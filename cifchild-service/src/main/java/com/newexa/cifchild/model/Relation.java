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
@Table(name = "exa_relation")
@Entity
@Data
public class Relation {

    protected String idRelation;
    protected String relation;
    
    public Relation(){
        
    }
    
    public Relation(String idRelation, String relation){
        this.idRelation = idRelation;
        this.relation = relation;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrelation")
    public String getIdRelation() {
        return idRelation;
    }

    public void setIdRelation(String idRelation) {
        this.idRelation = idRelation;
    }
    
    @Column(name = "relation")
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
