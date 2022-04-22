package com.newexa.registerservice.controller;

import com.newexa.registerservice.model.Employee;
import com.newexa.registerservice.response.ResponseHandler;
import com.newexa.registerservice.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired private RegisterService registerService;
  
    
    @PostMapping(value = "/")
    public ResponseEntity<Object> saveStudent(@RequestBody(required = true) Employee employee){
        try {
            //  List<UserEntity> result = userService.Get();
            String username = employee.getUserName().strip();
            String password = employee.getPassword().strip();
            String role = employee.getRole().strip();

            if(username.isEmpty() || username == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Username cannot empty!", HttpStatus.OK, true, is_success);
            }

            if(role.isEmpty() || role == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Role cannot empty!", HttpStatus.OK, true, is_success);
            }

            if(password.isEmpty() || password == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Password cannot empty!", HttpStatus.OK, true, is_success);
            }

            if(password.length() < 8 ){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Password length must be 8 or more!", HttpStatus.OK, true, is_success);
            }
        
            String message = registerService.register(employee);
            if(message != null){
                return ResponseHandler.generateResponse(message, HttpStatus.OK, true, true);
            }

            return ResponseHandler.generateResponse(message, HttpStatus.OK, false, false);
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, false, null);
        }
    }
}
