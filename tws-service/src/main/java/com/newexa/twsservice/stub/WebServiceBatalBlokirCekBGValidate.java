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
 * <p>Java class for WebServiceBatalBlokirCekBG_Validate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebServiceBatalBlokirCekBG_Validate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENTSTOPTWSREVOKEType" type="{T24WebServicesImpl}PAYMENTSTOPTWSREVOKEType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceBatalBlokirCekBG_Validate", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "paymentstoptwsrevokeType"
})
public class WebServiceBatalBlokirCekBGValidate {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "PAYMENTSTOPTWSREVOKEType")
    protected PAYMENTSTOPTWSREVOKEType paymentstoptwsrevokeType;

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
     * Gets the value of the paymentstoptwsrevokeType property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTSTOPTWSREVOKEType }
     *     
     */
    public PAYMENTSTOPTWSREVOKEType getPAYMENTSTOPTWSREVOKEType() {
        return paymentstoptwsrevokeType;
    }

    /**
     * Sets the value of the paymentstoptwsrevokeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTSTOPTWSREVOKEType }
     *     
     */
    public void setPAYMENTSTOPTWSREVOKEType(PAYMENTSTOPTWSREVOKEType value) {
        this.paymentstoptwsrevokeType = value;
    }

}
