//package org.tyss.sms.pagerepo;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.tyss.sms.genricUtility.SmsWebDriverUtility;
//
//public class Parent_MySonAttendanceTest {
//	@FindBy(id="year")
//	private WebElement yeardropDown;
//	
//	@FindBy(id="month")
//	private WebElement monthDropDown;
//	
//	
//	@FindBy(id="btnSubmit")
//	private WebElement submitbtn;
//	
//	
//	
//	public Parent_MySonAttendanceTest(WebDriver driver) {
//		PageFactory.initElements(driver,this);
//	}
//	public void handleDropDown(SmsWebDriverUtility webdriverUtil) {
//		webdriverUtil.dropdownByText(yeardropDown, "2017");
//		webdriverUtil.dropdownByText(monthDropDown, "May");
//		
//	}
//	
//
//}
