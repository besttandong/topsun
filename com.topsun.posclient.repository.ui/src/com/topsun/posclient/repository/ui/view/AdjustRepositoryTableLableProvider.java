package com.topsun.posclient.repository.ui.view;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.datamodel.AdjustRepositoryInfo;

public class AdjustRepositoryTableLableProvider implements ITableLabelProvider {

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
		if (element instanceof AdjustRepositoryInfo) {
			AdjustRepositoryInfo ari = (AdjustRepositoryInfo) element;
			String backDate = ProjectUtil.getDateString(ari.getBackDate());
			String orderNo = ari.getOrderNo();
			String shopName = ari.getShopName();
			String receiveRepository = ari.getReceiveRepository();
			int num = ari.getNum();
			String backReason = ari.getBackReason();
			String applyUser = ari.getApplyUser();
			String checker = ari.getChecker();
			String reChecker = ari.getReChecker();
			String remark = ari.getRemark();
			String checkDate = ProjectUtil.getDateString(ari.getCheckDate());
			String recheckDate = ProjectUtil.getDateString(ari.getReCheckDate());
			switch (columnIndex) {
			case 0:
				return backDate;
			case 1:
				return orderNo;
			case 2:
				return shopName;
			case 3:
				return receiveRepository;
			case 4:
				return String.valueOf(num);
			case 5:
				return backReason;
			case 6:
				return applyUser;
			case 7:
				return checker;
			case 8:
				return checkDate;
			case 9:
				return reChecker;
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