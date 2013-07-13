
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <pre>
 * &lt;complexType name="getUserInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.topsunit.com/rms}processResult" minOccurs="0"/>
 *         &lt;element name="users" type="{http://www.topsunit.com/rms}ArrayOfuser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserInfoResult", propOrder = {
    "result",
    "users"
})
public class GetUserInfoResult {

    @XmlElementRef(name = "result", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<ProcessResult> result;
    @XmlElementRef(name = "users", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<ArrayOfuser> users;

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessResult }{@code >}
     *     
     */
    public JAXBElement<ProcessResult> getResult() {
        return result;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessResult }{@code >}
     *     
     */
    public void setResult(JAXBElement<ProcessResult> value) {
        this.result = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfuser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfuser> getUsers() {
        return users;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfuser }{@code >}
     *     
     */
    public void setUsers(JAXBElement<ArrayOfuser> value) {
        this.users = value;
    }

}
