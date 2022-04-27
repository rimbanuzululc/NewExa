package com.newexa.twsservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reg_cif_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCIF {

    @Column(name = "username_maker")
    private String username;
    @Id
    @Column(name = "id")
	private String id; //1
    @Column(name ="TICKET_NO")
	private String ticketNo; //2
    @Column(name = "CARDNO")
	private String cardNo;//3
    @Column(name = "PRODUCTCODE")
    private String productCode; //4
    @Column(name = "RESIDEYN")
    private String resideYN; //5
    @Column(name = "LEGALTYPE")
    private String legalType; //6
    @Column(name = "LEGALIDNO")
    private String legalIdNo; //7
    @Column(name = "SHORTNAME")
    private String shortName; //8
    @Column(name = "NAME1")
    private String name1; //9
    @Column(name = "GIVENNAME")
    private String givenName; //10
    @Column(name = "FAMILYNAME")
    private String familyName; //11
    @Column(name = "CUSTTITLE1")
    private String custTitle1; //12
    @Column(name = "CUSTTITLE2")
    private String custTitle2; //13
    @Column(name = "PLACEBIRTH")
    private String placeBirth; //14
    @Column(name = "DATEOFBIRTH")
    private String dateOfBirth; //15
    @Column(name = "STREET")
    private String street; //16
    @Column(name = "ADDRESS")
    private String address; //17
    @Column(name = "RT")
    private String rt; //18
    @Column(name = "RW")
    private String rw; //19
    @Column(name = "PROVINCE")
    private String province; //20
    @Column(name = "DISTRICTCODE")
    private String districtCode; //21
    @Column(name = "COUNTRY")
    private String country; //22
    @Column(name = "TOWNCOUNTRY")
    private String townCountry; //23
    @Column(name = "RESIDENCE")
    private String residence; //24
    @Column(name = "POSTCODE")
    private String postCode; //25
    @Column(name = "ADDRTYPE")
    private String addrType; //26
    @Column(name = "ADDRSTREET")
    private String addrStreet; //27
    @Column(name = "ADDRRT")
    private String addrRT; //28
    @Column(name = "ADDRRW")
    private String addrRW; //29
    @Column(name = "ADDRPROVINCE")
    private String addrProvince; //30
    @Column(name = "ADDRSUBURBTWN")
    private String addrSuburBtwn; //31
    @Column(name = "ADDRMUNICIPAL")
    private String addrMunicipal; //32
    @Column(name = "ADDRCOUNTRY")
    private String addrCountry; //33
    @Column(name = "ADDRDISTRICT")
    private String addrDistrict; //34
    @Column(name = "ADDRPOSTCODE")
    private String addrPostCode; //35
    @Column(name = "ADDRPHONEAREA")
    private String addrPhoneArea; //36
    @Column(name = "ADDRPHONENO")
    private String addrPhoneNo; //37
    @Column(name = "SMS")
    private String sms; //38
    @Column(name = "EMAIL")
    private String email; //39
    @Column(name = "MARITALSTATUS")
    private String maritalStatus; //40
    @Column(name = "EDUCATION")
    private String education; //41
    @Column(name = "RELIGION")
    private String religion; //42
    @Column(name = "GENDER")
    private String gender; //43
    @Column(name = "MOTHMAIDEN")
    private String mothMaiden; //44
    @Column(name = "FUNDSOURCE")
    private String fundSource; //45
    @Column(name = "FUNDSOURCEAMT")
    private String fundSourceAMT; //46
    @Column(name = "EMPLOYMENTSTATUS")
    private String employmentStatus; //47
    @Column(name = "EMPLOYERSNAME")
    private String employersName; //48
    @Column(name = "JOBTITLE")
    private String jobTitle; //49
    @Column(name = "OCCUPATION")
    private String occupation; //50
    @Column(name = "EMPLOYERSADD")
    private String employersAdd; //51
    @Column(name = "EMPLOYERSBUSS")
    private String employersBuss; //52
    @Column(name = "EMPLOYMENTSTART")
    private String employmentStart; //53
    @Column(name = "FUNDPROVNAME")
    private String fundProvName; //54
    @Column(name = "OFFPHONE")
    private String offPhone; //55
    @Column(name = "TAXID")
    private String taxID; //56
    @Column(name = "FUNDPROVJOB")
    private String fundProvJob; //57
    @Column(name = "FUNDPROVADDR")
    private String fundProvAddr; //58
    @Column(name = "FUNDPROVPHONE")
    private String fundProvePhone; //59
    @Column(name = "GUARANTORCODE")
    private String guarantorCode; //60
    @Column(name = "SIDRELATIBANK")
    private String sidRelatiBank; //61
    @Column(name = "LBUCUSTTYPE")
    private String lBuCustType; //62
    @Column(name = "CUSTOMERRATING")
    private String customerRating; //63
    @Column(name = "CIFNO")
    private String cifNo; //64
    @Column(name = "RESPONSE_CIF")
    private String responseCif; //65
    @Column(name = "CURRENCY")
    private String currency; //66
    @Column(name = "ZAKAT")
    private String zakat; //67
    @Column(name = "BONUS")
    private String bonus; //68
    @Column(name = "ATM")
    private String atm; //69
    @Column(name = "PASSBOOK")
    private String passBook; //70
    @Column(name = "ACOPENPURPOSE")
    private String acopenPurpose; //71
    @Column(name = "PRINTEDNAME")
    private String printedName; //72
    @Column(name = "ACCOUNTOFFICER")
    private String accountOfficer; //73
    @Column(name = "ACCOUNTNO")
    private String accountNo; //74
    @Column(name = "MSGID")
    private String msgId; //75
    @Column(name = "STATUS")
    private String status; //76
    @Column(name = "USER_CREATED_BY")
    private String userCreatedBy; //77
    @Column(name = "USER_CREATED_BY_NAME")
    private String userCreatedByName; //78
    @Column(name = "USER_CREATED_BRANCH")
    private String userCreatedBranch; //79
    @Column(name = "USER_CREATED_BRANCH_GROUP")
    private String userCreatedBranchGroup; //80
    @Column(name = "USER_CREATED_DATE")
    private String userCreatedDate; //81
    @Column(name = "USER_CREATED_TIME")
    private String userCreatedTime; //82
    @Column(name = "USER_VERIFIED_BY")
    private String userVerifiedBy; //83
    @Column(name = "USER_VERIFIED_BY_NAME")
    private String userVerifiedByName; //84
    @Column(name = "USER_VERIFIED_BRANCH")
    private String userVerifiedBranch; //85
    @Column(name = "USER_VERIFIED_DATE")
    private String userVerifiedDate; //86
    @Column(name = "USER_VERIFIED_TIME")
    private String userVerifiedTime; //87
    @Column(name = "USER_UPDATED_BY")
    private String userUpdatedBy; //88
    @Column(name = "USER_UPDATED_BY_NAME")
    private String userUpdatedByName; //89
    @Column(name = "USER_UPDATED_BRANCH")
    private String userUpdatedBranch; //90
    @Column(name = "USER_UPDATED_DATE")
    private String userUpdatedDate; //91
    @Column(name = "USER_UPDATED_TIME")
    private String userUpdateTime; //92
    @Column(name = "USER_APPROVED_BY")
    private String userApprovedBy; //93
    @Column(name = "USER_APPROVED_BY_NAME")
    private String userApprovedByName; //94
    @Column(name = "USER_APPROVED_BRANCH")
    private String userApprovedBranch; // 95
    @Column(name = "USER_APPROVED_DATE")
    private String userApprovedDate; //96
    @Column(name = "USER_APPROVED_TIME")
    private String userApprovedTime; //97
    @Column(name = "USER_DELETED_BY")
    private String userDeletedBy; //98
    @Column(name = "USER_DELETED_BY_NAME")
    private String userDeletedByName; //99
    @Column(name = "USER_DELETED_BRANCH")
    private String userDeletedBranch; //100
    @Column(name = "USER_DELETED_DATE")
    private String userDeletedDate; //101
    @Column(name = "USER_DELETED_TIME")
    private String userDeletedTime; //102
    @Column(name = "TAGGINGCODE")
    private String taggingCode; //103
    @Column(name = "TAGGINGCIF")
    private String taggingCIF; // 104
    @Column(name = "TAGGINGSTATUS")
    private String taggingStatus; // 105
    @Column(name = "FATHERNAME")
    private String fatherName; // 106
    @Column(name = "EVENTCODE")
    private String eventCode; // 107
    @Column(name = "ADDRSTREETDET")
    private String addStreetDet; //108
    @Column(name = "TICKET_CHANNEL")
    private String ticketChannel; //109
    @Column(name = "OPEN_TYPE")
    private String openType; //110
    @Column(name = "CUSTOMER_TYPE")
    private String customerType; //111
    @Column(name = "RISKLEVELID")
    private String riskLevelID; //112
    
    @Column(name = "transactionId")
    protected String transactionId;
    
    public String getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getRiskLevelID() {
        return riskLevelID;
    }
    public void setRiskLevelID(String riskLevelID) {
        this.riskLevelID = riskLevelID;
    }
    public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getOpenType() {
        return openType;
    }
    public void setOpenType(String openType) {
        this.openType = openType;
    }
    public String getTicketChannel() {
        return ticketChannel;
    }
    public void setTicketChannel(String ticketChannel) {
        this.ticketChannel = ticketChannel;
    }
    public String getAddStreetDet() {
        return addStreetDet;
    }
    public void setAddStreetDet(String addStreetDet) {
        this.addStreetDet = addStreetDet;
    }
    public String getEventCode() {
        return eventCode;
    }
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getTaggingStatus() {
        return taggingStatus;
    }
    public void setTaggingStatus(String taggingStatus) {
        this.taggingStatus = taggingStatus;
    }
    public String getTaggingCIF() {
        return taggingCIF;
    }
    public void setTaggingCIF(String taggingCIF) {
        this.taggingCIF = taggingCIF;
    }
    public String getTaggingCode() {
        return taggingCode;
    }
    public void setTaggingCode(String taggingCode) {
        this.taggingCode = taggingCode;
    }
    public String getUserDeletedTime() {
        return userDeletedTime;
    }
    public void setUserDeletedTime(String userDeletedTime) {
        this.userDeletedTime = userDeletedTime;
    }
    public String getUserDeletedDate() {
        return userDeletedDate;
    }
    public void setUserDeletedDate(String userDeletedDate) {
        this.userDeletedDate = userDeletedDate;
    }
    public String getUserDeletedBranch() {
        return userDeletedBranch;
    }
    public void setUserDeletedBranch(String userDeletedBranch) {
        this.userDeletedBranch = userDeletedBranch;
    }
    public String getUserDeletedByName() {
        return userDeletedByName;
    }
    public void setUserDeletedByName(String userDeletedByName) {
        this.userDeletedByName = userDeletedByName;
    }
    public String getUserDeletedBy() {
        return userDeletedBy;
    }
    public void setUserDeletedBy(String userDeletedBy) {
        this.userDeletedBy = userDeletedBy;
    }
    public String getUserApprovedTime() {
        return userApprovedTime;
    }
    public void setUserApprovedTime(String userApprovedTime) {
        this.userApprovedTime = userApprovedTime;
    }
    public String getUserApprovedDate() {
        return userApprovedDate;
    }
    public void setUserApprovedDate(String userApprovedDate) {
        this.userApprovedDate = userApprovedDate;
    }
    public String getUserApprovedBranch() {
        return userApprovedBranch;
    }
    public void setUserApprovedBranch(String userApprovedBranch) {
        this.userApprovedBranch = userApprovedBranch;
    }
    public String getUserApprovedByName() {
        return userApprovedByName;
    }
    public void setUserApprovedByName(String userApprovedByName) {
        this.userApprovedByName = userApprovedByName;
    }
    public String getUserApprovedBy() {
        return userApprovedBy;
    }
    public void setUserApprovedBy(String userApprovedBy) {
        this.userApprovedBy = userApprovedBy;
    }
    public String getUserUpdateTime() {
        return userUpdateTime;
    }
    public void setUserUpdateTime(String userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }
    public String getUserUpdatedDate() {
        return userUpdatedDate;
    }
    public void setUserUpdatedDate(String userUpdatedDate) {
        this.userUpdatedDate = userUpdatedDate;
    }
    public String getUserUpdatedBranch() {
        return userUpdatedBranch;
    }
    public void setUserUpdatedBranch(String userUpdatedBranch) {
        this.userUpdatedBranch = userUpdatedBranch;
    }
    public String getUserUpdatedByName() {
        return userUpdatedByName;
    }
    public void setUserUpdatedByName(String userUpdatedByName) {
        this.userUpdatedByName = userUpdatedByName;
    }
    public String getUserUpdatedBy() {
        return userUpdatedBy;
    }
    public void setUserUpdatedBy(String userUpdatedBy) {
        this.userUpdatedBy = userUpdatedBy;
    }
    public String getUserVerifiedTime() {
        return userVerifiedTime;
    }
    public void setUserVerifiedTime(String userVerifiedTime) {
        this.userVerifiedTime = userVerifiedTime;
    }
    public String getUserVerifiedDate() {
        return userVerifiedDate;
    }
    public void setUserVerifiedDate(String userVerifiedDate) {
        this.userVerifiedDate = userVerifiedDate;
    }
    public String getUserVerifiedBranch() {
        return userVerifiedBranch;
    }
    public void setUserVerifiedBranch(String userVerifiedBranch) {
        this.userVerifiedBranch = userVerifiedBranch;
    }
    public String getUserVerifiedByName() {
        return userVerifiedByName;
    }
    public void setUserVerifiedByName(String userVerifiedByName) {
        this.userVerifiedByName = userVerifiedByName;
    }
    public String getUserVerifiedBy() {
        return userVerifiedBy;
    }
    public void setUserVerifiedBy(String userVerifiedBy) {
        this.userVerifiedBy = userVerifiedBy;
    }
    public String getUserCreatedTime() {
        return userCreatedTime;
    }
    public void setUserCreatedTime(String userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }
    public String getUserCreatedDate() {
        return userCreatedDate;
    }
    public void setUserCreatedDate(String userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }
    public String getUserCreatedBranchGroup() {
        return userCreatedBranchGroup;
    }
    public void setUserCreatedBranchGroup(String userCreatedBranchGroup) {
        this.userCreatedBranchGroup = userCreatedBranchGroup;
    }
    public String getUserCreatedBranch() {
        return userCreatedBranch;
    }
    public void setUserCreatedBranch(String userCreatedBranch) {
        this.userCreatedBranch = userCreatedBranch;
    }
    public String getUserCreatedByName() {
        return userCreatedByName;
    }
    public void setUserCreatedByName(String userCreatedByName) {
        this.userCreatedByName = userCreatedByName;
    }
    public String getUserCreatedBy() {
        return userCreatedBy;
    }
    public void setUserCreatedBy(String userCreatedBy) {
        this.userCreatedBy = userCreatedBy;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMsgId() {
        return msgId;
    }
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountOfficer() {
        return accountOfficer;
    }
    public void setAccountOfficer(String accountOfficer) {
        this.accountOfficer = accountOfficer;
    }
    public String getPrintedName() {
        return printedName;
    }
    public void setPrintedName(String printedName) {
        this.printedName = printedName;
    }
    public String getAcopenPurpose() {
        return acopenPurpose;
    }
    public void setAcopenPurpose(String acopenPurpose) {
        this.acopenPurpose = acopenPurpose;
    }
    public String getPassBook() {
        return passBook;
    }
    public void setPassBook(String passBook) {
        this.passBook = passBook;
    }
    public String getAtm() {
        return atm;
    }
    public void setAtm(String atm) {
        this.atm = atm;
    }
    public String getBonus() {
        return bonus;
    }
    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    public String getZakat() {
        return zakat;
    }
    public void setZakat(String zakat) {
        this.zakat = zakat;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getResponseCif() {
        return responseCif;
    }
    public void setResponseCif(String responseCif) {
        this.responseCif = responseCif;
    }
    public String getCifNo() {
        return cifNo;
    }
    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }
    public String getCustomerRating() {
        return customerRating;
    }
    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }
    public String getlBuCustType() {
        return lBuCustType;
    }
    public void setlBuCustType(String lBuCustType) {
        this.lBuCustType = lBuCustType;
    }
    public String getSidRelatiBank() {
        return sidRelatiBank;
    }
    public void setSidRelatiBank(String sidRelatiBank) {
        this.sidRelatiBank = sidRelatiBank;
    }
    public String getGuarantorCode() {
        return guarantorCode;
    }
    public void setGuarantorCode(String guarantorCode) {
        this.guarantorCode = guarantorCode;
    }
    public String getFundProvePhone() {
        return fundProvePhone;
    }
    public void setFundProvePhone(String fundProvePhone) {
        this.fundProvePhone = fundProvePhone;
    }
    public String getFundProvAddr() {
        return fundProvAddr;
    }
    public void setFundProvAddr(String fundProvAddr) {
        this.fundProvAddr = fundProvAddr;
    }
    public String getFundProvJob() {
        return fundProvJob;
    }
    public void setFundProvJob(String fundProvJob) {
        this.fundProvJob = fundProvJob;
    }
    public String getTaxID() {
        return taxID;
    }
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }
    public String getOffPhone() {
        return offPhone;
    }
    public void setOffPhone(String offPhone) {
        this.offPhone = offPhone;
    }
    public String getFundProvName() {
        return fundProvName;
    }
    public void setFundProvName(String fundProvName) {
        this.fundProvName = fundProvName;
    }
    public String getEmploymentStart() {
        return employmentStart;
    }
    public void setEmploymentStart(String employmentStart) {
        this.employmentStart = employmentStart;
    }
    public String getEmployersBuss() {
        return employersBuss;
    }
    public void setEmployersBuss(String employersBuss) {
        this.employersBuss = employersBuss;
    }
    public String getEmployersAdd() {
        return employersAdd;
    }
    public void setEmployersAdd(String employersAdd) {
        this.employersAdd = employersAdd;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getEmployersName() {
        return employersName;
    }
    public void setEmployersName(String employersName) {
        this.employersName = employersName;
    }
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
    public String getFundSourceAMT() {
        return fundSourceAMT;
    }
    public void setFundSourceAMT(String fundSourceAMT) {
        this.fundSourceAMT = fundSourceAMT;
    }
    public String getFundSource() {
        return fundSource;
    }
    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
    }
    public String getMothMaiden() {
        return mothMaiden;
    }
    public void setMothMaiden(String mothMaiden) {
        this.mothMaiden = mothMaiden;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSms() {
        return sms;
    }
    public void setSms(String sms) {
        this.sms = sms;
    }
    public String getAddrPhoneNo() {
        return addrPhoneNo;
    }
    public void setAddrPhoneNo(String addrPhoneNo) {
        this.addrPhoneNo = addrPhoneNo;
    }
    public String getAddrPhoneArea() {
        return addrPhoneArea;
    }
    public void setAddrPhoneArea(String addrPhoneArea) {
        this.addrPhoneArea = addrPhoneArea;
    }
    public String getAddrPostCode() {
        return addrPostCode;
    }
    public void setAddrPostCode(String addrPostCode) {
        this.addrPostCode = addrPostCode;
    }
    public String getAddrDistrict() {
        return addrDistrict;
    }
    public void setAddrDistrict(String addrDistrict) {
        this.addrDistrict = addrDistrict;
    }
    public String getAddrCountry() {
        return addrCountry;
    }
    public void setAddrCountry(String addrCountry) {
        this.addrCountry = addrCountry;
    }
    public String getAddrMunicipal() {
        return addrMunicipal;
    }
    public void setAddrMunicipal(String addrMunicipal) {
        this.addrMunicipal = addrMunicipal;
    }
    public String getAddrSuburBtwn() {
        return addrSuburBtwn;
    }
    public void setAddrSuburBtwn(String addrSuburBtwn) {
        this.addrSuburBtwn = addrSuburBtwn;
    }
    public String getAddrProvince() {
        return addrProvince;
    }
    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }
    public String getAddrRW() {
        return addrRW;
    }
    public void setAddrRW(String addrRW) {
        this.addrRW = addrRW;
    }
    public String getAddrRT() {
        return addrRT;
    }
    public void setAddrRT(String addrRT) {
        this.addrRT = addrRT;
    }
    public String getAddrStreet() {
        return addrStreet;
    }
    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }
    public String getAddrType() {
        return addrType;
    }
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public String getResidence() {
        return residence;
    }
    public void setResidence(String residence) {
        this.residence = residence;
    }
    public String getTownCountry() {
        return townCountry;
    }
    public void setTownCountry(String townCountry) {
        this.townCountry = townCountry;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getDistrictCode() {
        return districtCode;
    }
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getRw() {
        return rw;
    }
    public void setRw(String rw) {
        this.rw = rw;
    }
    public String getRt() {
        return rt;
    }
    public void setRt(String rt) {
        this.rt = rt;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPlaceBirth() {
        return placeBirth;
    }
    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }
    public String getCustTitle2() {
        return custTitle2;
    }
    public void setCustTitle2(String custTitle2) {
        this.custTitle2 = custTitle2;
    }
    public String getCustTitle1() {
        return custTitle1;
    }
    public void setCustTitle1(String custTitle1) {
        this.custTitle1 = custTitle1;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getName1() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getLegalIdNo() {
        return legalIdNo;
    }
    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo;
    }
    public String getLegalType() {
        return legalType;
    }
    public void setLegalType(String legalType) {
        this.legalType = legalType;
    }
    public String getResideYN() {
        return resideYN;
    }
    public void setResideYN(String resideYN) {
        this.resideYN = resideYN;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getCardNo() {
        return cardNo;
    }
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    public String getTicketNo() {
        return ticketNo;
    }
    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }
    public void setId(String idNumber) {
        this.id = idNumber;
    }
    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
}

