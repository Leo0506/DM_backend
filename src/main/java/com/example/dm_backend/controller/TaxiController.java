//package com.example.dm_backend.controller;
//
//
//import com.example.dm_backend.Request.TaxiId;
//
//import com.example.dm_backend.model.TaxiUpdated;
////import com.example.dm_backend.service.TaxiService;
//import net.minidev.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/layers")
//public class TaxiController {
//
//    @Autowired
//    TaxiService taxiService;
//
//
////    @GetMapping("/GetInTaxiLayer")
////    public ResponseEntity<JSONObject> GetInTaxiLayer() {
////
////        messageService.addMessage(rMessage.getContent(),rMessage.getChatroomid(), rMessage.getUser1(),rMessage.getUser2(),rMessage.getUsersent(),rMessage.getOrdercnt());
////        ChatRoom chatRoom = chatRoomService.findChatRoom(rMessage.getChatroomid());
////        chatRoom.addMessageNumber(1);
////        chatRoomService.updateChatRoom(chatRoom);
////
////        return ResponseEntity.ok().build();
////    }
////
////    @GetMapping("/GetOffTaxiLayer")
////    public ResponseEntity<JSONObject> GetOffTaxiLayer(@RequestBody RMessage rMessage) {
////        messageService.addMessage(rMessage.getContent(),rMessage.getChatroomid(), rMessage.getUser1(),rMessage.getUser2(),rMessage.getUsersent(),rMessage.getOrdercnt());
////        ChatRoom chatRoom = chatRoomService.findChatRoom(rMessage.getChatroomid());
////        chatRoom.addMessageNumber(1);
////        chatRoomService.updateChatRoom(chatRoom);
////        return ResponseEntity.ok().build();
////    }
//
//    @GetMapping("/GetTaxi")
//    public ResponseEntity<JSONObject> GetOffTaxiLayer(@RequestBody TaxiId taxiId) {
//        List<TaxiUpdated> t=taxiService.findTaxi(taxiId.getTaxiID());
////        messageService.addMessage(rMessage.getContent(),rMessage.getChatroomid(), rMessage.getUser1(),rMessage.getUser2(),rMessage.getUsersent(),rMessage.getOrdercnt());
////        ChatRoom chatRoom = chatRoomService.findChatRoom(rMessage.getChatroomid());
////        chatRoom.addMessageNumber(1);
////        chatRoomService.updateChatRoom(chatRoom);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("result", t);
//        return ResponseEntity.ok().body(jsonObject);
//    }
//
//
//}
