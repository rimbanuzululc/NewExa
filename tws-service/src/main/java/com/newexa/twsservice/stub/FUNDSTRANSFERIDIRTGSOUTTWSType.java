//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 11:23:29 AM ICT 
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
 * <p>Java class for FUNDSTRANSFERIDIRTGSOUTTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDSTRANSFERIDIRTGSOUTTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekeningDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NominalDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TglValutaDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gORDERINGCUST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NamaPengirim" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gPAYMENTDETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Keterangan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RekeningBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KodeBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gCOMMISSIONTYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mCOMMISSIONTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="JenisBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NominalBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ProfitDeptCentre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BENNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BENACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTGSTXNCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTGSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOACCBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gORDER.CUST.ADDR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ORDERCUSTADDR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gRTGS.BEN.ADDR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RTGSBENADDR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORDERPOSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BENEPOSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FUNDSTRANSFERIDIRTGSOUTTWSType", propOrder = {
    "transactionType",
    "rekeningDebit",
    "nominalDebit",
    "tglValutaDebit",
    "gorderingcust",
    "gpaymentdetails",
    "rekeningBiaya",
    "kodeBiaya",
    "gcommissiontype",
    "profitDeptCentre",
    "benname",
    "benacc",
    "msgid",
    "rtgstxncode",
    "rtgscode",
    "toaccbranch",
    "gordercustaddr",
    "grtgsbenaddr",
    "orderpostcode",
    "benepostcode"
})
public class FUNDSTRANSFERIDIRTGSOUTTWSType {

    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "RekeningDebit")
    protected String rekeningDebit;
    @XmlElement(name = "NominalDebit")
    protected String nominalDebit;
    @XmlElement(name = "TglValutaDebit")
    protected String tglValutaDebit;
    @XmlElement(name = "gORDERINGCUST")
    protected FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERINGCUST gorderingcust;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected FUNDSTRANSFERIDIRTGSOUTTWSType.GPAYMENTDETAILS gpaymentdetails;
    @XmlElement(name = "RekeningBiaya")
    protected String rekeningBiaya;
    @XmlElement(name = "KodeBiaya")
    protected String kodeBiaya;
    @XmlElement(name = "gCOMMISSIONTYPE")
    protected FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE gcommissiontype;
    @XmlElement(name = "ProfitDeptCentre")
    protected String profitDeptCentre;
    @XmlElement(name = "BENNAME")
    protected String benname;
    @XmlElement(name = "BENACC")
    protected String benacc;
    @XmlElement(name = "MSGID")
    protected String msgid;
    @XmlElement(name = "RTGSTXNCODE")
    protected String rtgstxncode;
    @XmlElement(name = "RTGSCODE")
    protected String rtgscode;
    @XmlElement(name = "TOACCBRANCH")
    protected String toaccbranch;
    @XmlElement(name = "gORDER.CUST.ADDR")
    protected FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERCUSTADDR gordercustaddr;
    @XmlElement(name = "gRTGS.BEN.ADDR")
    protected FUNDSTRANSFERIDIRTGSOUTTWSType.GRTGSBENADDR grtgsbenaddr;
    @XmlElement(name = "ORDERPOSTCODE")
    protected String orderpostcode;
    @XmlElement(name = "BENEPOSTCODE")
    protected String benepostcode;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the rekeningDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningDebit() {
        return rekeningDebit;
    }

    /**
     * Sets the value of the rekeningDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningDebit(String value) {
        this.rekeningDebit = value;
    }

    /**
     * Gets the value of the nominalDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalDebit() {
        return nominalDebit;
    }

    /**
     * Sets the value of the nominalDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalDebit(String value) {
        this.nominalDebit = value;
    }

    /**
     * Gets the value of the tglValutaDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglValutaDebit() {
        return tglValutaDebit;
    }

    /**
     * Sets the value of the tglValutaDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglValutaDebit(String value) {
        this.tglValutaDebit = value;
    }

    /**
     * Gets the value of the gorderingcust property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERINGCUST }
     *     
     */
    public FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERINGCUST getGORDERINGCUST() {
        return gorderingcust;
    }

    /**
     * Sets the value of the gorderingcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERINGCUST }
     *     
     */
    public void setGORDERINGCUST(FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERINGCUST value) {
        this.gorderingcust = value;
    }

    /**
     * Gets the value of the gpaymentdetails property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GPAYMENTDETAILS }
     *     
     */
    public FUNDSTRANSFERIDIRTGSOUTTWSType.GPAYMENTDETAILS getGPAYMENTDETAILS() {
        return gpaymentdetails;
    }

    /**
     * Sets the value of the gpaymentdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GPAYMENTDETAILS }
     *     
     */
    public void setGPAYMENTDETAILS(FUNDSTRANSFERIDIRTGSOUTTWSType.GPAYMENTDETAILS value) {
        this.gpaymentdetails = value;
    }

    /**
     * Gets the value of the rekeningBiaya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekeningBiaya() {
        return rekeningBiaya;
    }

    /**
     * Sets the value of the rekeningBiaya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekeningBiaya(String value) {
        this.rekeningBiaya = value;
    }

    /**
     * Gets the value of the kodeBiaya property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeBiaya() {
        return kodeBiaya;
    }

    /**
     * Sets the value of the kodeBiaya property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeBiaya(String value) {
        this.kodeBiaya = value;
    }

    /**
     * Gets the value of the gcommissiontype property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE }
     *     
     */
    public FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE getGCOMMISSIONTYPE() {
        return gcommissiontype;
    }

    /**
     * Sets the value of the gcommissiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE }
     *     
     */
    public void setGCOMMISSIONTYPE(FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE value) {
        this.gcommissiontype = value;
    }

    /**
     * Gets the value of the profitDeptCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitDeptCentre() {
        return profitDeptCentre;
    }

    /**
     * Sets the value of the profitDeptCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitDeptCentre(String value) {
        this.profitDeptCentre = value;
    }

    /**
     * Gets the value of the benname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENNAME() {
        return benname;
    }

    /**
     * Sets the value of the benname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENNAME(String value) {
        this.benname = value;
    }

    /**
     * Gets the value of the benacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENACC() {
        return benacc;
    }

    /**
     * Sets the value of the benacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENACC(String value) {
        this.benacc = value;
    }

    /**
     * Gets the value of the msgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGID() {
        return msgid;
    }

    /**
     * Sets the value of the msgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGID(String value) {
        this.msgid = value;
    }

    /**
     * Gets the value of the rtgstxncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGSTXNCODE() {
        return rtgstxncode;
    }

    /**
     * Sets the value of the rtgstxncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTGSTXNCODE(String value) {
        this.rtgstxncode = value;
    }

    /**
     * Gets the value of the rtgscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGSCODE() {
        return rtgscode;
    }

    /**
     * Sets the value of the rtgscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTGSCODE(String value) {
        this.rtgscode = value;
    }

    /**
     * Gets the value of the toaccbranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOACCBRANCH() {
        return toaccbranch;
    }

    /**
     * Sets the value of the toaccbranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOACCBRANCH(String value) {
        this.toaccbranch = value;
    }

    /**
     * Gets the value of the gordercustaddr property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERCUSTADDR }
     *     
     */
    public FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERCUSTADDR getGORDERCUSTADDR() {
        return gordercustaddr;
    }

    /**
     * Sets the value of the gordercustaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERCUSTADDR }
     *     
     */
    public void setGORDERCUSTADDR(FUNDSTRANSFERIDIRTGSOUTTWSType.GORDERCUSTADDR value) {
        this.gordercustaddr = value;
    }

    /**
     * Gets the value of the grtgsbenaddr property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GRTGSBENADDR }
     *     
     */
    public FUNDSTRANSFERIDIRTGSOUTTWSType.GRTGSBENADDR getGRTGSBENADDR() {
        return grtgsbenaddr;
    }

    /**
     * Sets the value of the grtgsbenaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GRTGSBENADDR }
     *     
     */
    public void setGRTGSBENADDR(FUNDSTRANSFERIDIRTGSOUTTWSType.GRTGSBENADDR value) {
        this.grtgsbenaddr = value;
    }

    /**
     * Gets the value of the orderpostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERPOSTCODE() {
        return orderpostcode;
    }

    /**
     * Sets the value of the orderpostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERPOSTCODE(String value) {
        this.orderpostcode = value;
    }

    /**
     * Gets the value of the benepostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEPOSTCODE() {
        return benepostcode;
    }

    /**
     * Sets the value of the benepostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEPOSTCODE(String value) {
        this.benepostcode = value;
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
     *         &lt;element name="mCOMMISSIONTYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="JenisBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NominalBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mcommissiontype"
    })
    public static class GCOMMISSIONTYPE {

        @XmlElement(name = "mCOMMISSIONTYPE")
        protected List<FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> mcommissiontype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcommissiontype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcommissiontype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCOMMISSIONTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE }
         * 
         * 
         */
        public List<FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> getMCOMMISSIONTYPE() {
            if (mcommissiontype == null) {
                mcommissiontype = new ArrayList<FUNDSTRANSFERIDIRTGSOUTTWSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE>();
            }
            return this.mcommissiontype;
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
         *         &lt;element name="JenisBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NominalBiaya" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "jenisBiaya",
            "nominalBiaya"
        })
        public static class MCOMMISSIONTYPE {

            @XmlElement(name = "JenisBiaya")
            protected String jenisBiaya;
            @XmlElement(name = "NominalBiaya")
            protected String nominalBiaya;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the jenisBiaya property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJenisBiaya() {
                return jenisBiaya;
            }

            /**
             * Sets the value of the jenisBiaya property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJenisBiaya(String value) {
                this.jenisBiaya = value;
            }

            /**
             * Gets the value of the nominalBiaya property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNominalBiaya() {
                return nominalBiaya;
            }

            /**
             * Sets the value of the nominalBiaya property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNominalBiaya(String value) {
                this.nominalBiaya = value;
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
     *         &lt;element name="ORDERCUSTADDR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ordercustaddr"
    })
    public static class GORDERCUSTADDR {

        @XmlElement(name = "ORDERCUSTADDR")
        protected List<String> ordercustaddr;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the ordercustaddr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ordercustaddr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORDERCUSTADDR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getORDERCUSTADDR() {
            if (ordercustaddr == null) {
                ordercustaddr = new ArrayList<String>();
            }
            return this.ordercustaddr;
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
     *         &lt;element name="NamaPengirim" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "namaPengirim"
    })
    public static class GORDERINGCUST {

        @XmlElement(name = "NamaPengirim")
        protected List<String> namaPengirim;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the namaPengirim property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the namaPengirim property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNamaPengirim().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNamaPengirim() {
            if (namaPengirim == null) {
                namaPengirim = new ArrayList<String>();
            }
            return this.namaPengirim;
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
     *         &lt;element name="Keterangan" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "keterangan"
    })
    public static class GPAYMENTDETAILS {

        @XmlElement(name = "Keterangan")
        protected List<String> keterangan;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the keterangan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keterangan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeterangan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getKeterangan() {
            if (keterangan == null) {
                keterangan = new ArrayList<String>();
            }
            return this.keterangan;
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
     *         &lt;element name="RTGSBENADDR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "rtgsbenaddr"
    })
    public static class GRTGSBENADDR {

        @XmlElement(name = "RTGSBENADDR")
        protected List<String> rtgsbenaddr;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the rtgsbenaddr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rtgsbenaddr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRTGSBENADDR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRTGSBENADDR() {
            if (rtgsbenaddr == null) {
                rtgsbenaddr = new ArrayList<String>();
            }
            return this.rtgsbenaddr;
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
