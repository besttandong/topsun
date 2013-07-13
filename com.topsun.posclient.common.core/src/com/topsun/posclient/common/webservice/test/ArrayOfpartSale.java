
package com.topsun.posclient.common.webservice.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfpartSale complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfpartSale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partSale" type="{http://www.topsunit.com/rms}partSale" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfpartSale", propOrder = {
    "partSale"
})
public class ArrayOfpartSale {

    @XmlElement(nillable = true)
    protected List<PartSale> partSale;

    /**
     * Gets the value of the partSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartSale }
     * 
     * 
     */
    public List<PartSale> getPartSale() {
        if (partSale == null) {
            partSale = new ArrayList<PartSale>();
        }
        return this.partSale;
    }

}
