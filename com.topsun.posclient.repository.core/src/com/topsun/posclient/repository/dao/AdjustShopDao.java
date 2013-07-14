package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.datamodel.AdjustShopInfo;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;

/**
 * 调店信息数据处理
 * 
 * @author Dong
 * 
 */
public class AdjustShopDao extends BaseDao {

	/**
	 * 保存调店信息
	 * 
	 * @param adjustStoreDTO 调店信息
	 * @throws Exception
	 */
	public void saveAdjustShop(AdjustShopDTO adjustStoreDTO) throws Exception {
		if (checkConnection()) {
			//保存本地备份数据
			File file = this.getLocalProcessor().createXmlFileFromObject(adjustStoreDTO, "data_adjustShop", AppConstants.DATA_ADJUSTSHOP_PATH_BACK);
			String saveData = this.getLocalProcessor().getDataFileContent(file);
			IPosWebService webservice = this.getServerCaller().getWebService();
			webservice.saveShopPay(saveData);
		}else{
			this.getLocalProcessor().createXmlFileFromObject(adjustStoreDTO,
					"data_adjustShop", AppConstants.DATA_ADJUSTSHOP_PATH);
		}
	}
	
	/**
	 * 获取所有调店信息
	 * @return 调店信息集合
	 * @throws Exception
	 */
	public List<AdjustShopInfo> getAllAdjustShopInfo() throws Exception{
		List<AdjustShopInfo> returnList = new ArrayList<AdjustShopInfo>();
		List<AdjustShopDTO> adjustShopDTOList = new ArrayList<AdjustShopDTO>();
		
		File file = new File(ProjectUtil.getRuntimeClassPath() + AppConstants.DATA_ADJUSTSHOP_PATH);
		File[] dataFiles = file.listFiles();
		if(dataFiles.length > 0){
			AdjustShopDTO adjustShopDTO = (AdjustShopDTO)this.getLocalProcessor()
			.getObjectFromXml(getLocalProcessor().getDataFileContent(file), AdjustShopDTO.class);
			adjustShopDTOList.add(adjustShopDTO);
		}
		
		for(AdjustShopDTO adjustShopDTO : adjustShopDTOList){
			List<AdjustShopInfo> adjustShopInfoList = adjustShopDTO.getAdjustShopList();
			for(AdjustShopInfo asi : adjustShopInfoList){
				returnList.add(asi);
			}
		}
		
		return returnList;
	}

	/**
	 * 查询调店信息
	 * 
	 * @return 调店信息集合
	 * @throws Exception
	 */
	public List<AdjustShopInfo> queryAdjustShopInfo(AdjustShopInfo adjustShopInfo) throws Exception {
		if (checkConnection()) {
//			IPosWebService webservice = this.getServerCaller().getWebService();
//			webservice.saveAdjustRepository(adjustRepositoryDTO));
			
			return null;
			
		}else{
			List<AdjustShopInfo> returnList = new ArrayList<AdjustShopInfo>();
			List<AdjustShopDTO> adjustShopDTOList = new ArrayList<AdjustShopDTO>();
			
			File file = new File(ProjectUtil.getRuntimeClassPath() + AppConstants.DATA_ADJUSTSHOP_PATH);
			File[] dataFiles = file.listFiles();
			for(int i=0; i<dataFiles.length; i++){
				File dataFile = dataFiles[i];
				if(dataFile.isFile()){
					AdjustShopDTO adjustShopDTO = (AdjustShopDTO)this.getLocalProcessor()
					.getObjectFromXml(getLocalProcessor().getDataFileContent(dataFile), AdjustShopDTO.class);
					adjustShopDTOList.add(adjustShopDTO);
				}
			}
			for(AdjustShopDTO adjustShopDTO : adjustShopDTOList){
				List<AdjustShopInfo> adjustShopInfoList = adjustShopDTO.getAdjustShopList();
				for(AdjustShopInfo asi : adjustShopInfoList){
					Date startDate = new Date();
					Date endDate = new Date();
					//时间区间判断
					if(asi.getCallDate().before(startDate) && asi.getCallDate().after(endDate)){
						returnList.add(asi);
					}
				}
			}
			return returnList;
		}
	}

}
