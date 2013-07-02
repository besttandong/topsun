package com.topsun.posclient.common.service;

import java.util.List;

import com.topsun.posclient.datamodel.CashierModel;

/**
 * ��������ӿ�
 * 
 * @author Dong
 *
 */
public interface ICommonService {
	
	/**
	 * ����û�ID��ȡ���ڵ���
	 * @param userId �û�ID
	 * @return ���̶���
	 * @throws Exception
	 */
	public String getShopNameByUserId(int userId) throws Exception;
	
	/**
	 * ��ȡ���н��㷽ʽ
	 * 
	 * @return ���㷽ʽ�б�
	 * @throws Exception
	 */
	public List<CashierModel> getAllCashierMode() throws Exception;

}
