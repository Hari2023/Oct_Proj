package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Summary_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Summary Page");
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	
	

}
