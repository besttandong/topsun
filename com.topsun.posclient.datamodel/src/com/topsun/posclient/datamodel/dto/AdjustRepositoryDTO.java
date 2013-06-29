package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.AdjustRepositoryInfo;

/**
 * @author Dong
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "AdjustRepositoryDTO", propOrder = {
    "adjustRepositoryInfos"
},namespace="http://com.topsun.posclient/AdjustRepositoryDTO")
public class AdjustRepositoryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AdjustRepositoryInfo> adjustRepositoryInfos;

	@XmlElements({
        @XmlElement(name = "adjustRepositoryInfo", type = AdjustRepositoryInfo.class)
    })
	public List<AdjustRepositoryInfo> getAdjustRepositoryInfos() {
		return adjustRepositoryInfos;
	}

	public void setAdjustRepositoryInfos(
			List<AdjustRepositoryInfo> adjustRepositoryInfos) {
		this.adjustRepositoryInfos = adjustRepositoryInfos;
	}
}
