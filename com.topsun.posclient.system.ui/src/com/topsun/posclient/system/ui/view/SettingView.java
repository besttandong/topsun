package com.topsun.posclient.system.ui.view;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.SettingData;
import com.topsun.posclient.system.service.ISettingService;
import com.topsun.posclient.system.service.impl.SettingServiceImpl;
import com.topsun.widget.calendar.DefaultSettings;

/**
 * Setting View
 * 
 * @author Dong
 *
 */
public class SettingView extends ViewPart {
	
	private ISettingService settingService = new SettingServiceImpl();
	
	public Text status;
	public Text serverIP;
	public Text serverPort;
	public Combo reconnection;
	
	public TableViewer tableViewer;

	public SettingView() {
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		buildBaseInfo(parent);
		buildOperation(parent);
	}

	private void buildBaseInfo(Composite parent) {
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginLeft = 30;
		parent.setLayout(gridLayout);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite leftComposite = new Composite(parent, SWT.NONE);
		leftComposite.setLayout(new GridLayout(4, false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite rightCompoiste = new Composite(parent, SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4, false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite underCompsite = new Composite(parent, SWT.NONE);
		underCompsite.setLayout(new GridLayout(4, false));
		GridData data2 = new GridData(GridData.FILL_BOTH);
		data2.horizontalSpan = 2;
		underCompsite.setLayoutData(data2);
		
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("当前连接状态：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			status = new Text(leftComposite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 210;
			status.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("主机IP：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			serverIP = new Text(leftComposite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 210;
			serverIP.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("端口：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			serverPort = new Text(leftComposite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 210;
			serverPort.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("自动重连策略：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			reconnection = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 195;
			data.horizontalSpan = 3;
			reconnection.select(0);
			reconnection.setLayoutData(data);
			reconnection.setItems(new String[] { "5分钟", "10分钟", "半个小时", "1个小时" });
		}
		
	}

	private void buildOperation(Composite parent) {
		Composite operation = new Composite(parent, SWT.NONE);
		operation.setLayout(new GridLayout(2, true));
		operation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("保存");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);

			button.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					Button saveButton = (Button)e.getSource();
					String ipAdd = serverIP.getText();
					if(null == ipAdd || ("").equals(ipAdd)){
						MessageDialog.openError(saveButton.getShell(), "提示", "请输入[服务器IP地址]");
						return;
					}
					String port = serverPort.getText();
					if(null == port || ("").equals(port)){
						MessageDialog.openError(saveButton.getShell(), "提示", "请输入[服务器端口]");
						return;
					}
					SettingData settingData = new SettingData();
					settingData.setIp(ipAdd);
					settingData.setPort(port);
					try {
						settingService.saveSetting(settingData);
					} catch (POSException e1) {
						MessageDialog.openError(saveButton.getShell(), "提示", e1.getErrorMessage());
						return;
					}
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
