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
		settleAccWayInfo1.setBankName("�й���������");
		settleAccWayInfo1.setAccount("6225667788990989");
		settleAccWayInfo1.setPayCustomer("XXX����");
		settleAccWayInfo1.setReceiveCustomer("XXXX�ͻ�");
		settleAccWayInfo1.setSettleAccWay(1);
		settleAccWayInfo1.setRemark("��ע��Ϣ");
		settleAccWayInfo1.setId("000101");
		
		SettleAccWayInfo settleAccWayInfo2 = new SettleAccWayInfo();
		settleAccWayInfo2.setBankName("�й���������");
		settleAccWayInfo2.setAccount("6225334488990989");
		settleAccWayInfo2.setPayCustomer("XXX����");
		settleAccWayInfo2.setReceiveCustomer("XXXX�ͻ�");
		settleAccWayInfo2.setSettleAccWay(1);
		settleAccWayInfo2.setRemark("��ע��Ϣ");
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
