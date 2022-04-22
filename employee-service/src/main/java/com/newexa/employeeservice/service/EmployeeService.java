package com.newexa.employeeservice.service;

import com.newexa.employeeservice.model.Employee;


public interface EmployeeService {
    Employee save(Employee employee);
    boolean checkUsername(String username);
    Employee getEmployeeData(Employee employee);
    Employee login(Employee employee);
    
    // Employee findByUsername(String username);
    
}
