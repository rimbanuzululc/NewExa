/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.accountservice.service;

import com.newexa.accountservice.model.AccountCustomer;
import com.newexa.accountservice.stub.OpenAccountWadiahResponse;
import com.newexa.accountservice.stub.OpenAccountWadiahValidateResponse;

/**
 *
 * @author hp
 */
public interface AccountService {
    
    AccountCustomer save (AccountCustomer accountCustomer);
    int update (AccountCustomer accountCustomer);
    
    OpenAccountWadiahValidateResponse wadiahValidateResponse (AccountCustomer accountCustomer);
    OpenAccountWadiahResponse wadiahResponse (AccountCustomer accountCustomer);
    
}
