package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.PayRecord;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "PayRecordDTO", propOrder = {
    "payRecordList"
},namespace="http://com.topsun.posclient/PayRecordDTO")
public class PayRecordDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PayRecord> payRecordList;

	@XmlElements({
        @XmlElement(name = "payRecord", type = PayRecord.class)
    })
	public List<PayRecord> getPayRecordList() {
		return payRecordList;
	}

	public void setPayRecordList(List<PayRecord> payRecordList) {
		this.payRecordList = payRecordList;
	}

}
