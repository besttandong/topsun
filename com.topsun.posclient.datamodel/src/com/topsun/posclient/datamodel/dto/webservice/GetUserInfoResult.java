package com.topsun.posclient.datamodel.dto.webservice;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.topsun.posclient.datamodel.dto.UserDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GetUserInfoResult",namespace="http://com.topsun.posclient/rms")
public class GetUserInfoResult implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Result result;
	
	private UserDTO users;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public UserDTO getUsers() {
		return users;
	}

	public void setUsers(UserDTO users) {
		this.users = users;
	}
}
