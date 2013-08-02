package com.topsun.posclient.repository.ui.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.MockDataFactory;
import com.topsun.posclient.common.POSClientApp;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.common.service.impl.CommonServiceImpl;
import com.topsun.posclient.datamodel.AdjustShopInfo;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.StockCheck;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.StockCheckDTO;
import com.topsun.posclient.repository.service.ICheckRepositoryService;
import com.topsun.posclient.repository.service.impl.CheckRepositoryServiceImpl;
import com.topsun.posclient.repository.ui.table.AdjustShopSearchContentProvider;
import com.topsun.posclient.repository.ui.table.AdjustShopSearchLableProvider;
import com.topsun.posclient.repository.ui.table.AdjustStoreCellModify;
import com.topsun.posclient.repository.ui.table.AdjustStoreContentProvider;
import com.topsun.posclient.repository.ui.table.AdjustStoreLableProvider;
import com.topsun.widget.calendar.CalendarCombo;

/**
 * 库存盘点视图
 * 
 * @author Dong
 *
 */
public class CheckRepositoryView extends ViewPart {
	public User loginUser = POSClientApp.get().getLoginUser();
	public ICheckRepositoryService checkRepositoryService = new CheckRepositoryServiceImpl();
	public ICommonService commonService = new CommonServiceImpl();
	List<Item> items = null;

	public StockCheck stockCheck;
	
	public CalendarCombo startDate;
	public CalendarCombo endDate;

	public Combo checkStoreName;//盘点店铺
	public Text docNum; //单据编号
	public Combo checkRange;//盘点范围ID
	public CalendarCombo checkDate;//审核日期
	
	public CalendarCombo stockDate;//盘点日期

	public Text applyUser;//制单人
	public Text auditId;//最后审核人ID	
	public Text remark;//备注

	public TableViewer recordViewer;//录入tableview
	
	public TableViewer searchViewer;//
	private Text numberTotal;
	private Text priceTotal;

	public CheckRepositoryView() {
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		buildBaseInfo(parent);
//		buildSerachInfo(parent);
		buildProductInfo(parent);
	
		buildProductRecordInfo(parent);
	
		buildRecodeInfo(parent);
		buildOperation(parent);
	}
	
	private void buildSerachInfo(Composite parent){
		Composite serachComposite = new Composite(parent, SWT.NONE);
		serachComposite.setLayout(new GridLayout(9, false));
		{
			Label label = new Label(serachComposite, SWT.NONE);
			GridData data = new GridData();
			label.setLayoutData(data);
			label.setText("开始日期：");
		}
		{
			startDate = new CalendarCombo(serachComposite, SWT.READ_ONLY, new Settings(), null);
			GridData data = new GridData();
			startDate.setLayoutData(data);
		}
		{
			Label label = new Label(serachComposite, SWT.NONE);
			GridData data = new GridData();
			label.setLayoutData(data);
			label.setText("结束日期：");
		}
		{
			endDate = new CalendarCombo(serachComposite, SWT.READ_ONLY, new Settings(), null);
			GridData data = new GridData();
			endDate.setLayoutData(data);
		}
		{
			Label label = new Label(serachComposite, SWT.NONE);
			GridData data = new GridData();
			label.setLayoutData(data);
			label.setText("单据状态：");
		}
		{
			Combo orderStatus = new Combo(serachComposite, SWT.NONE);
			GridData data = new GridData();
			orderStatus.setLayoutData(data);
			orderStatus.select(0);
		}
		
		{
			Label label = new Label(serachComposite, SWT.NONE);
			GridData data = new GridData();
			label.setLayoutData(data);
			label.setText("商品：");
		}
		
		{
			Text label = new Text(serachComposite, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 100;
			label.setLayoutData(data);
		}
		
		{
			Button searchBtn = new Button(serachComposite, SWT.NONE);
			GridData data = new GridData();
			searchBtn.setLayoutData(data);
			searchBtn.setText("查询");
			searchBtn.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					try {
						StockCheck stockCheck = new StockCheck();
						stockCheck.setDocNum(docNum.getText());
						List<StockCheck> stockChecks  = checkRepositoryService.queryAdjustShopList(stockCheck);
						searchViewer.setInput(stockChecks);
					} catch (POSException e1) {
						MessageDialog.openError(((Button)e.getSource()).getShell(), "错误", e1.getErrorMessage());
						e1.printStackTrace();
					}
					
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					
				}
			});
		}
	};

	private void buildOperation(Composite parent) {
		Composite operation = new Composite(parent, SWT.NONE);
		operation.setLayout(new GridLayout(3, true));
		operation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("确定");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);

			button.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
				
					Button button = (Button)e.getSource();
					stockCheck = new StockCheck();
					stockCheck.setCheckShId(checkStoreName.getSelectionIndex());
					stockCheck.setCheckDate(stockDate.getDate().getTime());
					stockCheck.setAuditDate(checkDate.getDate().getTime());
					stockCheck.setDocNum(docNum.getText());
					stockCheck.setAuditId(Integer.valueOf(auditId.getText()));
					
					stockCheck.setMemo(remark.getText());
					if (recordViewer.getInput() instanceof List) {
						List<Item> list = (List<Item>) recordViewer.getInput();
						stockCheck.setItemList(list);
					};

					List<StockCheck> stockChecks = new ArrayList<StockCheck>();
					stockChecks.add(stockCheck);
					
					
					StockCheckDTO  stockCheckDTO = new StockCheckDTO();
					stockCheckDTO.setStockCheckList(stockChecks);
					caculatorNumAndPrice();
					try {
						checkRepositoryService.saveStockCheck(stockCheckDTO);
						MessageDialog.openInformation(button.getShell(), "提示", "保存成功");
					} catch (POSException e1) {
						MessageDialog.openError(button.getShell(), "错误", e1.getErrorMessage());
					}
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("取消");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
		}
		
		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("读取商品");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
		}
	}

	private void buildRecodeInfo(Composite parent) {
		Composite recodeComposite = new Composite(parent, SWT.NONE);
		recodeComposite.setLayout(new GridLayout(6, false));
		{
			Label label = new Label(recodeComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("制单人：");
		}
		{
			applyUser = new Text(recodeComposite, SWT.BORDER);
			applyUser.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			applyUser.setLayoutData(data);
			applyUser.setText(loginUser.getUserName());
		}
		{
			Label label = new Label(recodeComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("审核人：");
		}
		{
			auditId = new Text(recodeComposite, SWT.BORDER);
			auditId.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			auditId.setLayoutData(data);
			auditId.setText(String.valueOf(loginUser.getId()));
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
			label.setText("数量合计：");
		}
		{
			numberTotal = new Text(caculatorComposite, SWT.BORDER);
			numberTotal.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			numberTotal.setLayoutData(data);
		}
		{
			Label label = new Label(caculatorComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("金额合计：");
		}
		{
			priceTotal = new Text(caculatorComposite, SWT.BORDER);
			priceTotal.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			priceTotal.setLayoutData(data);
		}

		{
			Label label = new Label(caculatorComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("库存量：");
		}
		{
			Text text = new Text(caculatorComposite, SWT.BORDER);
			text.setEditable(false);
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
			label.setText("条形码(F2)：");
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
			label.setText("数量：");
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
			button.setText("扫描计数模式");
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			data.horizontalSpan = 1;
			button.setLayoutData(data);
			button.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					List<AdjustShopInfo> list = MockDataFactory.createAdjustShopInfoList();
					if (recordViewer.getInput() != null) {
						items.add(((List<Item>) recordViewer.getInput()).get(0));
					}
					recordViewer.setInput(MockDataFactory.createItemList());
					caculatorNumAndPrice();
				}
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
		}
	}
	

	private void caculatorNumAndPrice() {
		
		int totalNum = 0;
		double totalPrice = 0;
		for (Item item : (List<Item>)recordViewer.getInput()) {
			int num = item.getNum();
			totalNum = totalNum+num;
		}
		numberTotal.setText(String.valueOf(totalNum));
		
		for (Item item : (List<Item>)recordViewer.getInput()) {
			int num = item.getNum();
			double price  = item.getRetailPrice()* num;
			totalPrice = totalPrice + price;
		}
		priceTotal.setText(String.valueOf(totalPrice));
	}
	
	private void buildProductRecordInfo(Composite parent){

		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("商品信息");
		GridLayout gridLayout = new GridLayout(1,false);
		gridLayout.marginLeft = 20;
		//gridLayout.horizontalSpacing = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		//		data.heightHint = 300;
		productInfo.setLayoutData(data);
		buildPrintInfo(productInfo);

		recordViewer = new TableViewer(productInfo,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER|SWT.FULL_SELECTION);
		recordViewer.setContentProvider(new AdjustStoreContentProvider());
		recordViewer.setLabelProvider(new AdjustStoreLableProvider());
		//		TableViewerKeyBoardSupporter boardSupporter = new TableViewerKeyBoardSupporter(tableViewer);
		//		boardSupporter.startSupport();
		String[] cloumsProperties = new String[]{"itemName","itemCode","productName","num"};
		recordViewer.setColumnProperties(cloumsProperties);
		Table table = recordViewer.getTable();
		CellEditor[] editors = new CellEditor[4];

		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new TextCellEditor(table);
		editors[3] = new TextCellEditor(table);
		recordViewer.setCellEditors(editors);
		recordViewer.setCellModifier(new AdjustStoreCellModify(recordViewer));

		table.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(SWT.DEL == e.character){
					ISelection iSelection = recordViewer.getSelection();
					if(!iSelection.isEmpty()){
						Object obj = ((StructuredSelection)iSelection).getFirstElement();
						if(obj instanceof Item){
							Item item = (Item)obj;
							List<Item> items = (List<Item>)recordViewer.getInput();
							items.remove(item);
							recordViewer.setInput(items);
							caculatorNumAndPrice();
						}
					}
				}

			}
		});

		{
			GridData tableData = new GridData(GridData.FILL_HORIZONTAL);
			tableData.heightHint = 100;
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}

		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("商品搜索");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("货号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("商品名称");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("数量");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("零售价");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("零售价金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(200);
			column.setText("备注");
		}

		buildCaculator(productInfo);
	}
	
	private void buildProductInfo(Composite parent) {
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("单据查询");
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginLeft = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		productInfo.setLayoutData(data);
		buildSerachInfo(productInfo);
		searchViewer = new TableViewer(productInfo);
		searchViewer.setContentProvider(new AdjustShopSearchContentProvider());
		searchViewer.setLabelProvider(new AdjustShopSearchLableProvider());
		Table table = searchViewer.getTable();
		{
			GridData tableData = new GridData(GridData.FILL_HORIZONTAL);
			tableData.heightHint = 100;
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}

		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("盘点日期");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("单据编号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("盘点范围");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("盘点数量");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("制单人");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("审核人");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("审核日期");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("备注");
		}
		
	}

	private void buildBaseInfo(Composite parent) {
	
		Group baseInfo = new Group(parent, SWT.NONE);

		baseInfo.setText("基本信息：");
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.marginLeft = 20;
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
		underCompsite.setLayoutData(data2);

		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("盘点店铺：");
		}
		{
			checkStoreName = new Combo(leftComposite, SWT.NONE);
			checkStoreName.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 155;
			data.horizontalSpan = 3;
			checkStoreName.setLayoutData(data);
			checkStoreName.setItems(new String[] {loginUser.getDeptName()});
			checkStoreName.select(0);
		}

		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("单据编号：");
		}
		{
			docNum = new Text(rightCompoiste, SWT.BORDER);
			docNum.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 160;
			data.horizontalSpan = 3;
			docNum.setLayoutData(data);
			try {
				docNum.setText(commonService.createNo());
			} catch (POSException e) {
				MessageDialog.openError(docNum.getShell(), "错误", e.getErrorMessage());
			}
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("盘点范围：");
		}
		List<String> shopNames = new ArrayList<String>();
		{
			ICommonService commonService = new CommonServiceImpl();
			try {
				List<Shop> shops = commonService.getAllShop();
				for (Shop shop : shops) {
					shopNames.add(shop.getShpName());
				}
			} catch (POSException e) {
				MessageDialog.openError(checkRange.getShell(), "错误", e.getErrorMessage());
			}
			checkRange = new Combo(leftComposite, SWT.NONE|SWT.READ_ONLY);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 155;
			checkRange.setLayoutData(data);
			
			checkRange.setItems(shopNames.toArray(new String[]{}));
			checkRange.select(0);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("盘点日期：");
		}
		{
			stockDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY, new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 170;
			data.horizontalSpan = 3;
			stockDate.setLayoutData(data);
			stockDate.setDate(Calendar.getInstance());
		}
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("审核日期：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			checkDate = new CalendarCombo(underCompsite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 170;
			data.horizontalSpan = 3;
			checkDate.setLayoutData(data);
			checkDate.setDate(Calendar.getInstance());
		}
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("备注：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			remark = new Text(underCompsite, SWT.MULTI | SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			data.heightHint = 30;
			remark.setLayoutData(data);
		}
	}

	@Override
	public void setFocus() {

	}
}