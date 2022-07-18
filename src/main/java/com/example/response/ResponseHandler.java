//package com.example.response;
//
//import com.example.Entity.TextType;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ResponseHandler {
//    public static ResponseEntity<Object> generateResponse(TextType question, HttpStatus status, Object responseObj)
//    {
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("content",question.content);
//        map.put("status",status.value());
//        map.put("metaData", responseObj);
//
//        return new ResponseEntity<Object>(map,status);
//    }
//}
