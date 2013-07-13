
package com.topsun.posclient.common.webservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>goodsSale complex type�� Java �ࡣ
 * 
 * <pre>
 * &lt;complexType name="goodsSale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singlePoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goodsSale", propOrder = {
    "amount",
    "discountA",
    "discountB",
    "itemCode",
    "listPrice",
    "number",
    "retailPrice",
    "singlePoints",
    "unitPrice"
})
public class GoodsSale {

    @XmlElementRef(name = "amount", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "discountA", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> discountA;
    @XmlElementRef(name = "discountB", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> discountB;
    @XmlElementRef(name = "itemCode", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> itemCode;
    @XmlElementRef(name = "listPrice", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> listPrice;
    @XmlElementRef(name = "number", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "retailPrice", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> retailPrice;
    @XmlElementRef(name = "singlePoints", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> singlePoints;
    @XmlElementRef(name = "unitPrice", namespace = "http://www.topsunit.com/rms", type = JAXBElement.class)
    protected JAXBElement<String> unitPrice;

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmount() {
        return amount;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmount(JAXBElement<String> value) {
        this.amount = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscountA() {
        return discountA;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscountA(JAXBElement<String> value) {
        this.discountA = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscountB() {
        return discountB;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscountB(JAXBElement<String> value) {
        this.discountB = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemCode() {
        return itemCode;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemCode(JAXBElement<String> value) {
        this.itemCode = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListPrice() {
        return listPrice;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListPrice(JAXBElement<String> value) {
        this.listPrice = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumber() {
        return number;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumber(JAXBElement<String> value) {
        this.number = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailPrice() {
        return retailPrice;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailPrice(JAXBElement<String> value) {
        this.retailPrice = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSinglePoints() {
        return singlePoints;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSinglePoints(JAXBElement<String> value) {
        this.singlePoints = value;
    }

    /**
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitPrice(JAXBElement<String> value) {
        this.unitPrice = value;
    }

}
