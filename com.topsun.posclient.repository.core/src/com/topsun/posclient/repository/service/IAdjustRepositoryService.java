package com.topsun.posclient.repository.service;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.dto.AdjustRepositoryDTO;

/**
 * 调仓信息服务接口
 * 
 * @author Dong
 *
 */
public interface IAdjustRepositoryService extends IBaseService {

	/**
	 * 保存回仓信息
	 * 
	 * @param adjustRepositoryDTO 回仓信息
	 * @throws POSException
	 */
	public void saveAdjustRepositoryInfo(AdjustRepositoryDTO adjustRepositoryDTO) throws POSException;
	
	/**
	 * 查询回仓信息
	 * 
	 * @param adjustShopInfo 回仓信息
	 * @return
	 * @throws POSException
	 */
	public List<AdjustRepositoryInfo> queryAdjustShopList(AdjustRepositoryInfo adjustRepositoryInfo) throws POSException;
}
