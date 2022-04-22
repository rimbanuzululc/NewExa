package com.newexa.registerservice.service.impl;


import com.newexa.registerservice.model.Employee;
import com.newexa.registerservice.repository.RegisterRepository;
import com.newexa.registerservice.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegisterServiceImpl implements RegisterService{
    RestTemplate restTemplate = new RestTemplate();
    @Autowired RegisterRepository registerRepository;

    @Override
    public String register(Employee employee) {
        // TODO Auto-generated method stub     
        String message = restTemplate.postForObject(  "http://localhost:9003/employee/register", employee, String.class);
        if(message != null){
            return message;
        }
        return null;
    }

    // @Override
    // public boolean checkUsername(String username) {
    //     // TODO Auto-generated method stub
    //     Employee employeeSaved = restTemplate.postForObject(  "http://localhost:9003/employee/register", username, Employee.class);
        
    //     Employee employeeData = registerRepository.getByUsername(username);
    //     if(employeeData != null){
    //         return true;
    //     }
    //     return false;
    // }
}
