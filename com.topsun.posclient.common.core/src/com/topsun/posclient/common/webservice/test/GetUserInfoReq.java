
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getUserInfoReq complex type�� Java �ࡣ
 * 
 * <pre>
 * &lt;complexType name="getUserInfoReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCredential" type="{http://www.topsunit.com/rms}userCredential" minOccurs="0"/>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserInfoReq", propOrder = {
    "userCredential",
    "userCode"
})
public class GetUserInfoReq {

    @XmlElementRef(name = "userCredential", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<UserCredential> userCredential;
    @XmlElementRef(name = "userCode", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> userCode;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserCode() {
        return userCode;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserCode(JAXBElement<String> value) {
        this.userCode = value;
    }

}
