package com.topsun.posclient.datamodel;

public class SettingData {
	
	private String ip;
	
	private String port;
	
	private String reconnectionTime;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getReconnectionTime() {
		return reconnectionTime;
	}

	public void setReconnectionTime(String reconnectionTime) {
		this.reconnectionTime = reconnectionTime;
	}
}
