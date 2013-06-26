package com.topsun.posclient.application.common.service.impl;

import com.topsun.posclient.application.common.service.IBaseService;
import com.topsun.posclient.application.dao.LocalProcessor;

public class BaseServiceImpl implements IBaseService {
	
	LocalProcessor ldp;
	
	public LocalProcessor getLocalDataProcessor(){
		synchronized (this) {
			if(null == ldp){
				ldp = new LocalProcessor(System.currentTimeMillis()+"");
			}
			return ldp;
		}
	}
	
	public static void main(String[] args){
		for(int i=0; i<50; i++){
			new Thread(){
				public void run(){
					BaseServiceImpl bs = new BaseServiceImpl();
					LocalProcessor ldp = bs.getLocalDataProcessor();
					System.out.println(Thread.currentThread().getName()+" -- >> getLocalDataProcessor:"+ldp.getId());
					
					try {
						Thread.sleep(30000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
