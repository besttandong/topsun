package com.topsun.posclient.application.common.service.impl;

import java.util.List;

import com.topsun.posclient.application.common.dto.OperatorDTO;
import com.topsun.posclient.application.common.service.IOperatorService;
import com.topsun.posclient.application.dao.OperatorLocalDao;
import com.topsun.posclient.application.model.Operator;

public class OperatorServiceImpl extends BaseServiceImpl implements IOperatorService {
	
	private OperatorLocalDao operatorLocalDao = new OperatorLocalDao();

	
	@Override
	public Operator getOperator(String name, String password)
			throws Exception {
		Operator loginOpr = null;
		OperatorDTO operatorDTO = operatorLocalDao.getOperatorData();
		if(null == operatorDTO){
			return null;
		}
		List<Operator> operators = operatorDTO.getOperatorList();
		for(Operator o : operators){
			if(o.getName().equals(name) && o.getPassword().equals(password)){
				loginOpr = o;
			}
		}
		return loginOpr;
	}

}
