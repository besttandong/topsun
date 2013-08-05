package com.topsun.posclient.common.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.ui.keys.Key;

/**
 *ɨ��ǹģ��ļ��̰�ť�¼�����0-9��ͻس���
 * �ؼ��㷨��������ɨ�����ں̵ܶ�ʱ�������������� barcodeMinLength ���ַ�������Ϣ�������ԡ��س�����Ϊ�����ַ���һ��ɨ��Ҫ�� maxScanTime ���������
 * �ַ���ɨ��ʱ��ɸ�ݾ����������
 */
public class BarcodeKeyboardListener {

	//��������ݻ�����
    private StringBuilder barcode;
    //ɨ�迪ʼʱ��
    private long start;
    private Map<Integer,Integer> keyToLetter=new HashMap<Integer,Integer>();
    //һ��ɨ����ʱ��
    private static int maxScanTime=300;
    //���������̳���
    private static int barcodeMinLength=6;

    /**
     * ��ʼ���̴������ĸ�Ķ��ڹ�ϵ
     */
    public BarcodeKeyboardListener(){
        keyToLetter.put(48,0);
        keyToLetter.put(49,1);
        keyToLetter.put(50,2);
        keyToLetter.put(51,3);
        keyToLetter.put(52,4);
        keyToLetter.put(53,5);
        keyToLetter.put(54,6);
        keyToLetter.put(55,7);
        keyToLetter.put(56,8);
        keyToLetter.put(57,9);
    }
    /**
     * �˷�����Ӧɨ��ǹ�¼�
     * @param keyCode 
     */
    public void onKey(int keyCode) {
        //��ȡ��������Ǹ�����
        Integer letter=keyToLetter.get(keyCode);
        if(barcode==null){
            //��ʼ����ɨ��״̬
            barcode=new StringBuilder();
            //��¼��ʼɨ��ʱ��
            start=System.currentTimeMillis();
        }
        //��Ҫ�ж�ʱ��
        long cost=System.currentTimeMillis()-start;
        if(cost > maxScanTime){
             //��ʼ����ɨ��״̬
            barcode=new StringBuilder();
            //��¼��ʼɨ��ʱ��
            start=System.currentTimeMillis();
        }
        //���ּ�0-9
        if (keyCode >= 48 && keyCode <= 57) {
            barcode.append(letter);
        }
        
        
        //�س���
        if (keyCode == 13) {
            //������ɨ�����ں̵ܶ�ʱ�������������� barcodeMinLength ���ַ�������Ϣ���6901028075763����ԡ��س�����Ϊ�����ַ�

            //�������������ʾ�ǡ��س���
            //��ô�жϻس�֮ǰ������ַ������� barcodeMinLength ���ַ�
            //����һ��ɨ��Ҫ�� maxScanTime ���������
            if(barcode.length() >= barcodeMinLength && cost < maxScanTime){
                cost=System.currentTimeMillis()-start;
                System.out.println("��ʱ��"+cost);
                System.out.println(barcode.toString());
                //����ݼ��뻺���������
                BarcodeListenetManager.getInstance().fireChange(barcode.toString());
                BarcodeBuffer.product(barcode.toString());
            }

            //���ԭ���Ļ�����
            barcode=new StringBuilder();
        }
    }
}
