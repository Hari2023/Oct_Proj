package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='form-group']//child::input[@name='email' and @id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class='form-group']//child::input[@name='passwd']")
	private WebElement pass;
	
	@FindBy(xpath = "//p[@class='submit']//child::button[@type='submit']")
	private WebElement submit;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	

}
