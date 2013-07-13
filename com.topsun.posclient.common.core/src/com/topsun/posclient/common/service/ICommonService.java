package com.topsun.posclient.common.service;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.AllotStyle;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.Shop;

/**
 * 公共服务接口
 * 
 * @author Dong
 *
 */
public interface ICommonService {
	
	/**
	 * 生成单据编号
	 * @return
	 * @throws POSException
	 */
	public String createNo() throws POSException;
	
	/**
	 * 根据用户ID获取店铺名称
	 * 
	 * @throws Exception
	 */
	public String getShopNameByUserId(int userId) throws POSException;
	
	/**
	 * 获取所有结算方式
	 * @return
	 * @throws Exception
	 */
	public List<CashierModel> getAllCashierMode() throws POSException;
	
	/**
	 * 根据款号获取商品信息
	 * @return
	 * @throws POSException
	 */
	public Item getItemByCode(String code) throws POSException;
	
	
	/**
	 * 获取所有店铺信息
	 * @return
	 * @throws POSException
	 */
	public List<Shop> getAllShop() throws POSException;
	
	/**
	 * 获取所有调拨类型
	 * @return
	 * @throws POSException
	 */
	public List<AllotStyle> getAllotStyle() throws POSException;

}
