/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.controller;

import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.Dukcapil;
import com.newexa.cifchild.model.ParentCifChild;
import com.newexa.cifchild.model.SubmitCIF;
import com.newexa.cifchild.response.ResponseHandler;
import com.newexa.cifchild.service.CIFChildService;
import com.newexa.cifchild.service.DukcapilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @Autowired
    DukcapilService dukcapilService;
    
    @PostMapping("/submit")
    public ResponseEntity<Object> submitCIF(@RequestBody(required = true) SubmitCIF cIF) {
        
            Boolean hasil = childService.submit(cIF.getChild(), cIF.getParent());
            
            if (hasil) {
                
                return ResponseHandler.generateResponse("Succses!", HttpStatus.OK, true, hasil);
                
            } else {
                return ResponseHandler.generateResponse("Failed!", HttpStatus.OK, true, hasil);
            }   
    }
    
    @PutMapping("/update")
    public ResponseEntity<Object> editCIF(@RequestBody(required = true) CIFChild child) {
        
        Integer child1 = childService.update(child);
        
        return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, child1);
    }
    
    @GetMapping("/list")
    public ResponseEntity<Object> listTransaction() {
        
        List<CIFChild> list = childService.listSubmit();
        
        return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, list);
    }
    
    @PutMapping("/approve")
    public ResponseEntity<Object> editApproval(@RequestBody(required = true) CIFChild child) {
        
        Integer child1 = childService.approval(child);
        
        return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, child1);
    }
    
    @PostMapping("/dukcapil")
    public ResponseEntity<Object> validDukcapil (@RequestBody(required = true) Dukcapil dukcapil) {
        
         Dukcapil dukcapil2 = new Dukcapil();
          dukcapil2 = dukcapilService.cekDukcapil(dukcapil);
                  
         return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, dukcapil2);
    }
}
