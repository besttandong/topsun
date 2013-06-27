package com.topsun.posclient.finance.ui;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

/**
 * 结算方式视图
 * 
 * @author Dong
 *
 */
public class SettleAccountWayView extends ViewPart {
	
	/**
	 * 结算方式列表
	 */
	public TableViewer tableViewer;

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1,false));
		buildTableViewer(parent);
	}

	public void setFocus() {}
	
	public void buildTableViewer(Composite parent){
		
		GridLayout gridLayout = new GridLayout(1,false);
		parent.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		parent.setLayoutData(data);
		
		tableViewer = new TableViewer(parent);
		tableViewer.setContentProvider(new SettleAccWayTableContentProvider());
		tableViewer.setLabelProvider(new SettleAccWayTableLableProvider());
		Table table = tableViewer.getTable();
		{
			GridData tableData = new GridData(GridData.FILL_BOTH);
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("结算方式");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("应用到付款");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("应用到收款");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("应用到POS费用");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("银行");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(120);
			column.setText("银行帐号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(120);
			column.setText("备注");
		}
		
		table.addListener(SWT.MouseDoubleClick, new Listener() {
			public void handleEvent(Event event) {
				//鼠标双击事件
			} 
		});
		
		tableViewer.setColumnProperties(new String[] { "settleAccWay", "payCustomer", "receiveCustomer", "posId", "bankName", "account", "remark" });
	    CellEditor[] cellEditor = new CellEditor[6];
	    cellEditor[0] = new ComboBoxCellEditor(this.tableViewer.getTable(), SettleAccWayCellModifier.SETTLEACC_WAY, 8);
	    cellEditor[1] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[2] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[3] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[4] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[5] = new TextCellEditor(this.tableViewer.getTable());
	    tableViewer.setCellEditors(cellEditor);
	    
		ICellModifier modifier = new SettleAccWayCellModifier(tableViewer, parent);
		tableViewer.setCellModifier(modifier);
	}
}