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
 * <p>Java class for CHEQUEISSUETWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHEQUEISSUETWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CHEQUESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISSUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUMBERISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STOCKREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERIESID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHQNOSTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gNOTES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAIVECHARGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gCHG.TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mCHG.TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CHGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="TOTCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CHEQUEISSUETWSType", propOrder = {
    "chequestatus",
    "issuedate",
    "numberissued",
    "currency",
    "stockreg",
    "seriesid",
    "chqnostart",
    "gnotes",
    "waivecharges",
    "gchgtype",
    "totchg"
})
public class CHEQUEISSUETWSType {

    @XmlElement(name = "CHEQUESTATUS")
    protected String chequestatus;
    @XmlElement(name = "ISSUEDATE")
    protected String issuedate;
    @XmlElement(name = "NUMBERISSUED")
    protected String numberissued;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "STOCKREG")
    protected String stockreg;
    @XmlElement(name = "SERIESID")
    protected String seriesid;
    @XmlElement(name = "CHQNOSTART")
    protected String chqnostart;
    @XmlElement(name = "gNOTES")
    protected CHEQUEISSUETWSType.GNOTES gnotes;
    @XmlElement(name = "WAIVECHARGES")
    protected String waivecharges;
    @XmlElement(name = "gCHG.TYPE")
    protected CHEQUEISSUETWSType.GCHGTYPE gchgtype;
    @XmlElement(name = "TOTCHG")
    protected String totchg;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the chequestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUESTATUS() {
        return chequestatus;
    }

    /**
     * Sets the value of the chequestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUESTATUS(String value) {
        this.chequestatus = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUEDATE(String value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the numberissued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBERISSUED() {
        return numberissued;
    }

    /**
     * Sets the value of the numberissued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBERISSUED(String value) {
        this.numberissued = value;
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
     * Gets the value of the stockreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOCKREG() {
        return stockreg;
    }

    /**
     * Sets the value of the stockreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOCKREG(String value) {
        this.stockreg = value;
    }

    /**
     * Gets the value of the seriesid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIESID() {
        return seriesid;
    }

    /**
     * Sets the value of the seriesid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIESID(String value) {
        this.seriesid = value;
    }

    /**
     * Gets the value of the chqnostart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHQNOSTART() {
        return chqnostart;
    }

    /**
     * Sets the value of the chqnostart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHQNOSTART(String value) {
        this.chqnostart = value;
    }

    /**
     * Gets the value of the gnotes property.
     * 
     * @return
     *     possible object is
     *     {@link CHEQUEISSUETWSType.GNOTES }
     *     
     */
    public CHEQUEISSUETWSType.GNOTES getGNOTES() {
        return gnotes;
    }

    /**
     * Sets the value of the gnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHEQUEISSUETWSType.GNOTES }
     *     
     */
    public void setGNOTES(CHEQUEISSUETWSType.GNOTES value) {
        this.gnotes = value;
    }

    /**
     * Gets the value of the waivecharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVECHARGES() {
        return waivecharges;
    }

    /**
     * Sets the value of the waivecharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVECHARGES(String value) {
        this.waivecharges = value;
    }

    /**
     * Gets the value of the gchgtype property.
     * 
     * @return
     *     possible object is
     *     {@link CHEQUEISSUETWSType.GCHGTYPE }
     *     
     */
    public CHEQUEISSUETWSType.GCHGTYPE getGCHGTYPE() {
        return gchgtype;
    }

    /**
     * Sets the value of the gchgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHEQUEISSUETWSType.GCHGTYPE }
     *     
     */
    public void setGCHGTYPE(CHEQUEISSUETWSType.GCHGTYPE value) {
        this.gchgtype = value;
    }

    /**
     * Gets the value of the totchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTCHG() {
        return totchg;
    }

    /**
     * Sets the value of the totchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTCHG(String value) {
        this.totchg = value;
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
     *         &lt;element name="mCHG.TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CHGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "mchgtype"
    })
    public static class GCHGTYPE {

        @XmlElement(name = "mCHG.TYPE")
        protected List<CHEQUEISSUETWSType.GCHGTYPE.MCHGTYPE> mchgtype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mchgtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mchgtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCHGTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CHEQUEISSUETWSType.GCHGTYPE.MCHGTYPE }
         * 
         * 
         */
        public List<CHEQUEISSUETWSType.GCHGTYPE.MCHGTYPE> getMCHGTYPE() {
            if (mchgtype == null) {
                mchgtype = new ArrayList<CHEQUEISSUETWSType.GCHGTYPE.MCHGTYPE>();
            }
            return this.mchgtype;
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
         *         &lt;element name="CHGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "chgtype",
            "chgamt"
        })
        public static class MCHGTYPE {

            @XmlElement(name = "CHGTYPE")
            protected String chgtype;
            @XmlElement(name = "CHGAMT")
            protected String chgamt;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the chgtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGTYPE() {
                return chgtype;
            }

            /**
             * Sets the value of the chgtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGTYPE(String value) {
                this.chgtype = value;
            }

            /**
             * Gets the value of the chgamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHGAMT() {
                return chgamt;
            }

            /**
             * Sets the value of the chgamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHGAMT(String value) {
                this.chgamt = value;
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
     *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "notes"
    })
    public static class GNOTES {

        @XmlElement(name = "NOTES")
        protected List<String> notes;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the notes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNOTES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNOTES() {
            if (notes == null) {
                notes = new ArrayList<String>();
            }
            return this.notes;
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
