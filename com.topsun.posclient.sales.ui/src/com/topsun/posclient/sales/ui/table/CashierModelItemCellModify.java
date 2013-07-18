package com.topsun.posclient.sales.ui.table;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;

import com.topsun.posclient.datamodel.CashierModel;

public class CashierModelItemCellModify implements ICellModifier {

	public TableViewer tableViewer;
	
	public CashierModelItemCellModify(TableViewer tableViewer){
		this.tableViewer = tableViewer;
	}
	
	public boolean canModify(Object element, String property) {
		if("amount".equals(property)){
			return true;
		}
		return false;
	}

	public Object getValue(Object element, String property) {
		if(element instanceof CashierModel){
			CashierModel cashierModel = (CashierModel)element;
			if("amount".equals(property)){
				return String.valueOf(cashierModel.getId());
			}
		}
		
		return null;
	}

	public void modify(Object element, String property, Object value) {
		if(element instanceof TableItem){
			TableItem item = (TableItem)element;
			CashierModel cashierModel = (CashierModel)item.getData();
			if("amount".equals(property)){
				if("".equals(value.toString().trim())){
					return;
				}
				cashierModel.setAmount(Integer.valueOf(value.toString()));
				tableViewer.refresh();
			}
		}
	}

}
