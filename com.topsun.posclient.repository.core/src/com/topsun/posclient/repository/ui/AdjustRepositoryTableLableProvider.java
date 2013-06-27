package com.topsun.posclient.repository.ui;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.topsun.posclient.application.model.Goods;

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
		if (element instanceof Goods) {
			Goods goodsRepository = (Goods) element;
			String productName = goodsRepository.getGoodsName();
			String type = goodsRepository.getGoodsType();
			double number = goodsRepository.getNumber();
			String listPrice = goodsRepository.getListPrice();
			double retailPrice = goodsRepository.getRetailPrice();
			double disB = goodsRepository.getDiscountB();
			double disA = goodsRepository.getDiscountA();
			double unitPrice = goodsRepository.getUnitPrice();
			double amount = goodsRepository.getAmount();
			double singlePoints = goodsRepository.getSinglePoints();

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
