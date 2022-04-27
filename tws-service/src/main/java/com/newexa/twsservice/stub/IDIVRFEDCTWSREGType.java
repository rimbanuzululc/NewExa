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
 * <p>Java class for IDIVRFEDCTWSREGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIVRFEDCTWSREGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIVRFEDCTWSREGDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIVRFEDCTWSREGDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CARDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TERMINALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MERCHANTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIVRFEDCTWSREGType", propOrder = {
    "zerorecords",
    "gidivrfedctwsregDetailType"
})
public class IDIVRFEDCTWSREGType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIVRFEDCTWSREGDetailType")
    protected IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType gidivrfedctwsregDetailType;

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
     * Gets the value of the gidivrfedctwsregDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType }
     *     
     */
    public IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType getGIDIVRFEDCTWSREGDetailType() {
        return gidivrfedctwsregDetailType;
    }

    /**
     * Sets the value of the gidivrfedctwsregDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType }
     *     
     */
    public void setGIDIVRFEDCTWSREGDetailType(IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType value) {
        this.gidivrfedctwsregDetailType = value;
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
     *         &lt;element name="mIDIVRFEDCTWSREGDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CARDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TERMINALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MERCHANTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midivrfedctwsregDetailType"
    })
    public static class GIDIVRFEDCTWSREGDetailType {

        @XmlElement(name = "mIDIVRFEDCTWSREGDetailType")
        protected List<IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType.MIDIVRFEDCTWSREGDetailType> midivrfedctwsregDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midivrfedctwsregDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midivrfedctwsregDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIVRFEDCTWSREGDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType.MIDIVRFEDCTWSREGDetailType }
         * 
         * 
         */
        public List<IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType.MIDIVRFEDCTWSREGDetailType> getMIDIVRFEDCTWSREGDetailType() {
            if (midivrfedctwsregDetailType == null) {
                midivrfedctwsregDetailType = new ArrayList<IDIVRFEDCTWSREGType.GIDIVRFEDCTWSREGDetailType.MIDIVRFEDCTWSREGDetailType>();
            }
            return this.midivrfedctwsregDetailType;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CARDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TERMINALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MERCHANTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "id",
            "cardno",
            "account",
            "cif",
            "status",
            "terminalid",
            "merchantid",
            "reserved5",
            "reserved4"
        })
        public static class MIDIVRFEDCTWSREGDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "CARDNO")
            protected String cardno;
            @XmlElement(name = "ACCOUNT")
            protected String account;
            @XmlElement(name = "CIF")
            protected String cif;
            @XmlElement(name = "STATUS")
            protected String status;
            @XmlElement(name = "TERMINALID")
            protected String terminalid;
            @XmlElement(name = "MERCHANTID")
            protected String merchantid;
            @XmlElement(name = "RESERVED5")
            protected String reserved5;
            @XmlElement(name = "RESERVED4")
            protected String reserved4;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the cardno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCARDNO() {
                return cardno;
            }

            /**
             * Sets the value of the cardno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCARDNO(String value) {
                this.cardno = value;
            }

            /**
             * Gets the value of the account property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNT() {
                return account;
            }

            /**
             * Sets the value of the account property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNT(String value) {
                this.account = value;
            }

            /**
             * Gets the value of the cif property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCIF() {
                return cif;
            }

            /**
             * Sets the value of the cif property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCIF(String value) {
                this.cif = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATUS(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the terminalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTERMINALID() {
                return terminalid;
            }

            /**
             * Sets the value of the terminalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTERMINALID(String value) {
                this.terminalid = value;
            }

            /**
             * Gets the value of the merchantid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMERCHANTID() {
                return merchantid;
            }

            /**
             * Sets the value of the merchantid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMERCHANTID(String value) {
                this.merchantid = value;
            }

            /**
             * Gets the value of the reserved5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED5() {
                return reserved5;
            }

            /**
             * Sets the value of the reserved5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED5(String value) {
                this.reserved5 = value;
            }

            /**
             * Gets the value of the reserved4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESERVED4() {
                return reserved4;
            }

            /**
             * Sets the value of the reserved4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESERVED4(String value) {
                this.reserved4 = value;
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
