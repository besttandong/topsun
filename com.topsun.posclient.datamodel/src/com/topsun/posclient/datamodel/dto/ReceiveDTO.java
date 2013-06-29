package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.Receive;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "ReceiveDTO", propOrder = {
    "receiveList"
},namespace="http://com.topsun.posclient/ReceiveDTO")
public class ReceiveDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Receive> receiveList;

	@XmlElements({
        @XmlElement(name = "receive", type = Receive.class)
    })
	public List<Receive> getReceiveList() {
		return receiveList;
	}

	public void setReceiveList(List<Receive> receiveList) {
		this.receiveList = receiveList;
	}

    
}
