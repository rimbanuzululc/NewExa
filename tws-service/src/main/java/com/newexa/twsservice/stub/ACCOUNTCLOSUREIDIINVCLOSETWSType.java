//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 11:23:29 AM ICT 
//


package com.newexa.twsservice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNTCLOSUREIDIINVCLOSETWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTCLOSUREIDIINVCLOSETWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAPITALDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLOCHARGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLOCHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCLSNOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ACCOUNTCLOSUREIDIINVCLOSETWSType", propOrder = {
    "capitaldate",
    "clochargetype",
    "clochargeamt",
    "acclsnote"
})
public class ACCOUNTCLOSUREIDIINVCLOSETWSType {

    @XmlElement(name = "CAPITALDATE")
    protected String capitaldate;
    @XmlElement(name = "CLOCHARGETYPE")
    protected String clochargetype;
    @XmlElement(name = "CLOCHARGEAMT")
    protected String clochargeamt;
    @XmlElement(name = "ACCLSNOTE")
    protected String acclsnote;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the capitaldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPITALDATE() {
        return capitaldate;
    }

    /**
     * Sets the value of the capitaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPITALDATE(String value) {
        this.capitaldate = value;
    }

    /**
     * Gets the value of the clochargetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLOCHARGETYPE() {
        return clochargetype;
    }

    /**
     * Sets the value of the clochargetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLOCHARGETYPE(String value) {
        this.clochargetype = value;
    }

    /**
     * Gets the value of the clochargeamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLOCHARGEAMT() {
        return clochargeamt;
    }

    /**
     * Sets the value of the clochargeamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLOCHARGEAMT(String value) {
        this.clochargeamt = value;
    }

    /**
     * Gets the value of the acclsnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCLSNOTE() {
        return acclsnote;
    }

    /**
     * Sets the value of the acclsnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCLSNOTE(String value) {
        this.acclsnote = value;
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

}
