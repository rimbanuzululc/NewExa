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
@Table(name = "exa_province")
@Data
public class Province {

    protected String idProvince;
    protected String province;
    
    public Province() {
    
    }
    
    public Province(String idProvince, String province){
        this.idProvince = idProvince;
        this.province = province;
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprovince")
    public String getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(String idProvince) {
        this.idProvince = idProvince;
    }
    
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
}
