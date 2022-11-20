package com.testng.attributes;

import org.testng.annotations.Test;

public class Enabled_Demo {

	@Test
	private void laptop() {
		System.out.println("Dell laptop");

	}

	@Test
	private void earphone() {
		System.out.println("Boat earphone");

	}
	
	@Test(groups =   "Social Media")
	private void instagram() {

		System.out.println("Instagram");
	}
	
	@Test(groups =  "Social Media")
	private void twitter() {

		System.out.println("Twitter");
	}

}
