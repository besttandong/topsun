package com.topsun.posclient.system.ui.view;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.service.SyncDataManager;
import com.topsun.widget.calendar.DefaultSettings;

public class SyncDataView extends ViewPart {
	

	public ProgressBar bar;
	
	public Text infoText;


	public SyncDataView() {
		// TODO Auto-generated constructor stub
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		buildBaseInfo(parent);
		buildOperation(parent);
	}

	private void buildBaseInfo(Composite parent) {
		Group baseInfo = new Group(parent, SWT.NONE);

		baseInfo.setText("数据同步：");
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite composite = new Composite(baseInfo, SWT.NONE);
		composite.setLayout(new GridLayout(4, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		{
			Label lable = new Label(composite, SWT.NONE);
			lable.setText("进度：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		
		{
			bar = new ProgressBar(composite, SWT.HORIZONTAL);
			bar.setMaximum(100);//设置最大值
			bar.setMinimum(0);//设置最小值
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint = 30;
			data.widthHint = 750;
			bar.setLayoutData(data);
		}
		{
			Label lable = new Label(composite, SWT.NONE);
			lable.setText("信息：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		
		{
			infoText = new Text(composite, SWT.MULTI | SWT.BORDER);
			infoText.setEditable(false);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint = 450;
			data.widthHint = 740;
			infoText.setLayoutData(data);
		}
	}

	private void buildOperation(Composite parent) {
		Composite operation = new Composite(parent, SWT.NONE);
		operation.setLayout(new GridLayout(2, true));
		operation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("开始");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);

			button.addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					Button saveButton = (Button)e.getSource();
					try {
						SyncProgress progress = new SyncProgress(bar, infoText);
						SyncDataManager.getInstance().doSyncData(progress);
						
					} catch (POSException e1) {
						MessageDialog.openError(saveButton.getShell(), "提示", e1.getErrorMessage());
						return;
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}
		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("清除日志");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
			button.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					infoText.setText("");
				}
				public void widgetDefaultSelected(SelectionEvent e) {
					
				}
			});

		}
	}

	public void setFocus() {

	}

	class Settings extends DefaultSettings {

		public boolean keyboardNavigatesCalendar() {
			return false;
		}

	}
}
