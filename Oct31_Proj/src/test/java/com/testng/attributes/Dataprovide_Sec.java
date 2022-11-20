package com.testng.attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovide_Sec {
	
	
	@DataProvider
	private String[][] employee_Data() {

		String[][] values = { { "Hari", "5014" },

				{ "Bharath", "5015" },

				{ "Ram", "5042" }

		};
		return values;
	}

	
	//@Test(dataProvider = "employee_Data" , dataProviderClass = Dataprovider_Prac.class)
	private void login(String name, String userid) {
		System.out.println("User name:" + name);
		System.out.println("User ID: " + userid);

	}

	
	
	
	
	
	
	
	
	
	
	
	

}
