package com.pom.automation.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Page {
    
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']//parent::div")
	private WebElement sign;

	public Sign_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	    System.out.println("Im in Signin Page");
	}

	public WebElement getSign() {
		return sign;
	}

}
