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
@Table(name = "exa_fundsource")
@Data
public class FundSource {

    protected int idFundSource;
    protected String fundSource;
    
    public FundSource(){
        
    }
    
    public FundSource(int idFundSource, String fundSource) {
        this.idFundSource = idFundSource;
        this.fundSource = fundSource;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfundsource")
    public int getIdFundSource() {
        return idFundSource;
    }

    public void setIdFundSource(int idFundSource) {
        this.idFundSource = idFundSource;
    }
    
    @Column(name = "fundsource")
    public String getFundSource() {
        return fundSource;
    }

    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
    }

}
