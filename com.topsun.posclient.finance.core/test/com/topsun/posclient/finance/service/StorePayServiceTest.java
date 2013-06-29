package com.topsun.posclient.finance.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.PayRecord;
import com.topsun.posclient.datamodel.dto.PayRecordDTO;
import com.topsun.posclient.finance.service.impl.StorePayServiceImpl;

public class StorePayServiceTest extends TestCase {
	
	IStorePayService payRecordService = new StorePayServiceImpl();
	
	public void testSaveStorePay(){
		
		PayRecord payRecord1 = new PayRecord();
		payRecord1.setAccount("6225666678900985");
		payRecord1.setAmount(70000.00);
		payRecord1.setApprove("张三");
		payRecord1.setApproveDate("2013-06-24");
		payRecord1.setBankName("中国建设银行");
		payRecord1.setPayDate("2013-06-24");
		payRecord1.setRemark("备注信息");
		payRecord1.setPayer("李四");
		payRecord1.setId("00101");
		
		
		PayRecord payRecord2 = new PayRecord();
		payRecord2.setAccount("6225666678903456");
		payRecord2.setAmount(70000.00);
		payRecord2.setApprove("张三");
		payRecord2.setApproveDate("2013-06-30");
		payRecord2.setBankName("中国建设银行");
		payRecord2.setPayDate("2013-06-30");
		payRecord2.setRemark("备注信息");
		payRecord2.setPayer("王五");
		payRecord2.setId("00102");
		
		List<PayRecord> payRecords = new ArrayList<PayRecord>();
		payRecords.add(payRecord1);
		payRecords.add(payRecord2);
		
		PayRecordDTO payRecordDTO = new PayRecordDTO();
		payRecordDTO.setPayRecordList(payRecords);
		
		try {
			payRecordService.saveStorePay(payRecordDTO);
		} catch (POSException e) {
			e.printStackTrace();
		}
	}

}
