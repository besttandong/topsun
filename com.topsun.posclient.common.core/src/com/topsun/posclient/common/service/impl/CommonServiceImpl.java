package com.topsun.posclient.common.service.impl;

import java.util.List;

import com.topsun.posclient.common.dao.CommonDao;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.CashierModeDTO;
import com.topsun.posclient.datamodel.dto.UserDTO;

/**
 * 
 * @author Dong
 *
 */
public class CommonServiceImpl implements ICommonService {
	
	private CommonDao commonDao = new CommonDao();

	/* (non-Javadoc)
	 * @see com.topsun.posclient.common.service.ICommonService#getAllCashierMode()
	 */
	public List<CashierModel> getAllCashierMode() throws Exception {
		CashierModeDTO  cashierModeDTO = commonDao.getAllCashierMode();
		return cashierModeDTO.getCashierModeList();
	}

	/* (non-Javadoc)
	 * @see com.topsun.posclient.common.service.ICommonService#getShopNameByUserId(int)
	 */
	public String getShopNameByUserId(int userId) throws Exception {
		UserDTO userDto = commonDao.getUserById(userId);
		List<User> userList = userDto.getUserList();
		if(null == userList){
			return "";
		}
		User user = userList.get(0);
		if(null == user){
			return "";
		}
		return user.getDeptName();
	}

}
