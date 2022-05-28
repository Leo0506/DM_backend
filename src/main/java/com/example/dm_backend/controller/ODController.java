package com.example.dm_backend.controller;


import com.example.dm_backend.Request.TaxiId;
import com.example.dm_backend.model.OD;
import com.example.dm_backend.model.TaxiUpdated;
import com.example.dm_backend.service.OD_service;
//import com.example.dm_backend.service.TaxiService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/layers")
public class ODController {
    @Autowired
    OD_service od_service;


    @GetMapping("/GetOD")
    public ResponseEntity<JSONObject> GetOffTaxiLayer(@RequestBody TaxiId taxiId) {
        System.out.println("***************");
//        System.out.println(taxiId.getTaxiID());
//        System.out.println("***************"); @RequestBody TaxiId taxiId

        List<OD> t=od_service.findOD(1);
        for (int i = 0; i <t.size() ; i++) {
            System.out.println(t.get(i).getTaxiId());
        }
//        for (int i = 0; i <t.size() ; i++) {
//            System.out.println("!!!!!!!!!!!!");
//        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", t);
        return ResponseEntity.ok().body(jsonObject);
    }
}
