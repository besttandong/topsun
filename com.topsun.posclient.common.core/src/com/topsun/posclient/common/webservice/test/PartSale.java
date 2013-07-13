
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <pre>
 * &lt;complexType name="partSale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ballotNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balloter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enablePoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsSales" type="{http://www.topsunit.com/rms}ArrayOfgoodsSale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partSale", propOrder = {
    "no",
    "remark",
    "salesDate",
    "storeCode",
    "memberCode",
    "applyUser",
    "ballotNo",
    "balloter",
    "cardNo",
    "checkDate",
    "checker",
    "enableBalance",
    "enablePoint",
    "goodsSales"
})
public class PartSale {

    @XmlElementRef(name = "no", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> no;
    @XmlElementRef(name = "remark", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "salesDate", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> salesDate;
    @XmlElementRef(name = "storeCode", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> storeCode;
    @XmlElementRef(name = "memberCode", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> memberCode;
    @XmlElementRef(name = "applyUser", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> applyUser;
    @XmlElementRef(name = "ballotNo", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> ballotNo;
    @XmlElementRef(name = "balloter", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> balloter;
    @XmlElementRef(name = "cardNo", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> cardNo;
    @XmlElementRef(name = "checkDate", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> checkDate;
    @XmlElementRef(name = "checker", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> checker;
    @XmlElementRef(name = "enableBalance", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> enableBalance;
    @XmlElementRef(name = "enablePoint", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> enablePoint;
    @XmlElementRef(name = "goodsSales", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<ArrayOfgoodsSale> goodsSales;

    /**
     * ��ȡno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNo() {
        return no;
    }

    /**
     * ����no���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNo(JAXBElement<String> value) {
        this.no = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * ��ȡsalesDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesDate() {
        return salesDate;
    }

    /**
     * ����salesDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesDate(JAXBElement<String> value) {
        this.salesDate = value;
    }

    /**
     * ��ȡstoreCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreCode() {
        return storeCode;
    }

    /**
     * ����storeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreCode(JAXBElement<String> value) {
        this.storeCode = value;
    }

    /**
     * ��ȡmemberCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberCode() {
        return memberCode;
    }

    /**
     * ����memberCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberCode(JAXBElement<String> value) {
        this.memberCode = value;
    }

    /**
     * ��ȡapplyUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyUser() {
        return applyUser;
    }

    /**
     * ����applyUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyUser(JAXBElement<String> value) {
        this.applyUser = value;
    }

    /**
     * ��ȡballotNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBallotNo() {
        return ballotNo;
    }

    /**
     * ����ballotNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBallotNo(JAXBElement<String> value) {
        this.ballotNo = value;
    }

    /**
     * ��ȡballoter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalloter() {
        return balloter;
    }

    /**
     * ����balloter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalloter(JAXBElement<String> value) {
        this.balloter = value;
    }

    /**
     * ��ȡcardNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNo() {
        return cardNo;
    }

    /**
     * ����cardNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNo(JAXBElement<String> value) {
        this.cardNo = value;
    }

    /**
     * ��ȡcheckDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckDate() {
        return checkDate;
    }

    /**
     * ����checkDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckDate(JAXBElement<String> value) {
        this.checkDate = value;
    }

    /**
     * ��ȡchecker���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChecker() {
        return checker;
    }

    /**
     * ����checker���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChecker(JAXBElement<String> value) {
        this.checker = value;
    }

    /**
     * ��ȡenableBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnableBalance() {
        return enableBalance;
    }

    /**
     * ����enableBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnableBalance(JAXBElement<String> value) {
        this.enableBalance = value;
    }

    /**
     * ��ȡenablePoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnablePoint() {
        return enablePoint;
    }

    /**
     * ����enablePoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnablePoint(JAXBElement<String> value) {
        this.enablePoint = value;
    }

    /**
     * ��ȡgoodsSales���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgoodsSale }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgoodsSale> getGoodsSales() {
        return goodsSales;
    }

    /**
     * ����goodsSales���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgoodsSale }{@code >}
     *     
     */
    public void setGoodsSales(JAXBElement<ArrayOfgoodsSale> value) {
        this.goodsSales = value;
    }

}
