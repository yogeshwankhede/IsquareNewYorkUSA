package org.sms.runtests;
import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class Addteacherinit extends BaseClassTest {
	SmsLoginPage loginPage;
	Sms_CommonHomePage commonPage;
	Sms_CommonHomePage  homePage;
	@Test
	public void addTeacher() {	

		//Create objects of pom classes
		loginPage = new SmsLoginPage();
		commonPage = new Sms_CommonHomePage();
		homePage = new Sms_CommonHomePage();

		//init methods
		loginPage.login(username, password).getTeacherTab()
		.getAddTeacherTab()
		.setAddTeachersData(excelUtility,password, password, password, password, password, password, username, password);

	}
}
