

import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClass;
import org.tyss.sms.pagerepo.Admin_LeaveStudentPage;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class Admin_LeaveStudentPageTest extends BaseClass {
//	public static void main(String[] args) {
		//Initalize the genric utilities
//		SmsWebDriverUtility webdriverUtil = new SmsWebDriverUtility();
//		SmsExcelUtility excelUtility = new SmsExcelUtility();
//		SmsFileUtilty fileUtility = new SmsFileUtilty();
//		SmsJavaUtility javaUtility = new SmsJavaUtility();
		
//		//Generate Random Number
//		int randomNum = javaUtility.getRandomNumber();
//		
//		//Get data from property file
//		fileUtility.intiallizeProperyFile(IConnect.SMSPROPERTYFILEPATH);
//		String browser=fileUtility.getDataFromProperty("browser").trim();
//		String username=fileUtility.getDataFromProperty("adminusername").trim();
//		String password=fileUtility.getDataFromProperty("password").trim();
//		String url=fileUtility.getDataFromProperty("url");
//		String timeout=fileUtility.getDataFromProperty("timeouts");
//		System.out.println(username+password+url);
		
		
//		//get data from excel
//		excelUtility.initExcelFile(IConnect.SMSEXCELPATH);
//		ArrayList<String> multiData = excelUtility.getMultipleDataFromExcelRow(1, "Admin-Add Teacher");
//		int count = multiData.size();
//		for(int i=1;i<count;i++) {
//			String data = multiData.get(i);
//			
//			System.out.println(data);
//			
//		}
		
		
		
//		
//		//launch the browser in runtime
//		WebDriver driver = webdriverUtil.setupDriver(browser);
//		webdriverUtil.openApplication(url);
		
//		//convert string to long
//		long longTimeout = javaUtility.convertStringToLong(timeout);
//		
//		//pre-setting for the browser
//		webdriverUtil.maximizeBrowser();
//		webdriverUtil.implicitWait(longTimeout);
		SmsLoginPage loginPage;
		Sms_CommonHomePage commonPage;
		Admin_LeaveStudentPage studentLeavePage;
		
		@Test
		public void loginTest() {
		//Create objects of pom classes
			loginPage = new SmsLoginPage(driver);
			commonPage = new Sms_CommonHomePage(driver);
			studentLeavePage = new Admin_LeaveStudentPage(driver);
			
//		Sms_CommonHomePage homePage = new Sms_CommonHomePage(driver);
		
		//init methods
		loginPage.login(username,password).getStudentTab().getLeaveStudentTab();
		studentLeavePage.setActive();
		webdriverUtil.intiallizeExplicitWait(longTimeout, longTimeout);
		studentLeavePage.handleTab().gradeSelect(webdriverUtil);
		webdriverUtil.intiallizeExplicitWait(longTimeout, longTimeout);
		studentLeavePage.checkboxhandle().clickOnSubmit();

		
		
		//webdriverUtil.dropdownByText("class2", timeout);
	}

	}
//}

