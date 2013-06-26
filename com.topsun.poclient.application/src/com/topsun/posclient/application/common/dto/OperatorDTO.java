package com.topsun.posclient.application.common.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.application.model.Operator;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "OperatorDTO", propOrder = {
    "operatorList"
},namespace="http://com.topsun.posclient/Operator")
public class OperatorDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Operator> operatorList;

	@XmlElements({
        @XmlElement(name = "operator", type = Operator.class)
    })
	public List<Operator> getOperatorList() {
		return operatorList;
	}

	public void setOperatorList(List<Operator> operatorList) {
		this.operatorList = operatorList;
	}
    
}
