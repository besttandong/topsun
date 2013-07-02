package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.CashierModel;

/**
 * @author Dong
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "CashierModeDTO", propOrder = {
    "cashierModeList"
},namespace="http://com.topsun.posclient/CashierModeDTO")
public class CashierModeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<CashierModel> cashierModeList;

	@XmlElements({
        @XmlElement(name = "cashierMode", type = CashierModel.class)
    })
	public List<CashierModel> getCashierModeList() {
		return cashierModeList;
	}

	public void setCashierModeList(List<CashierModel> cashierModeList) {
		this.cashierModeList = cashierModeList;
	}
    
}
