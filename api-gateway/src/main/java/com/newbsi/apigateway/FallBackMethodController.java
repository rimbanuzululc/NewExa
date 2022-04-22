/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbsi.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rimba
 */
@RestController
public class FallBackMethodController {
    
    @GetMapping("/employeeFallBack")
    public String employeeServiceFallBackMethod() {
        return "Employee Service is too long, try again later!";
    }
    
    @GetMapping("/loginFallBack")
    public String loginServiceFallBackMethod() {
        return "Login Service is too long, try again later!";
    }
    
    @GetMapping("/registerFallBack")
    public String registerServiceFallBackMethod() {
        return "Register Service is too long, try again later!";
    }
}
