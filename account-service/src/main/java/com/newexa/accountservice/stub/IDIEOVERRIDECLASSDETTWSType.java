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
 * <p>Java class for IDIEOVERRIDECLASSDETTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDIEOVERRIDECLASSDETTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZEROREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gIDIEOVERRIDECLASSDETTWSDetailType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mIDIEOVERRIDECLASSDETTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CLASSIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMPARISON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATAFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "IDIEOVERRIDECLASSDETTWSType", propOrder = {
    "zerorec",
    "gidieoverrideclassdettwsDetailType"
})
public class IDIEOVERRIDECLASSDETTWSType {

    @XmlElement(name = "ZEROREC")
    protected String zerorec;
    @XmlElement(name = "gIDIEOVERRIDECLASSDETTWSDetailType")
    protected IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType gidieoverrideclassdettwsDetailType;

    /**
     * Gets the value of the zerorec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEROREC() {
        return zerorec;
    }

    /**
     * Sets the value of the zerorec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEROREC(String value) {
        this.zerorec = value;
    }

    /**
     * Gets the value of the gidieoverrideclassdettwsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType }
     *     
     */
    public IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType getGIDIEOVERRIDECLASSDETTWSDetailType() {
        return gidieoverrideclassdettwsDetailType;
    }

    /**
     * Sets the value of the gidieoverrideclassdettwsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType }
     *     
     */
    public void setGIDIEOVERRIDECLASSDETTWSDetailType(IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType value) {
        this.gidieoverrideclassdettwsDetailType = value;
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
     *         &lt;element name="mIDIEOVERRIDECLASSDETTWSDetailType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CLASSIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMPARISON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATAFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "midieoverrideclassdettwsDetailType"
    })
    public static class GIDIEOVERRIDECLASSDETTWSDetailType {

        @XmlElement(name = "mIDIEOVERRIDECLASSDETTWSDetailType")
        protected List<IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType.MIDIEOVERRIDECLASSDETTWSDetailType> midieoverrideclassdettwsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the midieoverrideclassdettwsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the midieoverrideclassdettwsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMIDIEOVERRIDECLASSDETTWSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType.MIDIEOVERRIDECLASSDETTWSDetailType }
         * 
         * 
         */
        public List<IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType.MIDIEOVERRIDECLASSDETTWSDetailType> getMIDIEOVERRIDECLASSDETTWSDetailType() {
            if (midieoverrideclassdettwsDetailType == null) {
                midieoverrideclassdettwsDetailType = new ArrayList<IDIEOVERRIDECLASSDETTWSType.GIDIEOVERRIDECLASSDETTWSDetailType.MIDIEOVERRIDECLASSDETTWSDetailType>();
            }
            return this.midieoverrideclassdettwsDetailType;
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
         *         &lt;element name="CLASSIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMPARISON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATAFROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "classification",
            "comparison",
            "datafrom",
            "datato"
        })
        public static class MIDIEOVERRIDECLASSDETTWSDetailType {

            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "CLASSIFICATION")
            protected String classification;
            @XmlElement(name = "COMPARISON")
            protected String comparison;
            @XmlElement(name = "DATAFROM")
            protected String datafrom;
            @XmlElement(name = "DATATO")
            protected String datato;
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
             * Gets the value of the classification property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLASSIFICATION() {
                return classification;
            }

            /**
             * Sets the value of the classification property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLASSIFICATION(String value) {
                this.classification = value;
            }

            /**
             * Gets the value of the comparison property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPARISON() {
                return comparison;
            }

            /**
             * Sets the value of the comparison property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPARISON(String value) {
                this.comparison = value;
            }

            /**
             * Gets the value of the datafrom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATAFROM() {
                return datafrom;
            }

            /**
             * Sets the value of the datafrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATAFROM(String value) {
                this.datafrom = value;
            }

            /**
             * Gets the value of the datato property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATATO() {
                return datato;
            }

            /**
             * Sets the value of the datato property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATATO(String value) {
                this.datato = value;
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
