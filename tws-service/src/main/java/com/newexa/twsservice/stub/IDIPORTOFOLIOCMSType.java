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
 * <p>Java class for IDIPORTOFOLIOCMSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIPORTOFOLIOCMSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERORECORDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIPORTOFOLIOCMSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIPORTOFOLIOCMSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCTOLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CATDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIPORTOFOLIOCMSType", propOrder = {
    "zerorecords",
    "gidiportofoliocmsDetailType"
})
public class IDIPORTOFOLIOCMSType {

    @XmlElement(name = "ZERORECORDS")
    protected String zerorecords;
    @XmlElement(name = "gIDIPORTOFOLIOCMSDetailType")
    protected IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType gidiportofoliocmsDetailType;

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
     * Gets the value of the gidiportofoliocmsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType }
     *     
     */
    public IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType getGIDIPORTOFOLIOCMSDetailType() {
        return gidiportofoliocmsDetailType;
    }

    /**
     * Sets the value of the gidiportofoliocmsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType }
     *     
     */
    public void setGIDIPORTOFOLIOCMSDetailType(IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType value) {
        this.gidiportofoliocmsDetailType = value;
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
     *         &lt;element name="mIDIPORTOFOLIOCMSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCTOLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CATDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midiportofoliocmsDetailType"
    })
    public static class GIDIPORTOFOLIOCMSDetailType {

        @XmlElement(name = "mIDIPORTOFOLIOCMSDetailType")
        protected List<IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType.MIDIPORTOFOLIOCMSDetailType> midiportofoliocmsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midiportofoliocmsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midiportofoliocmsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIPORTOFOLIOCMSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType.MIDIPORTOFOLIOCMSDetailType }
         * 
         * 
         */
        public List<IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType.MIDIPORTOFOLIOCMSDetailType> getMIDIPORTOFOLIOCMSDetailType() {
            if (midiportofoliocmsDetailType == null) {
                midiportofoliocmsDetailType = new ArrayList<IDIPORTOFOLIOCMSType.GIDIPORTOFOLIOCMSDetailType.MIDIPORTOFOLIOCMSDetailType>();
            }
            return this.midiportofoliocmsDetailType;
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
         *         &lt;element name="ACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCTOLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CATDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "acctno",
            "acctold",
            "accttype",
            "acctname",
            "currency",
            "category",
            "catdesc"
        })
        public static class MIDIPORTOFOLIOCMSDetailType {

            @XmlElement(name = "ACCTNO")
            protected String acctno;
            @XmlElement(name = "ACCTOLD")
            protected String acctold;
            @XmlElement(name = "ACCTTYPE")
            protected String accttype;
            @XmlElement(name = "ACCTNAME")
            protected String acctname;
            @XmlElement(name = "CURRENCY")
            protected String currency;
            @XmlElement(name = "CATEGORY")
            protected String category;
            @XmlElement(name = "CATDESC")
            protected String catdesc;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the acctno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTNO() {
                return acctno;
            }

            /**
             * Sets the value of the acctno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTNO(String value) {
                this.acctno = value;
            }

            /**
             * Gets the value of the acctold property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTOLD() {
                return acctold;
            }

            /**
             * Sets the value of the acctold property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTOLD(String value) {
                this.acctold = value;
            }

            /**
             * Gets the value of the accttype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTTYPE() {
                return accttype;
            }

            /**
             * Sets the value of the accttype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTTYPE(String value) {
                this.accttype = value;
            }

            /**
             * Gets the value of the acctname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCTNAME() {
                return acctname;
            }

            /**
             * Sets the value of the acctname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCTNAME(String value) {
                this.acctname = value;
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
             * Gets the value of the catdesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCATDESC() {
                return catdesc;
            }

            /**
             * Sets the value of the catdesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCATDESC(String value) {
                this.catdesc = value;
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
