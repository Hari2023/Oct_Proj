package com.testng.attributes;

import org.testng.annotations.Test;

public class Dependencys_Demo {
	@Test
	private void apple_Macbook() {

		System.out.println("Apple Macbook");

	}

	@Test
	private void vivo_Phone() {
		System.out.println("Vivo Y15");
	}

	@Test(dependsOnMethods = "Vivo Y15")
	private void flipkart_Kit() {
		System.out.println("Mobile Kit Offer");
	}

}
