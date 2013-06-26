package com.topsun.posclient.finance.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.model.SettleAccWayInfo;
import com.topsun.posclient.finance.dto.SettleAccWayDTO;
import com.topsun.posclient.finance.service.impl.SettleAccWayServiceImpl;

public class SettleAccWayServiceTest extends TestCase {
	
	ISettleAccWayService settleAccWayService = new SettleAccWayServiceImpl();
	
	public void testSaveAccWay(){
		
		SettleAccWayInfo settleAccWayInfo1 = new SettleAccWayInfo();
		settleAccWayInfo1.setBankName("中国建设银行");
		settleAccWayInfo1.setAccount("6225667788990989");
		settleAccWayInfo1.setPayCustomer("XXX工厂");
		settleAccWayInfo1.setReceiveCustomer("XXXX客户");
		settleAccWayInfo1.setSettleAccWay(1);
		settleAccWayInfo1.setRemark("备注信息");
		settleAccWayInfo1.setId("000101");
		
		SettleAccWayInfo settleAccWayInfo2 = new SettleAccWayInfo();
		settleAccWayInfo2.setBankName("中国工商银行");
		settleAccWayInfo2.setAccount("6225334488990989");
		settleAccWayInfo2.setPayCustomer("XXX工厂");
		settleAccWayInfo2.setReceiveCustomer("XXXX客户");
		settleAccWayInfo2.setSettleAccWay(1);
		settleAccWayInfo2.setRemark("备注信息");
		settleAccWayInfo2.setId("000102");
		
		List<SettleAccWayInfo> settleAccWayInfos = new ArrayList<SettleAccWayInfo>();
		settleAccWayInfos.add(settleAccWayInfo1);
		settleAccWayInfos.add(settleAccWayInfo2);
		
		SettleAccWayDTO settleAccWayDTO = new SettleAccWayDTO();
		settleAccWayDTO.setSettleAccWayInfoList(settleAccWayInfos);
		
		try {
			settleAccWayService.saveSettleAccWay(settleAccWayDTO);
		} catch (POSException e) {
			e.printStackTrace();
		}
	}

}
