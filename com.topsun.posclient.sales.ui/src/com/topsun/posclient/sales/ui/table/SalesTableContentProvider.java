package com.topsun.posclient.sales.ui.table;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.datamodel.Item;

public class SalesTableContentProvider extends ArrayContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list = (List)inputElement;
			return list.toArray();
		}
		return super.getElements(inputElement);

	}

	
	
}
