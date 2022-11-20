package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity_Select {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='product-image-container']//child::a[@title='Printed Dress']")
	private WebElement printeddress;

	@FindBy(xpath = "//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']")
	private WebElement frame;

	@FindBy(xpath = "//div[@id='uniform-group_1']//child::select[@name='group_1']")
	private WebElement size;

	@FindBy(xpath = "//a[@title='Pink']//ancestor::ul[@id='color_to_pick_list']")
	private WebElement color;

	@FindBy(xpath = "//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']")
	private WebElement cart;

	@FindBy(xpath = "//div[@class='button-container']//child::a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Quantity_Select(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getPrinteddress() {
		return printeddress;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
