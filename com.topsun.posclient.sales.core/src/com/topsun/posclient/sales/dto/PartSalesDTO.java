package com.topsun.posclient.sales.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.application.model.PartSales;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "PartSalesDTO", propOrder = {
    "partSalesList"
},namespace="http://com.topsun.posclient/PartSales")
public class PartSalesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PartSales> partSalesList;

	@XmlElements({
        @XmlElement(name = "partSales", type = PartSales.class)
    })
	public List<PartSales> getPartSalesList() {
		return partSalesList;
	}

	public void setPartSalesList(List<PartSales> partSalesList) {
		this.partSalesList = partSalesList;
	}

}
