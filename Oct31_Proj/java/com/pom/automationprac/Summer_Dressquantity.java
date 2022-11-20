package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Dressquantity {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='product-image-container']//child::a[@title='Printed Chiffon Dress']")
	private WebElement summerqty;
	
	@FindBy(xpath = "//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']")
	private WebElement iframe;
	
	@FindBy(xpath="//div[@class='selector']//child::select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//a[@title='Yellow']//ancestor::ul[@id='color_to_pick_list']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']")
	private WebElement addcart;
	
	@FindBy(xpath = "//div[@class='button-container']//child::a[@title='Proceed to checkout']")
	private WebElement proced;

	public Summer_Dressquantity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im in Summer qty page");
	}

	public WebElement getSummerqty() {
		return summerqty;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getProced() {
		return proced;
	}
	
	
	
	
	
	
	

}
