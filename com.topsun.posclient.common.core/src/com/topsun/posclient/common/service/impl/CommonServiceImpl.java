package com.topsun.posclient.common.service.impl;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.dao.CommonDao;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.CashierModeDTO;
import com.topsun.posclient.datamodel.dto.ItemDTO;
import com.topsun.posclient.datamodel.dto.ShopDTO;
import com.topsun.posclient.datamodel.dto.UserDTO;

/**
 * 公共服务实现
 * 
 * @author Dong
 * 
 */
public class CommonServiceImpl implements ICommonService {

	/**
	 * 公共数据访问
	 */
	private CommonDao commonDao = new CommonDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.topsun.posclient.common.service.ICommonService#getAllCashierMode()
	 */
	public List<CashierModel> getAllCashierMode() throws POSException {
		CashierModeDTO cashierModeDTO = null;
		try {
			cashierModeDTO = commonDao.getAllCashierMode();
		} catch (Exception e) {
			throw new POSException("查询结算方式出错！");
		}
		return cashierModeDTO.getCashierModeList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.topsun.posclient.common.service.ICommonService#getShopNameByUserId
	 * (int)
	 */
	public String getShopNameByUserId(int userId) throws POSException {
		UserDTO userDto = null;
		try {
			userDto = commonDao.getUserById(userId);
		} catch (Exception e) {
			throw new POSException("查询店铺名称出错！");
		}
		List<User> userList = userDto.getUserList();
		if (null == userList) {
			return "";
		}
		User user = userList.get(0);
		if (null == user) {
			return "";
		}
		return user.getDeptName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.topsun.posclient.common.service.ICommonService#getItemByCode(java
	 * .lang.String)
	 */
	public Item getItemByCode(String code) throws POSException {
		Item returnItem = null;
		ItemDTO itemDto = null;
		try {
			itemDto = commonDao.getAllItem();

			if (null != itemDto) {
				List<Item> itemList = itemDto.getItemList();
				if (null == itemList || itemList.size() <= 0) {
					return null;
				}
				for (Item item : itemList) {
					if (item.getItemCode().equals(code)) {
						returnItem = item;
					}
				}
			}
		} catch (Exception e) {
			throw new POSException("查询商品信息出错！");
		}
		return returnItem;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.topsun.posclient.common.service.ICommonService#getAllShop()
	 */
	public List<Shop> getAllShop() throws POSException {
		
		ShopDTO itemDto = null;
		List<Shop> itemList = null;
		try {
			itemDto = commonDao.getAllShop();
			if (null != itemDto) {
				itemList = itemDto.getShopList();
			}
		} catch (Exception e) {
			throw new POSException("获取店铺信息失败");
		}
		return itemList;
	}
}
