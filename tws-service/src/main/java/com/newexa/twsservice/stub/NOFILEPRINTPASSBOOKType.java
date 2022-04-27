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
 * <p>Java class for NOFILEPRINTPASSBOOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOFILEPRINTPASSBOOKType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gNOFILEPRINTPASSBOOKDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mNOFILEPRINTPASSBOOKDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TXNCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNTTRX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PBOOKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TELLERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "NOFILEPRINTPASSBOOKType", propOrder = {
    "gnofileprintpassbookDetailType"
})
public class NOFILEPRINTPASSBOOKType {

    @XmlElement(name = "gNOFILEPRINTPASSBOOKDetailType")
    protected NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType gnofileprintpassbookDetailType;

    /**
     * Gets the value of the gnofileprintpassbookDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType }
     *     
     */
    public NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType getGNOFILEPRINTPASSBOOKDetailType() {
        return gnofileprintpassbookDetailType;
    }

    /**
     * Sets the value of the gnofileprintpassbookDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType }
     *     
     */
    public void setGNOFILEPRINTPASSBOOKDetailType(NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType value) {
        this.gnofileprintpassbookDetailType = value;
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
     *         &lt;element name="mNOFILEPRINTPASSBOOKDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TXNCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNTTRX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PBOOKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TELLERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mnofileprintpassbookDetailType"
    })
    public static class GNOFILEPRINTPASSBOOKDetailType {

        @XmlElement(name = "mNOFILEPRINTPASSBOOKDetailType")
        protected List<NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType.MNOFILEPRINTPASSBOOKDetailType> mnofileprintpassbookDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mnofileprintpassbookDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnofileprintpassbookDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMNOFILEPRINTPASSBOOKDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType.MNOFILEPRINTPASSBOOKDetailType }
         * 
         * 
         */
        public List<NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType.MNOFILEPRINTPASSBOOKDetailType> getMNOFILEPRINTPASSBOOKDetailType() {
            if (mnofileprintpassbookDetailType == null) {
                mnofileprintpassbookDetailType = new ArrayList<NOFILEPRINTPASSBOOKType.GNOFILEPRINTPASSBOOKDetailType.MNOFILEPRINTPASSBOOKDetailType>();
            }
            return this.mnofileprintpassbookDetailType;
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
         *         &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TXNCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNTTRX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PBOOKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TELLERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "line",
            "date",
            "txncode",
            "sign",
            "amounttrx",
            "pbookbal",
            "tellerid"
        })
        public static class MNOFILEPRINTPASSBOOKDetailType {

            @XmlElement(name = "LINE")
            protected String line;
            @XmlElement(name = "DATE")
            protected String date;
            @XmlElement(name = "TXNCODE")
            protected String txncode;
            @XmlElement(name = "SIGN")
            protected String sign;
            @XmlElement(name = "AMOUNTTRX")
            protected String amounttrx;
            @XmlElement(name = "PBOOKBAL")
            protected String pbookbal;
            @XmlElement(name = "TELLERID")
            protected String tellerid;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the line property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLINE() {
                return line;
            }

            /**
             * Sets the value of the line property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLINE(String value) {
                this.line = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATE(String value) {
                this.date = value;
            }

            /**
             * Gets the value of the txncode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTXNCODE() {
                return txncode;
            }

            /**
             * Sets the value of the txncode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTXNCODE(String value) {
                this.txncode = value;
            }

            /**
             * Gets the value of the sign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGN() {
                return sign;
            }

            /**
             * Sets the value of the sign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGN(String value) {
                this.sign = value;
            }

            /**
             * Gets the value of the amounttrx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMOUNTTRX() {
                return amounttrx;
            }

            /**
             * Sets the value of the amounttrx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMOUNTTRX(String value) {
                this.amounttrx = value;
            }

            /**
             * Gets the value of the pbookbal property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPBOOKBAL() {
                return pbookbal;
            }

            /**
             * Sets the value of the pbookbal property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPBOOKBAL(String value) {
                this.pbookbal = value;
            }

            /**
             * Gets the value of the tellerid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTELLERID() {
                return tellerid;
            }

            /**
             * Sets the value of the tellerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTELLERID(String value) {
                this.tellerid = value;
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
