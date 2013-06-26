
package com.topsun.posclient.finance.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PayRecordDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PayRecordDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payRecord" type="{http://service.pos.webservice.topsunit.com/}payRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayRecordDTO", namespace = "http://com.topsun.posclient/PayRecordDTO", propOrder = {
    "payRecord"
})
public class PayRecordDTO {

    protected List<PayRecord> payRecord;

    /**
     * Gets the value of the payRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayRecord }
     * 
     * 
     */
    public List<PayRecord> getPayRecord() {
        if (payRecord == null) {
            payRecord = new ArrayList<PayRecord>();
        }
        return this.payRecord;
    }

}
