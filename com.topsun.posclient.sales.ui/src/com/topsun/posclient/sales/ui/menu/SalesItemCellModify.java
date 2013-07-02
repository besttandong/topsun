package com.topsun.posclient.sales.ui.menu;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;

import com.topsun.posclient.datamodel.Item;

public class SalesItemCellModify implements ICellModifier {

	public TableViewer tableViewer;
	public SalesItemCellModify(TableViewer tableViewer){
		this.tableViewer = tableViewer;
	}
	@Override
	public boolean canModify(Object element, String property) {
		if("itemName".equals(property) || "num".equals(property)){
			return true;
		}
		return false;
	}

	@Override
	public Object getValue(Object element, String property) {
		if(element instanceof Item){
			Item item = (Item)element;
			if("itemName".equals(property)){
				return item.getItemName();
			}
			
			if("num".equals(property)){
				return String.valueOf(item.getNum());
			}
		}
		
		return null;
	}

	@Override
	public void modify(Object element, String property, Object value) {
		if(element instanceof TableItem){
			TableItem item = (TableItem)element;
			Item saleItem = (Item)item.getData();
			if("itemName".equals(property)){
				saleItem.setItemName(value.toString());
				tableViewer.refresh();
			}
			if("num".equals(property)){
				saleItem.setNum(Integer.valueOf(value.toString()));
				tableViewer.refresh();
			}
		}
	}

}
