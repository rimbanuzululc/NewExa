/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.accountservice.model;

import javax.persistence.Column;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author hp
 */
@Entity
@Table(name = "exa_accountcustomer")
@Data
public class AccountCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaccountcustomer")
    protected int idAccountCustomer;
    
    @Column(name = "cifno")
    protected String cifNo;
    
    @Column(name = "name")
    protected String name;
    
    @Column(name = "currency")
    protected String currency;
    
    @Column(name = "acopenpurpose")
    protected String acOpenPurpose;
    
    @Column(name = "accountofficer")
    protected String accountOfficer;
    
    @Column(name = "noaccount")
    protected String noAccount;
    
    public AccountCustomer() {
        
    }
    
    public AccountCustomer (int idAccountCustomer, String cifNo, String name, String currency, String acOpenPurpose,
                            String accountOfficer, String noAccount) {
        
        this.idAccountCustomer = idAccountCustomer;
        this.cifNo = cifNo;
        this.name = name;
        this.currency = currency;
        this.acOpenPurpose = acOpenPurpose;
        this.accountOfficer = accountOfficer;
        this.noAccount = noAccount;
    }
    
    public int getIdAccountCustomer() {
        return idAccountCustomer;
    }

    public void setIdAccountCustomer(int idAccountCustomer) {
        this.idAccountCustomer = idAccountCustomer;
    }

    public String getCifNo() {
        return cifNo;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAcOpenPurpose() {
        return acOpenPurpose;
    }

    public void setAcOpenPurpose(String acOpenPurpose) {
        this.acOpenPurpose = acOpenPurpose;
    }

    public String getAccountOfficer() {
        return accountOfficer;
    }

    public void setAccountOfficer(String accountOfficer) {
        this.accountOfficer = accountOfficer;
    }

    public String getNoAccount() {
        return noAccount;
    }

    public void setNoAccount(String noAccount) {
        this.noAccount = noAccount;
    }
    
}
