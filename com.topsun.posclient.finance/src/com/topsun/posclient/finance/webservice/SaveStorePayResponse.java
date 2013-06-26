
package com.topsun.posclient.finance.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>saveStorePayResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="saveStorePayResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="syncData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveStorePayResponse", propOrder = {
    "syncData"
})
public class SaveStorePayResponse {

    protected String syncData;

    /**
     * 获取syncData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncData() {
        return syncData;
    }

    /**
     * 设置syncData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncData(String value) {
        this.syncData = value;
    }

}
