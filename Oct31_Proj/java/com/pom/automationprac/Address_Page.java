package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']")
	private WebElement address;

	public Address_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in address page");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddress() {
		return address;
	}
	

}
