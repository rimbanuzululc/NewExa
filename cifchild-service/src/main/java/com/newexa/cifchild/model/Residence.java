/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author rimba
 */
@Table(name = "exa_residence")
@AllArgsConstructor
@NoArgsConstructor
public class Residence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String idResidence;
    protected String residence;
    
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
