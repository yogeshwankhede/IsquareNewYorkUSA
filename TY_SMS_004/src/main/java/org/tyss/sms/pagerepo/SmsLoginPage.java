package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmsLoginPage {
	WebDriver driver=null;
	@FindBy(id="email")
	private WebElement loginTxtBox;
	
	@FindBy(id="password")
	private WebElement passTxtBox;
	
	@FindBy(id="btnSubmit")
	private WebElement loginBtn;
	
	//init
	public SmsLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 //SetterMethod
	public  Sms_CommonHomePage login(String username,String password) {
		loginTxtBox.sendKeys(username);
		passTxtBox.sendKeys(password);
		loginBtn.click();
		//System.out.println(username+password);
		return new Sms_CommonHomePage(driver);
		
	}
	
	

}
