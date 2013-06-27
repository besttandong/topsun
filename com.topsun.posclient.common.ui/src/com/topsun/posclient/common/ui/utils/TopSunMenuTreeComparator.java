package com.topsun.posclient.common.ui.utils;

import java.util.Comparator;

import com.topsun.posclient.common.ui.model.TopSunMenuModel;
import com.topsun.posclient.common.ui.model.TopSunTreeModel;

public class TopSunMenuTreeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof TopSunMenuModel && o2 instanceof TopSunMenuModel){
			TopSunMenuModel model1 = (TopSunMenuModel)o1;
			TopSunMenuModel model2 = (TopSunMenuModel)o2;
			int flag=model1.getIndex().compareTo(model2.getIndex());
			if(flag==0){
				return model1.getIndex().compareTo(model2.getIndex());
			}else{
				return flag;
			}  
		}
		
		if(o1 instanceof TopSunTreeModel && o2 instanceof TopSunTreeModel){
			TopSunTreeModel model1 = (TopSunTreeModel)o1;
			TopSunTreeModel model2 = (TopSunTreeModel)o2;
			int flag=model1.getIndex().compareTo(model2.getIndex());
			if(flag==0){
				return model1.getIndex().compareTo(model2.getIndex());
			}else{
				return flag;
			}  
		}
		 
		return 0;
	}


}
