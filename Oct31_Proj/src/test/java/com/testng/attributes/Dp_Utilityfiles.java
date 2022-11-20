package com.testng.attributes;

import org.testng.annotations.DataProvider;

public class Dp_Utilityfiles {

	@DataProvider
	private String[][] user_Name() {

		String[][] values = { { "Hari", "5014" },

				{ "Bharath", "5015" },

				{ "Ram", "5042" }

		};
		return values;
	}

	@DataProvider
	private String[][] off_Add() {

		String[][] add = {

				{ "add1", "Chennai" },

				

		};

		return add;
	}

}
