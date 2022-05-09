//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 11:13:12 AM ICT 
//


package com.newexa.accountservice.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementOnlineV1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementOnlineV1Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="IDIACCTSTMTCMSV1Type" type="{T24WebServicesImpl}IDIACCTSTMTCMSV1Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementOnlineV1Response", propOrder = {
    "status",
    "idiacctstmtcmsv1Type"
})
public class StatementOnlineV1Response {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "IDIACCTSTMTCMSV1Type")
    protected List<IDIACCTSTMTCMSV1Type> idiacctstmtcmsv1Type;

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
     * Gets the value of the idiacctstmtcmsv1Type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idiacctstmtcmsv1Type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDIACCTSTMTCMSV1Type().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDIACCTSTMTCMSV1Type }
     * 
     * 
     */
    public List<IDIACCTSTMTCMSV1Type> getIDIACCTSTMTCMSV1Type() {
        if (idiacctstmtcmsv1Type == null) {
            idiacctstmtcmsv1Type = new ArrayList<IDIACCTSTMTCMSV1Type>();
        }
        return this.idiacctstmtcmsv1Type;
    }

}
