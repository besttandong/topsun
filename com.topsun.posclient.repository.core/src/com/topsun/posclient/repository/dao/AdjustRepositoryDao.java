package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.dto.AdjustRepositoryDTO;

/**
 * 回仓数据处理
 * 
 * @author Dong
 * 
 */
public class AdjustRepositoryDao extends BaseDao {

	/**
	 * 保存回仓信息
	 * @param adjustRepositoryDTO 回仓信息
	 * @throws Exception
	 */
	public void saveAdjustRepository(AdjustRepositoryDTO adjustRepositoryDTO) throws Exception {
		if (checkConnection()) {
			
		}else{
			this.getLocalProcessor().createXmlFileFromObject(adjustRepositoryDTO, "data_adjustRepository", AppConstants.DATA_ADJUSTREPOSITORY_PATH);
		}
	}
	
	/**
	 * 查询回仓信息
	 * @param adjustRepositoryInfo 回仓信息
	 * @return
	 * @throws Exception
	 */
	public List<AdjustRepositoryInfo> queryAdjustRepository(AdjustRepositoryInfo adjustRepositoryInfo) throws Exception {
		
		File file = new File(ProjectUtil.getRuntimeClassPath() + AppConstants.DATA_ADJUSTREPOSITORY_PATH);
		
		//TODO 遍历所有回仓信息文件
		AdjustRepositoryDTO adjustRepositoryDTO = (AdjustRepositoryDTO)this.getLocalProcessor()
				.getObjectFromXml(
						this.getLocalProcessor().getDataFileContent(file),
						AdjustRepositoryDTO.class);
		
		List<AdjustRepositoryInfo> returnList = adjustRepositoryDTO.getAdjustRepositoryInfos();
		List<AdjustRepositoryInfo> adjustRepositoryInfoList = adjustRepositoryDTO.getAdjustRepositoryInfos();
		for(AdjustRepositoryInfo asi : adjustRepositoryInfoList){
			// TODO 查询条件判断，回仓日期在开始日期和结束日期之间
			System.out.println(asi.getBackDate());
		}
		return returnList;
	}
}
