//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.27 at 11:23:29 AM ICT 
//


package com.newexa.twsservice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundsTransferWSV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundsTransferWSV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="FUNDSTRANSFERIDIACFTWSV2Type" type="{T24WebServicesImpl}FUNDSTRANSFERIDIACFTWSV2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundsTransferWSV2", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "fundstransferidiacftwsv2Type"
})
public class FundsTransferWSV2 {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "FUNDSTRANSFERIDIACFTWSV2Type")
    protected FUNDSTRANSFERIDIACFTWSV2Type fundstransferidiacftwsv2Type;

    /**
     * Gets the value of the webRequestCommon property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Sets the value of the webRequestCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Gets the value of the ofsFunction property.
     * 
     * @return
     *     possible object is
     *     {@link OfsFunction }
     *     
     */
    public OfsFunction getOfsFunction() {
        return ofsFunction;
    }

    /**
     * Sets the value of the ofsFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfsFunction }
     *     
     */
    public void setOfsFunction(OfsFunction value) {
        this.ofsFunction = value;
    }

    /**
     * Gets the value of the fundstransferidiacftwsv2Type property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIACFTWSV2Type }
     *     
     */
    public FUNDSTRANSFERIDIACFTWSV2Type getFUNDSTRANSFERIDIACFTWSV2Type() {
        return fundstransferidiacftwsv2Type;
    }

    /**
     * Sets the value of the fundstransferidiacftwsv2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIACFTWSV2Type }
     *     
     */
    public void setFUNDSTRANSFERIDIACFTWSV2Type(FUNDSTRANSFERIDIACFTWSV2Type value) {
        this.fundstransferidiacftwsv2Type = value;
    }

}
