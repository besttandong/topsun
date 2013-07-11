package com.topsun.posclient.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询条件
 * 
 * @author Dong
 *
 */
public class QueryConditions {
	
	Map<String, Object> conditions = new HashMap<String, Object>();
	
	/**
	 * 添加查询条件
	 * @param parmsKey 查询参数名称
	 * @param paramValue 查询参数值
	 */
	public void addConditions(String parmsKey, Object paramValue){
		conditions.put(parmsKey, paramValue);
	}
	
}
