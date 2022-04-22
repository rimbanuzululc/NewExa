package com.newexa.employeeservice.controller;

import com.newexa.employeeservice.model.Employee;
import com.newexa.employeeservice.response.ResponseHandler;
import com.newexa.employeeservice.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired EmployeeService employeeService;
    
    @PostMapping(value = "/register")
    public String saveStudent(@RequestBody(required = true) Employee employee){
        try {
            String hashedpassword = BCrypt.hashpw(employee.getPassword(), BCrypt.gensalt(12) );
            employee.setPassword(hashedpassword);
            boolean checkEmployee = employeeService.checkUsername(employee.getUsername());
            
            if(checkEmployee){
                return "Username cannot use";
            }

            Employee employeeSaved = employeeService.save(employee);
            if(employeeSaved != null){
                return "Register Successfully";
            }
            return "Register Unsuccessfully";
        } catch (Exception e) {
            System.out.println("exception" +e);
            return "Register Unsuccessfully";
        }
    }

    @PostMapping(value = "/checkusername")
    public boolean checkUsername(@RequestBody(required =  true) Employee employee){
        try{
            boolean employeeCheck = employeeService.checkUsername(employee.getUsername());
            if(employeeCheck){
                return true;
            }
            return false;

        }catch(Exception e){
            return false;
        }
    }

    @PostMapping(value = "/getuserdata")
    public Employee getUserData(@RequestBody(required =  true) Employee employee){
        try{
            // System.out.println("cek" + employee.getUsername());
            Employee employeeData = employeeService.getEmployeeData(employee);
            // System.out.println(employeeData);
            if(employeeData != null){
                return employeeData;
            }
            return null;

        }catch(Exception e){
            return null;
        }
    }
    
    
}

