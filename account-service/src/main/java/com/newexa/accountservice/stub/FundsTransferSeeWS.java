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
 * <p>Java class for FundsTransferSeeWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundsTransferSeeWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebRequestCommon" type="{T24WebServicesImpl}webRequestCommon" minOccurs="0"/&gt;
 *         &lt;element name="FUNDSTRANSFERMSGIDType" type="{T24WebServicesImpl}transactionId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundsTransferSeeWS", propOrder = {
    "webRequestCommon",
    "fundstransfermsgidType"
})
public class FundsTransferSeeWS {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "FUNDSTRANSFERMSGIDType")
    protected TransactionId fundstransfermsgidType;

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
     * Gets the value of the fundstransfermsgidType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionId }
     *     
     */
    public TransactionId getFUNDSTRANSFERMSGIDType() {
        return fundstransfermsgidType;
    }

    /**
     * Sets the value of the fundstransfermsgidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionId }
     *     
     */
    public void setFUNDSTRANSFERMSGIDType(TransactionId value) {
        this.fundstransfermsgidType = value;
    }

}
