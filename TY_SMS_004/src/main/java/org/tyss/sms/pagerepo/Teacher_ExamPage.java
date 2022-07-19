package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Teacher_ExamPage {
	@FindBy(xpath = "//span[.='Exam']")
	private WebElement examLink;
	@FindBy(xpath = "//a[.='Add ']")
	private WebElement addTab;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement searchTxtBx;
	@FindBy(id = "btnSubmit")
	private WebElement submitBtn;

}
 