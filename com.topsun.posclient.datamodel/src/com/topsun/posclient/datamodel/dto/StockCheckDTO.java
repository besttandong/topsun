package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.StockCheck;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="stockChecks")
@XmlType(name = "StockCheckDTO", propOrder = {
    "stockCheckList"
})
public class StockCheckDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<StockCheck> stockCheckList;

	@XmlElements({
        @XmlElement(name = "stockCheck", type = StockCheck.class)
    })
    public List<StockCheck> getStockCheckList() {
		return stockCheckList;
	}

	public void setStockCheckList(List<StockCheck> stockCheckList) {
		this.stockCheckList = stockCheckList;
	}
}
