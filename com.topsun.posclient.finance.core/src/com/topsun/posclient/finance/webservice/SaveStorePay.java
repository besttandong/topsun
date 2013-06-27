
package com.topsun.posclient.finance.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>saveStorePay complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="saveStorePay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payRecordDTO" type="{http://com.topsun.posclient/PayRecordDTO}PayRecordDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveStorePay", propOrder = {
    "payRecordDTO"
})
public class SaveStorePay {

    protected PayRecordDTO payRecordDTO;

    /**
     * 获取payRecordDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayRecordDTO }
     *     
     */
    public PayRecordDTO getPayRecordDTO() {
        return payRecordDTO;
    }

    /**
     * 设置payRecordDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayRecordDTO }
     *     
     */
    public void setPayRecordDTO(PayRecordDTO value) {
        this.payRecordDTO = value;
    }

}
