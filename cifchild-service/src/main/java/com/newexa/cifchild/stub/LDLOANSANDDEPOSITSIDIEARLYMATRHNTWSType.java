//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 03:43:40 PM ICT 
//


package com.newexa.cifchild.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NomorCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MataUang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gAMOUNT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NominalBayarPokok" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TanggalMulai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TanggalPelunasan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KategoriProduk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NominalBayarUjroh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekPmbyrnPokok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RekPmbyrnUjroh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountIncrease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountValDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTPAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType", propOrder = {
    "nomorCIF",
    "mataUang",
    "gamount",
    "tanggalMulai",
    "tanggalPelunasan",
    "kategoriProduk",
    "nominalBayarUjroh",
    "rekPmbyrnPokok",
    "rekPmbyrnUjroh",
    "amountIncrease",
    "amountValDate",
    "totpaid"
})
public class LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType {

    @XmlElement(name = "NomorCIF")
    protected String nomorCIF;
    @XmlElement(name = "MataUang")
    protected String mataUang;
    @XmlElement(name = "gAMOUNT")
    protected LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType.GAMOUNT gamount;
    @XmlElement(name = "TanggalMulai")
    protected String tanggalMulai;
    @XmlElement(name = "TanggalPelunasan")
    protected String tanggalPelunasan;
    @XmlElement(name = "KategoriProduk")
    protected String kategoriProduk;
    @XmlElement(name = "NominalBayarUjroh")
    protected String nominalBayarUjroh;
    @XmlElement(name = "RekPmbyrnPokok")
    protected String rekPmbyrnPokok;
    @XmlElement(name = "RekPmbyrnUjroh")
    protected String rekPmbyrnUjroh;
    @XmlElement(name = "AmountIncrease")
    protected String amountIncrease;
    @XmlElement(name = "AmountValDate")
    protected String amountValDate;
    @XmlElement(name = "TOTPAID")
    protected String totpaid;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the nomorCIF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomorCIF() {
        return nomorCIF;
    }

    /**
     * Sets the value of the nomorCIF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomorCIF(String value) {
        this.nomorCIF = value;
    }

    /**
     * Gets the value of the mataUang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMataUang() {
        return mataUang;
    }

    /**
     * Sets the value of the mataUang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMataUang(String value) {
        this.mataUang = value;
    }

    /**
     * Gets the value of the gamount property.
     * 
     * @return
     *     possible object is
     *     {@link LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType.GAMOUNT }
     *     
     */
    public LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType.GAMOUNT getGAMOUNT() {
        return gamount;
    }

    /**
     * Sets the value of the gamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType.GAMOUNT }
     *     
     */
    public void setGAMOUNT(LDLOANSANDDEPOSITSIDIEARLYMATRHNTWSType.GAMOUNT value) {
        this.gamount = value;
    }

    /**
     * Gets the value of the tanggalMulai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalMulai() {
        return tanggalMulai;
    }

    /**
     * Sets the value of the tanggalMulai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalMulai(String value) {
        this.tanggalMulai = value;
    }

    /**
     * Gets the value of the tanggalPelunasan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPelunasan() {
        return tanggalPelunasan;
    }

    /**
     * Sets the value of the tanggalPelunasan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPelunasan(String value) {
        this.tanggalPelunasan = value;
    }

    /**
     * Gets the value of the kategoriProduk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategoriProduk() {
        return kategoriProduk;
    }

    /**
     * Sets the value of the kategoriProduk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategoriProduk(String value) {
        this.kategoriProduk = value;
    }

    /**
     * Gets the value of the nominalBayarUjroh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalBayarUjroh() {
        return nominalBayarUjroh;
    }

    /**
     * Sets the value of the nominalBayarUjroh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalBayarUjroh(String value) {
        this.nominalBayarUjroh = value;
    }

    /**
     * Gets the value of the rekPmbyrnPokok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekPmbyrnPokok() {
        return rekPmbyrnPokok;
    }

    /**
     * Sets the value of the rekPmbyrnPokok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekPmbyrnPokok(String value) {
        this.rekPmbyrnPokok = value;
    }

    /**
     * Gets the value of the rekPmbyrnUjroh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRekPmbyrnUjroh() {
        return rekPmbyrnUjroh;
    }

    /**
     * Sets the value of the rekPmbyrnUjroh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRekPmbyrnUjroh(String value) {
        this.rekPmbyrnUjroh = value;
    }

    /**
     * Gets the value of the amountIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountIncrease() {
        return amountIncrease;
    }

    /**
     * Sets the value of the amountIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountIncrease(String value) {
        this.amountIncrease = value;
    }

    /**
     * Gets the value of the amountValDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountValDate() {
        return amountValDate;
    }

    /**
     * Sets the value of the amountValDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountValDate(String value) {
        this.amountValDate = value;
    }

    /**
     * Gets the value of the totpaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAID() {
        return totpaid;
    }

    /**
     * Sets the value of the totpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAID(String value) {
        this.totpaid = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NominalBayarPokok" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nominalBayarPokok"
    })
    public static class GAMOUNT {

        @XmlElement(name = "NominalBayarPokok")
        protected List<String> nominalBayarPokok;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the nominalBayarPokok property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nominalBayarPokok property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNominalBayarPokok().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNominalBayarPokok() {
            if (nominalBayarPokok == null) {
                nominalBayarPokok = new ArrayList<String>();
            }
            return this.nominalBayarPokok;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }

    }

}
