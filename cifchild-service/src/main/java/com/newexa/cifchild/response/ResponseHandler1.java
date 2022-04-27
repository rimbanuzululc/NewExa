package com.newexa.cifchild.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler1 {
    public static ResponseEntity<Object> generateResponse(String message, String statusResponse, Object responseObj) {
        Map<String, Object> map = new HashMap<>();
            map.put("data", responseObj);
            map.put("responseMessage", statusResponse);
            map.put("responseCode", message);

            return new ResponseEntity<>(map, HttpStatus.OK);
    }
}