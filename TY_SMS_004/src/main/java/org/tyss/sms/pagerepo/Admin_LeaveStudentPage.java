 package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genricUtility.DriverClass;
import org.tyss.sms.genricUtility.SmsWebDriverUtility;

public class Admin_LeaveStudentPage {
	@FindBy(xpath="//td[.='1']/following-sibling::td[2]/a[.='Active']")
	private WebElement activeBtn;
	
	@FindBy(xpath="//td[.='1']/following-sibling::td[2]/a[.='View']") 
	private WebElement viewBtn;
	@FindBy(xpath="//select[@id='grade']")
	private WebElement selectDropDown;
	@FindBy(xpath = "(//table[@class='table ']/tbody/tr/td[1])[1]")
	private WebElement checkbox;
	
	@FindBy(xpath="//a[@id='btnYes']")
	private WebElement yesbtn;
	@FindBy(xpath="//button[@id='btnSubmit1']")
	private WebElement submitbtn;

	public Admin_LeaveStudentPage() {
		PageFactory.initElements(DriverClass.getInstance().getDriver(),this);
	}
	
	
	
	
	public Admin_LeaveStudentPage setActive() {
		activeBtn.click();
		return this;
	}
	public Admin_LeaveStudentPage setView() {
		viewBtn.click();
		return this;
	}
	public Admin_LeaveStudentPage handleTab() {
		yesbtn.click();
		return this;
		
	}
	public void gradeSelect(SmsWebDriverUtility webdriverutil) {
		 webdriverutil.dropdownByText(selectDropDown, "Grade 1");
		selectDropDown.click();
	}
	public Admin_LeaveStudentPage checkboxhandle() {
		checkbox.click();
		return this;
	}
	public Admin_LeaveStudentPage clickOnSubmit() {
		submitbtn.click();
		return this;
	}

}
