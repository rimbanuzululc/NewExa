/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.repository;

import com.newexa.cifchild.model.CIFChild;
import java.util.Date;
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
public interface CIFChildRepository extends JpaRepository<CIFChild, Long>{
    
    CIFChild save(CIFChild child);
    
    @Transactional
    @Modifying
    @Query("update CIFChild cif set cif.status = ?1, cif.cif = ?2 where cif.idCifChild = ?3")
    int updateStatus (String status, String cif, int idCifChild);
    
    @Transactional
    @Query("select c from CIFChild c where c.submitTime > CURRENT_DATE")
    List<CIFChild> listToday ();
    
    @Transactional
    @Modifying
    @Query("update CIFChild c set c.status = ?1, c.approvalTime = ?2 where c.idCifChild = ?3")
    int updateApproval (String status, Date approvalTime, int idCifChild);
}
