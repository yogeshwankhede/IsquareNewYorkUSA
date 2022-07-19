package org.tyss.sms.initclasses;

import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class Init_Parent_AllTeacher extends BaseClassTest {
	Init_Parent_AllTeacher PAllTeacher;
	SmsLoginPage loginPage;
	Sms_CommonHomePage commonPage;
	@Test
	public void P_AllTeacher() {
		loginPage = new SmsLoginPage();
		commonPage = new Sms_CommonHomePage();
		PAllTeacher = new Init_Parent_AllTeacher();
		loginPage.login(username, password).getAllTeacherTab().setsal(webdriverUtil);
	}
}
