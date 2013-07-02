package com.topsun.posclient.sales.ui.menu;

import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.sales.ui.table.SalesTableContentProvider;
import com.topsun.posclient.sales.ui.table.SalesTableLableProvider;

public class SalesItemBuilder {
	
	public TableViewer  tableViewer;
	
	
	public TableViewer getTableViewer() {
		return tableViewer;
	}


	public void setTableViewer(TableViewer tableViewer) {
		this.tableViewer = tableViewer;
	}


	/**
	 * 商品信息
	 * @param parent
	 */
	public  void buildProductInfo(Composite parent){
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("商品信息");
		GridLayout gridLayout = new GridLayout(1,false);
		gridLayout.marginLeft = 20;
		//gridLayout.horizontalSpacing = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
//		data.heightHint = 300;
		productInfo.setLayoutData(data);
		
		
		tableViewer = new TableViewer(productInfo,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER|SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new SalesTableContentProvider());
		tableViewer.setLabelProvider(new SalesTableLableProvider());
		
		String[] cloumsProperties = new String[]{"itemName","itemCode","num"};
		tableViewer.setColumnProperties(cloumsProperties);
		Table table = tableViewer.getTable();
		CellEditor[] editors = new CellEditor[3];
		
		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new TextCellEditor(table);
		tableViewer.setCellEditors(editors);
		tableViewer.setCellModifier(new SalesItemCellModify(tableViewer));
		
//		tableViewer.setCellEditors(editors);
		
		table.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(SWT.DEL == e.character){
					ISelection iSelection = tableViewer.getSelection();
					if(!iSelection.isEmpty()){
						Object obj = ((StructuredSelection)iSelection).getFirstElement();
						if(obj instanceof Item){
							Item item = (Item)obj;
							List<Item> items = (List<Item>)tableViewer.getInput();
							items.remove(item);
							tableViewer.setInput(items);
						}
					}
				}
				
			}
		});
		table.addListener(SWT.MouseDoubleClick, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				if(tableViewer.getInput() != null){
					List<Item> items = (List<Item>)tableViewer.getInput() ;
					items.add(new Item());
					tableViewer.setInput(items);
				};
				
			}
		});
		
		{
			GridData tableData = new GridData(GridData.FILL_HORIZONTAL);
			tableData.heightHint = 200;
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}
		
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("款号搜索");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("款号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("数量");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("零售价");
		}
//		{
//			TableColumn column = new TableColumn(table, SWT.NONE);
//			column.setWidth(80);
//			column.setText("售价");
//		}
//		{
//			TableColumn column = new TableColumn(table, SWT.NONE);
//			column.setWidth(80);
//			column.setText("单价");
//		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("金额");
		}
	}
}
