package com.topsun.posclient.common.dao;

import java.io.File;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.datamodel.dto.CashierModeDTO;
import com.topsun.posclient.datamodel.dto.UserDTO;

/**
 * 
 * @author Dong
 * 
 */
public class CommonDao extends BaseDao {

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public UserDTO getUserData() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_USER_FILENAME);
		
		if(file.exists()){
			UserDTO operatorDTO = (UserDTO) getLocalProcessor().getObjectFromXml(
					this.getLocalProcessor().getDataFileContent(file),
					UserDTO.class);
			return operatorDTO;
		}
		return null;
	}

	/**
	 * 
	 * @param userId �û�ID
	 * @return
	 * @throws Exception
	 */
	public UserDTO getUserById(int userId) throws Exception {
		File userDatafile = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_USER_FILENAME);
		UserDTO userDTO = (UserDTO) getLocalProcessor().getObjectFromXml(
				getLocalProcessor().getDataFileContent(userDatafile),
				UserDTO.class);
		return userDTO;
	}

	/**
	 * 
	 * @throws Exception
	 */
	public CashierModeDTO getAllCashierMode() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_CASHIERMODE_FILENAME);
		CashierModeDTO cashierModeDTO = (CashierModeDTO) getLocalProcessor()
				.getObjectFromXml(getLocalProcessor().getDataFileContent(file),
						CashierModeDTO.class);
		return cashierModeDTO;
	}

}
