/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.repository;

import com.newexa.cifchild.model.DistrictCode;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hp
 */
@Repository
public interface DistrictCodeRepository extends JpaRepository<DistrictCode, Long>{
    
    @Transactional
    @Modifying
    @Query("select u from DistrictCode u where u.idProvince in ?1")
    List<DistrictCode> listDistrictbyProvince (String idProvince);
    
}
