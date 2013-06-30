package com.topsun.posclient.sales.dialog;

import java.text.DecimalFormat;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.TableViewer;
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


/**
 * 
 * @author yujie
 *
 */
public class SalesPayDialog extends Dialog{

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
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 3;
			data.heightHint = 100;
			Table table  = tableViewer.getTable();
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
