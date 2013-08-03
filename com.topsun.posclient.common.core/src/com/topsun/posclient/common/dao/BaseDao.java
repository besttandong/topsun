package com.topsun.posclient.common.dao;

import java.io.File;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.LocalDataProcessor;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.AllotStyleDTO;
import com.topsun.posclient.datamodel.dto.CashierModeDTO;
import com.topsun.posclient.datamodel.dto.ItemDTO;
import com.topsun.posclient.datamodel.dto.ShopDTO;
import com.topsun.posclient.datamodel.dto.UserDTO;

/**
 * @author Dong
 *
 */
public class BaseDao {
	
	LocalDataProcessor localProcessor = new LocalDataProcessor();

	/**
	 * 
	 * @return
	 * @throws POSException 
	 */
	public boolean checkConnection() {
		return ProjectUtil.checkConnection();
	}


	public LocalDataProcessor getLocalProcessor() {
		return localProcessor;
	}
	
	
	/**
	 * 获取用户
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
	 * 根据ID获取用户信息
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
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public String getEmployeeNameById(int userId) throws Exception {
		File userDatafile = new File(ProjectUtil.getRuntimeClassPath()+ AppConstants.DATA_USER_FILENAME);
		UserDTO userDTO = (UserDTO) getLocalProcessor().getObjectFromXml(
				getLocalProcessor().getDataFileContent(userDatafile),
				UserDTO.class);
		List<User> userList = userDTO.getUserList();
		for(User s : userList){
			if(s.getId() == userId){
				return s.getEmployeeName();
			}
		}
		return "";
	}

	/**
	 * 获取所有结算方式
	 * @return
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
	
	/**
	 * 获取所有调拨类型
	 * @return
	 * @throws Exception
	 */
	public AllotStyleDTO getAllAllotStyle() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_ALLOTSTYLE_FILENAME);
		AllotStyleDTO allotStyleDTO = (AllotStyleDTO) getLocalProcessor()
				.getObjectFromXml(getLocalProcessor().getDataFileContent(file), AllotStyleDTO.class);
		return allotStyleDTO;
	}
	
	/**
	 * 获取所有商品信息
	 * @return
	 * @throws Exception
	 */
	public ItemDTO getAllItem() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_ITEM_FILENAME);
		ItemDTO itemDTO = (ItemDTO) getLocalProcessor()
				.getObjectFromXml(getLocalProcessor().getDataFileContent(file), ItemDTO.class);
		return itemDTO;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public ShopDTO getAllShop() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_SHOP_FILENAME);
		ShopDTO shopDTO = (ShopDTO) getLocalProcessor()
				.getObjectFromXml(getLocalProcessor().getDataFileContent(file), ShopDTO.class);
		return shopDTO;
	}
	
	public String getShopNameById(int shopId) throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()+ AppConstants.DATA_SHOP_FILENAME);
		ShopDTO shopDTO = (ShopDTO) getLocalProcessor().getObjectFromXml(getLocalProcessor().getDataFileContent(file), ShopDTO.class);
		List<Shop> shopList = shopDTO.getShopList();
		for(Shop s : shopList){
			if(s.getId() == shopId){
				return s.getShpName();
			}
		}
		return "";
	}
	
	public String getItemNameById(int itemId) throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()+ AppConstants.DATA_ITEM_FILENAME);
		ItemDTO itemDTO = (ItemDTO) getLocalProcessor().getObjectFromXml(getLocalProcessor().getDataFileContent(file), ItemDTO.class);
		List<Item> itemList = itemDTO.getItemList();
		for(Item i : itemList){
			if(i.getId() == itemId){
				return i.getItemName();
			}
		}
		return "";
	}
}
