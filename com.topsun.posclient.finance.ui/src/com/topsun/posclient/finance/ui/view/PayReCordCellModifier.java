package com.topsun.posclient.finance.ui.view;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;

import com.topsun.posclient.datamodel.PayRecord;

public class PayReCordCellModifier implements ICellModifier
{
	  private TableViewer tv;
	  public static final String[] PAY_PROPERTIES = { "payDate", "bankName", "account", "amount", "payer", "approve", "approveDate", "remark"};

	  
	  
	  public PayReCordCellModifier(TableViewer tv, Composite parent)
	  {
	    this.tv = tv;
	  }

	  public boolean canModify(Object element, String property) {
	    return true;
	  }

	  public Object getValue(Object element, String property) {
		  PayRecord p = (PayRecord)element;

		  if (property.equals(PAY_PROPERTIES[0]))
			  return p.getPayDate()==null?"":p.getPayDate();

		  if (property.equals(PAY_PROPERTIES[1]))
			  return p.getBankName()==null?"":p.getBankName();

		  if (property.equals(PAY_PROPERTIES[2]))
			  return p.getAccount()==null?"":p.getAccount();

		  if (property.equals(PAY_PROPERTIES[3]))
			  return String.valueOf(p.getAmount());
			  
		  if (property.equals(PAY_PROPERTIES[4]))
			  return p.getPayer()==null?"":p.getPayer();
				  
		  if (property.equals(PAY_PROPERTIES[5]))	
			  return p.getApprove()==null?"":p.getApprove();
			  
		  if (property.equals(PAY_PROPERTIES[6]))
			 return p.getApproveDate()==null?"":p.getApproveDate();
		  
		  if (property.equals(PAY_PROPERTIES[7]))
			  return p.getRemark()==null?"":p.getRemark();
		
		  return "";
	  }

//	  private int getJavaTypeIndex(String name) {
//	    for (int i = 0; i < SETTLEACC_WAY.length; ++i)
//	      if (SETTLEACC_WAY[i].equals(name))
//	        return i;
//	    return -1;
//	  }

	  public void modify(Object element, String property, Object value) {
		  TableItem item = (TableItem)element;
		  PayRecord p = (PayRecord)item.getData();
		  if(property.equals(PAY_PROPERTIES[0])){
			  p.setPayDate(String.valueOf(value));
		  }

		  if(property.equals(PAY_PROPERTIES[1])){
			  p.setBankName(String.valueOf(value));
		  }
		  if(property.equals(PAY_PROPERTIES[2])){
			  p.setAccount(String.valueOf(value));
		  }
		  if(property.equals(PAY_PROPERTIES[3])){
			  if(value.toString().equals("")){
				  p.setAmount(0);
			  }else{
				  p.setAmount(Double.valueOf(value.toString()));
			  }
		  }
		  if(property.equals(PAY_PROPERTIES[4])){
			  p.setPayer(String.valueOf(value));
		  }
		  if(property.equals(PAY_PROPERTIES[5])){
			  p.setApprove(String.valueOf(value));
		  }
		  if(property.equals(PAY_PROPERTIES[6])){
			  p.setApproveDate(String.valueOf(value));
		  }
		  
		  if(property.equals(PAY_PROPERTIES[7])){
			  p.setRemark(String.valueOf(value));
		  }
		  tv.refresh();
	  }
	}