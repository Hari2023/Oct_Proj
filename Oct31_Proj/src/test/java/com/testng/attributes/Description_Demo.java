package com.testng.attributes;

import org.testng.annotations.Test;

public class Description_Demo {
	
	@Test(priority = 0, description = "Higher Studies")
	private void hsc() {
      System.out.println("HSC");
	}
	
	@Test(priority = 1, description = "Post Graduate")
	private void master_Degree() {

		System.out.println("Master Degree");
	}

	
	@Test(priority = -1, description = "Under Graduate")
	private void ug() {
		System.out.println("UG");
	}
	
	
	
}
