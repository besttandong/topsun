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
			Item item = (Item) element;
			String productName = item.getItemName();
			String type = item.getItemCode();
			int number = item.getNum();
			double retailPrice = item.getRetailPrice();
			double total = retailPrice * number;

			switch (columnIndex) {
			case 0:
				return productName;
			case 1:
				return type;
			case 2:
				return String.valueOf(number);
			case 3:
				if(retailPrice == 0){
					return "";
				}
				return String.valueOf(retailPrice);
			case 4:
				if(total == 0){
					return "";
				}
				return String.valueOf(total);

			default:
				return "";
			}
		}

		return element.toString();

	}

}
