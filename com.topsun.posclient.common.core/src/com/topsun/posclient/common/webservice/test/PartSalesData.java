
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>partSalesData complex type�� Java �ࡣ
 * 
 * 
 * <pre>
 * &lt;complexType name="partSalesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCredential" type="{http://www.topsunit.com/rms}userCredential" minOccurs="0"/>
 *         &lt;element name="partSales" type="{http://www.topsunit.com/rms}ArrayOfpartSale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partSalesData", propOrder = {
    "userCredential",
    "partSales"
})
public class PartSalesData {

    @XmlElementRef(name = "userCredential", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<UserCredential> userCredential;
    @XmlElementRef(name = "partSales", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<ArrayOfpartSale> partSales;

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserCredential }{@code >}
     *     
     */
    public JAXBElement<UserCredential> getUserCredential() {
        return userCredential;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserCredential }{@code >}
     *     
     */
    public void setUserCredential(JAXBElement<UserCredential> value) {
        this.userCredential = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfpartSale }{@code >}
     *     
     */
    public JAXBElement<ArrayOfpartSale> getPartSales() {
        return partSales;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfpartSale }{@code >}
     *     
     */
    public void setPartSales(JAXBElement<ArrayOfpartSale> value) {
        this.partSales = value;
    }

}
