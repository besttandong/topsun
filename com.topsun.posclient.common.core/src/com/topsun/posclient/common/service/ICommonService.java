package com.topsun.posclient.common.service;

import java.util.List;

import com.topsun.posclient.datamodel.CashierMode;

/**
 * 公共服务接口
 * 
 * @author Dong
 *
 */
public interface ICommonService {
	
	/**
	 * 根据用户ID获取所在店铺
	 * @param userId 用户ID
	 * @return 店铺对象
	 * @throws Exception
	 */
	public String getShopNameByUserId(int userId) throws Exception;
	
	/**
	 * 获取所有结算方式
	 * 
	 * @return 结算方式列表
	 * @throws Exception
	 */
	public List<CashierMode> getAllCashierMode() throws Exception;

}
