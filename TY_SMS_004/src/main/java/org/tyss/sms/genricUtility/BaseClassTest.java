package org.tyss.sms.genricUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassTest extends InitClasses {
	String browser;
	protected static String username;
	String url;
	protected static String password;
	String timeout;
	public int randomNum;
	public static long longTimeout;
	
	@BeforeSuite
	public void genrateRandomNum() {
		//Generate Random Number
		randomNum = javaUtility.getRandomNumber();
		
		System.out.println("Before suite executed");
		getProperty();
		convertLongToString();
		
	}
	
	public void getProperty() {
		//Get data from property file
		fileUtility.intiallizeProperyFile(IConnect.SMSPROPERTYFILEPATH);
		browser=fileUtility.getDataFromProperty("browser").trim();
		username=fileUtility.getDataFromProperty("adminusername").trim();
		password=fileUtility.getDataFromProperty("password").trim();
		url=fileUtility.getDataFromProperty("url");
		timeout =fileUtility.getDataFromProperty("timeouts");
		System.out.println(username+password+url);
	}
	public void convertLongToString() {
		//convert string to long
		longTimeout = javaUtility.convertStringToLong(timeout);

	}
	@BeforeMethod
	public void PreSetUp() {
		//launch the browser in runtime
		//make driver as  local variable
		WebDriver driver = webdriverUtil.setupDriver(browser);
		//call the the setter method from driver class in order set driver instance
		DriverClass.getInstance().setDriver(driver);
		SmsWebDriverUtility.openApplication(url);
		//pre-setting for the browser
		webdriverUtil.maximizeBrowser();
		webdriverUtil.implicitWait(longTimeout);
	}
	
	@AfterMethod
	public void closeBrowser() {
		webdriverUtil.closeBrowser();
		
	}

}
