
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
 *         &lt;element name="savePartSalesResult" type="{http://www.topsunit.com/rms}savePartSalesResult" minOccurs="0"/>
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
    "savePartSalesResult"
})
@XmlRootElement(name = "savePartSalesResponse")
public class SavePartSalesResponse {

    @XmlElementRef(name = "savePartSalesResult", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<SavePartSalesResult> savePartSalesResult;

    /**
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SavePartSalesResult }{@code >}
     *     
     */
    public JAXBElement<SavePartSalesResult> getSavePartSalesResult() {
        return savePartSalesResult;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SavePartSalesResult }{@code >}
     *     
     */
    public void setSavePartSalesResult(JAXBElement<SavePartSalesResult> value) {
        this.savePartSalesResult = value;
    }

}
