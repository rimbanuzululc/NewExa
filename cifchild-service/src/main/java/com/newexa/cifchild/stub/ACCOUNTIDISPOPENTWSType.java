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
 * <p>Java class for ACCOUNTIDISPOPENTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTIDISPOPENTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gJOINTHOLDER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mJOINTHOLDER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="JOINTHOLDER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RELATIONCODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="JOINTNOTES1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="NOREFERAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACOPENPURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTHACCPURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFOUTSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFPROGRAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTRECVBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ACCOUNTIDISPOPENTWSType", propOrder = {
    "customer",
    "category",
    "currency",
    "accountofficer",
    "gjointholder",
    "noreferal",
    "acopenpurpose",
    "othaccpurpose",
    "refoutsource",
    "refprogram",
    "eventcode",
    "acctrecvbonus"
})
public class ACCOUNTIDISPOPENTWSType {

    @XmlElement(name = "CUSTOMER")
    protected String customer;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "ACCOUNTOFFICER")
    protected String accountofficer;
    @XmlElement(name = "gJOINTHOLDER")
    protected ACCOUNTIDISPOPENTWSType.GJOINTHOLDER gjointholder;
    @XmlElement(name = "NOREFERAL")
    protected String noreferal;
    @XmlElement(name = "ACOPENPURPOSE")
    protected String acopenpurpose;
    @XmlElement(name = "OTHACCPURPOSE")
    protected String othaccpurpose;
    @XmlElement(name = "REFOUTSOURCE")
    protected String refoutsource;
    @XmlElement(name = "REFPROGRAM")
    protected String refprogram;
    @XmlElement(name = "EVENTCODE")
    protected String eventcode;
    @XmlElement(name = "ACCTRECVBONUS")
    protected String acctrecvbonus;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMER(String value) {
        this.customer = value;
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
     * Gets the value of the accountofficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTOFFICER() {
        return accountofficer;
    }

    /**
     * Sets the value of the accountofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTOFFICER(String value) {
        this.accountofficer = value;
    }

    /**
     * Gets the value of the gjointholder property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTIDISPOPENTWSType.GJOINTHOLDER }
     *     
     */
    public ACCOUNTIDISPOPENTWSType.GJOINTHOLDER getGJOINTHOLDER() {
        return gjointholder;
    }

    /**
     * Sets the value of the gjointholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTIDISPOPENTWSType.GJOINTHOLDER }
     *     
     */
    public void setGJOINTHOLDER(ACCOUNTIDISPOPENTWSType.GJOINTHOLDER value) {
        this.gjointholder = value;
    }

    /**
     * Gets the value of the noreferal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOREFERAL() {
        return noreferal;
    }

    /**
     * Sets the value of the noreferal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOREFERAL(String value) {
        this.noreferal = value;
    }

    /**
     * Gets the value of the acopenpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACOPENPURPOSE() {
        return acopenpurpose;
    }

    /**
     * Sets the value of the acopenpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACOPENPURPOSE(String value) {
        this.acopenpurpose = value;
    }

    /**
     * Gets the value of the othaccpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHACCPURPOSE() {
        return othaccpurpose;
    }

    /**
     * Sets the value of the othaccpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHACCPURPOSE(String value) {
        this.othaccpurpose = value;
    }

    /**
     * Gets the value of the refoutsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFOUTSOURCE() {
        return refoutsource;
    }

    /**
     * Sets the value of the refoutsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFOUTSOURCE(String value) {
        this.refoutsource = value;
    }

    /**
     * Gets the value of the refprogram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFPROGRAM() {
        return refprogram;
    }

    /**
     * Sets the value of the refprogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFPROGRAM(String value) {
        this.refprogram = value;
    }

    /**
     * Gets the value of the eventcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTCODE() {
        return eventcode;
    }

    /**
     * Sets the value of the eventcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTCODE(String value) {
        this.eventcode = value;
    }

    /**
     * Gets the value of the acctrecvbonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTRECVBONUS() {
        return acctrecvbonus;
    }

    /**
     * Sets the value of the acctrecvbonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTRECVBONUS(String value) {
        this.acctrecvbonus = value;
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
     *         &lt;element name="mJOINTHOLDER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="JOINTHOLDER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RELATIONCODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="JOINTNOTES1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "mjointholder"
    })
    public static class GJOINTHOLDER {

        @XmlElement(name = "mJOINTHOLDER")
        protected List<ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER> mjointholder;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mjointholder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mjointholder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMJOINTHOLDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER }
         * 
         * 
         */
        public List<ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER> getMJOINTHOLDER() {
            if (mjointholder == null) {
                mjointholder = new ArrayList<ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER>();
            }
            return this.mjointholder;
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
         *         &lt;element name="JOINTHOLDER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RELATIONCODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="sgJOINTNOTES" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="JOINTNOTES1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "jointholder1",
            "relationcode1",
            "sgJOINTNOTES"
        })
        public static class MJOINTHOLDER {

            @XmlElement(name = "JOINTHOLDER1")
            protected String jointholder1;
            @XmlElement(name = "RELATIONCODE1")
            protected String relationcode1;
            protected ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES sgJOINTNOTES;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the jointholder1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJOINTHOLDER1() {
                return jointholder1;
            }

            /**
             * Sets the value of the jointholder1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJOINTHOLDER1(String value) {
                this.jointholder1 = value;
            }

            /**
             * Gets the value of the relationcode1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATIONCODE1() {
                return relationcode1;
            }

            /**
             * Sets the value of the relationcode1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATIONCODE1(String value) {
                this.relationcode1 = value;
            }

            /**
             * Gets the value of the sgJOINTNOTES property.
             * 
             * @return
             *     possible object is
             *     {@link ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES }
             *     
             */
            public ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES getSgJOINTNOTES() {
                return sgJOINTNOTES;
            }

            /**
             * Sets the value of the sgJOINTNOTES property.
             * 
             * @param value
             *     allowed object is
             *     {@link ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES }
             *     
             */
            public void setSgJOINTNOTES(ACCOUNTIDISPOPENTWSType.GJOINTHOLDER.MJOINTHOLDER.SgJOINTNOTES value) {
                this.sgJOINTNOTES = value;
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
             *         &lt;element name="JOINTNOTES1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "jointnotes1"
            })
            public static class SgJOINTNOTES {

                @XmlElement(name = "JOINTNOTES1")
                protected List<String> jointnotes1;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the jointnotes1 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the jointnotes1 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getJOINTNOTES1().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getJOINTNOTES1() {
                    if (jointnotes1 == null) {
                        jointnotes1 = new ArrayList<String>();
                    }
                    return this.jointnotes1;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

    }

}
