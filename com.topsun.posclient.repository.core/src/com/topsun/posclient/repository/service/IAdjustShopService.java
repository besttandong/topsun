package com.topsun.posclient.repository.service;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.AdjustShopInfo;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;

/**
 * 调店服务接口
 * 
 * @author Dong
 * 
 */
public interface IAdjustShopService extends IBaseService {

	/**
	 * 保存调店信息
	 * 
	 * @param adjustStoreDTO
	 * @throws POSException
	 */
	public void saveAdjustStoreInfo(AdjustShopDTO adjustStoreDTO)
			throws POSException;

	/**
	 * 查询调店信息
	 * 
	 * @param adjustShopInfo
	 *            调店信息
	 * @return 调店信息集合
	 * @throws POSException
	 */
	public List<AdjustShopInfo> queryAdjustShopList(
			AdjustShopInfo adjustShopInfo) throws POSException;

}
