//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 03:43:40 PM ICT 
//


package com.newexa.cifchild.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWIFTMT1031Layer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIFTMT1031Layer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="OfsFunction" type="{T24WebServicesImpl}ofsFunction" minOccurs="0"/&gt;
 *         &lt;element name="FUNDSTRANSFERIDIOT103DBACCTTWS2Type" type="{T24WebServicesImpl}FUNDSTRANSFERIDIOT103DBACCTTWS2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIFTMT1031Layer", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "fundstransferidiot103DBACCTTWS2Type"
})
public class SWIFTMT1031Layer {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "FUNDSTRANSFERIDIOT103DBACCTTWS2Type")
    protected FUNDSTRANSFERIDIOT103DBACCTTWS2Type fundstransferidiot103DBACCTTWS2Type;

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
     * Gets the value of the fundstransferidiot103DBACCTTWS2Type property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERIDIOT103DBACCTTWS2Type }
     *     
     */
    public FUNDSTRANSFERIDIOT103DBACCTTWS2Type getFUNDSTRANSFERIDIOT103DBACCTTWS2Type() {
        return fundstransferidiot103DBACCTTWS2Type;
    }

    /**
     * Sets the value of the fundstransferidiot103DBACCTTWS2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERIDIOT103DBACCTTWS2Type }
     *     
     */
    public void setFUNDSTRANSFERIDIOT103DBACCTTWS2Type(FUNDSTRANSFERIDIOT103DBACCTTWS2Type value) {
        this.fundstransferidiot103DBACCTTWS2Type = value;
    }

}
