package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Dress {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Dresses']//following::a[text()='Dresses']")
	private WebElement dress_Summer;
	
	@FindBy(xpath = "//a[@title='Summer Dresses']//following::a[.='Summer Dresses']")
	private WebElement summerdress;

	public Summer_Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Summer class");
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDress_Summer() {
		return dress_Summer;
	}

	public WebElement getSummerdress() {
		return summerdress;
	}

}
