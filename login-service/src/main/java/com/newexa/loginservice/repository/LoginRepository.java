package com.newexa.loginservice.repository;

import com.newexa.loginservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Employee, Integer> {

    Employee findByUsername(String username);

}