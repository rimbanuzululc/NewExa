/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.controller;

import com.newexa.cifchild.model.Dukcapil;
import com.newexa.cifchild.response.ResponseHandler1;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@RequestMapping("/dummy")
public class DukcapilController {
    
    @PostMapping("/")
    public ResponseEntity<Object> dummy (@RequestBody(required = true) Dukcapil dukcapil) {
        
        Map<String, String> retur = new HashMap<>();
        retur.put("NO_KK", "Tidak Sesuai");
        retur.put("NIK", "3301072401970002");
        retur.put("NAMA_LGKP", "Sesuai (100)");
        retur.put("TMPT_LHR", "Sesuai (100)");
        retur.put("NAMA_LGKP_IBU", "Sesuai (100)");
        retur.put("JENIS_KLMIN", "Sesuai");
        retur.put("TGL_LHR", "Sesuai");
        
        return ResponseHandler1.generateResponse("00", "SUCCESS", retur);
    }
    
}
