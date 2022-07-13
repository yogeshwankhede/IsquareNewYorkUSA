package org.tyss.sms.genricUtility;

public interface IConnect {
	String ABSOLUTEPATH=System.getProperty("user.dir");
	public String SMSPROPERTYFILEPATH =ABSOLUTEPATH+"\\src\\test\\resources\\SmsData\\commondataSMS.properties";
	public String SMSEXCELPATH=ABSOLUTEPATH+"\\src\\test\\resources\\SmsData\\SMS_ExcelFile.xlsx";

}
