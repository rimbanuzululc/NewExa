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
 * <p>Java class for WSDECUSTOMERPREFERENCESResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDECUSTOMERPREFERENCESResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="DECUSTOMERPREFERENCESType" type="{T24WebServicesImpl}DECUSTOMERPREFERENCESType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDECUSTOMERPREFERENCESResponse", propOrder = {
    "status",
    "decustomerpreferencesType"
})
public class WSDECUSTOMERPREFERENCESResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "DECUSTOMERPREFERENCESType")
    protected DECUSTOMERPREFERENCESType decustomerpreferencesType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the decustomerpreferencesType property.
     * 
     * @return
     *     possible object is
     *     {@link DECUSTOMERPREFERENCESType }
     *     
     */
    public DECUSTOMERPREFERENCESType getDECUSTOMERPREFERENCESType() {
        return decustomerpreferencesType;
    }

    /**
     * Sets the value of the decustomerpreferencesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DECUSTOMERPREFERENCESType }
     *     
     */
    public void setDECUSTOMERPREFERENCESType(DECUSTOMERPREFERENCESType value) {
        this.decustomerpreferencesType = value;
    }

}
