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
 * <p>Java class for IDIEVALSINGLECIFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEVALSINGLECIFType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZERODISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIEVALSINGLECIFDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEVALSINGLECIFDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MOTHMAIDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIEVALSINGLECIFType", propOrder = {
    "zerodisplay",
    "gidievalsinglecifDetailType"
})
public class IDIEVALSINGLECIFType {

    @XmlElement(name = "ZERODISPLAY")
    protected String zerodisplay;
    @XmlElement(name = "gIDIEVALSINGLECIFDetailType")
    protected IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType gidievalsinglecifDetailType;

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
     * Gets the value of the gidievalsinglecifDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType }
     *     
     */
    public IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType getGIDIEVALSINGLECIFDetailType() {
        return gidievalsinglecifDetailType;
    }

    /**
     * Sets the value of the gidievalsinglecifDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType }
     *     
     */
    public void setGIDIEVALSINGLECIFDetailType(IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType value) {
        this.gidievalsinglecifDetailType = value;
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
     *         &lt;element name="mIDIEVALSINGLECIFDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MOTHMAIDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midievalsinglecifDetailType"
    })
    public static class GIDIEVALSINGLECIFDetailType {

        @XmlElement(name = "mIDIEVALSINGLECIFDetailType")
        protected List<IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType.MIDIEVALSINGLECIFDetailType> midievalsinglecifDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midievalsinglecifDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midievalsinglecifDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEVALSINGLECIFDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType.MIDIEVALSINGLECIFDetailType }
         * 
         * 
         */
        public List<IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType.MIDIEVALSINGLECIFDetailType> getMIDIEVALSINGLECIFDetailType() {
            if (midievalsinglecifDetailType == null) {
                midievalsinglecifDetailType = new ArrayList<IDIEVALSINGLECIFType.GIDIEVALSINGLECIFDetailType.MIDIEVALSINGLECIFDetailType>();
            }
            return this.midievalsinglecifDetailType;
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
         *         &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MOTHMAIDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "legalid",
            "mothmaiden",
            "dob"
        })
        public static class MIDIEVALSINGLECIFDetailType {

            @XmlElement(name = "LEGALID")
            protected String legalid;
            @XmlElement(name = "MOTHMAIDEN")
            protected String mothmaiden;
            @XmlElement(name = "DOB")
            protected String dob;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

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
             * Gets the value of the dob property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOB() {
                return dob;
            }

            /**
             * Sets the value of the dob property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOB(String value) {
                this.dob = value;
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
