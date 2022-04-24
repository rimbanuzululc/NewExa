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
@Table(name = "exa_legal")
@Data
public class Legal {  

    protected String idLegal;
    protected String legal;
    
    public Legal() {
        
    }
    
    public Legal(String idLegal, String legal) {
        this.idLegal = idLegal;
        this.legal = legal;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlegal")
    public String getIdLegal() {
        return idLegal;
    }

    public void setIdLegal(String idLegal) {
        this.idLegal = idLegal;
    }
    
    @Column(name = "legal")
    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }


}
