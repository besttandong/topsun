
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>auth complex type�� Java �ࡣ
 * 
 * <pre>
 * &lt;complexType name="auth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="authGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="functionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth", propOrder = {
    "authGroupId",
    "authGroupName",
    "functionId",
    "functionName",
    "operationId",
    "operationName",
    "isAuth"
})
public class Auth {

    protected Integer authGroupId;
    @XmlElementRef(name = "authGroupName", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> authGroupName;
    protected Integer functionId;
    @XmlElementRef(name = "functionName", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> functionName;
    protected Integer operationId;
    @XmlElementRef(name = "operationName", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> operationName;
    @XmlElementRef(name = "isAuth", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> isAuth;

    /**
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthGroupId() {
        return authGroupId;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthGroupId(Integer value) {
        this.authGroupId = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthGroupName() {
        return authGroupName;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthGroupName(JAXBElement<String> value) {
        this.authGroupName = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFunctionId(Integer value) {
        this.functionId = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFunctionName() {
        return functionName;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFunctionName(JAXBElement<String> value) {
        this.functionName = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationId() {
        return operationId;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationId(Integer value) {
        this.operationId = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationName() {
        return operationName;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationName(JAXBElement<String> value) {
        this.operationName = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsAuth() {
        return isAuth;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsAuth(JAXBElement<String> value) {
        this.isAuth = value;
    }

}
