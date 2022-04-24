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
@Table(name = "exa_jobtitle")
@Data
public class JobTitle {

    protected String job;
    protected String jobTitle;
    
    public JobTitle(){
        
    }
    
    public JobTitle (String job, String jobTitle) {
        this.job = job;
        this.jobTitle = jobTitle;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    @Column(name = "jobtitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
}
