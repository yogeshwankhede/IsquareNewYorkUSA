package org.tyss.sms.initclasses;


import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.Admin_LeaveStudentPage;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class Admin_LeaveStudentPageTest extends BaseClassTest {
		SmsLoginPage loginPage;
		Sms_CommonHomePage commonPage;
		Admin_LeaveStudentPage studentLeavePage;
		
		@Test
		public void loginTest() {
		//Create objects of pom classes
			loginPage = new SmsLoginPage();
			commonPage = new Sms_CommonHomePage();
			studentLeavePage = new Admin_LeaveStudentPage();
			
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

