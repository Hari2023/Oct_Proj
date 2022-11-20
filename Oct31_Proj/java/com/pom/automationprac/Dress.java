package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress {
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Dresses']//following::a[text()='Dresses']")
	private WebElement move_dress;



	@FindBy(xpath = "//a[@title='Casual Dresses']//following::a[.='Casual Dresses']")
	private WebElement causal;

	public Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMove_dress() {
		return move_dress;
	}


	public WebElement getCausal() {
		return causal;
	}
	

}
