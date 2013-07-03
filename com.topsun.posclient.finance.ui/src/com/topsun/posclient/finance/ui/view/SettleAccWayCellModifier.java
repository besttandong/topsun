package com.topsun.posclient.finance.ui.view;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;

import com.topsun.posclient.datamodel.PayRecord;

public class SettleAccWayCellModifier implements ICellModifier
{
	  private TableViewer tv;
	  public static String[] SETTLEACC_WAY = { "0", "1", "2", "3", "4"};

	  public SettleAccWayCellModifier(TableViewer tv, Composite parent)
	  {
	    this.tv = tv;
	  }

	  public boolean canModify(Object element, String property) {
	    return true;
	  }

	  public Object getValue(Object element, String property) {
		  PayRecord p = (PayRecord)element;
//	    if (property.equals("settleAccWay"))
//	      return p.getSettleAccWay();
//	    if (property.equals("payCustomer"))
//	      return ((p.getPayCustomer() == null) ? "" : p.getPayCustomer());
//	    if (property.equals("receiveCustomer"))
//	      return new Integer(getJavaTypeIndex(p.getReceiveCustomer()));
//	    if (property.equals("posId"))
//	      return p.getPosId();
//	    if (property.equals("bankName"))
//	      return new Integer(p.getBankName());
//	    if (property.equals("account"))
//	      return p.getAccount();
//	    if (property.equals("remark"))
//	      return p.getRemark();
//
//	    throw new RuntimeException("error column name : " + property);
		  return null;
	  }

	  private int getJavaTypeIndex(String name) {
	    for (int i = 0; i < SETTLEACC_WAY.length; ++i)
	      if (SETTLEACC_WAY[i].equals(name))
	        return i;
	    return -1;
	  }

	  public void modify(Object element, String property, Object value) {
//	    String newValue;
//	    TableItem item = (TableItem)element;
//	    SettleAccWayInfo p = (SettleAccWayInfo)item.getData();
//	    if (property.equals("settleAccWay")) {
//	      p.setSettleAccWay(0);
//	    } else if (property.equals("payCustomer")) {
//	      newValue = (String)value;
//	      p.setPayCustomer(newValue);
//	    } else {}
//	    this.tv.update(p, null);
	  }
	}