package com.topsun.posclient.system.ui;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.system.service.ISyncDataService;
import com.topsun.posclient.system.service.impl.SyncDataServiceImpl;
import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

public class SyncDataView extends ViewPart {
	
	private ISyncDataService syncDataService = new SyncDataServiceImpl();

	public Combo dataType;
	public Text orderNo;
	public Combo casher;
	public Text casherNo;
	public Combo sales;
	public Text cardNo;
	public Text userName;
	public Text enableAccount;
	public Text enablePoint;

	public CalendarCombo salesDate;
	public CalendarCombo checkDate;

	public Text applyUser;
	public Text checker;
	public Text remark;

	public TableViewer tableViewer;

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

		Composite leftComposite = new Composite(baseInfo, SWT.NONE);
		leftComposite.setLayout(new GridLayout(4, false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite rightCompoiste = new Composite(baseInfo, SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4, false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite underCompsite = new Composite(baseInfo, SWT.NONE);
		underCompsite.setLayout(new GridLayout(4, false));
		GridData data2 = new GridData(GridData.FILL_BOTH);
		data2.horizontalSpan = 2;
		underCompsite.setLayoutData(data2);

		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("数据类型：");
		}
		{
			dataType = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			dataType.select(0);
			dataType.setLayoutData(data);
			dataType.setItems(new String[] { "所有", "库存", "促销方案", "用户数据" });
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("日期：");
		}
		{
			salesDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY,
					new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			salesDate.setLayoutData(data);
		}
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("信息：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}

		{
			remark = new Text(underCompsite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint = 400;
			data.widthHint = 740;
			remark.setLayoutData(data);
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
					try {
						StringBuffer buffer = new StringBuffer();
						buffer.append("正在同步数据.....\n");
						remark.setText(buffer.toString());
						String type = dataType.getText();
						if(type.equals("用户数据")){
							buffer.append("同步用户数据.....\n");
							remark.setText(buffer.toString());
							syncDataService.syncUserData();
						}else if(type.equals("库存")){
							buffer.append("同步库存.....\n");
							remark.setText(buffer.toString());
							syncDataService.syncRepositoryData();
						}else if(type.equals("促销方案")){
							buffer.append("同步促销方案.....\n");
							remark.setText(buffer.toString());
						}else{
							syncDataService.syncAll();
						}
						remark.setText("同步完成");
					} catch (Exception e1) {
						e1.printStackTrace();
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