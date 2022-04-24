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
import lombok.Data;

/**
 *
 * @author rimba
 */
@Entity
@Table(name = "exa_parentcifchild")
@Data
public class ParentCifChild {

    protected int idParentCifChild;
    //informasi orang tua
    
    protected String fundProvName;
    protected String fundLegalType;
    protected String funLegalIdNo; 
    protected String funProvGender;
    protected String fundMaritStat;
    protected String fundEducation;
    protected String fundReligion;
    protected String fundMothMaide;
    protected String fundPlaceBirt;
    protected String funDateBirth;
    protected String fundStreet;
    protected String fundProvSms1;
    protected String fundProvJob;
    protected String fundProvAddr;
    protected String fundProvPhone;
    protected String fundOccupation;
    protected String fundSource;
    protected String fundEmployAdd;
    protected String funProvRelcu;
    
    //alamat identitas
    
    protected String addrType;
    protected String addrStreet;
    protected String addrRtRw;
    protected String addrProvince;
    protected String addrSuburBtwn;
    protected String addrMunicipal;
    protected String addrCountry;
    protected String addrDistrict;
    protected String addrPostCode;
    
    public ParentCifChild() {
        
    }
    
    public ParentCifChild(int ididParentCifChild, String fundProvName, String fundLegalType, String funLegalIdNo, String funProvGender
                    , String fundMaritStat, String fundEducation, String fundReligion, String fundMothMaide, String fundPlaceBirt, String funDateBirth 
                    , String fundStreet, String fundProvSms1, String fundProvJob, String fundProvAddr, String fundProvPhone, String fundOccupation
                    , String fundSource, String fundEmployAdd, String funProvRelcu, String addrType, String addrStreet, String addrRtRw
                    , String addProvince, String addrSuburBtwn, String addrMunicipal, String addrCountry, String addrDistrict, String addrPostCode){
        
        this.idParentCifChild = ididParentCifChild;
        this.fundProvName = fundProvName;
        this.fundLegalType = fundLegalType;
        this.funLegalIdNo = funLegalIdNo;
        this.funProvGender = funProvGender;
        this.fundMaritStat = fundMaritStat;
        this.fundEducation = fundEducation;
        this.fundReligion = fundReligion;
        this.fundMothMaide = fundMothMaide;
        this.fundPlaceBirt = fundPlaceBirt;
        this.funDateBirth = funDateBirth;
        this.fundStreet = fundStreet;
        this.fundProvSms1 = fundProvSms1;
        this.fundProvJob = fundProvJob;
        this.fundProvAddr = fundProvAddr;
        this.fundProvPhone = fundProvPhone;
        this.fundOccupation = fundOccupation;
        this.fundSource = fundSource;
        this.fundEmployAdd = fundEmployAdd;
        this.funProvRelcu = funProvRelcu;
        
        this.addrType = addrType;
        this.addrStreet = addrStreet;
        this.addrRtRw = addrRtRw;
        this.addrProvince = addProvince;
        this.addrSuburBtwn = addrSuburBtwn;
        this.addrMunicipal = addrMunicipal;
        this.addrCountry = addrCountry;
        this.addrDistrict = addrDistrict;
        this.addrPostCode = addrPostCode;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idparentcifchild")
    public int getIdParentCifChild() {
        return idParentCifChild;
    }

    public void setIdParentCifChild(int idParentCifChild) {
        this.idParentCifChild = idParentCifChild;
    }
    
    //informasi orang tua
    
    @Column(name = "fundprovname")
    public String getFundProvName() {
        return fundProvName;
    }

    public void setFundProvName(String fundProvName) {
        this.fundProvName = fundProvName;
    }
    
    @Column(name = "fundlegaltype")
    public String getFundLegalType() {
        return fundLegalType;
    }
    
    public void setFundLegalType(String fundLegalType) {
        this.fundLegalType = fundLegalType;
    }
    
    @Column(name = "funlegalidno")
    public String getFunLegalIdNo() {
        return funLegalIdNo;
    }

    public void setFunLegalIdNo(String funLegalIdNo) {
        this.funLegalIdNo = funLegalIdNo;
    }
    
    @Column(name = "funprovgender")
    public String getFunProvGender() {
        return funProvGender;
    }

    public void setFunProvGender(String funProvGender) {
        this.funProvGender = funProvGender;
    }
    
    @Column(name = "fundmaritstat")
    public String getFundMaritStat() {
        return fundMaritStat;
    }

    public void setFundMaritStat(String fundMaritStat) {
        this.fundMaritStat = fundMaritStat;
    }
    
    @Column(name = "fundeducation")
    public String getFundEducation() {
        return fundEducation;
    }

    public void setFundEducation(String fundEducation) {
        this.fundEducation = fundEducation;
    }
    
    @Column(name = "fundreligion")
    public String getFundReligion() {
        return fundReligion;
    }

    public void setFundReligion(String fundReligion) {
        this.fundReligion = fundReligion;
    }
    
    @Column(name = "fundmothmaide")
    public String getFundMothMaide() {
        return fundMothMaide;
    }

    public void setFundMothMaide(String fundMothMaide) {
        this.fundMothMaide = fundMothMaide;
    }
    
    @Column(name = "fundplacebirt")
    public String getFundPlaceBirt() {
        return fundPlaceBirt;
    }

    public void setFundPlaceBirt(String fundPlaceBirt) {
        this.fundPlaceBirt = fundPlaceBirt;
    }
    
    @Column(name = "fundatebirth")
    public String getFunDateBirth() {
        return funDateBirth;
    }

    public void setFunDateBirth(String funDateBirth) {
        this.funDateBirth = funDateBirth;
    }
    
    @Column(name = "fundstreet")
    public String getFundStreet() {
        return fundStreet;
    }

    public void setFundStreet(String fundStreet) {
        this.fundStreet = fundStreet;
    }
    
    @Column(name = "fundprovsms1")
    public String getFundProvSms1() {
        return fundProvSms1;
    }

    public void setFundProvSms1(String fundProvSms1) {
        this.fundProvSms1 = fundProvSms1;
    }
    
    @Column(name = "fundprovjob")
    public String getFundProvJob() {
        return fundProvJob;
    }

    public void setFundProvJob(String fundProvJob) {
        this.fundProvJob = fundProvJob;
    }
    
    @Column(name = "fundprovaddr")
    public String getFundProvAddr() {
        return fundProvAddr;
    }

    public void setFundProvAddr(String fundProvAddr) {
        this.fundProvAddr = fundProvAddr;
    }
    
    @Column(name = "fundprovphone")
    public String getFundProvPhone() {
        return fundProvPhone;
    }

    public void setFundProvPhone(String fundProvPhone) {
        this.fundProvPhone = fundProvPhone;
    }
    
    @Column(name = "fundoccupation")
    public String getFundOccupation() {
        return fundOccupation;
    }

    public void setFundOccupation(String fundOccupation) {
        this.fundOccupation = fundOccupation;
    }
    
    @Column(name = "fundsource")
    public String getFundSource() {
        return fundSource;
    }

    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
    }
    
    @Column(name = "fundemployadd")
    public String getFundEmployAdd() {
        return fundEmployAdd;
    }

    public void setFundEmployAdd(String fundEmployAdd) {
        this.fundEmployAdd = fundEmployAdd;
    }
    
    @Column(name = "funprovrelcu")
    public String getFunProvRelcu() {
        return funProvRelcu;
    }

    public void setFunProvRelcu(String funProvRelcu) {
        this.funProvRelcu = funProvRelcu;
    }
    
    //alamat identitas
    
    @Column(name = "addrtype")
    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }
    
    @Column(name = "addrstreet")
    public String getAddrStreet() {
        return addrStreet;
    }

    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }
    
    @Column(name = "addrrtrw")
    public String getAddrRtRw() {
        return addrRtRw;
    }

    public void setAddrRtRw(String addrRtRw) {
        this.addrRtRw = addrRtRw;
    }
    
    @Column(name = "addrprovince")
    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }
    
    @Column(name = "addrsuburbtwn")
    public String getAddrSuburBtwn() {
        return addrSuburBtwn;
    }

    public void setAddrSuburBtwn(String addrSuburBtwn) {
        this.addrSuburBtwn = addrSuburBtwn;
    }
    
    @Column(name = "addrmunicipal")
    public String getAddrMunicipal() {
        return addrMunicipal;
    }
    
    public void setAddrMunicipal(String addrMunicipal) {
        this.addrMunicipal = addrMunicipal;
    }
    
    @Column(name = "addrcountry")
    public String getAddrCountry() {
        return addrCountry;
    }

    public void setAddrCountry(String addrCountry) {
        this.addrCountry = addrCountry;
    }
    
    @Column(name = "addrdistrict")
    public String getAddrDistrict() {
        return addrDistrict;
    }

    public void setAddrDistrict(String addrDistrict) {
        this.addrDistrict = addrDistrict;
    }
    
    @Column(name = "addrpostcode")
    public String getAddrPostCode() {
        return addrPostCode;
    }

    public void setAddrPostCode(String addrPostCode) {
        this.addrPostCode = addrPostCode;
    }
    
}
