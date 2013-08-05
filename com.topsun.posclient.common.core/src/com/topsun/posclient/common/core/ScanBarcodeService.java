package com.topsun.posclient.common.core;

import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.platform.win32.WinDef.HMODULE;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser.HHOOK;
import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;
import com.sun.jna.platform.win32.WinUser.LowLevelKeyboardProc;
import com.sun.jna.platform.win32.WinUser.MSG;

/** 
 * 
 * ����HOOK������������¼���ɨ��ǹ���൱��ֻ��0-9�ͻس���ļ��̣�
 * �ͼ������¼�����
 * 
 */
public class ScanBarcodeService {

	private HHOOK hhkKeyBoard;
    private final User32 lib = User32.INSTANCE;
    
    /**
     * ֹͣɨ��ǹ����
     */
    public void stopScanBarcodeService() {    
        //ж�ؼ��̹���
        lib.UnhookWindowsHookEx(hhkKeyBoard);    
    }

    /**
     * ����ɨ��ǹ����
     */
    public void startScanBarcodeService() {
        //�����¼�����
        final BarcodeKeyboardListener listener=new BarcodeKeyboardListener();
        //�ص�
        LowLevelKeyboardProc keyboardHook = new LowLevelKeyboardProc() {

            @Override
            public LRESULT callback(int nCode, WPARAM wParam,
                    KBDLLHOOKSTRUCT info) {
            	
                if (nCode >= 0) {
                    switch (wParam.intValue()) {
                        case WinUser.WM_KEYUP:
                            int keyCode = info.vkCode;
                            
                            //�������ּ�0-9
                            if (keyCode >= 48 && keyCode <= 57) {
                                //��������������
                                listener.onKey(keyCode);
                            }
                            //����س���
                            if (keyCode == 13) {
                                //��������������
                                listener.onKey(keyCode);
                            }
                            break;
                    }
                }
                //������һ������
                return lib.CallNextHookEx(hhkKeyBoard, nCode, wParam,
                        info.getPointer());
            }
        };
        
        HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle(null);
        
        //�����涨��� �ص����� ��װ���ҹ����ж�ϵͳ�ĵײ�ļ��������¼����м��
        hhkKeyBoard = lib.SetWindowsHookEx(WinUser.WH_KEYBOARD_LL, keyboardHook, hMod, 0);
        
        // ������Ϣ���߳�����
        int result;
        MSG msg = new MSG();
        while ((result = lib.GetMessage(msg, null, 0, 0)) != 0) {
                if (result == -1) {
                        System.err.println("error in get message");
                        break;
                } else {
                	System.out.println(msg.message);
                        lib.TranslateMessage(msg);
                        lib.DispatchMessage(msg);
                }
        }
    }
}
