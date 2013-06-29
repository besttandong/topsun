package com.topsun.posclient.common.dao;

import java.io.File;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.datamodel.dto.CashierModeDTO;
import com.topsun.posclient.datamodel.dto.ShopDTO;
import com.topsun.posclient.datamodel.dto.UserDTO;

/**
 * �������ݴ���
 * 
 * @author Dong
 * 
 */
public class CommonDao extends BaseDao {

	/**
	 * ��ȡ�û�����
	 * 
	 * @return
	 * @throws Exception
	 */
	public UserDTO getUserData() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_USER_FILENAME);
		UserDTO operatorDTO = (UserDTO) getLocalProcessor().getObjectFromXml(
				this.getLocalProcessor().getDataFileContent(file),
				UserDTO.class);
		return operatorDTO;
	}

	/**
	 * �����û�ID��ȡ���ڵ���
	 * 
	 * @param userId
	 *            �û�ID
	 * @return
	 * @throws Exception
	 */
	public ShopDTO getShopByUserId(int userId) throws Exception {
		File userDatafile = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_USER_FILENAME);
		UserDTO userDTO = (UserDTO) getLocalProcessor().getObjectFromXml(
				getLocalProcessor().getDataFileContent(userDatafile),
				UserDTO.class);

		File shopDatafile = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_USER_FILENAME);

		ShopDTO shopDTO = (ShopDTO) getLocalProcessor().getObjectFromXml(
				getLocalProcessor().getDataFileContent(shopDatafile),
				ShopDTO.class);

		return shopDTO;
	}

	/**
	 * ��ȡ���н��㷽ʽ
	 * 
	 * @return ���㷽ʽDTO
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
