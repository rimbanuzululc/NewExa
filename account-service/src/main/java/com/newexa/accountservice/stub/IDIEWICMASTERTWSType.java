//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 11:13:12 AM ICT 
//


package com.newexa.accountservice.stub;

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
 * <p>Java class for IDIEWICMASTERTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEWICMASTERTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIEWICMASTERTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEWICMASTERTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="WICID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MARTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTHMAIDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TELP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PLACEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NATIONALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DISTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURDISTRCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SOURCEFUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NPWP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BENOWNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIEWICMASTERTWSType", propOrder = {
    "zerodisplay",
    "gidiewicmastertwsDetailType"
})
public class IDIEWICMASTERTWSType {

    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gIDIEWICMASTERTWSDetailType")
    protected IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType gidiewicmastertwsDetailType;

    /**
     * Gets the value of the zerodisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZERODISPLAY() {
        return zerodisplay;
    }

    /**
     * Sets the value of the zerodisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZERODISPLAY(String value) {
        this.zerodisplay = value;
    }

    /**
     * Gets the value of the gidiewicmastertwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType }
     *     
     */
    public IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType getGIDIEWICMASTERTWSDetailType() {
        return gidiewicmastertwsDetailType;
    }

    /**
     * Sets the value of the gidiewicmastertwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType }
     *     
     */
    public void setGIDIEWICMASTERTWSDetailType(IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType value) {
        this.gidiewicmastertwsDetailType = value;
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
     *         &lt;element name="mIDIEWICMASTERTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="WICID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MARTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTHMAIDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TELP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PLACEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NATIONALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DISTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURDISTRCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SOURCEFUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NPWP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BENOWNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiewicmastertwsDetailType"
    })
    public static class GIDIEWICMASTERTWSDetailType {

        @XmlElement(name = "mIDIEWICMASTERTWSDetailType")
        protected List<IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType.MIDIEWICMASTERTWSDetailType> midiewicmastertwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiewicmastertwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiewicmastertwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEWICMASTERTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType.MIDIEWICMASTERTWSDetailType }
         * 
         * 
         */
        public List<IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType.MIDIEWICMASTERTWSDetailType> getMIDIEWICMASTERTWSDetailType() {
            if (midiewicmastertwsDetailType == null) {
                midiewicmastertwsDetailType = new ArrayList<IDIEWICMASTERTWSType.GIDIEWICMASTERTWSDetailType.MIDIEWICMASTERTWSDetailType>();
            }
            return this.midiewicmastertwsDetailType;
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
         *         &lt;element name="WICID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MARTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTHMAIDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TELP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PLACEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATEBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NATIONALTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DISTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURPROV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURDISTRCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SOURCEFUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NPWP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BENOWNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "wicid",
            "idtype",
            "idno",
            "custtype",
            "name",
            "gender",
            "martstatus",
            "relation",
            "mothmaiden",
            "telp",
            "placebirth",
            "datebirth",
            "nationalty",
            "address",
            "province",
            "district",
            "curadd",
            "curprov",
            "curdistrct",
            "sourcefund",
            "npwp",
            "occupation",
            "benownid"
        })
        public static class MIDIEWICMASTERTWSDetailType {

            @XmlElement(name = "WICID")
            protected String wicid;
            @XmlElement(name = "IDTYPE")
            protected String idtype;
            @XmlElement(name = "IDNO")
            protected String idno;
            @XmlElement(name = "CUSTTYPE")
            protected String custtype;
            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "GENDER")
            protected String gender;
            @XmlElement(name = "MARTSTATUS")
            protected String martstatus;
            @XmlElement(name = "RELATION")
            protected String relation;
            @XmlElement(name = "MOTHMAIDEN")
            protected String mothmaiden;
            @XmlElement(name = "TELP")
            protected String telp;
            @XmlElement(name = "PLACEBIRTH")
            protected String placebirth;
            @XmlElement(name = "DATEBIRTH")
            protected String datebirth;
            @XmlElement(name = "NATIONALTY")
            protected String nationalty;
            @XmlElement(name = "ADDRESS")
            protected String address;
            @XmlElement(name = "PROVINCE")
            protected String province;
            @XmlElement(name = "DISTRICT")
            protected String district;
            @XmlElement(name = "CURADD")
            protected String curadd;
            @XmlElement(name = "CURPROV")
            protected String curprov;
            @XmlElement(name = "CURDISTRCT")
            protected String curdistrct;
            @XmlElement(name = "SOURCEFUND")
            protected String sourcefund;
            @XmlElement(name = "NPWP")
            protected String npwp;
            @XmlElement(name = "OCCUPATION")
            protected String occupation;
            @XmlElement(name = "BENOWNID")
            protected String benownid;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the wicid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWICID() {
                return wicid;
            }

            /**
             * Sets the value of the wicid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWICID(String value) {
                this.wicid = value;
            }

            /**
             * Gets the value of the idtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDTYPE() {
                return idtype;
            }

            /**
             * Sets the value of the idtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDTYPE(String value) {
                this.idtype = value;
            }

            /**
             * Gets the value of the idno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDNO() {
                return idno;
            }

            /**
             * Sets the value of the idno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDNO(String value) {
                this.idno = value;
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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the gender property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGENDER() {
                return gender;
            }

            /**
             * Sets the value of the gender property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGENDER(String value) {
                this.gender = value;
            }

            /**
             * Gets the value of the martstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMARTSTATUS() {
                return martstatus;
            }

            /**
             * Sets the value of the martstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMARTSTATUS(String value) {
                this.martstatus = value;
            }

            /**
             * Gets the value of the relation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATION() {
                return relation;
            }

            /**
             * Sets the value of the relation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATION(String value) {
                this.relation = value;
            }

            /**
             * Gets the value of the mothmaiden property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMOTHMAIDEN() {
                return mothmaiden;
            }

            /**
             * Sets the value of the mothmaiden property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMOTHMAIDEN(String value) {
                this.mothmaiden = value;
            }

            /**
             * Gets the value of the telp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTELP() {
                return telp;
            }

            /**
             * Sets the value of the telp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTELP(String value) {
                this.telp = value;
            }

            /**
             * Gets the value of the placebirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLACEBIRTH() {
                return placebirth;
            }

            /**
             * Sets the value of the placebirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLACEBIRTH(String value) {
                this.placebirth = value;
            }

            /**
             * Gets the value of the datebirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEBIRTH() {
                return datebirth;
            }

            /**
             * Sets the value of the datebirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEBIRTH(String value) {
                this.datebirth = value;
            }

            /**
             * Gets the value of the nationalty property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONALTY() {
                return nationalty;
            }

            /**
             * Sets the value of the nationalty property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONALTY(String value) {
                this.nationalty = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the province property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVINCE() {
                return province;
            }

            /**
             * Sets the value of the province property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVINCE(String value) {
                this.province = value;
            }

            /**
             * Gets the value of the district property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISTRICT() {
                return district;
            }

            /**
             * Sets the value of the district property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISTRICT(String value) {
                this.district = value;
            }

            /**
             * Gets the value of the curadd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURADD() {
                return curadd;
            }

            /**
             * Sets the value of the curadd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURADD(String value) {
                this.curadd = value;
            }

            /**
             * Gets the value of the curprov property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURPROV() {
                return curprov;
            }

            /**
             * Sets the value of the curprov property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURPROV(String value) {
                this.curprov = value;
            }

            /**
             * Gets the value of the curdistrct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURDISTRCT() {
                return curdistrct;
            }

            /**
             * Sets the value of the curdistrct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURDISTRCT(String value) {
                this.curdistrct = value;
            }

            /**
             * Gets the value of the sourcefund property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSOURCEFUND() {
                return sourcefund;
            }

            /**
             * Sets the value of the sourcefund property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSOURCEFUND(String value) {
                this.sourcefund = value;
            }

            /**
             * Gets the value of the npwp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNPWP() {
                return npwp;
            }

            /**
             * Sets the value of the npwp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNPWP(String value) {
                this.npwp = value;
            }

            /**
             * Gets the value of the occupation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOCCUPATION() {
                return occupation;
            }

            /**
             * Sets the value of the occupation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOCCUPATION(String value) {
                this.occupation = value;
            }

            /**
             * Gets the value of the benownid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENOWNID() {
                return benownid;
            }

            /**
             * Sets the value of the benownid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENOWNID(String value) {
                this.benownid = value;
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
