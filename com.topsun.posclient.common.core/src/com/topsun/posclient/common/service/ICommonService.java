package com.topsun.posclient.common.service;

import java.util.List;

import com.topsun.posclient.datamodel.CashierModel;

/**
 * 公共服务接口
 * 
 * @author Dong
 *
 */
public interface ICommonService {
	
	/**
	 * 根据用户ID获取店铺名称
	 * 
	 * @throws Exception
	 */
	public String getShopNameByUserId(int userId) throws Exception;
	
	/**
	 * 获取所有结算方式
	 * @return
	 * @throws Exception
	 */
	public List<CashierModel> getAllCashierMode() throws Exception;

}
