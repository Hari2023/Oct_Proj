package com.Readerdata;

import java.io.IOException;

public class File_Reader {

	private File_Reader() {
	}

	public static File_Reader getInstanceFR() {

		File_Reader fr = new File_Reader();

		return fr;

	}
	
	public  TestData_Reader getInstanceTD() throws IOException {

		TestData_Reader td = new TestData_Reader();
		return td;
		
		
	}

}
