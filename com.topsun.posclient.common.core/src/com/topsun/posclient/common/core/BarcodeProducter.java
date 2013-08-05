package com.topsun.posclient.common.core;

/**
 *�����͹ر�����ǹɨ���߳�
 * @author ysc
 */
public class BarcodeProducter {

	private boolean quit;
    private Thread thread;
    
    private ScanBarcodeService scanBarcodeService;
    
    public BarcodeProducter(){
        scanBarcodeService=new ScanBarcodeService();
    }
    /**
     * ����������߳�
     * �˷�����tomcat������ʱ�򱻵���
     */
    public void startProduct() {        
        //��ֹ�ظ�����
        if(thread!=null && thread.isAlive()){
            return;
        }
        System.out.println("���������������...");
        //����һ���߳�������tomcat�رյ�ʱ��ж�ؼ��̹���
        thread=new Thread() {
            @Override
            public void run() {
                System.out.println("����ǹɨ���߳�����");
                while (!quit) {
                    try {
                        Thread.sleep(Long.MAX_VALUE);
                    } catch (Exception e) {
                        quit=true;
                    }
                }

                scanBarcodeService.stopScanBarcodeService();
                System.out.println("����ǹɨ���߳��˳�");
                System.exit(0);
            }
        };
        thread.start();
        new Thread() {
            @Override
            public void run() {
                scanBarcodeService.startScanBarcodeService();
            }
        }.start();
        
    }
    /**
     * �ر�������߳�
     * �˷�����tomcat�رյ�ʱ�򱻵���
     */
    public void stopProduct(){
        if(thread!=null){
            thread.interrupt();
            System.out.println("ֹͣ�����������...");
        }
    }
}
