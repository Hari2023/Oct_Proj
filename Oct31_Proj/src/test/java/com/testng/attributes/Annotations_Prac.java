package com.testng.attributes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Prac {

	@BeforeSuite

	private void set_Property() {
		System.out.println("Set Property");
	}

	@AfterSuite
	private void delete_cookies() {
		System.out.println("Delete cookies and session close");
	}

	@BeforeTest
	private void session_Created() {
		System.out.println("Session Create");
	}

	@AfterTest

	private void session_Close() {
		System.out.println("Session End");
	}

	@BeforeClass
	private void browser_Launch() {
		System.out.println("Successfully Browser Launch");
	}

	@AfterClass
	private void move_Homepage() {
		System.out.println("In Home Page");
	}

	@Test
	private void Causal_Dress() {

		System.out.println("Print Causal Dress");
	}

	@Test
	private void evening_Dress() {

		System.out.println("Evening Dress");

	}

	@BeforeMethod
	private void login() {
		System.out.println("Login Page");

	}

	@AfterMethod
	private void logout() {
		System.out.println("Logout Page");
	}

}
