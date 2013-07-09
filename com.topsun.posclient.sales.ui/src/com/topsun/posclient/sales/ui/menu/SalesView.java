package com.topsun.posclient.sales.ui.menu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.MockDataFactory;
import com.topsun.posclient.common.POSClientApp;
import com.topsun.posclient.common.listener.IKeyListener;
import com.topsun.posclient.common.listener.KeyListenerManager;
import com.topsun.posclient.common.ui.utils.ImageUtils;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.PartSales;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;
import com.topsun.posclient.sales.MessageResources;
import com.topsun.posclient.sales.dialog.SalesPayDialog;
import com.topsun.posclient.sales.service.IPartSaleService;
import com.topsun.posclient.sales.service.impl.PartSaleServiceImpl;
import com.topsun.posclient.sales.ui.table.SalesTableContentProvider;
import com.topsun.posclient.sales.ui.table.SalesTableLableProvider;
import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

public class SalesView extends ViewPart implements IKeyListener {
	
	public IPartSaleService partSaleService = new PartSaleServiceImpl();
	
	List<Item> itemsList = new ArrayList();
		
	public PartSales partSales;
	
	public Combo shopName;
	public Text orderNo;
	public Combo casher;
	public Text casherNo;
	public Combo sales;
	public Text cardNo;
	public Text userName;
	public Text enableBalance;
	public Text enablePoint;

	public CalendarCombo salesDate;
	public CalendarCombo checkDate;
	
	public Text applyUser;
	public Text checker;
	public Text remark;
	public TableViewer  tableViewer;
	public Text numberTotal;
	public Text priceTotal;

	public Text getNumberTotal() {
		return numberTotal;
	}

	public void setNumberTotal(Text numberTotal) {
		this.numberTotal = numberTotal;
	}

	public Text getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(Text priceTotal) {
		this.priceTotal = priceTotal;
	}

	public SalesView() {
	
	}

	/**
	 * 商品信息
	 * @param parent
	 */
	private void buildProductInfo(Composite parent){
		KeyListenerManager.getInstance().addKeyListener(this);
		
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText(MessageResources.message_ui_group_iteminfo);
		GridLayout gridLayout = new GridLayout(1,false);
		gridLayout.marginLeft = 20;
		//gridLayout.horizontalSpacing = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
//		data.heightHint = 300;
		productInfo.setLayoutData(data);
		
		
		tableViewer = new TableViewer(productInfo,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER|SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new SalesTableContentProvider());
		tableViewer.setLabelProvider(new SalesTableLableProvider());
//		TableViewerKeyBoardSupporter boardSupporter = new TableViewerKeyBoardSupporter(tableViewer);
//		boardSupporter.startSupport();
		String[] cloumsProperties = new String[]{"itemName","itemCode","num"};
		tableViewer.setColumnProperties(cloumsProperties);
		Table table = tableViewer.getTable();
		CellEditor[] editors = new CellEditor[3];
		
		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new TextCellEditor(table);
		tableViewer.setCellEditors(editors);
		tableViewer.setCellModifier(new SalesItemCellModify(tableViewer));
		
//		tableViewer.setCellEditors(editors);
		
		table.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(SWT.DEL == e.character){
					ISelection iSelection = tableViewer.getSelection();
					if(!iSelection.isEmpty()){
						Object obj = ((StructuredSelection)iSelection).getFirstElement();
						if(obj instanceof Item){
							Item item = (Item)obj;
							List<Item> items = (List<Item>)tableViewer.getInput();
							items.remove(item);
							tableViewer.setInput(items);
							caculatorNumAndPrice();
						}
					}
				}
				
			}
		});
		
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
			column.setText("款号搜索");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("款号");
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
//		{
//			TableColumn column = new TableColumn(table, SWT.NONE);
//			column.setWidth(80);
//			column.setText("售价");
//		}
//		{
//			TableColumn column = new TableColumn(table, SWT.NONE);
//			column.setWidth(80);
//			column.setText("单价");
//		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("金额");
		}
	}


	@Override
	public void onChange(String operationType) {
		if(tableViewer.getInput() != null){
			List<Item> items = (List<Item>)tableViewer.getInput() ;
			Item addItem = new Item();
			addItem.setNum(1);
			items.add(addItem);
			tableViewer.setInput(items);
			tableViewer.editElement(addItem, 0);
			tableViewer.setSelection(new StructuredSelection(addItem));
		}else{
			List<Item> items = new ArrayList<Item>();
			Item addItem = new Item();
			addItem.setNum(1);
			items.add(addItem);
			tableViewer.setInput(items);
			tableViewer.editElement(addItem, 0);
		}
		caculatorNumAndPrice();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1,false));
		buildBaseInfo(parent);
		buildPrintInfo(parent);
		buildProductInfo(parent);
		buildCaculator(parent);
		buildRecodeInfo(parent);
		buildOperation(parent);
	}
	
	private void buildOperation(Composite parent){
	
		Composite operation = new Composite(parent, SWT.NONE);
		operation.setLayout(new GridLayout(2,true));
		operation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		{
			Button button = new Button(operation, SWT.NONE);
			button.setText("收银[END]");
			button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "icons//ok.gif"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
			
			button.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					Button saveButton = (Button)e.getSource();
					String salesName = sales.getText();
					if(salesName == null || "".equals(salesName.trim())){
						MessageDialog.openError(saveButton.getShell(), "提示", "导购不能为空");
						return;
					}
					
//					if(salesDate.getDateAsString()== null || "".equals(salesDate.getDateAsString().trim())){
//						MessageDialog.openError(saveButton.getShell(), "提示", "销售日期不能为空");
//						return;
//					}
					
//					if(checkDate.getDateAsString()== null || "".equals(checkDate.getDateAsString().trim())){
//						MessageDialog.openError(saveButton.getShell(), "提示", "审核日期不能为空");
//						return;
//					}
				
					SalesPayDialog dialog = new SalesPayDialog(saveButton.getShell());
					dialog.open();
					
					MockDataFactory dataFactory = new MockDataFactory();
					partSales = new PartSales();
					partSales.setApplyUser(applyUser.getText());
					//partSales.setBalance(balance)
					partSales.setBalloter(casher.getText());
					partSales.setBallotNo(casherNo.getText());
					partSales.setCardNo(cardNo.getText());
//					Calendar checkCal= checkDate.getDate();
//					partSales.setCheckDate(checkCal.getTime());
					partSales.setChecker(checker.getText());
					partSales.setEnableBalance(enableBalance.getText());
					partSales.setEnablePoint(enablePoint.getText());
					partSales.setNo(orderNo.getText());
					partSales.setRemark(remark.getText());
					
					Calendar salesCal= salesDate.getDate();
					partSales.setCheckDate(salesCal.getTime());
					
					partSales.setShopName(shopName.getText());
					partSales.setUserName(userName.getText());
					if(tableViewer.getInput() instanceof List){
						List list = (List)tableViewer.getInput();
						partSales.setItemList(list);
					};
					
					List<PartSales> partSalesList = new ArrayList<PartSales>();
					partSalesList.add(partSales);
					PartSalesDTO salesDTO = new PartSalesDTO();
					salesDTO.setPartSalesList(partSalesList);
					
					try {
						partSaleService.saveSaleData(salesDTO);
					} catch (Exception e1) {
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
			button.setText("整单取消[ESC]");
			button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "icons//nook.png"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			button.setLayoutData(data);
			
			button.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					tableViewer.setInput(null);
					priceTotal.setText("");
					numberTotal.setText("");
					
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
	}
	
	private void buildRecodeInfo(Composite parent){
		Composite recodeComposite = new Composite(parent, SWT.NONE);
		User user = POSClientApp.get().getLoginUser();
		recodeComposite.setLayout(new GridLayout(4,false));
		{
			Label label = new Label(recodeComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("制作人：");
		}
		{
			applyUser  = new Text(recodeComposite, SWT.BORDER);
			applyUser.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 100;
			data.horizontalSpan = 1;
			applyUser.setLayoutData(data);
			applyUser.setText(user.getUserName());
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
			checker.setText(user.getUserName());
		}
	
	}
	
	private void buildCaculator(Composite parent){
		Composite caculatorComposite = new Composite(parent, SWT.NONE);
		caculatorComposite.setLayout(new GridLayout(6,false));
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
	
	private void caculatorNumAndPrice() {
		
		int totalNum = 0;
		double totalPrice = 0;
		for (Item item : (List<Item>)tableViewer.getInput()) {
			int num = item.getNum();
			totalNum = totalNum+num;
		}
		numberTotal.setText(String.valueOf(totalNum));
		
		for (Item item : (List<Item>)tableViewer.getInput()) {
			int num = item.getNum();
			double price  = item.getRetailPrice()* num;
			totalPrice = totalPrice + price;
		}
		priceTotal.setText(String.valueOf(totalPrice));
	}
	
	private void buildPrintInfo(Composite parent){
		Composite printCompoiste = new Composite(parent, SWT.NONE);
		printCompoiste.setLayout(new GridLayout(8,false));
		{
			Label label = new Label(printCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("条形码输入：");
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
			button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "icons//sales.png"));
			GridData data = new GridData();
			data.heightHint = 28;
			data.widthHint = 120;
			data.horizontalSpan = 1;
			button.setLayoutData(data);
			button.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					
					if(tableViewer.getInput() == null){
						itemsList = MockDataFactory.createItemList();
						tableViewer.setInput(itemsList);
					}else{
						List<Item> items = (List<Item>)tableViewer.getInput();
						itemsList.add(items.get(0));
						tableViewer.setInput(itemsList);
					}
				
					caculatorNumAndPrice();
				}

				
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		
		
		{
			Button button = new Button(printCompoiste, SWT.NONE);
			button.setText("定长扫描");
			button.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "icons//sales.png"));
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
			label.setText("预设长度：");
		}
		{
		 Spinner spinner = new Spinner(printCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 90;
			data.horizontalSpan = 1;
			spinner.setLayoutData(data);
		}
	}
	

	private void buildBaseInfo(Composite parent) {
		
		User loginUser = POSClientApp.get().getLoginUser();
		
		Group baseInfo = new Group(parent, SWT.NONE);
	
		baseInfo.setText("基本信息：");
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		//gridLayout.horizontalSpacing = 50;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		Composite leftComposite = new Composite(baseInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(baseInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite underCompsite = new Composite(baseInfo,SWT.NONE);
		underCompsite.setLayout(new GridLayout(4,false));
		GridData data2 = new GridData(GridData.FILL_BOTH);
		data2.horizontalSpan = 2;
		underCompsite.setLayoutData(data2);
		
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("店铺：");
		}
		{
			shopName = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			shopName.setLayoutData(data);
			String loginShopName = loginUser.getDeptName();
			shopName.setItems(new String[]{loginShopName});
			shopName.setEnabled(false);
			shopName.select(0);
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
			data.widthHint = 200;
			data.horizontalSpan = 3;
			orderNo.setLayoutData(data);
			orderNo.setEditable(false);
			Date currentTime = new Date();  
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");  
			String dateString = formatter.format(currentTime);
			orderNo.setText(dateString);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("收银员：");
		}
		{
			casher = new Combo(leftComposite, SWT.NONE);
			casher.setEnabled(false);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 185;
			casher.setLayoutData(data);
			String userName = loginUser.getUserName();
			casher.setItems(new String[]{userName});
			casher.select(0);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("收银票号：");
		}
		
		{
			casherNo = new Text(rightCompoiste, SWT.BORDER);
			casherNo.setEditable(false);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			casherNo.setLayoutData(data);
			Date currentTime = new Date();  
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");  
			String dateString = formatter.format(currentTime);
			casherNo.setText(dateString);
		}
		
		
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("导购：");
		}
		{
			sales = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			sales.setLayoutData(data);
			String loginName = loginUser.getUserName();
			sales.setItems(new String[]{loginName});
			sales.select(0);
		}
		
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("销售日期：");
		}
		{
			salesDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY, new Settings(), null);
			salesDate.setDate(Calendar.getInstance());
			salesDate.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			salesDate.setLayoutData(data);
		}
		
		
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("会员卡号：");
		}
		{
			cardNo = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 70;
			data.horizontalSpan = 1;
			cardNo.setLayoutData(data);
			cardNo.setText("");
		}
		
		{ 
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("姓名：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			userName = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			data.widthHint = 75;
			userName.setLayoutData(data);
		}
//		{
//			Label lable = new Label(rightCompoiste, SWT.NONE);
//			lable.setText("审核日期：");
//			GridData data = new GridData();
//			data.horizontalSpan = 1;
//			lable.setLayoutData(data);
//		}
//		{
//			checkDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY, new Settings(), null);
//			GridData data = new GridData();
//			data.widthHint = 210;
//			data.horizontalSpan = 3;
//			checkDate.setLayoutData(data);
//		}
		
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("可用积分：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			enablePoint = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			enablePoint.setLayoutData(data);
			enablePoint.setText("0.0");
			enablePoint.setEditable(false);
		}
		
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			lable.setText("可用余额：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			enableBalance = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			enableBalance.setLayoutData(data);
			enableBalance.setText("0.0");
//			enableBalance.setEditable(false);
		}
		
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("注释：");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		
		{
			remark = new Text(underCompsite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint =40;
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
	
	/*			public Locale getLocale() {
					//return Locale.GERMAN;
				}
	*/
				public boolean keyboardNavigatesCalendar() {
					return false;
				}

				
			}
