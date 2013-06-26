package com.topsun.posclient.finance.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.application.model.SettleAccWayInfo;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "SettleAccWayDTO", propOrder = {
    "settleAccWayInfoList"
},namespace="http://com.topsun.posclient/SettleAccWayDTO")
public class SettleAccWayDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<SettleAccWayInfo> settleAccWayInfoList;

	@XmlElements({
        @XmlElement(name = "settleAccWay", type = SettleAccWayInfo.class)
    })
	public List<SettleAccWayInfo> getSettleAccWayInfoList() {
		return settleAccWayInfoList;
	}

	public void setSettleAccWayInfoList(List<SettleAccWayInfo> settleAccWayInfoList) {
		this.settleAccWayInfoList = settleAccWayInfoList;
	}
}
