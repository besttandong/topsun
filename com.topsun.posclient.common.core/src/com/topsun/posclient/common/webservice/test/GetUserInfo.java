
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getUserInfoReq" type="{http://www.topsunit.com/rms}getUserInfoReq" minOccurs="0"/>
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
    "getUserInfoReq"
})
@XmlRootElement(name = "getUserInfo")
public class GetUserInfo {

    @XmlElementRef(name = "getUserInfoReq", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<GetUserInfoReq> getUserInfoReq;

    /**
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetUserInfoReq }{@code >}
     *     
     */
    public JAXBElement<GetUserInfoReq> getGetUserInfoReq() {
        return getUserInfoReq;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetUserInfoReq }{@code >}
     *     
     */
    public void setGetUserInfoReq(JAXBElement<GetUserInfoReq> value) {
        this.getUserInfoReq = value;
    }

}
