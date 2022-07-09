package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genricUtility.SmsExcelUtility;

public class Admin_AddTeacherPage {
	
	@FindBy(id="index_number")
	private WebElement indexNumTxtBox;
	
	
	@FindBy(id="full_name")
	private WebElement full_nameTxtBox;
	
	
	
	@FindBy(id="i_name")
	private WebElement i_nameTxtBox;
	
	
	
	@FindBy(id="address")
	private WebElement addressTxtBox;
	
	
	@FindBy(id="phone")
	private WebElement phoneTxtBox;
	
	@FindBy(id="email")
	private WebElement emailTxtBox;
	
	@FindBy(id="fileToUpload")
	private WebElement fileToUploadBtn;
	
	@FindBy(id="btnSubmit")
	private WebElement submitbtn;
	
	
	public Admin_AddTeacherPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setAddTeachersData(SmsExcelUtility excelUtility) {
		
		
		
	}

}
