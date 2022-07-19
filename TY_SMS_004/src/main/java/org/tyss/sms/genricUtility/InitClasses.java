package org.tyss.sms.genricUtility;

import org.testng.annotations.BeforeSuite;

public class InitClasses {
	protected static SmsWebDriverUtility webdriverUtil;
	protected static  SmsExcelUtility excelUtility;
	protected static  SmsFileUtilty fileUtility;
	protected static  SmsJavaUtility javaUtility;
	@BeforeSuite
	public void intCls() {
		
		//Initalize the genric utilities
		webdriverUtil = new SmsWebDriverUtility();
		excelUtility = new SmsExcelUtility();
		fileUtility = new SmsFileUtilty();
		javaUtility = new SmsJavaUtility();
	}

}
