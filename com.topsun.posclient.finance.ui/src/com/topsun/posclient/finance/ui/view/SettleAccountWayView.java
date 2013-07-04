package com.topsun.posclient.finance.ui.view;

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
 * ���㷽ʽ��ͼ 
 * 
 * @author Dong
 *
 */
public class SettleAccountWayView extends ViewPart {
	
	/**
	 * ���㷽ʽ�б�
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
		tableViewer.setContentProvider(new PayRecordTableContentProvider());
		tableViewer.setLabelProvider(new PayRecordTableLableProvider());
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
			column.setText("���㷽ʽ");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("Ӧ�õ�����");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("Ӧ�õ��տ�");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("Ӧ�õ�POS����");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(100);
			column.setText("����");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(120);
			column.setText("�����ʺ�");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(120);
			column.setText("��ע");
		}
		
		table.addListener(SWT.MouseDoubleClick, new Listener() {
			public void handleEvent(Event event) {
				//���˫���¼�
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