//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 03:43:40 PM ICT 
//


package com.newexa.cifchild.stub;

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
 * <p>Java class for IDIACCTSTMTCMSV1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIACCTSTMTCMSV1Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YPERIOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCSNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YHEAD1FIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BFWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMTBFWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTDWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTCWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YFOOT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YFOOT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIACCTSTMTCMSV1DetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIACCTSTMTCMSV1DetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TXNTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TRANSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="YSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TOTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDIACCTSTMTCMSV1Type", propOrder = {
    "yperiod2",
    "accsnm",
    "cusadd",
    "cusadd2",
    "cusadd3",
    "yhead1FIX",
    "bfwd",
    "amtbfwd",
    "totdword",
    "totcword",
    "totd",
    "totc",
    "dbal",
    "total",
    "yfoot2",
    "yfoot3",
    "zerorecords",
    "gidiacctstmtcmsv1DetailType"
})
public class IDIACCTSTMTCMSV1Type {

    @XmlElement(name = "YPERIOD2")
    protected String yperiod2;
    @XmlElement(name = "ACCSNM")
    protected String accsnm;
    @XmlElement(name = "CUSADD")
    protected String cusadd;
    @XmlElement(name = "CUSADD2")
    protected String cusadd2;
    @XmlElement(name = "CUSADD3")
    protected String cusadd3;
    @XmlElement(name = "YHEAD1FIX")
    protected String yhead1FIX;
    @XmlElement(name = "BFWD")
    protected String bfwd;
    @XmlElement(name = "AMTBFWD")
    protected String amtbfwd;
    @XmlElement(name = "TOTDWORD")
    protected String totdword;
    @XmlElement(name = "TOTCWORD")
    protected String totcword;
    @XmlElement(name = "TOTD")
    protected String totd;
    @XmlElement(name = "TOTC")
    protected String totc;
    @XmlElement(name = "DBAL")
    protected String dbal;
    @XmlElement(name = "TOTAL")
    protected String total;
    @XmlElement(name = "YFOOT2")
    protected String yfoot2;
    @XmlElement(name = "YFOOT3")
    protected String yfoot3;
    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIACCTSTMTCMSV1DetailType")
    protected IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType gidiacctstmtcmsv1DetailType;

    /**
     * Gets the value of the yperiod2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYPERIOD2() {
        return yperiod2;
    }

    /**
     * Sets the value of the yperiod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYPERIOD2(String value) {
        this.yperiod2 = value;
    }

    /**
     * Gets the value of the accsnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCSNM() {
        return accsnm;
    }

    /**
     * Sets the value of the accsnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCSNM(String value) {
        this.accsnm = value;
    }

    /**
     * Gets the value of the cusadd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSADD() {
        return cusadd;
    }

    /**
     * Sets the value of the cusadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSADD(String value) {
        this.cusadd = value;
    }

    /**
     * Gets the value of the cusadd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSADD2() {
        return cusadd2;
    }

    /**
     * Sets the value of the cusadd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSADD2(String value) {
        this.cusadd2 = value;
    }

    /**
     * Gets the value of the cusadd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSADD3() {
        return cusadd3;
    }

    /**
     * Sets the value of the cusadd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSADD3(String value) {
        this.cusadd3 = value;
    }

    /**
     * Gets the value of the yhead1FIX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYHEAD1FIX() {
        return yhead1FIX;
    }

    /**
     * Sets the value of the yhead1FIX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYHEAD1FIX(String value) {
        this.yhead1FIX = value;
    }

    /**
     * Gets the value of the bfwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBFWD() {
        return bfwd;
    }

    /**
     * Sets the value of the bfwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBFWD(String value) {
        this.bfwd = value;
    }

    /**
     * Gets the value of the amtbfwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTBFWD() {
        return amtbfwd;
    }

    /**
     * Sets the value of the amtbfwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTBFWD(String value) {
        this.amtbfwd = value;
    }

    /**
     * Gets the value of the totdword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTDWORD() {
        return totdword;
    }

    /**
     * Sets the value of the totdword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTDWORD(String value) {
        this.totdword = value;
    }

    /**
     * Gets the value of the totcword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTCWORD() {
        return totcword;
    }

    /**
     * Sets the value of the totcword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTCWORD(String value) {
        this.totcword = value;
    }

    /**
     * Gets the value of the totd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTD() {
        return totd;
    }

    /**
     * Sets the value of the totd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTD(String value) {
        this.totd = value;
    }

    /**
     * Gets the value of the totc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTC() {
        return totc;
    }

    /**
     * Sets the value of the totc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTC(String value) {
        this.totc = value;
    }

    /**
     * Gets the value of the dbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBAL() {
        return dbal;
    }

    /**
     * Sets the value of the dbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBAL(String value) {
        this.dbal = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the yfoot2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYFOOT2() {
        return yfoot2;
    }

    /**
     * Sets the value of the yfoot2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYFOOT2(String value) {
        this.yfoot2 = value;
    }

    /**
     * Gets the value of the yfoot3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYFOOT3() {
        return yfoot3;
    }

    /**
     * Sets the value of the yfoot3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYFOOT3(String value) {
        this.yfoot3 = value;
    }

    /**
     * Gets the value of the zerorecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERORECORDS() {
        return zerorecords;
    }

    /**
     * Sets the value of the zerorecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERORECORDS(String value) {
        this.zerorecords = value;
    }

    /**
     * Gets the value of the gidiacctstmtcmsv1DetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType }
     *     
     */
    public IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType getGIDIACCTSTMTCMSV1DetailType() {
        return gidiacctstmtcmsv1DetailType;
    }

    /**
     * Sets the value of the gidiacctstmtcmsv1DetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType }
     *     
     */
    public void setGIDIACCTSTMTCMSV1DetailType(IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType value) {
        this.gidiacctstmtcmsv1DetailType = value;
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
     *         &lt;element name="mIDIACCTSTMTCMSV1DetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TXNTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TRANSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="YSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TOTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiacctstmtcmsv1DetailType"
    })
    public static class GIDIACCTSTMTCMSV1DetailType {

        @XmlElement(name = "mIDIACCTSTMTCMSV1DetailType")
        protected List<IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType.MIDIACCTSTMTCMSV1DetailType> midiacctstmtcmsv1DetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiacctstmtcmsv1DetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiacctstmtcmsv1DetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIACCTSTMTCMSV1DetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType.MIDIACCTSTMTCMSV1DetailType }
         * 
         * 
         */
        public List<IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType.MIDIACCTSTMTCMSV1DetailType> getMIDIACCTSTMTCMSV1DetailType() {
            if (midiacctstmtcmsv1DetailType == null) {
                midiacctstmtcmsv1DetailType = new ArrayList<IDIACCTSTMTCMSV1Type.GIDIACCTSTMTCMSV1DetailType.MIDIACCTSTMTCMSV1DetailType>();
            }
            return this.midiacctstmtcmsv1DetailType;
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
         *         &lt;element name="BACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TXNTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TRANSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="YSIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TOTBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "bacc",
            "post",
            "txntime",
            "refno",
            "pdesc",
            "transcode",
            "ysign",
            "pamt",
            "totbal"
        })
        public static class MIDIACCTSTMTCMSV1DetailType {

            @XmlElement(name = "BACC")
            protected String bacc;
            @XmlElement(name = "POST")
            protected String post;
            @XmlElement(name = "TXNTIME")
            protected String txntime;
            @XmlElement(name = "REFNO")
            protected String refno;
            @XmlElement(name = "PDESC")
            protected String pdesc;
            @XmlElement(name = "TRANSCODE")
            protected String transcode;
            @XmlElement(name = "YSIGN")
            protected String ysign;
            @XmlElement(name = "PAMT")
            protected String pamt;
            @XmlElement(name = "TOTBAL")
            protected String totbal;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the bacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBACC() {
                return bacc;
            }

            /**
             * Sets the value of the bacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBACC(String value) {
                this.bacc = value;
            }

            /**
             * Gets the value of the post property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOST() {
                return post;
            }

            /**
             * Sets the value of the post property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOST(String value) {
                this.post = value;
            }

            /**
             * Gets the value of the txntime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTXNTIME() {
                return txntime;
            }

            /**
             * Sets the value of the txntime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTXNTIME(String value) {
                this.txntime = value;
            }

            /**
             * Gets the value of the refno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFNO() {
                return refno;
            }

            /**
             * Sets the value of the refno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFNO(String value) {
                this.refno = value;
            }

            /**
             * Gets the value of the pdesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPDESC() {
                return pdesc;
            }

            /**
             * Sets the value of the pdesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPDESC(String value) {
                this.pdesc = value;
            }

            /**
             * Gets the value of the transcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRANSCODE() {
                return transcode;
            }

            /**
             * Sets the value of the transcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRANSCODE(String value) {
                this.transcode = value;
            }

            /**
             * Gets the value of the ysign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYSIGN() {
                return ysign;
            }

            /**
             * Sets the value of the ysign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYSIGN(String value) {
                this.ysign = value;
            }

            /**
             * Gets the value of the pamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAMT() {
                return pamt;
            }

            /**
             * Sets the value of the pamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAMT(String value) {
                this.pamt = value;
            }

            /**
             * Gets the value of the totbal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOTBAL() {
                return totbal;
            }

            /**
             * Sets the value of the totbal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOTBAL(String value) {
                this.totbal = value;
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

}
