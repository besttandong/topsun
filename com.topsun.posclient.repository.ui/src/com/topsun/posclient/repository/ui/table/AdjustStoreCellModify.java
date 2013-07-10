package com.topsun.posclient.repository.ui.table;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.common.service.impl.CommonServiceImpl;
import com.topsun.posclient.datamodel.Item;

public class AdjustStoreCellModify implements ICellModifier {

	public TableViewer tableViewer;
	public AdjustStoreCellModify(TableViewer tableViewer){
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
				return item.getItemName()!=null?"":"";
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
				ICommonService commonService  = new CommonServiceImpl();
				try {
					if(value.toString().equals("")){
						saleItem.setItemName("");
					}
					Item queryItem = commonService.getItemByCode(value.toString());
					if(queryItem != null){
						saleItem.setItemName(queryItem.getItemName());
						saleItem.setItemCode(value.toString());
						saleItem.setNum(1);
						saleItem.setRetailPrice(queryItem.getRetailPrice());
						tableViewer.refresh();
					}
				} catch (POSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if("num".equals(property)){
				if("".equals(value.toString().trim())){
					return;
				}
				saleItem.setNum(Integer.valueOf(value.toString()));
				tableViewer.refresh();
			}
		}
	}

}
