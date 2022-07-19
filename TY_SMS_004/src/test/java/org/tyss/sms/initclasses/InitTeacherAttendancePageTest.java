package org.tyss.sms.initclasses;
import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class InitTeacherAttendancePageTest extends BaseClassTest {

	SmsLoginPage loginPage;
	Sms_CommonHomePage commonPage;
	Sms_CommonHomePage homePage;
	@Test
	public void TeacherAttendanceTest() {
		//Create objects of pom classes
		loginPage = new SmsLoginPage();
		commonPage = new Sms_CommonHomePage();
		homePage = new Sms_CommonHomePage();

		//init methods
		loginPage.login(username,password).getTimetableTab();
	}		
}

