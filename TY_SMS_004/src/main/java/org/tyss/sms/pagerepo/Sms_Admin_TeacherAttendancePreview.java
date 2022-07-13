package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tyss.sms.genricUtility.SmsExcelUtility;
import org.tyss.sms.genricUtility.SmsWebDriverUtility;

public class Sms_Admin_TeacherAttendancePreview {
	
	@FindBy(id="year")
	private WebElement yearSelectDropDown;
	
	@FindBy(id="month")
	private WebElement monthSelectDropDown;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//select[@id='grade']")
	private WebElement gradeDropDown;
	
	
	//business Logic
	public void setTeacherPreview(SmsWebDriverUtility webDriverUtility,SmsExcelUtility smsExcelUtility) {
		yearSelectDropDown.click();
		String value = smsExcelUtility.getDataFromExcel(2, 4, "Admin_Teacher_AddTeacher");
		webDriverUtility.dropdownByText(yearSelectDropDown, value);
		
		
	}
	
	public void setGrade(SmsWebDriverUtility webdriverutil) {
		webdriverutil.dropdownByText(gradeDropDown, "Grade 1");
		gradeDropDown.click();
	}

}
