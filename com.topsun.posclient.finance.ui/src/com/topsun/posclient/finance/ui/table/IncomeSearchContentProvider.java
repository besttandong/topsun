package com.topsun.posclient.finance.ui.table;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;

public class IncomeSearchContentProvider extends ArrayContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list = (List)inputElement;
			return list.toArray();
		}
		return super.getElements(inputElement);

	}
}
