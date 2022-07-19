package org.tyss.sms001;

import org.testng.annotations.Test;

public class MavenPractice2Test {
	@Test
	public String getProperty(String string) {
		//Get data from property file
		   String browser = getProperty("BROWSER");
		String username = getProperty("UN");
		String password = getProperty("PWD");
		String url = getProperty("URL");
		System.out.println(username+password+url+browser);
		return string;
	}

}
