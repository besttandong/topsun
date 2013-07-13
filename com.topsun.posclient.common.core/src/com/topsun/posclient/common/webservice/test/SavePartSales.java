
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="savePartSalesReq" type="{http://www.topsunit.com/rms}partSalesData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "savePartSalesReq"
})
@XmlRootElement(name = "savePartSales")
public class SavePartSales {

    @XmlElementRef(name = "savePartSalesReq", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<PartSalesData> savePartSalesReq;

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartSalesData }{@code >}
     *     
     */
    public JAXBElement<PartSalesData> getSavePartSalesReq() {
        return savePartSalesReq;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartSalesData }{@code >}
     *     
     */
    public void setSavePartSalesReq(JAXBElement<PartSalesData> value) {
        this.savePartSalesReq = value;
    }

}
