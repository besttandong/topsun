package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.common.webservice.IPosWebService;
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
			//保存本地备份数据
			File file = this.getLocalProcessor().createXmlFileFromObject(adjustRepositoryDTO, "data_adjustRepository", AppConstants.DATA_ADJUSTREPOSITORY_PATH_BACK);
			String saveData = this.getLocalProcessor().getDataFileContent(file);
			IPosWebService webservice = this.getServerCaller().getWebService();
			webservice.saveShopPay(saveData);
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
		
		if (checkConnection()) {
//			IPosWebService webservice = this.getServerCaller().getWebService();
//			webservice.saveAdjustRepository(adjustRepositoryDTO));
			
			return null;
			
		}else{
			List<AdjustRepositoryInfo> returnList = new ArrayList<AdjustRepositoryInfo>();
			List<AdjustRepositoryDTO> adjustRepositoryDtoList = new ArrayList<AdjustRepositoryDTO>();
			
			File file = new File(ProjectUtil.getRuntimeClassPath() + AppConstants.DATA_ADJUSTREPOSITORY_PATH);
			File[] dataFiles = file.listFiles();
			for(int i=0; i<dataFiles.length; i++){
				File dataFile = dataFiles[i];
				if(dataFile.isFile()){
					AdjustRepositoryDTO adjustRepositoryDTO = (AdjustRepositoryDTO)this.getLocalProcessor()
					.getObjectFromXml(
							this.getLocalProcessor().getDataFileContent(file), AdjustRepositoryDTO.class);
					adjustRepositoryDtoList.add(adjustRepositoryDTO);
				}
			}
			for(AdjustRepositoryDTO adjustRepositoryDTO : adjustRepositoryDtoList){
				List<AdjustRepositoryInfo> adjustRepositoryInfoList = adjustRepositoryDTO.getAdjustRepositoryInfos();
				for(AdjustRepositoryInfo asi : adjustRepositoryInfoList){
					Date startDate = new Date();
					Date endDate = new Date();
					//时间区间判断
					if(asi.getBackDate().before(startDate) && asi.getBackDate().after(endDate)){
						returnList.add(asi);
					}
				}
			}
			return returnList;
		}
	}
}
