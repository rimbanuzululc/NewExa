package com.newexa.loginservice.service;

import com.newexa.loginservice.model.Employee;

public interface LoginService {

    Employee findByUsername(String username);
    
}
