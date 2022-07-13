import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.tyss.sms.genricUtility.IConnect;
import org.tyss.sms.genricUtility.SmsExcelUtility;
import org.tyss.sms.genricUtility.SmsFileUtilty;
import org.tyss.sms.genricUtility.SmsJavaUtility;
import org.tyss.sms.genricUtility.SmsWebDriverUtility;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class LoginInitTest {
	public static void main(String[] args) {
		
		//Initalize the genric utilities
		SmsWebDriverUtility webdriverUtil = new SmsWebDriverUtility();
		SmsExcelUtility excelUtility = new SmsExcelUtility();
		SmsFileUtilty fileUtility = new SmsFileUtilty();
		SmsJavaUtility javaUtility = new SmsJavaUtility();
		
		//Generate Random Number
		int randomNum = javaUtility.getRandomNumber();
		
		//Get data from property file
		fileUtility.intiallizeProperyFile(IConnect.SMSPROPERTYFILEPATH);
		String browser=fileUtility.getDataFromProperty("browser").trim();
		String username=fileUtility.getDataFromProperty("adminusername").trim();
		String password=fileUtility.getDataFromProperty("password").trim();
		String url=fileUtility.getDataFromProperty("url");
		String timeout=fileUtility.getDataFromProperty("timeouts");
		System.out.println(username+password+url);
		
		
		//get data from excel
		excelUtility.initExcelFile(IConnect.SMSEXCELPATH);
		ArrayList<String> multiData = excelUtility.getMultipleDataFromExcelRow(2, "Admin_Student_AddStudent");
		int count = multiData.size();
		for(int i=1;i<count;i++) {
			String data = multiData.get(i);
			
			System.out.println(data);
			
		}
		
		
		
		
		//launch the browser in runtime
		WebDriver driver = webdriverUtil.setupDriver(browser);
		webdriverUtil.openApplication(url);
		
		//convert string to long
		long longTimeout = javaUtility.convertStringToLong(timeout);
		
		//pre-setting for the browser
		webdriverUtil.maximizeBrowser();
		webdriverUtil.implicitWait(longTimeout);
		
		
		//Create objects of pom classes
		SmsLoginPage loginPage = new SmsLoginPage(driver);
		Sms_CommonHomePage homePage = new Sms_CommonHomePage(driver);
		
		//init methods
		loginPage.login(username,password);
		
		
		
		
	}

}
