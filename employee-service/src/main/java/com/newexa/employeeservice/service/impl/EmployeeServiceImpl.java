package com.newexa.employeeservice.service.impl;

import com.newexa.employeeservice.model.Employee;
import com.newexa.employeeservice.repository.EmployeeRepository;
import com.newexa.employeeservice.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        // TODO Auto-generated method stub
         
        Employee employeeSaved = employeeRepository.save(employee);
        if(employeeSaved != null){
            return employeeSaved;
        }
 
        return employeeSaved;
    }

    @Override
    public boolean checkUsername(String username) {
        // TODO Auto-generated method stub
        Employee employeeData = employeeRepository.getByUsername(username);
        if(employeeData != null){
            return true;
        }
 
        return false;
    }

    @Override
    public Employee getEmployeeData(Employee employee) {
        Employee employeeData = employeeRepository.getByUsername(employee.getUsername());
        // TODO Auto-generated method stub
        if(employeeData != null){
            return employeeData;
        }
 
        return null;
    }
    
    @Override
    public Employee login (Employee employee) {
        
        Employee employe1 = employeeRepository.getByUsername(employee.getUsername());
        
        if (employee != null) {
            return employee;
        }
        return null;
    }
    
    

    // @Override
    // public Employee findByUsername(String username) {
    //     // TODO Auto-generated method stub
    //     Employee employee = loginRepository.findByUsername(username);
    //     return employee;
    // }

    
    
}
