package com.pom.automation.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='text' and @name='email_create' ]")
	private WebElement mailid;
	
	
	@FindBy(xpath = "//button[@type='submit' and @name='SubmitCreate']")
    private WebElement loginbtn;


	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Login page");
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMailid() {
		return mailid;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
