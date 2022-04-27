package com.newexa.employeeservice.controller;

import com.newexa.employeeservice.model.Employee;
import com.newexa.employeeservice.model.Register;
import com.newexa.employeeservice.response.ResponseHandler;
import com.newexa.employeeservice.service.EmployeeService;
import com.newexa.employeeservice.service.TokenService;

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
    @Autowired TokenService tokenService;
    
    @PostMapping(value = "/register")
    public ResponseEntity<Object> saveStudent(@RequestBody(required = true) Employee employee){
        try {
            String username = employee.getUsername().strip();
            String password = employee.getPassword().strip();
            String role = employee.getRole().strip();

            if(username.isEmpty() || username == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Username cannot empty!", HttpStatus.BAD_REQUEST, true, is_success);
            }

            if(role.isEmpty() || role == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Role cannot empty!", HttpStatus.BAD_REQUEST, true, is_success);
            }

            if(password.isEmpty() || password == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Password cannot empty!", HttpStatus.BAD_REQUEST, true, is_success);
            }

            if(password.length() < 8 ){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Password length must be 8 or more!", HttpStatus.BAD_REQUEST, true, is_success);
            }
            
            String hashedpassword = BCrypt.hashpw(employee.getPassword(), BCrypt.gensalt(12) );
            employee.setPassword(hashedpassword);
            boolean checkEmployee = employeeService.checkUsername(employee.getUsername());
            
            if(checkEmployee){
                return ResponseHandler.generateResponse("Username cannot use", HttpStatus.BAD_REQUEST, true, false);
            }

            Employee employeeSaved = employeeService.save(employee);
            if(employeeSaved != null){
                return ResponseHandler.generateResponse("Register Successfully", HttpStatus.OK, true, true);
            } else {
                return ResponseHandler.generateResponse("Register Failed", HttpStatus.FORBIDDEN, true, false);
            }
            
        } catch (Exception e) {
            System.out.println("exception" +e);
            return ResponseHandler.generateResponse("Register Failed", HttpStatus.FORBIDDEN, true, false);
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

    @PostMapping(value = "/login")
    public ResponseEntity<Object> getUserData(@RequestParam(required =  true) String username, String password){
        try{
            
            String username1 = username.strip();
            String password1 = password.strip();
            Employee emplo = new Employee();
            emplo.setUsername(username);
            emplo.setPassword(password);

            if(username1.isEmpty() || username1 == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Username cannot empty!", HttpStatus.OK, true, is_success);
            }

            if(password1.isEmpty() || password1 == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Password cannot empty!", HttpStatus.OK, true, is_success);
            }

            Employee employeeData = employeeService.getEmployeeData(emplo);
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
            
//            Employee employeeDat = employeeService.login(emplo);
//            // System.out.println(employeeData);
//            if(employeeData != null){
//                return employeeData;
//            }
//            return null;

        }catch(Exception e){
            return null;
        }
    }
    
    
}

