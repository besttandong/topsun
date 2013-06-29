package com.topsun.posclient.sales.ui.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.datamodel.Item;

public class SalesTableLableProvider implements ITableLabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof Item) {
			Item goodsSales = (Item) element;
			String productName = goodsSales.getItemName();
			String type = goodsSales.getItemCode();
//			double number = goodsSales.getn
//			String listPrice = goodsSales.getListPrice();
//			double retailPrice = goodsSales.getRetailPrice();
//			double disB = goodsSales.getDiscountB();
//			double disA = goodsSales.getDiscountA();
//			double unitPrice = goodsSales.getUnitPrice();
//			double amount = goodsSales.getAmount();
//			double singlePoints = goodsSales.getSinglePoints();

			switch (columnIndex) {
			case 0:
				return productName;
			case 1:
				return type;
			case 2:
				return String.valueOf("");
			case 3:
				return "";
			case 4:
				return String.valueOf("");
			case 5:
				return String.valueOf("");
			case 6:
				return String.valueOf("");
			case 7:
				return String.valueOf("");
			case 8:
				return String.valueOf("");
			case 9:
				return String.valueOf("");

			default:
				return "";
			}
		}

		return element.toString();

	}

}
