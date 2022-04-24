/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.repository;

import com.newexa.cifchild.model.Province;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hp
 */
@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long>{
    
    List<Province> findAll();
}
