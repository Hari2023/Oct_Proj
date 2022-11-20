package com.testng.attributes;

import org.testng.annotations.Test;

public class Priority_Demo {
	
	@Test(priority = 0)
	private void hsc() {
      System.out.println("HSC");
	}
	
	@Test(priority = -1)
	private void sslc() {

		System.out.println("SSLC");
	}
	
	
	@Test(priority = 1)
	private void ug() {

		System.out.println("UG");
	}
	
	@Test(priority = 2)
	private void pg() {

		System.out.println("PG");
	}

}
