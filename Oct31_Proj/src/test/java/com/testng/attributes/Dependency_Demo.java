package com.testng.attributes;

import org.testng.annotations.Test;

public class Dependency_Demo {
	
	@Test
	private void laptop() {
		System.out.println("Dell laptop");
		System.out.println(10/0);

	}
	
	@Test
	private void earphone() {
		System.out.println("Boat earphone");

	}
	
	@Test( dependsOnMethods = "laptop", alwaysRun = true)
	private void amazonkit() {

		System.out.println("Laptop Kit");
	}

}
