package com.topsun.posclient.finance.ui.view;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class SettleAccWayTableLableProvider implements ITableLabelProvider {

	public void addListener(ILabelProviderListener arg0) {
		
	}

	public void dispose() {
		
	}

	public boolean isLabelProperty(Object arg0, String arg1) {
		return false;
	}

	public void removeListener(ILabelProviderListener arg0) {
		
	}

	public Image getColumnImage(Object arg0, int arg1) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
//		if (element instanceof SettleAccWayInfo) {
//			SettleAccWayInfo settleAccInfo = (SettleAccWayInfo) element;
//			int settleAccWay = settleAccInfo.getSettleAccWay();
//			String payCustomer = settleAccInfo.getPayCustomer();
//			String receiveCustomer = settleAccInfo.getReceiveCustomer();
//			String posId = settleAccInfo.getPosId();
//			String bankName = settleAccInfo.getBankName();
//			String account = settleAccInfo.getAccount();
//			String remark = settleAccInfo.getRemark();
//
//			switch (columnIndex) {
//			case 0:
//				return String.valueOf(settleAccWay);
//			case 1:
//				return payCustomer;
//			case 2:
//				return receiveCustomer;
//			case 3:
//				return posId;
//			case 4:
//				return bankName;
//			case 5:
//				return account;
//			case 6:
//				return remark;
//			default:
//				return "";
//			}
//		}

		return element.toString();
	}

}
