/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.repository;

import com.newexa.cifchild.model.JobTitle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Long>{
    
    List<JobTitle> findAll();
    
}
