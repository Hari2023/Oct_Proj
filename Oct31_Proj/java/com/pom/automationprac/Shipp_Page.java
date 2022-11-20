package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipp_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='checker']//child::input[@type='checkbox']")
	private WebElement check;
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//ancestor::button[@name='processCarrier']")
	private WebElement carrier;

	public Shipp_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Shipping page");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getCarrier() {
		return carrier;
	}
	

}
