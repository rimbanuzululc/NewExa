/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "exa_acctpurpose")
@Data
public class AcctOpenPurpose {

    protected String idAcct;
    protected String acctOpenPurpose;
    protected int sort;
    
    public AcctOpenPurpose(){
        
    }
    
    public AcctOpenPurpose(String idAcct, String acctOpenPurpose, int sort) {
        this.idAcct = idAcct;
        this.acctOpenPurpose = acctOpenPurpose;
        this.sort = sort;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idacct")
    public String getIdAcct() {
        return idAcct;
    }

    public void setIdAcct(String idAcct) {
        this.idAcct = idAcct;
    }
    
    @Column(name = "acctopenpurpose")
    public String getAcctOpenPurpose() {
        return acctOpenPurpose;
    }

    public void setAcctOpenPurpose(String acctOpenPurpose) {
        this.acctOpenPurpose = acctOpenPurpose;
    }
    
    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
    
    
}
