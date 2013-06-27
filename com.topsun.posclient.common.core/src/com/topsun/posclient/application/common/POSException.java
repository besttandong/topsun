package com.topsun.posclient.application.common;

public class POSException extends Throwable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String code;
	
	String message;
	
	public POSException(){}
	
	public POSException(String code, String message){
		this.code = code;
		this.message = message;
	}
	
	public POSException(String message){
		this.message = message;
	}

}
