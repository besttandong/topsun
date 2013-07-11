package com.topsun.posclient.sales.ui.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.datamodel.CashierModel;

public class CashierModelTableLableProvider implements ITableLabelProvider {

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
		if (element instanceof CashierModel) {
			CashierModel cashierModel = (CashierModel) element;
			String typeName = cashierModel.getTypeName();
			String amount = String.valueOf(cashierModel.getAmount());
			switch (columnIndex) {
			case 0:
				return typeName;
			case 1:
				return amount;
			default:
				return "";
			}
		}
		return element.toString();
	}

}
