package com.topsun.posclient.repository.ui.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.MockDataFactory;
import com.topsun.posclient.common.POSClientApp;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.common.service.impl.CommonServiceImpl;
import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.AllotStyle;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.AdjustRepositoryDTO;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;
import com.topsun.posclient.repository.service.IAdjustRepositoryService;
import com.topsun.posclient.repository.service.impl.AdjustRepositoryServiceImpl;
import com.topsun.posclient.repository.ui.table.AdjustShopSearchContentProvider;
import com.topsun.posclient.repository.ui.table.AdjustShopSearchLableProvider;
import com.topsun.posclient.repository.ui.table.AdjustStoreCellModify;
import com.topsun.posclient.repository.ui.table.AdjustStoreContentProvider;
import com.topsun.posclient.repository.ui.table.AdjustStoreLableProvider;
import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

/**
 * 调仓视图
 * 
 * @author Dong
 * 
 */
public class AdjustRepositoryView extends ViewPart {

	User loginUser = POSClientApp.get().getLoginUser();
	
	public IAdjustRepositoryService repositoryService = new AdjustRepositoryServiceImpl();

	List<Item> items = null;

	public AdjustRepositoryInfo adjustRepositoryInfo;

	public Combo storeName;//回仓店铺
	public Combo deliver;//发货人
	public Combo receiveRepository;//收货仓库
	public Text backReason;//回仓原因

	public Text orderNo; //单据编号
	public CalendarCombo backDate;//回仓日期
	public CalendarCombo checkDate;//审核日期
	public CalendarCombo reCheckDate;//复核日期
	
	public Text remark;//备注

	public Text applyUser;//制单人
	public Text checker;//审核人
	public Text reCheker;//复核人
	
	public TableViewer searchViewer;
	public TableViewer recordViewer;//录入tableview
	
	private Text numberTotal;
	private Text priceTotal;
	
	
	public AdjustRepositoryView() {
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
			CalendarCombo startDate = new CalendarCombo(serachComposite, SWT.READ_ONLY, new Settings(), null);
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
			CalendarCombo startDate = new CalendarCombo(serachComposite, SWT.READ_ONLY, new Settings(), null);
			GridData data = new GridData();
			startDate.setLayoutData(data);
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
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					try {
						
						AdjustRepositoryInfo repsInfo = new AdjustRepositoryInfo();
						repsInfo.setOrderNo("12345678");
						List<AdjustRepositoryInfo> AdjustRespositoryInfos  = repositoryService.queryAdjustShopList(repsInfo);
						searchViewer.setInput(AdjustRespositoryInfos);
					} catch (POSException e1) {
						MessageDialog.openError(((Button)e.getSource()).getShell(), "错误", e1.getErrorMessage());
						e1.printStackTrace();
					}
					
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					
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
			// button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID,
			// "ok.gif"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);

			button.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					AdjustRepositoryInfo adjustRepositoryInfo = new AdjustRepositoryInfo();
//					adjustRepositoryInfo.setOutShop(leaveStoreName.getText());
//					adjustRepositoryInfo.setIntoShop(inStoreName.getText());
//					adjustRepositoryInfo.setVoucherNo(orderNo.getText());
//					adjustRepositoryInfo.setCallType(adjustType.getText());
//					adjustRepositoryInfo.setCallDate(callDate.getDate().getTime());
//					adjustRepositoryInfo.setCheckDate(checkDate.getDate().getTime());
//					adjustRepositoryInfo.setReCheckDate(reCheckDate.getDate().getTime());
//					adjustRepositoryInfo.setItemNum(Integer.valueOf(numberTotal.getText()));
//					adjustRepositoryInfo.setChecker(checker.getText());
//					adjustRepositoryInfo.setReChecker(reviewer.getText());
					adjustRepositoryInfo.setApplyUser(applyUser.getText());
					
					adjustRepositoryInfo.setRemark(remark.getText());
					if (recordViewer.getInput() instanceof List) {
						List list = (List) recordViewer.getInput();
						adjustRepositoryInfo.setItemList(list);
					};

					List<AdjustRepositoryInfo> repList = new ArrayList<AdjustRepositoryInfo>();
					repList.add(adjustRepositoryInfo);
					
					
					AdjustRepositoryDTO  repDTO = new AdjustRepositoryDTO();
					repDTO.setAdjustRepositoryInfos(repList);
					caculatorNumAndPrice();
					try {
						repositoryService.saveAdjustRepositoryInfo(repDTO);
					} catch (POSException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub

				}
			});
		}

		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("取消");
			// button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID,
			// "nook.png"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
		}
		
		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("打印小票");
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
			checker = new Text(recodeComposite, SWT.BORDER);
			checker.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			checker.setLayoutData(data);
			checker.setText(loginUser.getUserName());
		}
		
		{
			Label label = new Label(recodeComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("复核人：");
		}
		
		{
			reCheker = new Text(recodeComposite, SWT.BORDER);
			reCheker.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			reCheker.setLayoutData(data);
			reCheker.setText(loginUser.getUserName());
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

				@Override
				public void widgetSelected(SelectionEvent e) {
					List<AdjustRepositoryInfo> list = MockDataFactory.createAdjustRepositoryInfoList();
					
					if (recordViewer.getInput() != null) {
						items.add(((List<Item>) recordViewer.getInput()).get(0));
					}
					recordViewer.setInput(MockDataFactory.createItemList());
					
					caculatorNumAndPrice();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub

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
		productInfo.setText("店调店查询");
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
			column.setText("发货日期");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("单据编号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("调出店铺");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("调入店铺");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("调拨类型");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("调拨数量");
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
			column.setText("复核人");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("复核日期");
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
//		data2.horizontalSpan = 2;
		underCompsite.setLayoutData(data2);

		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("回仓店铺：");
		}
		{
			storeName = new Combo(leftComposite, SWT.NONE);
			storeName.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 155;
			data.horizontalSpan = 3;
			storeName.setLayoutData(data);
			storeName.setItems(new String[] {loginUser.getDeptName()});
			storeName.select(0);
		}

		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("单据编号：");
		}
		{
			orderNo = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 160;
			data.horizontalSpan = 3;
			orderNo.setLayoutData(data);
//			orderNo.setText("01234567");
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("发货人：");
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			deliver = new Combo(leftComposite, SWT.NONE|SWT.READ_ONLY);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 155;
			deliver.setLayoutData(data);
			
			deliver.setItems(shopNames.toArray(new String[]{}));
			deliver.select(0);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("回仓日期：");
		}
		{
			backDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY, new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 170;
			data.horizontalSpan = 3;
			backDate.setLayoutData(data);
		}

		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("收货仓库：");
		}
		{
			receiveRepository = new Combo(leftComposite, SWT.NONE|SWT.READ_ONLY);
			GridData data = new GridData();
			data.widthHint = 155;
			data.horizontalSpan = 3;
			receiveRepository.setLayoutData(data);
			ICommonService commonService = new CommonServiceImpl();
			try {
				List<AllotStyle> allotStyles = commonService.getAllotStyle();
				String [] types = new String[allotStyles.size()];
				for (int i = 0; i <allotStyles.size();i++) {
					types[i] = allotStyles.get(i).getStyleName();
				}
				receiveRepository.setItems(types);
			} catch (POSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			receiveRepository.select(0);
		}

		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("审核日期：");
		}
		{
			checkDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY,
					new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 170;
			data.horizontalSpan = 3;
			checkDate.setLayoutData(data);
		}

//		{
//			Label lable = new Label(leftComposite, SWT.NONE);
//			GridData data = new GridData();
//			data.horizontalSpan = 1;
//			lable.setLayoutData(data);
//			lable.setText("回仓原因：");
//		}
//		{
//			backReason = new Text(leftComposite, SWT.BORDER);
//			GridData data = new GridData();
//			data.horizontalSpan = 3;
//			data.widthHint = 200;
//			backReason.setLayoutData(data);
//			backReason.setText("");
//		}
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
			data.horizontalSpan = 3;
			data.heightHint = 50;
			remark.setLayoutData(data);
		}
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("复核日期：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			reCheckDate = new CalendarCombo(underCompsite, SWT.READ_ONLY,
					new Settings(), null);
			GridData data = new GridData();
			data.widthHint = 170;
			data.horizontalSpan = 3;
			reCheckDate.setLayoutData(data);
		}
		

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}

