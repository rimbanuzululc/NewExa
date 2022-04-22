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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */
@Table(name = "exa_jobtitle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String job;
    protected String jobTitle;
    
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
}
