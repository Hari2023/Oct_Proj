package com.testng.attributes;

import org.testng.annotations.Test;

public class Expected_Exception_Demo {

	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		int a = 10;
		System.out.println(a / 2);
	}

}
