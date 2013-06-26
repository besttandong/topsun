package com.topsun.posclient.application.common.service;

import com.topsun.posclient.application.model.Operator;

public interface IOperatorService extends IBaseService {
	
	public Operator getOperator(String name, String password) throws Exception;

}
