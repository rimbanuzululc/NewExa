/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */
@Table(name = "exa_sidrelationbank")
@AllArgsConstructor
@NoArgsConstructor
public class SIDRelationBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String id;
    protected String sidRelation;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getSidRelation() {
        return sidRelation;
    }

    public void setSidRelation(String sidRelation) {
        this.sidRelation = sidRelation;
    }
    
}
