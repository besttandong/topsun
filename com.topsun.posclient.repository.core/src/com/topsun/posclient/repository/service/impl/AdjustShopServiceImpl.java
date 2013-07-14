package com.topsun.posclient.repository.service.impl;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.AdjustShopInfo;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;
import com.topsun.posclient.repository.dao.AdjustShopDao;
import com.topsun.posclient.repository.service.IAdjustShopService;

/**
 * 调店信息服务实现
 * 
 * @author Dong
 * 
 */
public class AdjustShopServiceImpl extends BaseServiceImpl implements
		IAdjustShopService {

	/**
	 * 调店数据处理
	 */
	AdjustShopDao adjustStoreDao = new AdjustShopDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.topsun.posclient.repository.service.IAdjustShopService#
	 * saveAdjustStoreInfo(com.topsun.posclient.datamodel.dto.AdjustShopDTO)
	 */
	public void saveAdjustStoreInfo(AdjustShopDTO adjustStoreDTO)
			throws POSException {
		try {
			adjustStoreDao.saveAdjustShop(adjustStoreDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new POSException("保存调店数据失败");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.topsun.posclient.repository.service.IAdjustShopService#
	 * queryAdjustShopList(com.topsun.posclient.datamodel.AdjustShopInfo)
	 */
	public List<AdjustShopInfo> queryAdjustShopList(
			AdjustShopInfo adjustShopInfo) throws POSException {
		List<AdjustShopInfo> adjustShopList = null;
		try {
			adjustShopList = adjustStoreDao.queryAdjustShopInfo(adjustShopInfo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new POSException("查询失败");
		}
		return adjustShopList;
	}

	/* (non-Javadoc)
	 * @see com.topsun.posclient.repository.service.IAdjustShopService#getAllAdjustShopInfo()
	 */
	public List<AdjustShopInfo> getAllAdjustShopInfo() throws POSException {
		return null;
	}

}
