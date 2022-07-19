package org.tyss.sms.genricUtility;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * This is Single Ton Design Pattern Class
 * @author YOGESH W.
 *
 */
public class DriverClass {
	//create static global variable/class variable and make it as private
	private static DriverClass classVar;
	private WebDriver driver;
	//make constructor as private
	private DriverClass() 
	{

	}
	/**
	 * Static getter method to create Single object
	 * @return
	 */
	public static DriverClass getInstance() 
	{
		if(Objects.isNull(classVar)) {
			classVar=new DriverClass();
		}
		return classVar;
	}


	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
