/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.accountservice.controller;

import com.newexa.accountservice.model.AccountCustomer;
import com.newexa.accountservice.response.ResponseHandler;
import com.newexa.accountservice.service.AccountService;
import com.newexa.accountservice.stub.OpenAccountWadiahResponse;
import com.newexa.accountservice.stub.OpenAccountWadiahValidateResponse;
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
@RequestMapping("/account")
public class AccountController {
    
    @Autowired
    AccountService accountService;
    
    @PostMapping("/validateAccount")
    public ResponseEntity<Object> validateAccount (@RequestBody(required = true) AccountCustomer accountCustomer) {
        
        OpenAccountWadiahValidateResponse wadiahValidateResponse = new OpenAccountWadiahValidateResponse();
        AccountCustomer customer = new AccountCustomer();
        int hasil = 2;
        
        wadiahValidateResponse = accountService.wadiahValidateResponse(accountCustomer);
        
        String respon = wadiahValidateResponse.getStatus().getSuccessIndicator().value();
        
        String responTWS = wadiahValidateResponse.getStatus().getMessages().get(0);
        
        if (!respon.equals("SUCCSESS")) {
            hasil = 1;
        } else {
            customer = accountService.save(accountCustomer);
            if (customer != null) {
                hasil = 0;
            }
        }
        
        switch (hasil) {
            case 0:
                return ResponseHandler.generateResponse("Succses!", HttpStatus.OK, true, "Success Submit Data!");
            case 1:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Error TWS! " + "(" + responTWS + ")");
            default:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Failed Submit Data!");
        }
 
    }
    
    @PostMapping("/authorAccount")
    public ResponseEntity<Object> authorAccount (@RequestBody(required = true) AccountCustomer accountCustomer) {
        
        OpenAccountWadiahResponse openAccountWadiahResponse = new OpenAccountWadiahResponse();
        
        int hasil;
        
        openAccountWadiahResponse = accountService.wadiahResponse(accountCustomer);
        String respon = openAccountWadiahResponse.getStatus().getSuccessIndicator().value();
        String responTWS = openAccountWadiahResponse.getStatus().getMessages().get(0);
        
        if (!respon.equals("SUCCSESS")) {
            hasil = 1;
        } else {
            String curno = openAccountWadiahResponse.getACCOUNTType().getCURRNO();
            accountCustomer.setNoAccount(curno);
            hasil = accountService.update(accountCustomer);
        }
        
        switch (hasil) {
            case 0:
                return ResponseHandler.generateResponse("Succses!", HttpStatus.OK, true, "Success Submit Data!");
            case 1:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Error TWS! " + "(" + responTWS + ")");
            default:
                return ResponseHandler.generateResponse("Failed!", HttpStatus.BAD_GATEWAY, false, "Failed Submit Data!");
        }
    }
    
}
