package com.topsun.posclient.common.core;

public interface BarcodeSaveService {

	/**
     * ����������
     * @param barcode 
     */
    public void save(String barcode);
    /**
     * �������ͷ���Դ������ݿ����ӣ��ر��ļ����ر��������ӵ�
     */
    public void finish();
}
