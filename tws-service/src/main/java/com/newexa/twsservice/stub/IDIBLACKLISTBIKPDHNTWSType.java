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
 * <p>Java class for IDIBLACKLISTBIKPDHNTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIBLACKLISTBIKPDHNTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIBLACKLISTBIKPDHNTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIBLACKLISTBIKPDHNTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="HEAD0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="HEAD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="USERDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDRW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROVINCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSTALCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DHNNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXPIREDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FLAGMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIBLACKLISTBIKPDHNTWSType", propOrder = {
    "zerorecords",
    "gidiblacklistbikpdhntwsDetailType"
})
public class IDIBLACKLISTBIKPDHNTWSType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIBLACKLISTBIKPDHNTWSDetailType")
    protected IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType gidiblacklistbikpdhntwsDetailType;

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
     * Gets the value of the gidiblacklistbikpdhntwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType }
     *     
     */
    public IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType getGIDIBLACKLISTBIKPDHNTWSDetailType() {
        return gidiblacklistbikpdhntwsDetailType;
    }

    /**
     * Sets the value of the gidiblacklistbikpdhntwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType }
     *     
     */
    public void setGIDIBLACKLISTBIKPDHNTWSDetailType(IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType value) {
        this.gidiblacklistbikpdhntwsDetailType = value;
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
     *         &lt;element name="mIDIBLACKLISTBIKPDHNTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="HEAD0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="HEAD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="USERDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDRW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROVINCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSTALCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DHNNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXPIREDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FLAGMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiblacklistbikpdhntwsDetailType"
    })
    public static class GIDIBLACKLISTBIKPDHNTWSDetailType {

        @XmlElement(name = "mIDIBLACKLISTBIKPDHNTWSDetailType")
        protected List<IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType.MIDIBLACKLISTBIKPDHNTWSDetailType> midiblacklistbikpdhntwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiblacklistbikpdhntwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiblacklistbikpdhntwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIBLACKLISTBIKPDHNTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType.MIDIBLACKLISTBIKPDHNTWSDetailType }
         * 
         * 
         */
        public List<IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType.MIDIBLACKLISTBIKPDHNTWSDetailType> getMIDIBLACKLISTBIKPDHNTWSDetailType() {
            if (midiblacklistbikpdhntwsDetailType == null) {
                midiblacklistbikpdhntwsDetailType = new ArrayList<IDIBLACKLISTBIKPDHNTWSType.GIDIBLACKLISTBIKPDHNTWSDetailType.MIDIBLACKLISTBIKPDHNTWSDetailType>();
            }
            return this.midiblacklistbikpdhntwsDetailType;
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
         *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="HEAD0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="HEAD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="USERDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMDISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDRW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROVINCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSTALCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANKCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DHNNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SEQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXPIREDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FLAGMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "custname",
            "head0",
            "head1",
            "userdisp",
            "datedisp",
            "comdisp",
            "dateofbirth",
            "legalid",
            "taxid",
            "street",
            "addrt",
            "addrw",
            "city",
            "provinces",
            "postalcode",
            "bankname",
            "bankcode",
            "custstatus",
            "custtype",
            "dhnno",
            "seqno",
            "refno",
            "remarks",
            "expiredate",
            "flagmatch"
        })
        public static class MIDIBLACKLISTBIKPDHNTWSDetailType {

            @XmlElement(name = "CUSTNAME")
            protected String custname;
            @XmlElement(name = "HEAD0")
            protected String head0;
            @XmlElement(name = "HEAD1")
            protected String head1;
            @XmlElement(name = "USERDISP")
            protected String userdisp;
            @XmlElement(name = "DATEDISP")
            protected String datedisp;
            @XmlElement(name = "COMDISP")
            protected String comdisp;
            @XmlElement(name = "DATEOFBIRTH")
            protected String dateofbirth;
            @XmlElement(name = "LEGALID")
            protected String legalid;
            @XmlElement(name = "TAXID")
            protected String taxid;
            @XmlElement(name = "STREET")
            protected String street;
            @XmlElement(name = "ADDRT")
            protected String addrt;
            @XmlElement(name = "ADDRW")
            protected String addrw;
            @XmlElement(name = "CITY")
            protected String city;
            @XmlElement(name = "PROVINCES")
            protected String provinces;
            @XmlElement(name = "POSTALCODE")
            protected String postalcode;
            @XmlElement(name = "BANKNAME")
            protected String bankname;
            @XmlElement(name = "BANKCODE")
            protected String bankcode;
            @XmlElement(name = "CUSTSTATUS")
            protected String custstatus;
            @XmlElement(name = "CUSTTYPE")
            protected String custtype;
            @XmlElement(name = "DHNNO")
            protected String dhnno;
            @XmlElement(name = "SEQNO")
            protected String seqno;
            @XmlElement(name = "REFNO")
            protected String refno;
            @XmlElement(name = "REMARKS")
            protected String remarks;
            @XmlElement(name = "EXPIREDATE")
            protected String expiredate;
            @XmlElement(name = "FLAGMATCH")
            protected String flagmatch;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the custname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTNAME() {
                return custname;
            }

            /**
             * Sets the value of the custname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTNAME(String value) {
                this.custname = value;
            }

            /**
             * Gets the value of the head0 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHEAD0() {
                return head0;
            }

            /**
             * Sets the value of the head0 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHEAD0(String value) {
                this.head0 = value;
            }

            /**
             * Gets the value of the head1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHEAD1() {
                return head1;
            }

            /**
             * Sets the value of the head1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHEAD1(String value) {
                this.head1 = value;
            }

            /**
             * Gets the value of the userdisp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSERDISP() {
                return userdisp;
            }

            /**
             * Sets the value of the userdisp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSERDISP(String value) {
                this.userdisp = value;
            }

            /**
             * Gets the value of the datedisp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEDISP() {
                return datedisp;
            }

            /**
             * Sets the value of the datedisp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEDISP(String value) {
                this.datedisp = value;
            }

            /**
             * Gets the value of the comdisp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMDISP() {
                return comdisp;
            }

            /**
             * Sets the value of the comdisp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMDISP(String value) {
                this.comdisp = value;
            }

            /**
             * Gets the value of the dateofbirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEOFBIRTH() {
                return dateofbirth;
            }

            /**
             * Sets the value of the dateofbirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEOFBIRTH(String value) {
                this.dateofbirth = value;
            }

            /**
             * Gets the value of the legalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALID() {
                return legalid;
            }

            /**
             * Sets the value of the legalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALID(String value) {
                this.legalid = value;
            }

            /**
             * Gets the value of the taxid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXID() {
                return taxid;
            }

            /**
             * Sets the value of the taxid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXID(String value) {
                this.taxid = value;
            }

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTREET() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTREET(String value) {
                this.street = value;
            }

            /**
             * Gets the value of the addrt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRT() {
                return addrt;
            }

            /**
             * Sets the value of the addrt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRT(String value) {
                this.addrt = value;
            }

            /**
             * Gets the value of the addrw property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRW() {
                return addrw;
            }

            /**
             * Sets the value of the addrw property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRW(String value) {
                this.addrw = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITY() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITY(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the provinces property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVINCES() {
                return provinces;
            }

            /**
             * Sets the value of the provinces property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVINCES(String value) {
                this.provinces = value;
            }

            /**
             * Gets the value of the postalcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOSTALCODE() {
                return postalcode;
            }

            /**
             * Sets the value of the postalcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOSTALCODE(String value) {
                this.postalcode = value;
            }

            /**
             * Gets the value of the bankname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANKNAME() {
                return bankname;
            }

            /**
             * Sets the value of the bankname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANKNAME(String value) {
                this.bankname = value;
            }

            /**
             * Gets the value of the bankcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANKCODE() {
                return bankcode;
            }

            /**
             * Sets the value of the bankcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANKCODE(String value) {
                this.bankcode = value;
            }

            /**
             * Gets the value of the custstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTSTATUS() {
                return custstatus;
            }

            /**
             * Sets the value of the custstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTSTATUS(String value) {
                this.custstatus = value;
            }

            /**
             * Gets the value of the custtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTTYPE() {
                return custtype;
            }

            /**
             * Sets the value of the custtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTTYPE(String value) {
                this.custtype = value;
            }

            /**
             * Gets the value of the dhnno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDHNNO() {
                return dhnno;
            }

            /**
             * Sets the value of the dhnno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDHNNO(String value) {
                this.dhnno = value;
            }

            /**
             * Gets the value of the seqno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEQNO() {
                return seqno;
            }

            /**
             * Sets the value of the seqno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEQNO(String value) {
                this.seqno = value;
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
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARKS() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARKS(String value) {
                this.remarks = value;
            }

            /**
             * Gets the value of the expiredate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXPIREDATE() {
                return expiredate;
            }

            /**
             * Sets the value of the expiredate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXPIREDATE(String value) {
                this.expiredate = value;
            }

            /**
             * Gets the value of the flagmatch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAGMATCH() {
                return flagmatch;
            }

            /**
             * Sets the value of the flagmatch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAGMATCH(String value) {
                this.flagmatch = value;
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
