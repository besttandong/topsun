package com.topsun.posclient.common.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CommonCoreActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.topsun.posclient.common.core"; //$NON-NLS-1$

	// The shared instance
	private static CommonCoreActivator plugin;
	
	/**
	 * The constructor
	 */
	public CommonCoreActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		final BarcodeProducter producter=new BarcodeProducter();
        final  BarcodeConsumer consumer=new BarcodeConsumer();
        
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				producter.startProduct();
				consumer.startConsume();

//				BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//				System.out.println("输入 '<exit>' 退出程序");
//				String line = "";
//
//				try {
//					line = reader.readLine();
//					BarcodeListenetManager.getInstance().fireChange(line);
//					System.err.println("input = ========" + line);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				while(line!=null){
//					if("exit".equals(line)){
//						producter.stopProduct();
//						consumer.stopConsume();
//						System.exit(0);
//					}
//					try {
//						line=reader.readLine();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}

			}
		}).start();
        
       
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static CommonCoreActivator getDefault() {
		return plugin;
	}

}
