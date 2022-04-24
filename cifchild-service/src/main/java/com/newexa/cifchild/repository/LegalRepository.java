/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.repository;

import com.newexa.cifchild.model.Legal;
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
public interface LegalRepository extends JpaRepository<Legal, Long>{

    @Transactional
    @Modifying
    @Query("select u from Legal u where u.idLegal = 'NIK' or idLegal = 'NISN'")
    List<Legal> findChild();
    
    @Transactional
    @Modifying
    @Query("select u from Legal u where u.idLegal = 'KITAS' or idLegal = 'KTP' or idLegal = 'PASSPORT' "
            + "or idlegal = 'SIM' or idLegal = 'RESI'")
    List<Legal> findParent();
    
}
