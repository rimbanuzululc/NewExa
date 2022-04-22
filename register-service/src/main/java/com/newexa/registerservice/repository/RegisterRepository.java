package com.newexa.registerservice.repository;

import com.newexa.registerservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Employee, Integer> {

    Employee getByUsername(String username);

}
