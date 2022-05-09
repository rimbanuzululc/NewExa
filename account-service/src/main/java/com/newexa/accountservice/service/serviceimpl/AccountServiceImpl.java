/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.accountservice.service.serviceimpl;

import com.newexa.accountservice.model.AccountCustomer;
import com.newexa.accountservice.repository.AccountRepository;
import com.newexa.accountservice.service.AccountService;
import com.newexa.accountservice.stub.OpenAccountWadiahResponse;
import com.newexa.accountservice.stub.OpenAccountWadiahValidateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author hp
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;
    
    @Autowired
    RestTemplate restTemplate;
    
    String urlTws = "http://localhost:9191/twsservice/";
    
    @Override
    public AccountCustomer save(AccountCustomer accountCustomer) {
        
        AccountCustomer accountCustomer1 = new AccountCustomer();
        
        accountCustomer1 = accountRepository.save(accountCustomer);
        
        return accountCustomer1;
    }

    @Override
    public OpenAccountWadiahValidateResponse wadiahValidateResponse(AccountCustomer accountCustomer) {
        
        OpenAccountWadiahValidateResponse wadiahValidateResponse = new OpenAccountWadiahValidateResponse();
        
        wadiahValidateResponse = restTemplate.postForObject(urlTws + "validateEasyWadiah", accountCustomer, OpenAccountWadiahValidateResponse.class);
        
        return wadiahValidateResponse;
        
    }

    @Override
    public OpenAccountWadiahResponse wadiahResponse(AccountCustomer accountCustomer) {
        
        OpenAccountWadiahResponse wadiahResponse = new OpenAccountWadiahResponse();
        wadiahResponse = restTemplate.postForObject(urlTws + "authorEasyWadiah", accountCustomer, OpenAccountWadiahResponse.class);
        
        return wadiahResponse;
    }

    @Override
    public int update(AccountCustomer accountCustomer) {
        
        int id = accountCustomer.getIdAccountCustomer();
        String account = accountCustomer.getNoAccount();
        
        int customer = accountRepository.update(account, id);
        
        return 0;
    }
    
}
