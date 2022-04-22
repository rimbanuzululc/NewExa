package com.newexa.loginservice.controller;

import com.newexa.loginservice.service.TokenService;
import com.newexa.loginservice.model.Employee;
import com.newexa.loginservice.model.Register;
import com.newexa.loginservice.response.ResponseHandler;
import com.newexa.loginservice.service.LoginService;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired 
    LoginService loginService;
    
    @Autowired
    protected TokenService tokenService;
    
    @PostMapping(value = "/")
    public ResponseEntity<Object> getEmployeeDataDetail(@RequestParam(required = true) String username, @RequestParam(required = true) String password) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, UnsupportedEncodingException, SignatureException{
        String username1 = username.strip();
        String password1 = password.strip();
        
        if(username1.isEmpty() || username1 == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Username cannot empty!", HttpStatus.OK, true, is_success);
        }

        if(password1.isEmpty() || password1 == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Password cannot empty!", HttpStatus.OK, true, is_success);
        }

        Employee employeeData = loginService.findByUsername(username);
        if(employeeData==null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Username cannot found!", HttpStatus.OK, true, is_success);
        }
        boolean passCheck = BCrypt.checkpw(password1, employeeData.getPassword());
        if(passCheck){
            Register register = new Register();
            register.setId(employeeData.getId());
            register.setRole(employeeData.getRole());
            register.setUsername(employeeData.getUsername());
            String id = String.valueOf(employeeData.getId());
            register.setAccessToken(tokenService.generateToken(id));
            
            return ResponseHandler.generateResponse("Login Success", HttpStatus.OK, true, register);
            
        }
        boolean is_success = false;
        return ResponseHandler.generateResponse("Wrong Password!", HttpStatus.OK, true, is_success);
    }
    
    @GetMapping("/token")
    public ResponseEntity<Object> token () throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, UnsupportedEncodingException {
        
        String token = "";
        try {
            token = tokenService.generateToken("1");
        } catch (SignatureException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResponseHandler.generateResponse("Sukses", HttpStatus.OK, true, token);
    }
}
