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
@Table(name = "exa_marital")
@Data
public class Marital {

    protected String idMarital;
    protected String marital;
    
    public Marital() {
        
    }
    
    public Marital(String idMarital, String marital) {
        this.idMarital = idMarital;
        this.marital = marital;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmarital")
    public String getIdMarital() {
        return idMarital;
    }

    public void setIdMarital(String idMarital) {
        this.idMarital = idMarital;
    }
    
    @Column(name = "marital")
    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }
}
