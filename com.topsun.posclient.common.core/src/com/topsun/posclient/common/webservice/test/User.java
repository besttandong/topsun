
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>user complex type�� Java �ࡣ
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auths" type="{http://www.topsunit.com/rms}ArrayOfauth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "userId",
    "userCode",
    "userName",
    "deptId",
    "deptName",
    "employeeId",
    "employeeName",
    "auths"
})
public class User {

    protected Integer userId;
    @XmlElementRef(name = "userCode", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> userCode;
    @XmlElementRef(name = "userName", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "deptId", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<Integer> deptId;
    @XmlElementRef(name = "deptName", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> deptName;
    @XmlElementRef(name = "employeeId", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<Integer> employeeId;
    @XmlElementRef(name = "employeeName", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> employeeName;
    @XmlElementRef(name = "auths", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<ArrayOfauth> auths;

    /**
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
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

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeptId() {
        return deptId;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeptId(JAXBElement<Integer> value) {
        this.deptId = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeptName() {
        return deptName;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeptName(JAXBElement<String> value) {
        this.deptName = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEmployeeId() {
        return employeeId;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEmployeeId(JAXBElement<Integer> value) {
        this.employeeId = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeName() {
        return employeeName;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeName(JAXBElement<String> value) {
        this.employeeName = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauth }{@code >}
     *     
     */
    public JAXBElement<ArrayOfauth> getAuths() {
        return auths;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfauth }{@code >}
     *     
     */
    public void setAuths(JAXBElement<ArrayOfauth> value) {
        this.auths = value;
    }

}
