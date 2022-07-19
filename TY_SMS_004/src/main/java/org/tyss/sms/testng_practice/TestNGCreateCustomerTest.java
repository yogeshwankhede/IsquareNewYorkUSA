package org.tyss.sms.testng_practice;

import org.testng.annotations.Test;

public class TestNGCreateCustomerTest {
	@Test(priority = 3)
	public void createCustomerTest() {
		System.out.println("execute createCustomerTest ");
	}

	@Test(priority = 1)
	public void modifyCustomerTest() {
		System.out.println("execute modifyCustomerTest ");
	}
	@Test(priority = 2)
	public void deleteCustomerTest() {
		System.out.println("execute deleteCustomerTest ");
	}



}
