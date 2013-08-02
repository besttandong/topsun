package com.topsun.posclient.sales.ui;

import java.util.Calendar;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.POSClientApp;
import com.topsun.posclient.common.listener.IKeyListener;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.sales.ui.menu.SalesItemCellModify;
import com.topsun.posclient.sales.ui.table.SalesTableContentProvider;
import com.topsun.posclient.sales.ui.table.SalesTableLableProvider;
import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

/**
 * @author Dong
 *
 */
public class VipView extends ViewPart implements IKeyListener {

	public TabFolder vipFolder;
	
	/** 会员基本信息 **/
	public Text vipName;
	
	public Combo age;
	
	public Combo gender;
	
	public Text email;
	
	public Text mobile1;
	
	public Text mobile2;
	
	public Text phone;
	
	public Text qq;
	
	public Text idCard;
	
	public Text address;
	
	public CalendarCombo birthday;
	
	/** 注册信息 **/
	public CalendarCombo registerDate;
	public Combo doShop;
	public Text sender1;
	public Text sender2;
	public Text remark;
	
	/** 消费信息 **/
	public Text monthCount;
	public Text yearCount;
	public Text buyCount;
	public Text firstBuy;
	public Text endBuy;
	
	/** 持卡信息 **/
	public Text cardNo;
	public Combo cardType;
	public Text validDate;
	public Text invalidDate;
	public Text status;
	/** 价格信息  **/
	public Text zkfs;//折扣方式
	public Text priceList; //价格清单
	/** 积分与充值 **/
	public Text monthPoint;//本月积分
	public Text countPoint;//累计积分
	public Text monthRecharge;//本月充值
	public Text countRecharge;//累计充值
	public Text cardBalance; //卡上余额
	
	
	public TableViewer  buyRecordViewer;//消费记录
	
	public TableViewer  pointRecordViewer;//积分记录
	
	public TableViewer rechargeViewer; //充值记录
	
	public void onChange(String operationType) {
		
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1,false));
		vipFolder = new TabFolder(parent, SWT.NONE);
		GridData vipFolderData = new GridData(GridData.FILL_BOTH);
		vipFolder.setLayoutData(vipFolderData);
		
		TabItem item1 = new TabItem(vipFolder, SWT.NONE);
		item1.setText("会员信息");
		
		Composite item1Comp = new Composite(item1.getParent(),SWT.NONE);
		item1Comp.setLayout(new GridLayout(1,false));
		buildVipInfo(item1Comp);
		buildRegisterInfo(item1Comp);
		buildBuyInfo(item1Comp);
		item1.setControl(item1Comp);
		
		TabItem item2 = new TabItem(vipFolder, SWT.NONE);
		item2.setText("持卡信息");
		Composite item2Comp = new Composite(item2.getParent(),SWT.NONE);
		item2Comp.setLayout(new GridLayout(1,false));
		buildCardInfo(item2Comp);
		buildPriceInfo(item2Comp);
		buildRechargeInfo(item2Comp);
		buildPointInfo(item2Comp);
		item2.setControl(item2Comp);
		
		TabItem item3 = new TabItem(vipFolder, SWT.NONE);
		item3.setText("消费记录");
		Composite item3Comp = new Composite(item3.getParent(),SWT.NONE);
		item3Comp.setLayout(new GridLayout(1,false));
		buildBuyRecord(item3Comp);
		item3.setControl(item3Comp);
		
		TabItem item4 = new TabItem(vipFolder, SWT.NONE);
		item4.setText("积分记录");
		Composite item4Comp = new Composite(item4.getParent(),SWT.NONE);
		item4Comp.setLayout(new GridLayout(1,false));
		buildPointRecord(item4Comp);
		item4.setControl(item4Comp);
		
		TabItem item5 = new TabItem(vipFolder, SWT.NONE);
		item5.setText("充值记录");
		Composite item5Comp = new Composite(item5.getParent(),SWT.NONE);
		item5Comp.setLayout(new GridLayout(1,false));
		buildRechargeViewer(item5Comp);
		item5.setControl(item5Comp);
		
//		TabItem item6 = new TabItem(vipFolder, SWT.NONE);
//		item6.setText("问卷调查");
//		
//		TabItem item7 = new TabItem(vipFolder, SWT.NONE);
//		item7.setText("消费指标分析");
//		
//		TabItem item8 = new TabItem(vipFolder, SWT.NONE);
//		item8.setText("消费习惯分析");
//		
//		TabItem item9 = new TabItem(vipFolder, SWT.NONE);
//		item9.setText("客户回访记录");
	}
	
	public void buildCardInfo(Composite parent){
		Group baseInfo = new Group(parent, SWT.NONE);
		baseInfo.setText("卡片信息（按回车确认）");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(baseInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(baseInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("会员卡号");
		}
		{
			cardNo = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			cardNo.setLayoutData(data);
		}
		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("卡类别");
		}
		{
			cardType = new Combo(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			cardType.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("生效日期");
		}
		{
			validDate = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			validDate.setLayoutData(data);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("失效日期");
		}
		{
			invalidDate = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			invalidDate.setLayoutData(data);
		}
		{
			Button getCardBtn = new Button(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 4;
			getCardBtn.setLayoutData(data);
			getCardBtn.setText("寻卡");
		}
	}
	
	public void buildPriceInfo(Composite parent){
		Group baseInfo = new Group(parent, SWT.NONE);
		baseInfo.setText("价格信息");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(baseInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(baseInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("折算方式");
		}
		{
			cardNo = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			cardNo.setLayoutData(data);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("价格清单");
		}
		{
			validDate = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			validDate.setLayoutData(data);
		}
	}
	
	public void buildRechargeInfo(Composite parent){
		Group baseInfo = new Group(parent, SWT.NONE);
		baseInfo.setText("充值信息");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(baseInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(baseInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("本月充值");
		}
		{
			monthRecharge = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			monthRecharge.setLayoutData(data);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("累计充值");
		}
		{
			countRecharge = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			countRecharge.setLayoutData(data);
		}
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("卡上余额");
		}
		{
			cardBalance = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			cardBalance.setLayoutData(data);
		}
	}
	
	public void buildPointInfo(Composite parent){
		Group baseInfo = new Group(parent, SWT.NONE);
		baseInfo.setText("积分信息");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(baseInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(baseInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("本月积分");
		}
		{
			monthPoint = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			monthPoint.setLayoutData(data);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("累计积分");
		}
		{
			countPoint = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			countPoint.setLayoutData(data);
		}
	}
	
	public void buildVipInfo(Composite parent){
		
		Group baseInfo = new Group(parent, SWT.NONE);
		baseInfo.setText("基本信息");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(baseInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(baseInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("姓名");
		}
		{
			vipName = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			vipName.setLayoutData(data);
		}
		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("年龄段");
		}
		{
			age = new Combo(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			age.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("性别");
		}
		{
			gender = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 185;
			gender.setLayoutData(data);
			gender.setItems(new String[]{"男","女"});
			gender.setEnabled(true);
			gender.select(0);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("生日");
		}
		{
			birthday = new CalendarCombo(rightCompoiste, SWT.READ_ONLY, new Settings(), null);
			birthday.setDate(Calendar.getInstance());
			birthday.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			birthday.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("手机1");
		}
		{
			mobile1 = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			mobile1.setLayoutData(data);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("手机2");
		}
		{
			mobile2 = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			mobile2.setLayoutData(data);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			lable.setText("邮箱");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			email = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			email.setLayoutData(data);
		}
	}

	public void buildRegisterInfo(Composite parent){
		
		User loginUser = POSClientApp.get().getLoginUser();
		
		Group registerInfo = new Group(parent, SWT.NONE);
		registerInfo.setText("注册信息");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		registerInfo.setLayout(gridLayout);
		registerInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(registerInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(registerInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite underCompsite = new Composite(registerInfo,SWT.NONE);
		underCompsite.setLayout(new GridLayout(4,false));
		GridData data2 = new GridData(GridData.FILL_BOTH);
		data2.horizontalSpan = 2;
		underCompsite.setLayoutData(data2);
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("注册日期");
		}
		{
			registerDate = new CalendarCombo(leftComposite, SWT.READ_ONLY, new Settings(), null);
			registerDate.setDate(Calendar.getInstance());
			registerDate.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			registerDate.setLayoutData(data);
		}
		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("办理店铺");
		}
		{
			doShop = new Combo(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			doShop.setLayoutData(data);
			String loginShopName = loginUser.getDeptName();
			doShop.setItems(new String[]{loginShopName});
			doShop.setEnabled(false);
			doShop.select(0);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("发卡人1");
		}
		{
			sender1 = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			sender1.setLayoutData(data);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("发卡人2");
		}
		{
			sender2 = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			sender2.setLayoutData(data);
		}
		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("备注");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			remark = new Text(underCompsite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint =50;
			data.widthHint = 718;
			remark.setLayoutData(data);
		}
	}
	
	public void buildBuyInfo(Composite parent){
		Group buyInfo = new Group(parent, SWT.NONE);
		buyInfo.setText("消费信息");
		
		GridLayout gridLayout = new GridLayout(2,false);
		gridLayout.marginLeft = 30;
		buyInfo.setLayout(gridLayout);
		buyInfo.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite leftComposite = new Composite(buyInfo,SWT.NONE);
		leftComposite.setLayout(new GridLayout(4,false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite rightCompoiste = new Composite(buyInfo,SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4,false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		{       
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("本月累计");
		}
		{
			monthCount = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			monthCount.setLayoutData(data);
			monthCount.setEditable(false);
		}
		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("年内累计");
		}
		{
			yearCount = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			yearCount.setLayoutData(data);
			yearCount.setEditable(false);
		}
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("消费累计");
		}
		{
			buyCount = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			buyCount.setLayoutData(data);
			buyCount.setEditable(false);
		}
		{
			Label label = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("首次累计");
		}
		{
			firstBuy = new Text(rightCompoiste, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			firstBuy.setLayoutData(data);
			firstBuy.setEditable(false);
		}
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("末次累计");
		}
		{
			endBuy = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 200;
			endBuy.setLayoutData(data);
			endBuy.setEditable(false);
		}
	}
	
	private void buildBuyRecord(Composite parent){
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("会员消费历史记录");
		GridLayout gridLayout = new GridLayout(1,false);
		gridLayout.marginLeft = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		productInfo.setLayoutData(data);
		
		buyRecordViewer = new TableViewer(productInfo,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER|SWT.FULL_SELECTION);
		buyRecordViewer.setContentProvider(new SalesTableContentProvider());
		buyRecordViewer.setLabelProvider(new SalesTableLableProvider());
		String[] cloumsProperties = new String[]{"salesDate","salesShop","itemCode","itemName","num","retailPrice","point","pointAmount","salesAmount","amount"};
		buyRecordViewer.setColumnProperties(cloumsProperties);
		Table table = buyRecordViewer.getTable();
		CellEditor[] editors = new CellEditor[3];
		
		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new TextCellEditor(table);
		buyRecordViewer.setCellEditors(editors);
		buyRecordViewer.setCellModifier(new SalesItemCellModify(buyRecordViewer));
		
		{
			GridData tableData = new GridData(GridData.FILL_BOTH);
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}
		
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("销售日期");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("销售店铺");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("款号");
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
			column.setText("折率");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("折让金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("售价");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("金额");
		}
	}
	
	private void buildPointRecord(Composite parent){
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("会员积分历史记录");
		GridLayout gridLayout = new GridLayout(1,false);
		gridLayout.marginLeft = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		productInfo.setLayoutData(data);
		
		pointRecordViewer = new TableViewer(productInfo,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER|SWT.FULL_SELECTION);
		pointRecordViewer.setContentProvider(new SalesTableContentProvider());
		pointRecordViewer.setLabelProvider(new SalesTableLableProvider());
		String[] cloumsProperties = new String[]{"salesDate","salesShop","itemCode","itemName","num","retailPrice","point","pointAmount","salesAmount"};
		pointRecordViewer.setColumnProperties(cloumsProperties);
		Table table = pointRecordViewer.getTable();
		CellEditor[] editors = new CellEditor[3];
		
		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new TextCellEditor(table);
		pointRecordViewer.setCellEditors(editors);
		pointRecordViewer.setCellModifier(new SalesItemCellModify(pointRecordViewer));
		
		{
			GridData tableData = new GridData(GridData.FILL_BOTH);
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}
		
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("单据日期");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("业务类型");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("单据编号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("店铺");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("消费金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("原积分");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("增加积分");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("减少积分");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("可用积分");
		}
	}
	
	private void buildRechargeViewer(Composite parent){
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("会员充值历史记录");
		GridLayout gridLayout = new GridLayout(1,false);
		gridLayout.marginLeft = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		productInfo.setLayoutData(data);
		
		pointRecordViewer = new TableViewer(productInfo,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER|SWT.FULL_SELECTION);
		pointRecordViewer.setContentProvider(new SalesTableContentProvider());
		pointRecordViewer.setLabelProvider(new SalesTableLableProvider());
		String[] cloumsProperties = new String[]{"salesDate","salesShop","itemCode","itemName","num","retailPrice","point","pointAmount","salesAmount"};
		pointRecordViewer.setColumnProperties(cloumsProperties);
		Table table = pointRecordViewer.getTable();
		CellEditor[] editors = new CellEditor[3];
		
		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new TextCellEditor(table);
		pointRecordViewer.setCellEditors(editors);
		pointRecordViewer.setCellModifier(new SalesItemCellModify(pointRecordViewer));
		
		{
			GridData tableData = new GridData(GridData.FILL_BOTH);
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
		}
		
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("业务日期");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("业务类型");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("小票号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("店铺");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("消费金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("原金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("增加金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("减少金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("可用金额");
		}
	}
	
	public void setFocus() {
		
	}
	
	class Settings extends DefaultSettings {
		
		public boolean keyboardNavigatesCalendar() {
			return false;
		}
	}
	
	public static void main(String[] args){
		
		Display dis = new Display();
		Shell shell = new Shell(dis);
		shell.setText("eeee");
		shell.setSize(400, 300);
		shell.setLayout(new GridLayout(1, false));
		
		TabFolder folder = new TabFolder(shell, SWT.NONE);
		folder.setLayout(new GridLayout(1,false));
		folder.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		TabItem item1 = new TabItem(folder, SWT.NONE);
		item1.setText("ssssss");
		
		TabItem item2 = new TabItem(folder, SWT.NONE);
		item2.setText("dddddd");
		
		Composite control = new Composite(item1.getParent(), SWT.NONE);
		control.setLayout(new GridLayout(1, false));
		
		Group group2 = new Group(control, SWT.NONE);
		group2.setText("group2");
		
		Group group3 = new Group(control, SWT.NONE);
		group3.setText("group3");
		
		item2.setControl(control);
		
		shell.open();
		while(!shell.isDisposed()){
			if(!dis.readAndDispatch())
				dis.sleep();
		}
		dis.dispose();
	}

}
