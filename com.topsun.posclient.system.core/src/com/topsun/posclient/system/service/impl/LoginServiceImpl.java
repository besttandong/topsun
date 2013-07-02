package com.topsun.posclient.system.service.impl;

import java.util.List;

import com.topsun.posclient.common.POSClientApp;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.dao.CommonDao;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.UserDTO;
import com.topsun.posclient.system.service.ILoginService;

/**
 * 登录服务实现
 * 
 * @author Dong
 *
 */
public class LoginServiceImpl extends BaseServiceImpl implements ILoginService {
	
	private CommonDao commonDao = new CommonDao();

	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ILoginService#getUserData(java.lang.String, java.lang.String)
	 */
	public User getUserData(String name, String password) throws POSException {
		User loginOpr = null;
		UserDTO userDTO = null;
		try {
			userDTO = commonDao.getUserData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(null == userDTO){
			return null;
		}
		List<User> operators = userDTO.getUserList();
		for(User o : operators){
			if(o.getUserName().equals(name) && o.getPassWord().equals(password)){
				loginOpr = o;
			}
		}
		//保存登录用户信息
		if(null != loginOpr){
			POSClientApp.get().saveLoginUser(loginOpr);
		}
		return loginOpr;
	}

}
