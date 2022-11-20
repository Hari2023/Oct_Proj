package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Dresses']//following::a[text()='Dresses']")
	private WebElement dress_Evening;
	
	
	@FindBy(xpath = "//a[@title='Evening Dresses']//following::a[.='Evening Dresses']")
	private WebElement eveningdress;


	public Evening_Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Evening Dress");
	}


	public WebElement getDress_Evening() {
		return dress_Evening;
	}


	public WebElement getEveningdress() {
		return eveningdress;
	}
	
	
	
	
	
	
	
	
	
	
	

}
