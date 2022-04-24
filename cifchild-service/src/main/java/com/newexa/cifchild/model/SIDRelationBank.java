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
@Table(name = "exa_sidrelationbank")
@Data
public class SIDRelationBank {

    protected String idSidRelation;
    protected String sidRelation;
    
    public SIDRelationBank(){
        
    }
    
    public SIDRelationBank(String idSidRelation, String sidRelation){
        this.idSidRelation = idSidRelation;
        this.sidRelation = sidRelation;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsidrelation")
    public String getIdSidRelation() {
        return idSidRelation;
    }

    public void setIdSidRelation(String idSidRelation) {
        this.idSidRelation = idSidRelation;
    }
    
    @Column(name = "sidrelation")
    public String getSidRelation() {
        return sidRelation;
    }

    public void setSidRelation(String sidRelation) {
        this.sidRelation = sidRelation;
    }
    
}
