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
@Table(name = "exa_customerrating")
@Data
public class CustomerRating {
    
    protected int idCustomerRating;
    protected String customerRating;
    
    public CustomerRating() {
    
    }
    
    public CustomerRating(int idCustomerRating, String customerString) {
        this.idCustomerRating = idCustomerRating;
        this.customerRating = customerString;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcustomerrtating")
    public int getIdCustomerRating() {
        return idCustomerRating;
    }

    public void setIdCustomerRating(int idCustomerRating) {
        this.idCustomerRating = idCustomerRating;
    }
    
    
    @Column(name = "customerrating")
    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }
    
}
