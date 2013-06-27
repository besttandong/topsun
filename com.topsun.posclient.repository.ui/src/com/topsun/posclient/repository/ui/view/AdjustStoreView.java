package com.topsun.posclient.repository.ui.view;

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.application.model.AdjustRepositoryInfo;
import com.topsun.posclient.application.model.Goods;
import com.topsun.posclient.repository.service.IAdjustRepositoryService;
import com.topsun.posclient.repository.service.impl.AdjustRepositoryServiceImpl;
import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

/**
 * ������ͼ
 * 
 * @author Dong
 *
 */
public class AdjustStoreView extends ViewPart {

	public IAdjustRepositoryService goodsRepositoryervice = new AdjustRepositoryServiceImpl();

	List<Goods> goodsList = null;

	public AdjustRepositoryInfo adjustRepositoryInfo;

	public Combo storeName;//���ֵ���
	public Text orderNo; //���ݱ��
	public Combo deliver;//������
	public Combo receiveRepository;//�ջ��ֿ�
	public Text backReason;//�ز�ԭ��
	
	public CalendarCombo backDate;//�ز�����
	public CalendarCombo checkDate;//�������
	public CalendarCombo reCheckDate;//��������

	public Text applyUser;//�Ƶ���
	public Text checker;//�����
	public Text remark;//��ע

	public TableViewer tableViewer;

	public AdjustStoreView() {
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		buildBaseInfo(parent);
		buildPrintInfo(parent);
		buildProductInfo(parent);
		buildCaculator(parent);
		buildRecodeInfo(parent);
		buildOperation(parent);
	}

	private void buildOperation(Composite parent) {
		Composite operation = new Composite(parent, SWT.NONE);
		operation.setLayout(new GridLayout(2, true));
		operation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("����");
			// button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID,
			// "ok.gif"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);

			button.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					adjustRepositoryInfo = new AdjustRepositoryInfo();
					adjustRepositoryInfo.setStoreName(storeName.getText());
					adjustRepositoryInfo.setOrderNo(orderNo.getText());
					adjustRepositoryInfo.setDeliver(deliver.getText());
					adjustRepositoryInfo.setBackDate(backDate.getDateAsString());
					adjustRepositoryInfo.setReceiveRepository(receiveRepository.getText());
					adjustRepositoryInfo.setCheckDate(checkDate.getDateAsString());
					adjustRepositoryInfo.setBackReason(backReason.getText());
					adjustRepositoryInfo.setReCheckDate(reCheckDate.getDateAsString());
					adjustRepositoryInfo.setRemark(remark.getText());
					if (tableViewer.getInput() instanceof List) {
						List list = (List) tableViewer.getInput();
						adjustRepositoryInfo.setGoodsList(list);
					};

					List<AdjustRepositoryInfo> goodsRepositoryList = new ArrayList<AdjustRepositoryInfo>();
					goodsRepositoryList.add(adjustRepositoryInfo);

//					try {
//						goodsRepositoryervice.saveSaleData(goodsRepositoryList);
//					} catch (Exception e1) {
//						e1.printStackTrace();
//					}
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub

				}
			});
		}

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("ȡ��");
			// button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID,
			// "nook.png"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
		}
	}

	private void buildRecodeInfo(Composite parent) {
		Composite recodeComposite = new Composite(parent, SWT.NONE);
		recodeComposite.setLayout(new GridLayout(4, false));
		{
			Label label = new Label(recodeComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("�����ˣ�");
		}
		{
			applyUser = new Text(recodeComposite, SWT.BORDER);
			applyUser.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			applyUser.setLayoutData(data);
			applyUser.setText("����");
		}
		{
			Label label = new Label(recodeComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("����ˣ�");
		}
		{
			checker = new Text(recodeComposite, SWT.BORDER);
			checker.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			checker.setLayoutData(data);
			checker.setText("����");
		}

	}

	private void buildCaculator(Composite parent) {
		Composite caculatorComposite = new Composite(parent, SWT.NONE);
		caculatorComposite.setLayout(new GridLayout(6, false));
		{
			Label label = new Label(caculatorComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("�����ϼƣ�");
		}
		{
			Text text = new Text(caculatorComposite, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			text.setLayoutData(data);
		}
		{
			Label label = new Label(caculatorComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("���ϼƣ�");
		}
		{
			Text text = new Text(caculatorComposite, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			text.setLayoutData(data);
		}

		{
			Label label = new Label(caculatorComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("�������");
		}
		{
			Text text = new Text(caculatorComposite, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			text.setLayoutData(data);
		}

	}

	private void buildPrintInfo(Composite parent) {
		Composite printCompoiste = new Composite(parent, SWT.NONE);
		printCompoiste.setLayout(new GridLayout(8, false));
		{
			Label label = new Label(printCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("���������룺");
		}
		{
			Text text = new Text(printCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 160;
			data.horizontalSpan = 1;
			text.setLayoutData(data);
		}
		{
			Label label = new Label(printCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("������");
		}
		{
			Text text = new Text(printCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			text.setLayoutData(data);
		}

		{
			Button button = new Button(printCompoiste, SWT.NONE);
			button.setText("ɨ�����ģʽ");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			data.horizontalSpan = 1;
			button.setLayoutData(data);
			button.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {

					if (tableViewer.getInput() != null) {
						goodsList.add(((List<Goods>) tableViewer.getInput()).get(0));
					}
					tableViewer.setInput(goodsList);
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub

				}
			});
		}

		{
			Button button = new Button(printCompoiste, SWT.NONE);
			button.setText("����ɨ��");
			//button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "sales.png"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 100;
			data.horizontalSpan = 1;
			button.setLayoutData(data);
		}

		{
			Label label = new Label(printCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("Ԥ�賤�ȣ�");
		}
		{
			Spinner spinner = new Spinner(printCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 90;
			data.horizontalSpan = 1;
			spinner.setLayoutData(data);
		}
	}

	private void buildProductInfo(Composite parent) {
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("��Ʒ��Ϣ");
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginLeft = 20;
		// gridLayout.horizontalSpacing = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		// data.heightHint = 300;
		productInfo.setLayoutData(data);

		tableViewer = new TableViewer(productInfo);
		tableViewer.setContentProvider(new AdjustRepositoryTableContentProvider());
		tableViewer.setLabelProvider(new AdjustRepositoryTableLableProvider());
		Table table = tableViewer.getTable();
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
			column.setText("��Ʒ����");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("���");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("����");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("�۸��嵥");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("���ۼ�");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("�ۿ���");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("�ۿ۽��");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("����");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("���");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("��Ʒ����");
		}

	}

	private void buildBaseInfo(Composite parent) {
		Group baseInfo = new Group(parent, SWT.NONE);

		baseInfo.setText("������Ϣ��");
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginLeft = 30;
		// gridLayout.horizontalSpacing = 50;
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
			label.setText("�زֵ��̣�");
		}
		{
			storeName = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			storeName.select(0);
			storeName.setLayoutData(data);
			storeName.setItems(new String[] { "�Ϻ�", "����" });
		}

		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("���ݱ�ţ�");
		}
		{
			orderNo = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 200;
			data.horizontalSpan = 3;
			orderNo.setLayoutData(data);
			orderNo.setEditable(false);
			orderNo.setText("01234567");
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("�����ˣ�");
		}
		{
			deliver = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 185;
			deliver.setLayoutData(data);
			deliver.setItems(new String[] { "����" });
			deliver.select(0);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("�������ڣ�");
		}
		{
			backDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY, new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			backDate.setLayoutData(data);
		}

		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("�ջ��ֿ⣺");
		}
		{
			receiveRepository = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			receiveRepository.setLayoutData(data);
			receiveRepository.setItems(new String[] { "����" });
			receiveRepository.select(0);
		}

		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("������ڣ�");
		}
		{
			checkDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY,
					new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			checkDate.setLayoutData(data);
		}

		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("�ز�ԭ��");
		}
		{
			backReason = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			backReason.setLayoutData(data);
			backReason.setText("");
		}

		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			lable.setText("�������ڣ�");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			reCheckDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY,
					new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			reCheckDate.setLayoutData(data);
		}
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("ע�ͣ�");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			remark = new Text(underCompsite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint = 60;
			data.widthHint = 740;
			remark.setLayoutData(data);
		}

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}

class Settings extends DefaultSettings {

	public boolean keyboardNavigatesCalendar() {
		return false;
	}

}
