package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='header_user_info']//child::a[@class='logout']")
    private WebElement logout;

	public Logout_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Logout Page");
	}

	public WebElement getLogout() {
		return logout;
	}
}
