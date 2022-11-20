package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store_Home {
	
	public WebDriver driver;

	@FindBy(xpath = "//div[@class='header_user_info']//child::a")
	private WebElement signin;

	public My_Store_Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	

}
