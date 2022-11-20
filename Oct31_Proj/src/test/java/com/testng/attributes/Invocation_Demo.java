package com.testng.attributes;

import org.testng.annotations.Test;

public class Invocation_Demo {
	
	@Test(priority = -2)
	private void session_Created() {
       System.out.println("Session Created");
		
	}
	
	@Test(priority = -1,invocationCount = 2)
	private void refresh() {

		System.out.println("Refresh the page");
		
		
	}
	
	@Test(priority = 0)
	private void login() {
    
		System.out.println("Open the login Page");
	}
	

}
