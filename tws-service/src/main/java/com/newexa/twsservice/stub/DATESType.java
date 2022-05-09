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
 * <p>Java class for DATESType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATESType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LASTWORKINGDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NEXTWORKINGDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCALPAYMENTDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCALDISPODAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BACKVALUEMINIMUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BACKVALUEMAXIMUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FORWVALUEMINIMUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FORWVALUEMAXIMUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COBATCHSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERIODEND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTINGSTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JULIANDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENTDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LASTPERIODEND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BKBALDATESTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gOVERRIDE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gINPUTTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gDATETIME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DATESType", propOrder = {
    "today",
    "version",
    "lastworkingday",
    "nextworkingday",
    "localpaymentday",
    "localdispoday",
    "backvalueminimum",
    "backvaluemaximum",
    "forwvalueminimum",
    "forwvaluemaximum",
    "cobatchstatus",
    "periodend",
    "accountingstage",
    "juliandate",
    "currentday",
    "lastperiodend",
    "bkbaldatestart",
    "reserved2",
    "reserved1",
    "goverride",
    "recordstatus",
    "currno",
    "ginputter",
    "gdatetime",
    "authoriser",
    "cocode",
    "deptcode",
    "auditorcode",
    "auditdatetime"
})
public class DATESType {

    @XmlElement(name = "TODAY")
    protected String today;
    @XmlElement(name = "VERSION")
    protected String version;
    @XmlElement(name = "LASTWORKINGDAY")
    protected String lastworkingday;
    @XmlElement(name = "NEXTWORKINGDAY")
    protected String nextworkingday;
    @XmlElement(name = "LOCALPAYMENTDAY")
    protected String localpaymentday;
    @XmlElement(name = "LOCALDISPODAY")
    protected String localdispoday;
    @XmlElement(name = "BACKVALUEMINIMUM")
    protected String backvalueminimum;
    @XmlElement(name = "BACKVALUEMAXIMUM")
    protected String backvaluemaximum;
    @XmlElement(name = "FORWVALUEMINIMUM")
    protected String forwvalueminimum;
    @XmlElement(name = "FORWVALUEMAXIMUM")
    protected String forwvaluemaximum;
    @XmlElement(name = "COBATCHSTATUS")
    protected String cobatchstatus;
    @XmlElement(name = "PERIODEND")
    protected String periodend;
    @XmlElement(name = "ACCOUNTINGSTAGE")
    protected String accountingstage;
    @XmlElement(name = "JULIANDATE")
    protected String juliandate;
    @XmlElement(name = "CURRENTDAY")
    protected String currentday;
    @XmlElement(name = "LASTPERIODEND")
    protected String lastperiodend;
    @XmlElement(name = "BKBALDATESTART")
    protected String bkbaldatestart;
    @XmlElement(name = "RESERVED2")
    protected String reserved2;
    @XmlElement(name = "RESERVED1")
    protected String reserved1;
    @XmlElement(name = "gOVERRIDE")
    protected DATESType.GOVERRIDE goverride;
    @XmlElement(name = "RECORDSTATUS")
    protected String recordstatus;
    @XmlElement(name = "CURRNO")
    protected String currno;
    @XmlElement(name = "gINPUTTER")
    protected DATESType.GINPUTTER ginputter;
    @XmlElement(name = "gDATETIME")
    protected DATESType.GDATETIME gdatetime;
    @XmlElement(name = "AUTHORISER")
    protected String authoriser;
    @XmlElement(name = "COCODE")
    protected String cocode;
    @XmlElement(name = "DEPTCODE")
    protected String deptcode;
    @XmlElement(name = "AUDITORCODE")
    protected String auditorcode;
    @XmlElement(name = "AUDITDATETIME")
    protected String auditdatetime;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the today property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODAY() {
        return today;
    }

    /**
     * Sets the value of the today property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODAY(String value) {
        this.today = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the lastworkingday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTWORKINGDAY() {
        return lastworkingday;
    }

    /**
     * Sets the value of the lastworkingday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTWORKINGDAY(String value) {
        this.lastworkingday = value;
    }

    /**
     * Gets the value of the nextworkingday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEXTWORKINGDAY() {
        return nextworkingday;
    }

    /**
     * Sets the value of the nextworkingday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEXTWORKINGDAY(String value) {
        this.nextworkingday = value;
    }

    /**
     * Gets the value of the localpaymentday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALPAYMENTDAY() {
        return localpaymentday;
    }

    /**
     * Sets the value of the localpaymentday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALPAYMENTDAY(String value) {
        this.localpaymentday = value;
    }

    /**
     * Gets the value of the localdispoday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDISPODAY() {
        return localdispoday;
    }

    /**
     * Sets the value of the localdispoday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDISPODAY(String value) {
        this.localdispoday = value;
    }

    /**
     * Gets the value of the backvalueminimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKVALUEMINIMUM() {
        return backvalueminimum;
    }

    /**
     * Sets the value of the backvalueminimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKVALUEMINIMUM(String value) {
        this.backvalueminimum = value;
    }

    /**
     * Gets the value of the backvaluemaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKVALUEMAXIMUM() {
        return backvaluemaximum;
    }

    /**
     * Sets the value of the backvaluemaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKVALUEMAXIMUM(String value) {
        this.backvaluemaximum = value;
    }

    /**
     * Gets the value of the forwvalueminimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORWVALUEMINIMUM() {
        return forwvalueminimum;
    }

    /**
     * Sets the value of the forwvalueminimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORWVALUEMINIMUM(String value) {
        this.forwvalueminimum = value;
    }

    /**
     * Gets the value of the forwvaluemaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORWVALUEMAXIMUM() {
        return forwvaluemaximum;
    }

    /**
     * Sets the value of the forwvaluemaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORWVALUEMAXIMUM(String value) {
        this.forwvaluemaximum = value;
    }

    /**
     * Gets the value of the cobatchstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOBATCHSTATUS() {
        return cobatchstatus;
    }

    /**
     * Sets the value of the cobatchstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOBATCHSTATUS(String value) {
        this.cobatchstatus = value;
    }

    /**
     * Gets the value of the periodend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIODEND() {
        return periodend;
    }

    /**
     * Sets the value of the periodend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIODEND(String value) {
        this.periodend = value;
    }

    /**
     * Gets the value of the accountingstage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTINGSTAGE() {
        return accountingstage;
    }

    /**
     * Sets the value of the accountingstage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTINGSTAGE(String value) {
        this.accountingstage = value;
    }

    /**
     * Gets the value of the juliandate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJULIANDATE() {
        return juliandate;
    }

    /**
     * Sets the value of the juliandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJULIANDATE(String value) {
        this.juliandate = value;
    }

    /**
     * Gets the value of the currentday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTDAY() {
        return currentday;
    }

    /**
     * Sets the value of the currentday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTDAY(String value) {
        this.currentday = value;
    }

    /**
     * Gets the value of the lastperiodend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTPERIODEND() {
        return lastperiodend;
    }

    /**
     * Sets the value of the lastperiodend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTPERIODEND(String value) {
        this.lastperiodend = value;
    }

    /**
     * Gets the value of the bkbaldatestart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKBALDATESTART() {
        return bkbaldatestart;
    }

    /**
     * Sets the value of the bkbaldatestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKBALDATESTART(String value) {
        this.bkbaldatestart = value;
    }

    /**
     * Gets the value of the reserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED2() {
        return reserved2;
    }

    /**
     * Sets the value of the reserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED2(String value) {
        this.reserved2 = value;
    }

    /**
     * Gets the value of the reserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED1() {
        return reserved1;
    }

    /**
     * Sets the value of the reserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED1(String value) {
        this.reserved1 = value;
    }

    /**
     * Gets the value of the goverride property.
     * 
     * @return
     *     possible object is
     *     {@link DATESType.GOVERRIDE }
     *     
     */
    public DATESType.GOVERRIDE getGOVERRIDE() {
        return goverride;
    }

    /**
     * Sets the value of the goverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATESType.GOVERRIDE }
     *     
     */
    public void setGOVERRIDE(DATESType.GOVERRIDE value) {
        this.goverride = value;
    }

    /**
     * Gets the value of the recordstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDSTATUS() {
        return recordstatus;
    }

    /**
     * Sets the value of the recordstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDSTATUS(String value) {
        this.recordstatus = value;
    }

    /**
     * Gets the value of the currno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRNO() {
        return currno;
    }

    /**
     * Sets the value of the currno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRNO(String value) {
        this.currno = value;
    }

    /**
     * Gets the value of the ginputter property.
     * 
     * @return
     *     possible object is
     *     {@link DATESType.GINPUTTER }
     *     
     */
    public DATESType.GINPUTTER getGINPUTTER() {
        return ginputter;
    }

    /**
     * Sets the value of the ginputter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATESType.GINPUTTER }
     *     
     */
    public void setGINPUTTER(DATESType.GINPUTTER value) {
        this.ginputter = value;
    }

    /**
     * Gets the value of the gdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link DATESType.GDATETIME }
     *     
     */
    public DATESType.GDATETIME getGDATETIME() {
        return gdatetime;
    }

    /**
     * Sets the value of the gdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATESType.GDATETIME }
     *     
     */
    public void setGDATETIME(DATESType.GDATETIME value) {
        this.gdatetime = value;
    }

    /**
     * Gets the value of the authoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORISER() {
        return authoriser;
    }

    /**
     * Sets the value of the authoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORISER(String value) {
        this.authoriser = value;
    }

    /**
     * Gets the value of the cocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOCODE() {
        return cocode;
    }

    /**
     * Sets the value of the cocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOCODE(String value) {
        this.cocode = value;
    }

    /**
     * Gets the value of the deptcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTCODE() {
        return deptcode;
    }

    /**
     * Sets the value of the deptcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTCODE(String value) {
        this.deptcode = value;
    }

    /**
     * Gets the value of the auditorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITORCODE() {
        return auditorcode;
    }

    /**
     * Sets the value of the auditorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITORCODE(String value) {
        this.auditorcode = value;
    }

    /**
     * Gets the value of the auditdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITDATETIME() {
        return auditdatetime;
    }

    /**
     * Sets the value of the auditdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITDATETIME(String value) {
        this.auditdatetime = value;
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
     *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "datetime"
    })
    public static class GDATETIME {

        @XmlElement(name = "DATETIME")
        protected List<String> datetime;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the datetime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datetime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATETIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDATETIME() {
            if (datetime == null) {
                datetime = new ArrayList<String>();
            }
            return this.datetime;
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
     *         &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "inputter"
    })
    public static class GINPUTTER {

        @XmlElement(name = "INPUTTER")
        protected List<String> inputter;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inputter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINPUTTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINPUTTER() {
            if (inputter == null) {
                inputter = new ArrayList<String>();
            }
            return this.inputter;
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
     *         &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "override"
    })
    public static class GOVERRIDE {

        @XmlElement(name = "OVERRIDE")
        protected List<String> override;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the override property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the override property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOVERRIDE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOVERRIDE() {
            if (override == null) {
                override = new ArrayList<String>();
            }
            return this.override;
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

    }

}
