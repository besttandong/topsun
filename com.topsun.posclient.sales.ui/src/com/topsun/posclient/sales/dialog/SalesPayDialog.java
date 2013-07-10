package com.topsun.posclient.sales.dialog;

import java.text.DecimalFormat;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.common.service.impl.CommonServiceImpl;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.sales.MessageResources;
import com.topsun.posclient.sales.ui.table.CashierModelItemCellModify;
import com.topsun.posclient.sales.ui.table.CashierModelTableContentProvider;
import com.topsun.posclient.sales.ui.table.CashierModelTableLableProvider;


/**
 * 
 * @author yujie creator
 *
 */
public class SalesPayDialog extends Dialog{
	
	ICommonService commonService = new CommonServiceImpl();

	public SalesPayDialog(Shell parent) {
		super(parent);
	}

	@Override
	protected Control createContents(Composite parent) {
		Font font = new Font(parent.getDisplay(),"黑体", 12, SWT.BOLD);
		Composite compsite = new Composite(parent, SWT.BORDER);
		
		compsite.setLayout(new GridLayout(3, false));
		GridData layoutData = new GridData(GridData.FILL_BOTH);
	
		compsite.setLayoutData(layoutData);
		{
			Label label = new Label(compsite, SWT.NONE);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			label.setLayoutData(data);
			label.setText("交易单号(F6):");
		}
		{
			Text text = new Text(compsite, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			
			text.setFont(font);
			data.widthHint = 150;
			text.setLayoutData(data);
			text.setEditable(false);
			text.setText("1234567");
		}
		{
			Button addBtn = new Button(compsite, SWT.NONE);
			addBtn.setText("+1");
		}
		{
			Label label = new Label(compsite, SWT.NONE);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			label.setLayoutData(data);
			label.setText("手工单号(F5):");
		}
		{
			Text text = new Text(compsite, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			data.widthHint = 150;
			text.setLayoutData(data);
			text.setText("1234567");
		}
		{
			Label label = new Label(compsite, SWT.NONE);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			label.setLayoutData(data);
			label.setText("合计金额:");
		}
		{
			Text text = new Text(compsite, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			data.widthHint = 150;
			text.setLayoutData(data);
			text.setFont(font);
			text.setEditable(false);
			text.setText("198.00");
		}
		
		{
			TableViewer tableViewer = new TableViewer(compsite);
			tableViewer.setContentProvider(new CashierModelTableContentProvider());
			tableViewer.setLabelProvider(new CashierModelTableLableProvider());
			String[] cloumsProperties = new String[]{"typeName","amount"};
			tableViewer.setColumnProperties(cloumsProperties);
			
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 3;
			data.heightHint = 100;
			Table table  = tableViewer.getTable();
			
			CellEditor[] editors = new CellEditor[2];
			editors[0] = new TextCellEditor(table);
			editors[1] = new TextCellEditor(table);
			tableViewer.setCellEditors(editors);
			tableViewer.setCellModifier(new CashierModelItemCellModify(tableViewer));
			
			table.setLayoutData(data);
			table.setLinesVisible(true);
			table.setHeaderVisible(true);
			{
				TableColumn column = new TableColumn(table, SWT.NONE);
				column.setText("收银方式(F3)");
				column.setWidth(170);
			}
			
			{
				TableColumn column = new TableColumn(table, SWT.NONE);
				column.setText("收款金额");
				column.setWidth(170);
			}
			List<CashierModel> cashierModeList = null;
			try {
				cashierModeList = commonService.getAllCashierMode();
			} catch (POSException e) {
				MessageDialog.openError(parent.getShell(), MessageResources.message_ui_tips, e.getErrorMessage());
			}
			tableViewer.setInput(cashierModeList);
		}
		{
			Label label = new Label(compsite, SWT.NONE);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			label.setLayoutData(data);
			label.setText("现金找补:");
		}
		{
			Text text = new Text(compsite, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			data.widthHint = 150;
			text.setLayoutData(data);
			text.setFont(font);
			text.setEditable(false);
			text.setText("20.00");
		}
		return super.createContents(parent);
	}
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		String style = ",000.0#";
		df.applyPattern(style);
		System.out.println(df.format(19));
	}

}
