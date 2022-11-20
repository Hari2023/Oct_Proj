package com.Readerdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestData_Reader {

	public static Properties p;

	public TestData_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\Oct31_Proj\\src\\main\\java\\com\\properties\\TestData.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String getUsername() {

		String username = p.getProperty("Username");
        return username;
	}
	
	public String getPassword() {
				
		String password = p.getProperty("Password");
	    return password;
	
	}
	
	public String getLocation() {
		
		String location = p.getProperty("Location");
		return location;

	}
	
	public String getHotel() {
   
		   String hotel = p.getProperty("Hotel");
		   return hotel;
		   
	}
	
	public String getRoomtype() {
		
		String roomtype = p.getProperty("Room_Type");
		return roomtype;

	}
	
	public String getNoofRoom() {
		
		String totalroom = p.getProperty("NoofRoom");
		return totalroom;

	}
	
	public String getCheckin() {
		String checkin = p.getProperty("CheckIn");
		
		return checkin;

	}
	
	
	public String getCheckout() {
		String checkout = p.getProperty("CheckOut");
         return checkout;
	}
	
	public String getCvvnum() {
      
		 String cvvnum = p.getProperty("CVVNum");
		 return cvvnum;
	}
	
	

}
