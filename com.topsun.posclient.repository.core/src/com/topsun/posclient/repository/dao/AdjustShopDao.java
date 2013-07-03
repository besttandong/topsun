package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
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
	public void saveAdjustStore(AdjustShopDTO adjustStoreDTO) throws Exception {
		this.getLocalProcessor().createXmlFileFromObject(adjustStoreDTO,
				"data_adjustStore", AppConstants.DATA_ADJUSTSTORE_PATH);
	}

	/**
	 * 查询调店信息
	 * 
	 * @return 调店信息集合
	 * @throws Exception
	 */
	public List<AdjustShopInfo> queryAdjustShopInfo(AdjustShopInfo adjustShopInfo) throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_ADJUSTSTORE_PATH);
		//TODO 遍历所有调店信息文件
		AdjustShopDTO adjustShopDTO = (AdjustShopDTO)this.getLocalProcessor()
				.getObjectFromXml(
						this.getLocalProcessor().getDataFileContent(file),
						AdjustShopDTO.class);
		
		List<AdjustShopInfo> returnList = adjustShopDTO.getAdjustShopList();
		List<AdjustShopInfo> adjustShopInfoList = adjustShopDTO.getAdjustShopList();
		for(AdjustShopInfo asi : adjustShopInfoList){
			// TODO 查询条件判断，调拨日期在开始日期和结束日期之间
			System.out.println(asi.getCallDate());
		}
		return returnList;
	}

}
