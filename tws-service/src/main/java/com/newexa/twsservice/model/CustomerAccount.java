package com.newexa.twsservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reg_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccount {
    @Column(name = "username_maker")
    private String username;
    @Id
    @Column(name = "id")
	private String id; //1
    @Column(name = "cif_column_id")
    private String cif_column_id;
    @Column(name = "PRODUCTCODE")
    private String productCode; //2
    @Column(name = "SHORTNAME")
    private String shortName; //3
    @Column(name = "PRINTEDNAME")
    private String printedName; //4
    @Column(name = "PLACEBIRTH")
    private String placeBirth; //5
    @Column(name = "DATEOFBIRTH")
    private String dateOfBirth; //6
    @Column(name = "MOTHMAIDEN")
    private String mothMaiden; //7
    @Column(name = "CURRENCY")
    private String currency; //8
    @Column(name = "ZAKAT")
    private String zakat; //9
    @Column(name = "BONUS")
    private String bonus; //10
    @Column(name = "ATM")
    private String atm; //11
    @Column(name = "PASSBOOK")
    private String passBook; //12
    @Column(name = "EVENTCODE")
    private String eventCode; // 13
    @Column(name = "ACOPENPURPOSE")
    private String acopenPurpose; //14
    @Column(name = "ACCOUNTOFFICER")
    private String accountOfficer; //15
    @Column(name = "CIFNO")
    private String cifNo; //16
    @Column(name = "ACCOUNTNO")
    private String accountNo; //17
    @Column(name = "STATUS")
    private String status; //18
    @Column(name = "MSGID")
    private String msgId; //19
    @Column(name = "USER_CREATED_BY")
    private String userCreatedBy; //20
    @Column(name = "USER_CREATED_BY_NAME")
    private String userCreatedByName; //21
    @Column(name = "USER_CREATED_BRANCH")
    private String userCreatedBranch; //22
    @Column(name = "USER_CREATED_BRANCH_GROUP")
    private String userCreatedBranchGroup; //23
    @Column(name = "USER_CREATED_DATE")
    private String userCreatedDate; //24
    @Column(name = "USER_CREATED_TIME")
    private String userCreatedTime; //25
    @Column(name = "USER_UPDATED_BY")
    private String userUpdatedBy; //26
    @Column(name = "USER_UPDATED_BY_NAME")
    private String userUpdatedByName; //27
    @Column(name = "USER_UPDATED_BRANCH")
    private String userUpdatedBranch; //28
    @Column(name = "USER_UPDATED_DATE")
    private String userUpdatedDate; //29
    @Column(name = "USER_UPDATED_TIME")
    private String userUpdateTime; //30
    @Column(name = "USER_APPROVED_BY")
    private String userApprovedBy; //31
    @Column(name = "USER_APPROVED_BY_NAME")
    private String userApprovedByName; //32
    @Column(name = "USER_APPROVED_BRANCH")
    private String userApprovedBranch; // 33
    @Column(name = "USER_APPROVED_DATE")
    private String userApprovedDate; //34
    @Column(name = "USER_APPROVED_TIME")
    private String userApprovedTime; //35
    @Column(name = "USER_DELETED_BY")
    private String userDeletedBy; //36
    @Column(name = "USER_DELETED_BY_NAME")
    private String userDeletedByName; //37
    @Column(name = "USER_DELETED_BRANCH")
    private String userDeletedBranch; //38
    @Column(name = "USER_DELETED_DATE")
    private String userDeletedDate; //39
    @Column(name = "USER_DELETED_TIME")
    private String userDeletedTime; //40

    public String getId() {
        return id;
    }
    public String getCif_column_id() {
        return cif_column_id;
    }
    public void setCif_column_id(String cif_column_id) {
        this.cif_column_id = cif_column_id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
   
   
    public String getEventCode() {
        return eventCode;
    }
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
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
   
    public String getCifNo() {
        return cifNo;
    }
    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public String getMothMaiden() {
        return mothMaiden;
    }
    public void setMothMaiden(String mothMaiden) {
        this.mothMaiden = mothMaiden;
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
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
   
    public void setId(String idNumber) {
        this.id = idNumber;
    }
}