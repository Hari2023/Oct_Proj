package com.testng.attributes;

import java.time.Duration;

import org.Oct31_Proj.Utility_Files;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Timeout_Demo {

	public static WebDriver driver = Utility_Files.browser_Configure("chrome");

	@Test(timeOut = 5000)
	private void login() throws InterruptedException {

		driver.get("https://www.facebook.com/login");
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.id("email")).sendKeys("hari@gmail.com");

	}

}
