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
 * @author rimba
 */
@Entity
@Table(name = "exa_residence")
@Data
public class Residence {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idresidence")
    protected String idResidence;
    
    @Column(name = "residence")
    protected String residence;
    
    public Residence(){
        
    }
    
    public Residence(String idResidence, String residence) {
        this.idResidence = idResidence;
        this.residence = residence;
    }
    
    public String getIdResidence() {
        return idResidence;
    }

    public void setIdResidence(String idResidence) {
        this.idResidence = idResidence;
    }
    
    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
