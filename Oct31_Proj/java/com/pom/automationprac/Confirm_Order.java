package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//p[@id='cart_navigation']//child::button[@type='submit']")
	private WebElement confirm;


	public Confirm_Order(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Confirm Page");
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getConfirm() {
		return confirm;
	}
	
	

}
