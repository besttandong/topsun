package com.topsun.posclient.system.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.User;

public interface ILoginService extends IBaseService {
	
	public User getUserData(String name, String password) throws POSException;

}
