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
 * <p>Java class for FUNDSTRANSFERIDIACCTTRFCMSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDSTRANSFERIDIACCTTRFCMSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prosesdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPAYMENTDETAILS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="ProfitCentreDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountDebited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountCredited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FUNDSTRANSFERIDIACCTTRFCMSType", propOrder = {
    "transactionType",
    "debitAccount",
    "debitCurrency",
    "debitAmount",
    "debitValueDate",
    "creditAccount",
    "creditCurrency",
    "creditAmount",
    "creditValueDate",
    "prosesdate",
    "gpaymentdetails",
    "rekeningBiaya",
    "kodeBiaya",
    "gcommissiontype",
    "profitCentreDept",
    "amountDebited",
    "amountCredited",
    "msgid"
})
public class FUNDSTRANSFERIDIACCTTRFCMSType {

    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "DebitAccount")
    protected String debitAccount;
    @XmlElement(name = "DebitCurrency")
    protected String debitCurrency;
    @XmlElement(name = "DebitAmount")
    protected String debitAmount;
    @XmlElement(name = "DebitValueDate")
    protected String debitValueDate;
    @XmlElement(name = "CreditAccount")
    protected String creditAccount;
    @XmlElement(name = "CreditCurrency")
    protected String creditCurrency;
    @XmlElement(name = "CreditAmount")
    protected String creditAmount;
    @XmlElement(name = "CreditValueDate")
    protected String creditValueDate;
    @XmlElement(name = "Prosesdate")
    protected String prosesdate;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected FUNDSTRANSFERIDIACCTTRFCMSType.GPAYMENTDETAILS gpaymentdetails;
    @XmlElement(name = "RekeningBiaya")
    protected String rekeningBiaya;
    @XmlElement(name = "KodeBiaya")
    protected String kodeBiaya;
    @XmlElement(name = "gCOMMISSIONTYPE")
    protected FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE gcommissiontype;
    @XmlElement(name = "ProfitCentreDept")
    protected String profitCentreDept;
    @XmlElement(name = "AmountDebited")
    protected String amountDebited;
    @XmlElement(name = "AmountCredited")
    protected String amountCredited;
    @XmlElement(name = "MSGID")
    protected String msgid;
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
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccount(String value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the debitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCurrency() {
        return debitCurrency;
    }

    /**
     * Sets the value of the debitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCurrency(String value) {
        this.debitCurrency = value;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAmount() {
        return debitAmount;
    }

    /**
     * Sets the value of the debitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAmount(String value) {
        this.debitAmount = value;
    }

    /**
     * Gets the value of the debitValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitValueDate() {
        return debitValueDate;
    }

    /**
     * Sets the value of the debitValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitValueDate(String value) {
        this.debitValueDate = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccount(String value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the creditCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCurrency() {
        return creditCurrency;
    }

    /**
     * Sets the value of the creditCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCurrency(String value) {
        this.creditCurrency = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAmount(String value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the creditValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditValueDate() {
        return creditValueDate;
    }

    /**
     * Sets the value of the creditValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditValueDate(String value) {
        this.creditValueDate = value;
    }

    /**
     * Gets the value of the prosesdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProsesdate() {
        return prosesdate;
    }

    /**
     * Sets the value of the prosesdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProsesdate(String value) {
        this.prosesdate = value;
    }

    /**
     * Gets the value of the gpaymentdetails property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIACCTTRFCMSType.GPAYMENTDETAILS }
     *     
     */
    public FUNDSTRANSFERIDIACCTTRFCMSType.GPAYMENTDETAILS getGPAYMENTDETAILS() {
        return gpaymentdetails;
    }

    /**
     * Sets the value of the gpaymentdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIACCTTRFCMSType.GPAYMENTDETAILS }
     *     
     */
    public void setGPAYMENTDETAILS(FUNDSTRANSFERIDIACCTTRFCMSType.GPAYMENTDETAILS value) {
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
     *     {@link FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE }
     *     
     */
    public FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE getGCOMMISSIONTYPE() {
        return gcommissiontype;
    }

    /**
     * Sets the value of the gcommissiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE }
     *     
     */
    public void setGCOMMISSIONTYPE(FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE value) {
        this.gcommissiontype = value;
    }

    /**
     * Gets the value of the profitCentreDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCentreDept() {
        return profitCentreDept;
    }

    /**
     * Sets the value of the profitCentreDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCentreDept(String value) {
        this.profitCentreDept = value;
    }

    /**
     * Gets the value of the amountDebited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountDebited() {
        return amountDebited;
    }

    /**
     * Sets the value of the amountDebited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountDebited(String value) {
        this.amountDebited = value;
    }

    /**
     * Gets the value of the amountCredited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountCredited() {
        return amountCredited;
    }

    /**
     * Sets the value of the amountCredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountCredited(String value) {
        this.amountCredited = value;
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
        protected List<FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> mcommissiontype;
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
         * {@link FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE }
         * 
         * 
         */
        public List<FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE> getMCOMMISSIONTYPE() {
            if (mcommissiontype == null) {
                mcommissiontype = new ArrayList<FUNDSTRANSFERIDIACCTTRFCMSType.GCOMMISSIONTYPE.MCOMMISSIONTYPE>();
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
     *         &lt;element name="PaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "paymentDetails"
    })
    public static class GPAYMENTDETAILS {

        @XmlElement(name = "PaymentDetails")
        protected List<String> paymentDetails;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the paymentDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaymentDetails() {
            if (paymentDetails == null) {
                paymentDetails = new ArrayList<String>();
            }
            return this.paymentDetails;
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
