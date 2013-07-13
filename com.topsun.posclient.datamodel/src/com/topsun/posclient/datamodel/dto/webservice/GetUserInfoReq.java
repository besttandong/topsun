package com.topsun.posclient.datamodel.dto.webservice;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="getUserInfoReq",namespace="http://www.topsunit.com/rms")
public class GetUserInfoReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private UserCredential userCredential;
	
	private String userCode;

	public UserCredential getUserCredential() {
		return userCredential;
	}

	public void setUserCredential(UserCredential userCredential) {
		this.userCredential = userCredential;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
}
