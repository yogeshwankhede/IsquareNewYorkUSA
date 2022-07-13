package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sms_CommonHomePage {

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement DashboardTab;
	@FindBy(xpath ="//span[text()='My Profile']")
	private WebElement MyProfileTab;
	@FindBy(xpath ="//span[text()='Classroom']")
	private WebElement ClassroomTab;
	@FindBy(xpath  ="//span[text()='Grade']")
	private WebElement GradeTab;
	@FindBy(xpath = "//span[text()='Subject']")
	private WebElement SubjectTab;
	@FindBy(xpath="//span[text()='Teacher']")
	private WebElement TeacherTab;
	@FindBy(xpath ="//a[text()=' Add Teacher']")
	private WebElement AddTeacherTab;
	@FindBy(xpath = "//a[text()=' All Teacher']")
	private WebElement AllTeacherTab;
	@FindBy(xpath = "//span[text()='Subject Routing']")
	private WebElement SubjectRoutineTab;
	@FindBy(xpath = "//span[text()='Timetable']")
	private WebElement TimetableTab;
	@FindBy(xpath = "//span[text()='Student']")
	private WebElement StudentTab;
	@FindBy(xpath = "//a[text()=' Add Student']")
	private WebElement AddStudentTab;
	@FindBy(xpath = "//a[text()=' Leave Student']")
	private WebElement LeaveStudentTab;
	@FindBy(xpath = "//span[text()='Student Payment']")
	private WebElement StudentPaymentTab;
	@FindBy(xpath = "//span[text()='Attendance']")
	private WebElement Attendance;
	@FindBy(xpath = "//a[text()=' Add Attendance']")
	private WebElement AddAttendanceTab;
	@FindBy(xpath = "//a[text()='Student Attendance History ']")
	private WebElement StudentAttendanceHistoryTab;
	@FindBy(xpath = "//a[text()=' Teacher Attendance History']")
	private WebElement TeacherAttendanceHistoryTab;
	@FindBy(xpath = "//span[text()='Exam']")
	private WebElement ExamTab;
	@FindBy(xpath = "//a[text()='Create Exam']")
	private WebElement CreateExamTab;
	@FindBy(xpath = "//a[text()=' Exam Timetable']")
	private WebElement ExamTimetableTab;
	@FindBy(xpath = "//a[text()='Student Exam Marks']")
	private WebElement StudentExamMarksTab;
	@FindBy(xpath = "//a[text()='Student Exam Marks History']")
	private WebElement StudentExamMarksHistoryTab;
	@FindBy(xpath = "//span[text()='Petty Cash']")
	private WebElement PettyCashTab;
	@FindBy(xpath = "//span[text()='Friends']")
	private WebElement FriendsTab;
	@FindBy(xpath = "//a[text()=' Add Friends']")
	private WebElement AddFriendsTab;
	@FindBy(xpath = "//a[text()=' My Friends']")
	private WebElement MyFriendsTab;
	@FindBy(xpath = "//span[text()='Event']")
	private WebElement EventTab;
	@FindBy(xpath = "//a[text()=' My Events']")
	private WebElement MyEventsTab;
	@FindBy(xpath = "//a[text()=' All Events']")
	private WebElement AllEventsTab;
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement DashboardLink;
	@FindBy(xpath = "//a[text()=' Home']")
	private WebElement HomeTab;
	@FindBy(xpath = "//a[text()='Sign out']")
	private static WebElement SignOutBtn;
	
	
	public Sms_CommonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  void setSignOutBtn() {
		 SignOutBtn.click();;
	}
	
	public  void setMyProfileTab() {
		MyProfileTab.click();
	}
/**
 * This method is for clicking on ClassroomTab
 */
	public void getClassroomTab() {
		 ClassroomTab.click();;
	}

	public void getGradeTab() {
		 GradeTab.click();
	}

	public void getSubjectTab() {
		 SubjectTab.click();
	}

	public Sms_CommonHomePage getTeacherTab() {
		 TeacherTab.click();
		 return this;
	}

	public void getAddTeacherTab() {
		 AddTeacherTab.click();
	}

	public void getAllTeacherTab() {
		 AllTeacherTab.click();
	}

	public void getSubjectRoutineTab() {
		 SubjectRoutineTab.click();
	}

	public void getTimetableTab() {
		 TimetableTab.click();
	}

	public Sms_CommonHomePage getStudentTab() {
		 StudentTab.click();
		 return this;
	}

	public Sms_CommonHomePage getAddStudentTab() {
		 AddStudentTab.click();
		 return this;
	}

	public Sms_CommonHomePage getLeaveStudentTab() {
		 LeaveStudentTab.click();
	return this;
	}

	public void getStudentPaymentTab() {
		 StudentPaymentTab.click();
	}

	public void getAttendance() {
		 Attendance.click();
	}

	public void getAddAttendanceTab() {
		 AddAttendanceTab.click();
	}

	public void setStudentAttendanceHistoryTab() {
		 StudentAttendanceHistoryTab.click();
	}

	public void getTeacherAttendanceHistoryTab() {
		 TeacherAttendanceHistoryTab.click();
	}

	public void getExamTab() {
		 ExamTab.click();
	}

	public void getCreateExamTab() {
		 CreateExamTab.click();
	}

	public void getExamTimetableTab() {
		 ExamTimetableTab.click();
	}

	public void getStudentExamMarksTab() {
		 StudentExamMarksTab.click();;
	}

	public void getStudentExamMarksHistoryTab() {
		 StudentExamMarksHistoryTab.click();;
	}

	public void getPettyCashTab() {
		 PettyCashTab.click();;
	}

	public void getFriendsTab() {
		 FriendsTab.click();;
	}

	public void getAddFriendsTab() {
		 AddFriendsTab.click();;
	}

	public void getMyFriendsTab() {
		 MyFriendsTab.click();;
	}

	public void getEventTab() {
		 EventTab.click();;
	}

	public void getMyEventsTab() {
		 MyEventsTab.click();;
	}

	public void getAllEventsTab() {
		 AllEventsTab.click();;
	}

	public void getDashboardLink() {
		 DashboardLink.click();;
	}

	public void getHomeTab() {
		 HomeTab.click();;
	}

	public void getDashboardTab() {
		DashboardTab.click();;
	}
	

}
