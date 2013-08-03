package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.AdjustShopInfo;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;
import com.topsun.posclient.webservice.POSServerCaller;
import com.topsun.posclient.webservice.dto.ArrayOfitem;
import com.topsun.posclient.webservice.dto.ArrayOfshopAllot;
import com.topsun.posclient.webservice.dto.QueryShopAllot;
import com.topsun.posclient.webservice.dto.QueryShopAllotReq;
import com.topsun.posclient.webservice.dto.QueryShopAllotReqCondition;
import com.topsun.posclient.webservice.dto.QueryShopAllotResponse;
import com.topsun.posclient.webservice.dto.QueryShopAllotResult;
import com.topsun.posclient.webservice.dto.ShopAllot;

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
//			IPosWebService webservice = this.getServerCaller().getWebService();
//			webservice.saveShopPay(saveData);
		}else{
			this.getLocalProcessor().createXmlFileFromObject(adjustStoreDTO,
					"data_adjustShop", AppConstants.DATA_ADJUSTSHOP_PATH);
		}
	}
	
	/**
	 * 查询调店信息
	 * 
	 * @return 调店信息集合
	 * @throws Exception
	 */
	public List<AdjustShopInfo> queryAdjustShopInfo(HashMap<String, Object> queryParams) throws Exception {
		if (checkConnection()) {
			//设置查询条件
			QueryShopAllotReqCondition condition = new QueryShopAllotReqCondition();
//			condition.setInShpId(0);
//			condition.setMakerID(0);
//			condition.setOutShpId(0);
//			condition.setDocNum(null);
//			condition.setAllotTypeId(0);
//			condition.setAllotDateStart(null);
//			condition.setAllotDateFinish(null);
			
			//设置查询请求报文
			QueryShopAllot queryShopAllot = new QueryShopAllot();
			
			QueryShopAllotReq req = new QueryShopAllotReq();
			req.setUserCredential(POSServerCaller.getDefaultUserCredential());
			req.setCondition(condition);
			
			queryShopAllot.setQueryShopAllotReq(req);
			
			//处理返回值
			QueryShopAllotResponse response = POSServerCaller.getWebService().queryShopAllot(queryShopAllot);
			QueryShopAllotResult result = response.getQueryShopAllotResult();
			
			List<AdjustShopInfo> resultList = new ArrayList<AdjustShopInfo>();
			
			if(result.getResult().getFlag().equals("0")){
				ArrayOfshopAllot arrayOfshopAllot = result.getShopAllots();
				ShopAllot[] shopAllotArray = arrayOfshopAllot.getShopAllot();
				for(int i=0; i<shopAllotArray.length; i++){
					ShopAllot shopAllot = shopAllotArray[i];
					AdjustShopInfo adjustShop = new AdjustShopInfo();
					adjustShop.setVoucherNo(shopAllot.getDocNum());
					adjustShop.setApplyUser(String.valueOf(shopAllot.getMakerID()));
					adjustShop.setCallDate(shopAllot.getAllotDate().getTime());
					adjustShop.setCallType(String.valueOf(shopAllot.getAllotTypeId()));
					adjustShop.setIntoShop(String.valueOf(shopAllot.getInShpId()));
					adjustShop.setRemark(shopAllot.getMemo());
					adjustShop.setOutShop(String.valueOf(shopAllot.getOutShpId()));
					adjustShop.setItemList(getItemList(shopAllot.getItems()));
					adjustShop.setCheckDate(new Date());
					adjustShop.setChecker(String.valueOf(shopAllot.getMakerID()));
					adjustShop.setReCheckDate(new Date());
					adjustShop.setReChecker(String.valueOf(shopAllot.getMakerID()));
					adjustShop.setItemNum(shopAllotArray.length);
					resultList.add(adjustShop);
				}
			}else{
				throw new Exception(result.getResult().getMsg());
			}
			return resultList;
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
	
	private static List<Item> getItemList(ArrayOfitem itemArray){
		List<Item> items = new ArrayList<Item>();
		com.topsun.posclient.webservice.dto.Item[] iArray = itemArray.getItem();
		if(null == iArray){
			return null;
		}
		for(int i=0; i<iArray.length; i++){
			com.topsun.posclient.webservice.dto.Item im =  iArray[i];
			Item iii = new Item();
			iii.setId(im.getItemId());
			iii.setItemCode(String.valueOf(im.getLineNum()));
			iii.setNum(im.getQuantity());
			items.add(iii);
		}
		return items;
	}

}
