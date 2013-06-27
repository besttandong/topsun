package com.topsun.posclient.application;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.application.common.service.IOperatorService;
import com.topsun.posclient.application.common.service.impl.OperatorServiceImpl;
import com.topsun.posclient.application.model.Operator;


public class LoginDialog extends TitleAreaDialog {
	
	private IOperatorService operatorService = new OperatorServiceImpl();

	private Text passwordText;
	private Text userNameText;

	/**
	 * Create the dialog
	 * 
	 * @param parentShell
	 */
	public LoginDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		container.setLayout(gridLayout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		final Label label = new Label(container, SWT.RIGHT);
		// label.setImage(CacheImage.getINSTANCE().getImage(AppConstants.APPLICATION_ID,
		// ImageKey.USER_NAME));
		label.setText("用户名");

		userNameText = new Text(container, SWT.BORDER);
		final GridData gd_userNameText = new GridData(SWT.FILL, SWT.CENTER,
				true, false);
		userNameText.setLayoutData(gd_userNameText);
		userNameText.setText("admin");

		final Label label_1 = new Label(container, SWT.RIGHT);
		label_1.setText("密码");

		passwordText = new Text(container, SWT.BORDER);
		final GridData gd_passwordText = new GridData(SWT.FILL, SWT.CENTER,
				true, false);
		passwordText.setLayoutData(gd_passwordText);
		passwordText.setText("123456");

		setTitle("POS");
		return area;
	}

	/**
	 * Create contents of the button bar
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "登录", true);
		createButton(parent, IDialogConstants.CANCEL_ID, "取消", false);
	}

	/**
	 * Return the initial size of the dialog
	 */
	protected Point getInitialSize() {
		return new Point(354, 229);
	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("POS客户端登录");
	}

	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			try {
				login(userNameText.getText(), passwordText.getText());
				okPressed();
			} catch (Exception e) {
				MessageDialog.openError(getShell(), "登录失败", e.getMessage());
				e.printStackTrace();
				return;
			}
		}
		if (buttonId == IDialogConstants.CANCEL_ID) {
			cancelPressed();
		}
		super.buttonPressed(buttonId);
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @throws Exception
	 */
	private void login(String userName, String password) throws Exception {
		Operator operator = operatorService.getOperator(userName, password);
		if (null != operator){
			return;
		}else{
			throw new Exception("错误的用户名和密");
		}
	}
}
