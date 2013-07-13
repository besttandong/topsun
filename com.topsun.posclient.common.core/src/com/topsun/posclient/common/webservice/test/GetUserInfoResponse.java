
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
 *         &lt;element name="getUserInfoResult" type="{http://www.topsunit.com/rms}getUserInfoResult" minOccurs="0"/>
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
    "getUserInfoResult"
})
@XmlRootElement(name = "getUserInfoResponse")
public class GetUserInfoResponse {

    @XmlElementRef(name = "getUserInfoResult", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<GetUserInfoResult> getUserInfoResult;

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetUserInfoResult }{@code >}
     *     
     */
    public JAXBElement<GetUserInfoResult> getGetUserInfoResult() {
        return getUserInfoResult;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetUserInfoResult }{@code >}
     *     
     */
    public void setGetUserInfoResult(JAXBElement<GetUserInfoResult> value) {
        this.getUserInfoResult = value;
    }

}
