package com.topsun.posclient.common.service.impl;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.datamodel.AllotStyle;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.AllotStyleDTO;
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

	private BaseDao baseDao = new BaseDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.topsun.posclient.common.service.ICommonService#getAllCashierMode()
	 */
	public List<CashierModel> getAllCashierMode() throws POSException {
		CashierModeDTO cashierModeDTO = null;
		try {
			cashierModeDTO = baseDao.getAllCashierMode();
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
			userDto = baseDao.getUserById(userId);
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
			itemDto = baseDao.getAllItem();

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
			itemDto = baseDao.getAllShop();
			if (null != itemDto) {
				itemList = itemDto.getShopList();
			}
		} catch (Exception e) {
			throw new POSException("获取店铺信息失败");
		}
		return itemList;
	}

	/* (non-Javadoc)
	 * @see com.topsun.posclient.common.service.ICommonService#getAllotStyle()
	 */
	public List<AllotStyle> getAllotStyle() throws POSException {
		AllotStyleDTO allotStyleDTO = null;
		
		List<AllotStyle> allotStyleList = null;
		try {
			allotStyleDTO = baseDao.getAllAllotStyle();
			if (null != allotStyleDTO) {
				allotStyleList = allotStyleDTO.getAllotStyleList();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new POSException("获取调拨类型信息失败");
		}
		return allotStyleList;
	}

	/* (non-Javadoc)
	 * @see com.topsun.posclient.common.service.ICommonService#createNo()
	 */
	public String createNo() throws POSException {
		return String.valueOf(System.currentTimeMillis());
	}
}
