package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.dto.AdjustRepositoryDTO;
import com.topsun.posclient.webservice.POSServerCaller;
import com.topsun.posclient.webservice.dto.ArrayOfbackWarehouse;
import com.topsun.posclient.webservice.dto.BackWarehouse;
import com.topsun.posclient.webservice.dto.QueryReturnRepository;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryReq;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryReqCondition;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryResponse;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryResult;

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
//			IPosWebService webservice = this.getServerCaller().getWebService();
//			webservice.saveShopPay(saveData);
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
		List<AdjustRepositoryInfo> resultList = null;
		if (checkConnection()) {
			//设置查询条件
			QueryReturnRepositoryReqCondition condition = new QueryReturnRepositoryReqCondition();
			
			QueryReturnRepositoryReq req = new QueryReturnRepositoryReq();
			req.setUserCredential(POSServerCaller.getDefaultUserCredential());
			req.setCondition(condition);
			
			QueryReturnRepository queryReturnRepository = new QueryReturnRepository();
			queryReturnRepository.setQueryReturnRepositoryReq(req);
			QueryReturnRepositoryResponse response = POSServerCaller.getWebService().queryReturnRepository(queryReturnRepository);
			System.out.println("--------->>> Call webservice finished!");
			// 处理查询结果
			QueryReturnRepositoryResult result = response.getQueryReturnRepositoryResult();
			if(result.getResult().getFlag().equals("0")){
				ArrayOfbackWarehouse aow = result.getBackWarehouses();
				BackWarehouse[] bws = aow.getBackWarehouse();
				
				resultList = new ArrayList<AdjustRepositoryInfo>();
				for(int i=0; i<bws.length; i++){
					BackWarehouse bw = bws[i];
					AdjustRepositoryInfo ari = new AdjustRepositoryInfo();
					ari.setApplyUser(this.getEmployeeNameById(bw.getMakerID()));
					ari.setBackReason(String.valueOf(bw.getBackWHID()));
					ari.setShopName(this.getShopNameById(bw.getShopID()));
					ari.setRemark(bw.getMemo());
					ari.setReceiveRepository(String.valueOf(bw.getWarehouseID()));
					ari.setOrderNo(bw.getDocNum());
					ari.setDeliver(this.getEmployeeNameById(bw.getConsignorID()));
					resultList.add(ari);
				}
			}else{
				throw new Exception(result.getResult().getMsg());
			}
			return resultList;
		}else{
			throw new Exception("联机失败！");
		}
	}
}
