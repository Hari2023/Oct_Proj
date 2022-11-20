package com.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Runner {

	@Test
	private void username() {

		String expected_Name = "Hari";

		String actual_Name = "Hari";

		Assert.assertEquals(actual_Name, expected_Name);
		
		System.out.println("UserName Passed");
	}
	
	@Test(priority = 1)
	private void user_Id() {

		
	String excepted_Password = "Hari2017";
	
	String actual_Pass = "Baskar2022";
	
	Assert.assertEquals(actual_Pass, excepted_Password);
	
	System.out.println("User Id");
	
	
	
	}
	
	
	
	
	
	}

