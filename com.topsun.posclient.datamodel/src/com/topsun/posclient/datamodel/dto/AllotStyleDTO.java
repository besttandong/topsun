package com.topsun.posclient.datamodel.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.topsun.posclient.datamodel.AllotStyle;

/**
 * @author LiLei
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name="data")
@XmlType(name = "AllotStyleDTO", propOrder = {
    "allotStyleList"
},namespace="http://com.topsun.posclient/AllotStyleDTO")
public class AllotStyleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AllotStyle> allotStyleList;

	@XmlElements({
        @XmlElement(name = "allotStyle", type = AllotStyle.class)
    })
	public List<AllotStyle> getAllotStyleList() {
		return allotStyleList;
	}

	public void setAllotStyleList(List<AllotStyle> allotStyleList) {
		this.allotStyleList = allotStyleList;
	}
}
