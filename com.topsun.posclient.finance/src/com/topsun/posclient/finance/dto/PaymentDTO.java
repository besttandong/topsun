package com.topsun.posclient.finance.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.application.model.Payment;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "PaymentDTO", propOrder = {
    "paymentList"
},namespace="http://com.topsun.posclient/PaymentDTO")
public class PaymentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Payment> paymentList;

	@XmlElements({
        @XmlElement(name = "payment", type = Payment.class)
    })
	public List<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}
}
