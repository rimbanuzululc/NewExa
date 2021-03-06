//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 09:30:48 AM ICT 
//


package com.newexa.twsservice.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNTIDITAPREGOPENTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTIDITAPREGOPENTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTERESTLIQUACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALTACCTID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gJOINTHOLDER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mJOINTHOLDER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="JOINTHOLDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RELATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="JOINTNOTES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NOREFERAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MUDNISBAHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZAKAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QQNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACOPENPURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTHACCPURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFOUTSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFPROGRAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTRECVBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPOSITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPSTARTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPMATDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPTERM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEBITACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSURANCEPERC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNTIDITAPREGOPENTWSType", propOrder = {
    "customer",
    "category",
    "accounttitle1",
    "currency",
    "accountofficer",
    "interestliquacct",
    "passbook",
    "altacctid1",
    "gjointholder",
    "noreferal",
    "mudnisbahbank",
    "zakat",
    "qqname",
    "taxable",
    "acopenpurpose",
    "othaccpurpose",
    "refoutsource",
    "refprogram",
    "eventcode",
    "acctrecvbonus",
    "depositamount",
    "depstartdate",
    "depmatdate",
    "depterm",
    "debitaccount",
    "insuranceperc",
    "instamount"
})
public class ACCOUNTIDITAPREGOPENTWSType {

    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "ACCOUNTTITLE1")
    protected String accounttitle1;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "ACCOUNTOFFICER")
    protected String accountofficer;
    @XmlElement(name = "INTERESTLIQUACCT")
    protected String interestliquacct;
    @XmlElement(name = "PASSBOOK")
    protected String passbook;
    @XmlElement(name = "ALTACCTID1")
    protected String altacctid1;
    @XmlElement(name = "gJOINTHOLDER")
    protected ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER gjointholder;
    @XmlElement(name = "NOREFERAL")
    protected String noreferal;
    @XmlElement(name = "MUDNISBAHBANK")
    protected String mudnisbahbank;
    @XmlElement(name = "ZAKAT")
    protected String zakat;
    @XmlElement(name = "QQNAME")
    protected String qqname;
    @XmlElement(name = "TAXABLE")
    protected String taxable;
    @XmlElement(name = "ACOPENPURPOSE")
    protected String acopenpurpose;
    @XmlElement(name = "OTHACCPURPOSE")
    protected String othaccpurpose;
    @XmlElement(name = "REFOUTSOURCE")
    protected String refoutsource;
    @XmlElement(name = "REFPROGRAM")
    protected String refprogram;
    @XmlElement(name = "EVENTCODE")
    protected String eventcode;
    @XmlElement(name = "ACCTRECVBONUS")
    protected String acctrecvbonus;
    @XmlElement(name = "DEPOSITAMOUNT")
    protected String depositamount;
    @XmlElement(name = "DEPSTARTDATE")
    protected String depstartdate;
    @XmlElement(name = "DEPMATDATE")
    protected String depmatdate;
    @XmlElement(name = "DEPTERM")
    protected String depterm;
    @XmlElement(name = "DEBITACCOUNT")
    protected String debitaccount;
    @XmlElement(name = "INSURANCEPERC")
    protected String insuranceperc;
    @XmlElement(name = "INSTAMOUNT")
    protected String instamount;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMER(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the accounttitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTITLE1() {
        return accounttitle1;
    }

    /**
     * Sets the value of the accounttitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTITLE1(String value) {
        this.accounttitle1 = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the accountofficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTOFFICER() {
        return accountofficer;
    }

    /**
     * Sets the value of the accountofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTOFFICER(String value) {
        this.accountofficer = value;
    }

    /**
     * Gets the value of the interestliquacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERESTLIQUACCT() {
        return interestliquacct;
    }

    /**
     * Sets the value of the interestliquacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERESTLIQUACCT(String value) {
        this.interestliquacct = value;
    }

    /**
     * Gets the value of the passbook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSBOOK() {
        return passbook;
    }

    /**
     * Sets the value of the passbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSBOOK(String value) {
        this.passbook = value;
    }

    /**
     * Gets the value of the altacctid1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTACCTID1() {
        return altacctid1;
    }

    /**
     * Sets the value of the altacctid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTACCTID1(String value) {
        this.altacctid1 = value;
    }

    /**
     * Gets the value of the gjointholder property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER }
     *     
     */
    public ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER getGJOINTHOLDER() {
        return gjointholder;
    }

    /**
     * Sets the value of the gjointholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER }
     *     
     */
    public void setGJOINTHOLDER(ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER value) {
        this.gjointholder = value;
    }

    /**
     * Gets the value of the noreferal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOREFERAL() {
        return noreferal;
    }

    /**
     * Sets the value of the noreferal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOREFERAL(String value) {
        this.noreferal = value;
    }

    /**
     * Gets the value of the mudnisbahbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUDNISBAHBANK() {
        return mudnisbahbank;
    }

    /**
     * Sets the value of the mudnisbahbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUDNISBAHBANK(String value) {
        this.mudnisbahbank = value;
    }

    /**
     * Gets the value of the zakat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZAKAT() {
        return zakat;
    }

    /**
     * Sets the value of the zakat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZAKAT(String value) {
        this.zakat = value;
    }

    /**
     * Gets the value of the qqname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQQNAME() {
        return qqname;
    }

    /**
     * Sets the value of the qqname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQQNAME(String value) {
        this.qqname = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXABLE() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXABLE(String value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the acopenpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACOPENPURPOSE() {
        return acopenpurpose;
    }

    /**
     * Sets the value of the acopenpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACOPENPURPOSE(String value) {
        this.acopenpurpose = value;
    }

    /**
     * Gets the value of the othaccpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHACCPURPOSE() {
        return othaccpurpose;
    }

    /**
     * Sets the value of the othaccpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHACCPURPOSE(String value) {
        this.othaccpurpose = value;
    }

    /**
     * Gets the value of the refoutsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFOUTSOURCE() {
        return refoutsource;
    }

    /**
     * Sets the value of the refoutsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFOUTSOURCE(String value) {
        this.refoutsource = value;
    }

    /**
     * Gets the value of the refprogram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFPROGRAM() {
        return refprogram;
    }

    /**
     * Sets the value of the refprogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFPROGRAM(String value) {
        this.refprogram = value;
    }

    /**
     * Gets the value of the eventcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTCODE() {
        return eventcode;
    }

    /**
     * Sets the value of the eventcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTCODE(String value) {
        this.eventcode = value;
    }

    /**
     * Gets the value of the acctrecvbonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTRECVBONUS() {
        return acctrecvbonus;
    }

    /**
     * Sets the value of the acctrecvbonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTRECVBONUS(String value) {
        this.acctrecvbonus = value;
    }

    /**
     * Gets the value of the depositamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOSITAMOUNT() {
        return depositamount;
    }

    /**
     * Sets the value of the depositamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOSITAMOUNT(String value) {
        this.depositamount = value;
    }

    /**
     * Gets the value of the depstartdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPSTARTDATE() {
        return depstartdate;
    }

    /**
     * Sets the value of the depstartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPSTARTDATE(String value) {
        this.depstartdate = value;
    }

    /**
     * Gets the value of the depmatdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPMATDATE() {
        return depmatdate;
    }

    /**
     * Sets the value of the depmatdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPMATDATE(String value) {
        this.depmatdate = value;
    }

    /**
     * Gets the value of the depterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTERM() {
        return depterm;
    }

    /**
     * Sets the value of the depterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTERM(String value) {
        this.depterm = value;
    }

    /**
     * Gets the value of the debitaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITACCOUNT() {
        return debitaccount;
    }

    /**
     * Sets the value of the debitaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITACCOUNT(String value) {
        this.debitaccount = value;
    }

    /**
     * Gets the value of the insuranceperc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURANCEPERC() {
        return insuranceperc;
    }

    /**
     * Sets the value of the insuranceperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURANCEPERC(String value) {
        this.insuranceperc = value;
    }

    /**
     * Gets the value of the instamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTAMOUNT() {
        return instamount;
    }

    /**
     * Sets the value of the instamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTAMOUNT(String value) {
        this.instamount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="mJOINTHOLDER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="JOINTHOLDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RELATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="JOINTNOTES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mjointholder"
    })
    public static class GJOINTHOLDER {

        @XmlElement(name = "mJOINTHOLDER")
        protected List<ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER> mjointholder;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mjointholder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mjointholder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMJOINTHOLDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER }
         * 
         * 
         */
        public List<ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER> getMJOINTHOLDER() {
            if (mjointholder == null) {
                mjointholder = new ArrayList<ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER>();
            }
            return this.mjointholder;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="JOINTHOLDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RELATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="JOINTNOTES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "jointholder",
            "relationcode",
            "sgJOINTNOTES"
        })
        public static class MJOINTHOLDER {

            @XmlElement(name = "JOINTHOLDER")
            protected String jointholder;
            @XmlElement(name = "RELATIONCODE")
            protected String relationcode;
            protected ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES sgJOINTNOTES;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the jointholder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJOINTHOLDER() {
                return jointholder;
            }

            /**
             * Sets the value of the jointholder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJOINTHOLDER(String value) {
                this.jointholder = value;
            }

            /**
             * Gets the value of the relationcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATIONCODE() {
                return relationcode;
            }

            /**
             * Sets the value of the relationcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATIONCODE(String value) {
                this.relationcode = value;
            }

            /**
             * Gets the value of the sgJOINTNOTES property.
             * 
             * @return
             *     possible object is
             *     {@link ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES }
             *     
             */
            public ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES getSgJOINTNOTES() {
                return sgJOINTNOTES;
            }

            /**
             * Sets the value of the sgJOINTNOTES property.
             * 
             * @param value
             *     allowed object is
             *     {@link ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES }
             *     
             */
            public void setSgJOINTNOTES(ACCOUNTIDITAPREGOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES value) {
                this.sgJOINTNOTES = value;
            }

            /**
             * Gets the value of the m property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Sets the value of the m property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="JOINTNOTES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "jointnotes"
            })
            public static class SgJOINTNOTES {

                @XmlElement(name = "JOINTNOTES")
                protected List<String> jointnotes;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the jointnotes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the jointnotes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getJOINTNOTES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getJOINTNOTES() {
                    if (jointnotes == null) {
                        jointnotes = new ArrayList<String>();
                    }
                    return this.jointnotes;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

    }

}
