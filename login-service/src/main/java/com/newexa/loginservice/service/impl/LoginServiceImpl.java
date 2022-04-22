package com.newexa.loginservice.service.impl;

import com.newexa.loginservice.model.Employee;
import com.newexa.loginservice.repository.LoginRepository;
import com.newexa.loginservice.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired LoginRepository loginRepository;
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Employee findByUsername(String username) {
        // TODO Auto-generated method stub
        Employee employee = new Employee();
        employee.setUsername(username);
        
        Employee employeeData = restTemplate.postForObject(  "http://localhost:9003/employee/getuserdata", employee, Employee.class);
        return employeeData;
    }
    
}

