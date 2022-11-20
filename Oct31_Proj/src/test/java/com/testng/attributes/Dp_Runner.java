package com.testng.attributes;

import org.testng.annotations.Test;

public class Dp_Runner {

	@Test(priority = -1, dataProvider = "user_Name", dataProviderClass = Dp_Utilityfiles.class)
	private void user_Login(String name, String userid) {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee id: " + userid);

	}

	@Test(dependsOnMethods = "user_Login", dataProvider = "off_Add", dataProviderClass = Dp_Utilityfiles.class)
	private void off_Address(String address, String location) {

		System.out.println("Address:"+address);

		System.out.println("Place: "+location);

	}

}
