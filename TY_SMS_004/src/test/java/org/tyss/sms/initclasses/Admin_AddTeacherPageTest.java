package org.tyss.sms.initclasses;


import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.Admin_AddTeacherPage;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class Admin_AddTeacherPageTest extends BaseClassTest {
	Admin_AddTeacherPage addTeacher;
	SmsLoginPage loginPage;
	Sms_CommonHomePage commonPage;
	@Test
	public void AddTeacher() {
		loginPage = new SmsLoginPage();
		commonPage = new Sms_CommonHomePage();
		 addTeacher = new Admin_AddTeacherPage();
		 loginPage.login(username,password).getTeacherTab().getAddTeacherTab().setAddTeachersData(excelUtility, password, password, password, password, password, password, username, password);
				
	}

}
