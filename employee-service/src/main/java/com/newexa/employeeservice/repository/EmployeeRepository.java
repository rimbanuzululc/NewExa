package com.newexa.employeeservice.repository;

import com.newexa.employeeservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee getByUsername(String username);

}
