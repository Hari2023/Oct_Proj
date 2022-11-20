package com.testng.attributes;

import org.Oct31_Proj.Utility_Files;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class Invocation_Timeout_Demo {

	public WebDriver driver = Utility_Files.browser_Configure("chrome");

	@Test(priority = -2)
	private void launch_Url() {
		driver.get("https://www.facebook.com/login");

	}

	@Test(priority = -1, invocationCount = 4, 
			invocationTimeOut = 5000)
	private void refresh_Page() {

		driver.navigate().refresh();

	}

	@Test
	private void email_Id() {

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

	}

}