//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 09:30:48 AM ICT 
//


package com.newexa.twsservice.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbookPrintResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbookPrintResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="NOFILEPRINTPASSBOOKType" type="{T24WebServicesImpl}NOFILEPRINTPASSBOOKType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbookPrintResponse", propOrder = {
    "status",
    "nofileprintpassbookType"
})
public class PassbookPrintResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "NOFILEPRINTPASSBOOKType")
    protected List<NOFILEPRINTPASSBOOKType> nofileprintpassbookType;

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
     * Gets the value of the nofileprintpassbookType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nofileprintpassbookType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNOFILEPRINTPASSBOOKType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOFILEPRINTPASSBOOKType }
     * 
     * 
     */
    public List<NOFILEPRINTPASSBOOKType> getNOFILEPRINTPASSBOOKType() {
        if (nofileprintpassbookType == null) {
            nofileprintpassbookType = new ArrayList<NOFILEPRINTPASSBOOKType>();
        }
        return this.nofileprintpassbookType;
    }

}
