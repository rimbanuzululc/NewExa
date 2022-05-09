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

/**
 *
 * @author hp
 */
@Entity
@Table(name = "exa_cifchild")
@Data
public class CIFChildTWS {

    protected int idCifChild;
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
    protected String province;
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
    
    protected String cif;
    protected String status;
    
    protected Date submitTime;
    protected Date approvalTime;
    
    protected String acOpenPurpose;
    
   public CIFChildTWS(){
        
    }
    
    public CIFChildTWS(int idCifChild ,String shortName, String name1, String givenNames, String mothMaiden, String placeBirth
                    , String dateOfBirth, String childLegalTyp, String legalIdNo, String gender, String nationality, String education
                    , String street, String address, String rtrw, String townCountry, String country, String residence, String districCode
                    , String postCode, String sms1, String email1, String mnemonic, String resideyn, String accountOfficer
                    , String altCustId, String segment, String employersName, String employersAdd, String offPhone
                    , String lbuCustType, String guarantorCode, String sidRelatiBank, String customerRating, String cif, String status,
                    Date submitTime, Date approvalTime, String fundProvName, String fundLegalType, String funLegalIdNo, String funProvGender
                    , String fundMaritStat, String fundEducation, String fundReligion, String fundMothMaide, String fundPlaceBirt, String funDateBirth 
                    , String fundStreet, String fundProvSms1, String fundProvJob, String fundProvAddr, String fundProvPhone, String fundOccupation
                    , String fundSource, String fundEmployAdd, String funProvRelcu, String addrType, String addrStreet, String addrRtRw
                    , String addProvince, String addrSuburBtwn, String addrMunicipal, String addrCountry, String addrDistrict, String addrPostCode
                    , String acOpenPurpose) {
        
        this.idCifChild = idCifChild;
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
        
        this.acOpenPurpose = acOpenPurpose;
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
    
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
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
    
    @Column(name = "acopenpurpose")
    public String getAcOpenPurpose() {
        return acOpenPurpose;
    }

    public void setAcOpenPurpose(String acOpenPurpose) {
        this.acOpenPurpose = acOpenPurpose;
    }
}
