package com.pom.automation.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Acc {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio' and @id='id_gender1']")
	private WebElement gender;
	
	@FindBy(xpath ="//input[@type='text' and @name='customer_firstname']")
	private WebElement firstnam;
	
	@FindBy(xpath = "//input[@type='text' and @name='customer_lastname']")
	private WebElement lastnam;
	
	@FindBy(xpath ="//div[@class='required password form-group']//child::input")
	private WebElement pass;
	
	@FindBy(xpath ="//div[@class='selector']//child::select[@name='days']")
	private WebElement days;
	
	@FindBy(xpath ="//div[@id='uniform-months']//child::select[@name='months']")
	private WebElement month;
	
	@FindBy(xpath ="//div[@id='uniform-years']//child::select[@name='years']")
	private WebElement year;
	
	@FindBy(xpath = "//div[@class='account_creation']//child::input[@name='company']")
	private WebElement companyname;
	
	@FindBy(xpath ="//div[@class='account_creation']//child::input[@name='address1' and @id='address1']")
	private WebElement address;
	
	@FindBy(xpath = "//div[@class='account_creation']//child::input[@name='address2' and @id='address2']")
	private WebElement address2;
	
	
	@FindBy(xpath ="//div[@class='account_creation']//child::input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath ="//div[@class='selector']//child::select[@name='id_state' ]")
	private WebElement statenam;
	
	@FindBy(xpath = "//p[@class='required postcode form-group']//child::input[@name='postcode' and @type='text']")
	private WebElement postcod;
	
	@FindBy(xpath = "//div[@id='uniform-id_country']//child::select[@name='id_country']")
	private WebElement country;
	
	@FindBy(xpath = "//p[@class='textarea form-group']//child::textarea[@name='other']")
	private WebElement addname;
	
	
	@FindBy(xpath = "//p[@class='form-group']//child::input[@name='phone']")
	private WebElement homephone;
	
	@FindBy(xpath = "//p[@class='required form-group']//child::input[@type='text' and @name='phone_mobile']")
	private WebElement personalnum;
	
	@FindBy(xpath = "//p[@id='address_alias']//child::input[@type='text']")
	private WebElement futureadd;
	
	@FindBy(xpath = "//div[@class='submit clearfix']//child::button[@id='submitAccount']")
	private WebElement submitbtn;

	public Create_Acc(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstnam() {
		return firstnam;
	}

	public WebElement getLastnam() {
		return lastnam;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getStatenam() {
		return statenam;
	}

	public WebElement getPostcod() {
		return postcod;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAddname() {
		return addname;
	}

	public WebElement getHomephone() {
		return homephone;
	}

	public WebElement getPersonalnum() {
		return personalnum;
	}

	public WebElement getFutureadd() {
		return futureadd;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
