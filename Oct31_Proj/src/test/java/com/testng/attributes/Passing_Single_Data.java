package com.testng.attributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Passing_Single_Data {

	@Parameters({"email" ,"pass"})
	@Test
	private void login(String Username, String Password) {

		System.out.println("Username: " + Username);
		System.out.println("Password: " + Password);

	}

	@Parameters({"first","last"})
	@Test
	private void sureNames(String firstName, String lastName) {

		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);

	}
	
	
	
	
	
	
	

}
