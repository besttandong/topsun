package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.AdjustStoreInfo;

/**
 * @author Dong
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "AdjustStoreDTO", propOrder = {
    "adjustStoreInfos"
},namespace="http://com.topsun.posclient/AdjustStoreDTO")
public class AdjustStoreDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AdjustStoreInfo> adjustStoreInfos;

	@XmlElements({
        @XmlElement(name = "adjustStoreInfo", type = AdjustStoreInfo.class)
    })
	public List<AdjustStoreInfo> getAdjustStoreInfos() {
		return adjustStoreInfos;
	}

	public void setAdjustStoreInfos(List<AdjustStoreInfo> adjustStoreInfos) {
		this.adjustStoreInfos = adjustStoreInfos;
	}

}
