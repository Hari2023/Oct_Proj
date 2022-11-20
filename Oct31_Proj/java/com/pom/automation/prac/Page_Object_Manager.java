package com.pom.automation.prac;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public WebDriver driver;

	private Sign_Page sign;

	private Login_Page loginpage;

	private Create_Acc create;

	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {

		return driver;
	}

	public Sign_Page getSignin() {
		if (sign == null) {
			sign = new Sign_Page(driver);

		}
		
		return sign;
	}

	public Login_Page getLoginpage() {
		if (loginpage == null) {
			loginpage = new Login_Page(driver);

		}
		return loginpage;
	}

	public Create_Acc getCreate() {
		if (create == null) {
			create = new Create_Acc(driver);

		}
		return create;
	}

}
