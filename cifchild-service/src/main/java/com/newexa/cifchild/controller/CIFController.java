/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.controller;

import com.newexa.cifchild.model.CIFChild;
import com.newexa.cifchild.model.CIFChildTWS;
import com.newexa.cifchild.model.Dukcapil;
import com.newexa.cifchild.model.ParentCifChild;
import com.newexa.cifchild.model.SubmitCIF;
import com.newexa.cifchild.response.ResponseHandler;
import com.newexa.cifchild.service.CIFChildService;
import com.newexa.cifchild.service.DukcapilService;
import com.newexa.cifchild.stub.EnquiryGetDataCIFResponse;
import com.newexa.cifchild.stub.OpenCIFChildResponse;
import com.newexa.cifchild.stub.OpenCIFChildValidateResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@RequestMapping("/CIF")
public class CIFController {
    
    @Autowired
    private CIFChildService childService;
    
    @Autowired
    private DukcapilService dukcapilService;
    
    @PostMapping("/validate")
    public ResponseEntity<Object> submitCIF(@RequestBody(required = true) CIFChildTWS childTWS) {
        
            OpenCIFChildValidateResponse childValidateResponse = new OpenCIFChildValidateResponse();
            int hasil;
            
            childValidateResponse = childService.validateCIFChild(childTWS);
            String responTWS = childValidateResponse.getStatus().getSuccessIndicator().value();
            
            String error = childValidateResponse.getStatus().getMessages().get(0);
            
            if (!responTWS.equalsIgnoreCase("SUCCESS")) {
                hasil = 1;
            } else {
                hasil = childService.submit(childTWS);
            }
            
        switch (hasil) {
            case 0:
                return ResponseHandler.generateResponse("Succses!", HttpStatus.OK, true, "Success Submit Data!");
            case 1:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Error TWS! " + "(" + error + ")");    
            case 2:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Failed Submit Data!");
            case 3:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_REQUEST, false, "Data Already Submited (Duplicate Data)!");
            default:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Failed Submit Data!");
        }
    }
    
    @PutMapping("/author")
    public ResponseEntity<Object> editCIF(@RequestBody(required = true) CIFChildTWS child) {
        
        OpenCIFChildResponse childResponse = new OpenCIFChildResponse();
        int hasil;
        
        childResponse = childService.authorFChild(child);
        String responTWS = childResponse.getStatus().getSuccessIndicator().value();
        
        String error = childResponse.getStatus().getMessages().get(0);
        
        if (!responTWS.equals("SUCCESS")) {
            hasil = 1;
        } else {
            String cifTWS = childResponse.getStatus().getTransactionId();
            child.setCif(cifTWS);
            hasil = childService.update(child);
        }
        
        switch(hasil) {
            case 0:
                return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, "Success Update Approval Status!");
            case 1:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Error TWS! " + "(" + error + ")");
            default:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Failed Submit Data!");
        }
    }
    
    @PostMapping("/enquiry")
    public ResponseEntity<Object> getDataCIFResponse (@RequestParam(required = true) String ID ) {
        
        EnquiryGetDataCIFResponse dataCIFResponse = childService.dataCIFResponse(ID);
        
        return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, dataCIFResponse);
        
    }
    
    @GetMapping("/list")
    public ResponseEntity<Object> listTransaction() {
        
        List<CIFChildTWS> list = childService.listSubmit();
        
        return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, list);
    }
        
    @PostMapping("/dukcapil")
    public ResponseEntity<Object> validDukcapil (@RequestBody(required = true) Dukcapil dukcapil) {
        
         Dukcapil dukcapil2 = new Dukcapil();
         dukcapil2 = dukcapilService.cekDukcapil(dukcapil);
                  
         return ResponseHandler.generateResponse("Succsess!", HttpStatus.OK, true, dukcapil2);
    }
}
