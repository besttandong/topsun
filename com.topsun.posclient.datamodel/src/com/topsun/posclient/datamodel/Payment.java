package com.topsun.posclient.datamodel;

import java.io.Serializable;

/**
 * 
 * @author Dong
 *
 */
public class Payment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
