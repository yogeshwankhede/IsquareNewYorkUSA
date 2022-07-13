package org.tyss.sms.genricUtility;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class SmsJavaUtility {
	/**
	 * This method is to generate random number
	 * @param i 
	 * @return
	 */
	public int getRandomNumber() {
		return new Random().nextInt(1000);		
	}


	/**
	 * This Method is to convert String to long
	 * @param stringData
	 * @return
	 */



	public long convertStringToLong(String stringData) {
		return Long.parseLong(stringData);
	}


	/**
	 * This method is to get current date
	 * @param format
	 * @return
	 */
	public String currentDate(String format) {
		String date = new SimpleDateFormat(format).format(new Date());
		return date;

	}
	/**
	 * This method is for printing option
	 * @param value
	 */
	public void printStatement(String value) {
		System.out.println(value);
	}

	/**
	 * This method is used to split the triming based on strategy
	 * @return 
	 */
	public String[] splitString(String value,String strategy) {
		return value.split(strategy);
	}
	/**
	 * This method is to gate current date in a strategy
	 * @return 
	 * 
	 */
	public String getCurrentDate(String Strategy) {
		return new SimpleDateFormat(Strategy).format(new Date());
	}
	/**
	 * This method is to convert month String value into resp. int value
	 * @param monthName
	 * @param Strategy
	 * @return
	 */
	public int convertMonthFromStringToInt(String monthName,String Strategy) {
		return DateTimeFormatter.ofPattern(Strategy)
				.withLocale(Locale.ENGLISH)
				.parse(monthName)
				.get(ChronoField.MONTH_OF_YEAR);	
	}
	public String convertFromIntToString(int number) {
		return String.valueOf(number);
		
		
	}


}
