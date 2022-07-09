package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_AddClassroomPage {
	@FindBy(id="name")
	private WebElement nameTxtBox;
	
	
	@FindBy(xpath="//input[@placeholder='Enter student count']")
	private WebElement studentCountTxtBox;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;
	
	
	public Admin_AddClassroomPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//SetterMethod
	public void setAddClass(String name,String count) {
		nameTxtBox.sendKeys(name);
		studentCountTxtBox.sendKeys(count);
		submitBtn.click();
	}

} 
