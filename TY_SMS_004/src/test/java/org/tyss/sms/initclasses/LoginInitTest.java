package org.tyss.sms.initclasses;
import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPage;
import org.tyss.sms.pagerepo.Sms_CommonHomePage;

public class LoginInitTest extends BaseClassTest {

	SmsLoginPage loginPage;
	Sms_CommonHomePage homePage;
	@Test
	public void loginApp() {
		
		//Create objects of pom classes
	loginPage = new SmsLoginPage();
	homePage = new Sms_CommonHomePage();
		
		//init methods
		loginPage.login(username,password);
		
		
		
		
	}

}
 
