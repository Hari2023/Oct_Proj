package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {

public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='bankwire']//parent::p[@class='payment_module']")
	private WebElement pay;
	
	@FindBy(xpath = "//p[@class='payment_module']//child::a[@class='cheque']")
	private WebElement cheque;



	public Payment_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Payment page");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPay() {
		return pay;
	}
	

	public WebElement getCheque() {
		return cheque;
	}

	

}
