package com.topsun.posclient.common;

/**
 * POS�쳣
 * 
 * @author Dong
 *
 */
public class POSException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String errorCode;

	String errorMessage;

	public POSException(){}

	public POSException(String errorCode, String errorMessage){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public POSException(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
