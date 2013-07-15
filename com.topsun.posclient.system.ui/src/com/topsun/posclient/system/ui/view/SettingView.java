package com.topsun.posclient.system.ui.view;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.SettingData;
import com.topsun.posclient.system.service.ISettingService;
import com.topsun.posclient.system.service.impl.SettingServiceImpl;
import com.topsun.posclient.system.ui.MessageResources;
import com.topsun.widget.calendar.DefaultSettings;

/**
 * Setting View
 * 
 * @author LiLei
 *
 */
public class SettingView extends ViewPart {
	
	private ISettingService settingService = new SettingServiceImpl();
	
	public Text serverIP;
	public Text serverPort;
	public Text reconnectionTime;
	
	public TableViewer tableViewer;

	public SettingView() {}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		buildBaseInfo(parent);
		buildOperation(parent);
	}

	private void buildBaseInfo(Composite parent) {
		SettingData defaultSettingData = null;
		try {
			defaultSettingData = settingService.getSetting();
		} catch (POSException e) {
			MessageDialog.openError(parent.getShell(), MessageResources.message_tips, e.getErrorMessage());
		}
		
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
			lable.setText(MessageResources.message_serverip);
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
			serverIP.setText(defaultSettingData.getIp());
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText(MessageResources.message_port);
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
			serverPort.setText(defaultSettingData.getPort());
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText(MessageResources.message_reconnection);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			reconnectionTime = new Text(leftComposite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 210;
			reconnectionTime.setLayoutData(data);
			reconnectionTime.setText(defaultSettingData.getReconnectionTime());
		}
	}

	private void buildOperation(Composite parent) {
		Composite operation = new Composite(parent, SWT.NONE);
		operation.setLayout(new GridLayout(2, true));
		operation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText(MessageResources.message_save);
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);

			button.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					Button saveButton = (Button)e.getSource();
					String ipAdd = serverIP.getText();
					if(null == ipAdd || ("").equals(ipAdd)){
						MessageDialog.openError(saveButton.getShell(), MessageResources.message_tips, MessageResources.message_tips_inputserverip);
						serverIP.forceFocus();
						return;
					}
					String port = serverPort.getText();
					if(null == port || ("").equals(port)){
						MessageDialog.openError(saveButton.getShell(), MessageResources.message_tips, MessageResources.message_tips_inputport);
						serverPort.forceFocus();
						return;
					}
					String time = reconnectionTime.getText();
					if(null == time || ("").equals(time)){
						MessageDialog.openError(saveButton.getShell(), MessageResources.message_tips, MessageResources.message_tips_inputreconnectiontime);
						reconnectionTime.forceFocus();
						return;
					}
					SettingData settingData = new SettingData();
					settingData.setIp(ipAdd);
					settingData.setPort(port);
					settingData.setReconnectionTime(time);
					try {
						settingService.saveSetting(settingData);
						MessageDialog.openInformation(saveButton.getShell(), MessageResources.message_tips, MessageResources.message_tips_success);
					} catch (POSException e1) {
						MessageDialog.openError(saveButton.getShell(), MessageResources.message_tips, e1.getErrorMessage());
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
