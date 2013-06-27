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
 * 店铺缴款视图
 * 
 * @author Dong
 *
 */
public class StorePayView extends ViewPart {

	/**
	 * 店铺缴款记录列表
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
			column.setText("缴款时间");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("存款银行");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("银行帐号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("存款金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("存款人");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(120);
			column.setText("审核人");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(120);
			column.setText("审核时间");
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
		
		tableViewer.setColumnProperties(new String[] { "payDate", "bankName", "account", "amount", "payer", "approve", "approveDate", "remark" });
	    CellEditor[] cellEditor = new CellEditor[8];
	    cellEditor[0] = new ComboBoxCellEditor(this.tableViewer.getTable(), SettleAccWayCellModifier.SETTLEACC_WAY, 8);
	    cellEditor[1] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[2] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[3] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[4] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[5] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[6] = new TextCellEditor(this.tableViewer.getTable());
	    cellEditor[7] = new TextCellEditor(this.tableViewer.getTable());
	    tableViewer.setCellEditors(cellEditor);
	    
		ICellModifier modifier = new SettleAccWayCellModifier(tableViewer, parent);
		tableViewer.setCellModifier(modifier);
	}
}
