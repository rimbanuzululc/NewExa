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
 * <p>Java class for WebserviceEnqCollUseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebserviceEnqCollUseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="IDIECOLLATERALUSETWSType" type="{T24WebServicesImpl}IDIECOLLATERALUSETWSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebserviceEnqCollUseResponse", propOrder = {
    "status",
    "idiecollateralusetwsType"
})
public class WebserviceEnqCollUseResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "IDIECOLLATERALUSETWSType")
    protected List<IDIECOLLATERALUSETWSType> idiecollateralusetwsType;

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
     * Gets the value of the idiecollateralusetwsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idiecollateralusetwsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDIECOLLATERALUSETWSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDIECOLLATERALUSETWSType }
     * 
     * 
     */
    public List<IDIECOLLATERALUSETWSType> getIDIECOLLATERALUSETWSType() {
        if (idiecollateralusetwsType == null) {
            idiecollateralusetwsType = new ArrayList<IDIECOLLATERALUSETWSType>();
        }
        return this.idiecollateralusetwsType;
    }

}
