package com.topsun.posclient.sales.ui.table;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.datamodel.CashierModel;

public class CashierModelItemCellModify implements ICellModifier {

	public TableViewer tableViewer;
	public Text cashBack;
	public String price;
	
	public Text getCashBack() {
		return cashBack;
	}

	public void setCashBack(Text cashBack) {
		this.cashBack = cashBack;
	}

	public CashierModelItemCellModify(TableViewer tableViewer,Text cashBack,String price){
		this.tableViewer = tableViewer;
		this.cashBack = cashBack;
		this.price = price;
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
				return String.valueOf(cashierModel.getAmount());
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
				if(value.toString().equals("0.0")){
					cashierModel.setAmount(0);
				}else{
					double amount = Double.valueOf(value.toString());
					if("现金".equals(item.getText())){
						String cashBackStr = String.valueOf(amount - Double.valueOf(price));
						cashBack.setText(cashBackStr);
						cashierModel.setAmount(amount);
					}else{
						cashierModel.setAmount(amount);
					}
				}
				tableViewer.refresh();
			}
		}
	}

}
