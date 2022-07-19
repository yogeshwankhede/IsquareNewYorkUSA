package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;
import org.tyss.sms.genricUtility.DriverClass;
import org.tyss.sms.genricUtility.SmsWebDriverUtility;

import com.github.dockerjava.api.model.Driver;

public class ParentTeacher_AllTeacher {
	@FindBy(xpath="//a[.=' All Teacher']")
	private WebElement allteacherlink;
	
	@FindBy(xpath="//table[@id='example1']/tbody/tr/td[3]/a[2]")
	private WebElement  addSallary;
	
	@FindBy(xpath="//div[@class='panel-heading bg-aqua-active']/h4[@id='hname']")
	private WebElement getTeacherName;
	
	@FindBy(xpath = "//button[@onclick='addSalary1(this)']")
	private WebElement clickOnAddSal;
	
	@FindBy(xpath = "//div[@class='col-xs-8']/select")
	private WebElement selectdropdown;
	
	@FindBy(xpath = "//option[@value='Advance']")
	private WebElement advOpt;
	
	@FindBy(xpath = "//input[@id='amount']")
	private WebElement amntTxtBx;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement submitBtn;
	
	
public ParentTeacher_AllTeacher() {
	PageFactory.initElements(DriverClass.getInstance().getDriver(), this);
}
public void setsal(SmsWebDriverUtility webUtil) {
	allteacherlink.click();
Assertion soft = new Assertion();
soft.assertEquals(true, toString().equals(getTeacherName));
	clickOnAddSal.click();
	webUtil.dropdownByIndex(1, selectdropdown);
	
	
}
}
