//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 11:13:12 AM ICT 
//


package com.newexa.accountservice.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeeSchTICResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeeSchTICResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="IDIHINVSCHEDULEType" type="{T24WebServicesImpl}IDIHINVSCHEDULEType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeeSchTICResponse", propOrder = {
    "status",
    "idihinvscheduleType"
})
public class SeeSchTICResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "IDIHINVSCHEDULEType")
    protected IDIHINVSCHEDULEType idihinvscheduleType;

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
     * Gets the value of the idihinvscheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link IDIHINVSCHEDULEType }
     *     
     */
    public IDIHINVSCHEDULEType getIDIHINVSCHEDULEType() {
        return idihinvscheduleType;
    }

    /**
     * Sets the value of the idihinvscheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIHINVSCHEDULEType }
     *     
     */
    public void setIDIHINVSCHEDULEType(IDIHINVSCHEDULEType value) {
        this.idihinvscheduleType = value;
    }

}
