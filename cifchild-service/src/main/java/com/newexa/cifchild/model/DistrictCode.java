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
@Table(name = "exa_districtcode")
@Data
public class DistrictCode {

    protected String idDistrict;
    protected String districtCode;
    protected String idProvince;
    
    public DistrictCode(){
        
    }
    
    public DistrictCode (String idDistrict, String districCode, String idProvince){
        this.idDistrict = idDistrict;
        this.districtCode = districCode;
        this.idProvince = idProvince;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddistrict")
    public String getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(String idDistrict) {
        this.idDistrict = idDistrict;
    }
    
    @Column(name = "districtcode")
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
    
    @Column(name = "idprovince")
    public String getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(String idProvince) {
        this.idProvince = idProvince;
    }
    
    
}
