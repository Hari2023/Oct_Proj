package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_Order {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']")
	private WebElement back;

	public Back_Order(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBack() {
		return back;
	}
	
	

}
