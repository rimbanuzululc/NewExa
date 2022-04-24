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
@Table(name = "exa_lbuscusttype")
@Data
public class LBUSCustType {

    protected String idlbus;
    protected String LbusCustType; 
    
    public LBUSCustType(){
        
    }
    
    public LBUSCustType(String idlbus, String LbusCustType) {
        this.idlbus = idlbus;
        this.LbusCustType = LbusCustType;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlbus")
    public String getIdlbus() {
        return idlbus;
    }

    public void setIdlbus(String idlbus) {
        this.idlbus = idlbus;
    }
    
    @Column(name = "lbuscusttype")
    public String getLbusCustType() {
        return LbusCustType;
    }

    public void setLbusCustType(String LbusCustType) {
        this.LbusCustType = LbusCustType;
    }
}
