package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.AdjustShopInfo;

/**
 * @author Dong
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "AdjustShopDTO", propOrder = {
    "adjustShopList"
},namespace="http://com.topsun.posclient/AdjustShopDTO")
public class AdjustShopDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AdjustShopInfo> adjustShopList;

	@XmlElements({
        @XmlElement(name = "adjustShopList", type = AdjustShopInfo.class)
    })
	public List<AdjustShopInfo> getAdjustShopList() {
		return adjustShopList;
	}

	public void setAdjustShopList(List<AdjustShopInfo> adjustShopList) {
		this.adjustShopList = adjustShopList;
	}


}
