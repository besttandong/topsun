package com.topsun.posclient.sales.ui.table;

import java.util.List;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.application.model.Goods;

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
		if (element instanceof Goods) {
			Goods goodsSales = (Goods) element;
			String productName = goodsSales.getGoodsName();
			String type = goodsSales.getGoodsType();
			double number = goodsSales.getNumber();
			String listPrice = goodsSales.getListPrice();
			double retailPrice = goodsSales.getRetailPrice();
			double disB = goodsSales.getDiscountB();
			double disA = goodsSales.getDiscountA();
			double unitPrice = goodsSales.getUnitPrice();
			double amount = goodsSales.getAmount();
			double singlePoints = goodsSales.getSinglePoints();

			switch (columnIndex) {
			case 0:
				return productName;
			case 1:
				return type;
			case 2:
				return String.valueOf(number);
			case 3:
				return listPrice;
			case 4:
				return String.valueOf(retailPrice);
			case 5:
				return String.valueOf(disB);
			case 6:
				return String.valueOf(disA);
			case 7:
				return String.valueOf(unitPrice);
			case 8:
				return String.valueOf(amount);
			case 9:
				return String.valueOf(singlePoints);

			default:
				return "";
			}
		}

		return element.toString();

	}

}
