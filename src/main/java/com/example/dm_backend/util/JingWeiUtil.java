package com.example.dm_backend.util;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import javax.net.ssl.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @author Abell
 * @descibe 根据经纬度查询地址信息
 * @date 2020/6/20 11:04
 */
public class JingWeiUtil {
    /**
     * 通过腾讯地图将经纬度转成详细地址
     *
     * @param lat 纬度
     * @param lng 经度
     * @return
     */
    public static JSONObject getLatAndLng(String lat, String lng) {
        try {
            String hsUrl = "https://apis.map.qq.com/ws/geocoder/v1/?location=" + lat + "," + lng + "&key=6OIBZ-EUNLS-IWQOV-6AOPG-3CUZV-AVF2L" + "&get_poi=1";
            URL url;
            url = new URL(hsUrl);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("GET");// 提交模式
            X509TrustManager xtm = new X509TrustManager() {
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    // TODO Auto-generated method stub
                    return null;
                }
                @Override
                public void checkServerTrusted(X509Certificate[] arg0, String arg1)
                        throws CertificateException {
                    // TODO Auto-generated method stub

                }
                @Override
                public void checkClientTrusted(X509Certificate[] arg0, String arg1)
                        throws CertificateException {
                    // TODO Auto-generated method stub

                }
            };
            TrustManager[] tm = {xtm};
            SSLContext ctx = SSLContext.getInstance("TLS");
            ctx.init(null, tm, null);
            con.setSSLSocketFactory(ctx.getSocketFactory());
            con.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }
            });
            InputStream inStream = con.getInputStream();
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }
            byte[] b = outStream.toByteArray();//网页的二进制数据
            outStream.close();
            inStream.close();
            String rtn = new String(b, "utf-8");
            if (StringUtils.isNotBlank(rtn)) {
                JSONObject object = JSONObject.fromObject(rtn);
                if (object != null) {
                    if (object.has("status") && object.getInt("status") == 0) {
                        JSONObject result = JSONObject.fromObject(object.get("result"));
                        if (result != null) {
                            JSONObject addressComponent = JSONObject.fromObject(result.get("address_component"));
                            if (addressComponent != null) {
                                return addressComponent;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getLatAndLng("22.53945", "113.942651"));
//        System.out.println(getLatAndLng("39.984154", "116.307490").getString("province"));
    }
}
