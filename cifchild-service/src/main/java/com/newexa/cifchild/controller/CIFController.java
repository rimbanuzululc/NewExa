/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.controller;

import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.ParentCifChild;
import com.newexa.cifchild.model.SubmitCIF;
import com.newexa.cifchild.response.ResponseHandler;
import com.newexa.cifchild.service.CIFChildService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/CIF")
public class CIFController {
    
    @Autowired
    CIFChildService childService;
    
    @PostMapping("/submit")
    public ResponseEntity<Object> submitCIF(@RequestBody(required = true) SubmitCIF cIF) {
        
            Boolean hasil = childService.submit(cIF.getChild(), cIF.getParent());
            
            if (hasil) {
                
                return ResponseHandler.generateResponse("Succses!", HttpStatus.OK, true, hasil);
                
            } else {
                return ResponseHandler.generateResponse("Failed!", HttpStatus.OK, true, hasil);
            }
            
            
        
    }
    
}
