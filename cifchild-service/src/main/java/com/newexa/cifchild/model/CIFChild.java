/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newexa.cifchild.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author rimba
 */

@Entity
@Table(name = "exa_cifchild")
@Data
public class CIFChild {

    protected int idCifChild;
    protected int idParentCifChild;
    protected String shortName;
    protected String name1;
    protected String givenNames;
    protected String mothMaiden;
    protected String placeBirth; 
    protected String dateOfBirth;
    protected String childLegalTyp;
    protected String legalIdNo;
    protected String gender;
    protected String nationality;
    protected String education;
    
    //alamat domisili
    
    protected String street;
    protected String address;
    protected String rtRw;
    protected String townCountry;
    protected String country;
    protected String residence;
    protected String districCode;
    protected String postCode;
    protected String sms1;
    protected String email1;
    protected String mnemonic;
    protected String resideyn;
    protected String accountOfficer;
    protected String altCustId;
    protected String segment;
    
    //informasi sekolah
    
    protected String employersName;
    protected String employersAdd;
    protected String offPhone;
    
    //informasi BI
    
    protected String lbuCustType;
    protected String guarantorCode;
    protected String sidRelatiBank;
    protected String customerRating;
    
    protected String cif;
    protected String status;
    
    protected Date submitTime;
    protected Date approvalTime;
    
    public CIFChild(){
        
    }
    
    public CIFChild(int idCifChild, int idParentCifChild,String shortName, String name1, String givenNames, String mothMaiden, String placeBirth
                    , String dateOfBirth, String childLegalTyp, String legalIdNo, String gender, String nationality, String education
                    , String street, String address, String rtrw, String townCountry, String country, String residence, String districCode
                    , String postCode, String sms1, String email1, String mnemonic, String resideyn, String accountOfficer
                    , String altCustId, String segment, String employersName, String employersAdd, String offPhone
                    , String lbuCustType, String guarantorCode, String sidRelatiBank, String customerRating, String cif, String status,
                    Date submitTime, Date approvalTime) {
        
        this.idCifChild = idCifChild;
        this.idParentCifChild = idParentCifChild;
        this.shortName = shortName;
        this.name1 = name1;
        this.givenNames = givenNames;
        this.mothMaiden = mothMaiden;
        this.placeBirth = placeBirth;
        this.dateOfBirth = dateOfBirth;
        this.childLegalTyp = childLegalTyp;
        this.legalIdNo = legalIdNo;
        this.gender = gender;
        this.nationality = nationality;
        this.education = education;
        this.street = street;
        this.address = address;
        this.rtRw = rtrw;
        this.townCountry = townCountry;
        this.country = country;
        this.residence = residence;
        this.districCode = districCode;
        this.postCode = postCode;
        this.sms1 = sms1;
        this.email1 = email1;
        this.mnemonic = mnemonic;
        this.resideyn = resideyn;
        this.accountOfficer = accountOfficer;
        this.altCustId = altCustId;
        this.segment = segment;
        
        this.employersName = employersName;
        this.employersAdd = employersAdd;
        this.offPhone = offPhone;
        
        this.lbuCustType = lbuCustType;
        this.guarantorCode = guarantorCode;
        this.sidRelatiBank = sidRelatiBank;
        this.customerRating = customerRating;
        this.cif = cif;
        this.status = status;
        this.submitTime = submitTime;
        this.approvalTime = approvalTime;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcifchild")
    public int getIdCifChild() {
        return idCifChild;
    }

    public void setIdCifChild(int idCifChild) {
        this.idCifChild = idCifChild;
    }
    
    @Column(name = "shortname ")
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    @Column(name = "name1")
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
    
    @Column(name = "givennames")
    public String getGivenNames() {
        return givenNames;
    }

    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }
    
    @Column(name = "mothmaiden")
    public String getMothMaiden() {
        return mothMaiden;
    }

    public void setMothMaiden(String mothMaiden) {
        this.mothMaiden = mothMaiden;
    }
    
    @Column(name = "placebirth")
    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }
    
    @Column(name = "dateofbirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Column(name = "childlegaltyp ")
    public String getChildLegalTyp() {
        return childLegalTyp;
    }

    public void setChildLegalTyp(String childLegalTyp) {
        this.childLegalTyp = childLegalTyp;
    }
    
    @Column(name = "legalidno")
    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo;
    }
    
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name = "rtrw")
    public String getRtRw() {
        return rtRw;
    }

    public void setRtRw(String rtRw) {
        this.rtRw = rtRw;
    }
    
    @Column(name = "towncountry")
    public String getTownCountry() {
        return townCountry;
    }

    public void setTownCountry(String townCountry) {
        this.townCountry = townCountry;
    }
    
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Column(name = "residence")
    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    @Column(name = "districtcode")
    public String getDistricCode() {
        return districCode;
    }

    public void setDistricCode(String districCode) {
        this.districCode = districCode;
    }
    
    @Column(name = "postcode")
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    
    @Column(name = "sms1")
    public String getSms1() {
        return sms1;
    }

    public void setSms1(String sms1) {
        this.sms1 = sms1;
    }
    
    @Column(name = "email1")
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }
    
    @Column(name = "mnemonic")
    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }
    
    @Column(name = "resideyn")
    public String getResideyn() {
        return resideyn;
    }

    public void setResideyn(String resideyn) {
        this.resideyn = resideyn;
    }
    
    @Column(name = "accountofficer")
    public String getAccountOfficer() {
        return accountOfficer;
    }

    public void setAccountOfficer(String accountOfficer) {
        this.accountOfficer = accountOfficer;
    }
    
    @Column(name = "altcustid")
    public String getAltCustId() {
        return altCustId;
    }

    public void setAltCustId(String altCustId) {
        this.altCustId = altCustId;
    }
    
    @Column(name = "segment")
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
    
    //informasi sekolah
    
    @Column(name = "employersname")
    public String getEmployersName() {
        return employersName;
    }

    public void setEmployersName(String employersName) {
        this.employersName = employersName;
    }
    
    @Column(name = "employersadd")
    public String getEmployersAdd() {
        return employersAdd;
    }

    public void setEmployersAdd(String employersAdd) {
        this.employersAdd = employersAdd;
    }
    
    @Column(name = "offphone")
    public String getOffPhone() {
        return offPhone;
    }

    public void setOffPhone(String offPhone) {
        this.offPhone = offPhone;
    }
    
    //informasi bi
    
    @Column(name = "lbucusttype")
    public String getLbuCustType() {
        return lbuCustType;
    }

    public void setLbuCustType(String lbuCustType) {
        this.lbuCustType = lbuCustType;
    }
    
    @Column(name = "guarantorcode")
    public String getGuarantorCode() {
        return guarantorCode;
    }

    public void setGuarantorCode(String guarantorCode) {
        this.guarantorCode = guarantorCode;
    }
    
    @Column(name = "sidrelatibank")
    public String getSidRelatiBank() {
        return sidRelatiBank;
    }

    public void setSidRelatiBank(String sidRelatiBank) {
        this.sidRelatiBank = sidRelatiBank;
    }
    
    @Column(name = "customerrating")
    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }

    @Column(name = "cif")
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    
    @Column(name = "idparentcifchild")
    public int getIdParentCifChild() {
        return idParentCifChild;
    }

    public void setIdParentCifChild(int idParentCifChild) {
        this.idParentCifChild = idParentCifChild;
    }
    
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name = "submittime")
    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
    
    @Column(name = "approvaltime")
    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }
}
