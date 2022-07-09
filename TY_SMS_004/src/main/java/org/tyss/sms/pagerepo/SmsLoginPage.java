package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmsLoginPage {
	@FindBy(id="email")
	private WebElement loginTxtBox;
	
	@FindBy(id="password")
	private WebElement passTxtBox;
	
	@FindBy(id="btnSubmit")
	private WebElement loginBtn;
	
	//init
	public SmsLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 //SetterMethod
	public void login(String un,String pwd) {
		loginTxtBox.sendKeys(un);
		passTxtBox.sendKeys(pwd);
		loginBtn.sendKeys(pwd);
		
	}
	
	

}
