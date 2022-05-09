/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.accountservice.repository;

import com.newexa.accountservice.model.AccountCustomer;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface AccountRepository extends JpaRepository<AccountCustomer, Long>{
    
    AccountCustomer save (AccountCustomer accountCustomer);
    
    @Transactional
    @Modifying
    @Query("update AccountCustomer a set a.noAccount = ?1 where a.idAccountCustomer = ?2")
    int update (String accountNo, int id);
    
}
