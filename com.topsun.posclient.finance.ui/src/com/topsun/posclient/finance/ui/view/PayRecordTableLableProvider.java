package com.topsun.posclient.finance.ui.view;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.datamodel.PayRecord;

public class PayRecordTableLableProvider implements ITableLabelProvider {

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
		if (element instanceof PayRecord) {
			PayRecord record = (PayRecord) element;
			String payDate = record.getPayDate();
			String bankName = record.getBankName();
			String account = record.getAccount();
			double amount = record.getAmount();
			String payer = record.getPayer();
			String approver = record.getApprove();
			String approveDate = record.getApproveDate();
			String remark = record.getRemark();

			switch (columnIndex) {
			case 0:
				return payDate;
			case 1:
				return bankName;
			case 2:
				return account;
			case 3:
				return String.valueOf(amount);
			case 4:
				return payer;
			case 5:
				return approver;
			case 6:
				return approveDate;
			case 7:
				return remark;
			default:
				return "";
			}
		}

		return element.toString();
	}

}
