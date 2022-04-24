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
@Table(name = "exa_education")
@Data
public class Education {

    protected String idEducation;
    protected String education;
    
    public Education(){
        
    }
    
    public Education(String idEducation, String education){
        this.idEducation = idEducation;
        this.education = education;
    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ideducation")
    public String getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(String idEducation) {
        this.idEducation = idEducation;
    }
    
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
}
