package com.topsun.posclient.repository.ui.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.datamodel.AdjustShopInfo;

public class AdjustShopSearchLableProvider implements ITableLabelProvider {

	public void addListener(ILabelProviderListener listener) {

	}

	public void dispose() {

	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {

	}

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof AdjustShopInfo) {
			AdjustShopInfo adjustShopInfo = (AdjustShopInfo) element;
			String callDate = adjustShopInfo.getCallDate().toString();
			String outShopName = adjustShopInfo.getOutShop();
			String intoShopName = adjustShopInfo.getIntoShop();
			String orderNumber = adjustShopInfo.getVoucherNo();
			String callType = adjustShopInfo.getCallType();
			int callNum = adjustShopInfo.getItemNum();
			String remark = adjustShopInfo.getRemark();
			String checkDate = adjustShopInfo.getCheckDate().toString();
			String recheckDate = adjustShopInfo.getReCheckDate().toString();
			switch (columnIndex) {
			case 0:
				return callDate;
			case 1:
				return orderNumber;
			case 2:
				return outShopName;
			case 3:
				return intoShopName;
			case 4:
				return callType;
			case 5:
				return String.valueOf(callNum);
			case 6:
				return intoShopName;
			case 7:
				return intoShopName;
			case 8:
				return checkDate;
			case 9:
				return remark;
			case 10:
				return recheckDate;
			case 11:
				return remark;


			default:
				return "";
			}
		}

		return element.toString();

	}

}
