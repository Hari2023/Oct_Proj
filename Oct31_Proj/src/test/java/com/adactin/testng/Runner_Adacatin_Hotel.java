package com.adactin.testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.Oct31_Proj.Utility_Files;
import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Readerdata.File_Reader;
import com.pom.adadactinprac.Book_Hotel;
import com.pom.adadactinprac.Home_Page;
import com.pom.adadactinprac.Hotel_Confirm;
import com.pom.adadactinprac.Order_List;
import com.pom.adadactinprac.Page_Object_Manager;
import com.pom.adadactinprac.Search_Hotel;
import com.pom.adadactinprac.Select_Hotel;

public class Runner_Adacatin_Hotel extends Utility_Files {

	public static WebDriver driver = browser_Configure("chrome");

	public static Page_Object_Manager manager =  new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {

	

			
			
		

		window_Commands("maximize");

		get_Url("https://adactinhotelapp.com/index.php");

		implicity_Wait(10);


	
	
	
		
		String username = File_Reader.getInstanceFR().getInstanceTD().getUsername();

		send_Keys(manager.getHp().getUsername(),username );

		String password = File_Reader.getInstanceFR().getInstanceTD().getPassword();

		send_Keys(manager.getHp().getPassword(), password);

		click_On_Element(manager.getHp().getLogin());

		// search Hotel

		String location = File_Reader.getInstanceFR().getInstanceTD().getLocation();

		select_By_Value(manager.getSearch().getLocate(), location);

		String hotel = File_Reader.getInstanceFR().getInstanceTD().getHotel();

		select_By_Value(manager.getSearch().getHotel(), hotel);

		
		String roomtype = File_Reader.getInstanceFR().getInstanceTD().getRoomtype();

		select_By_Value(manager.getSearch().getRoom_Type(), roomtype);

		String noofRoom = File_Reader.getInstanceFR().getInstanceTD().getNoofRoom();

		select_Visible_Text(manager.getSearch().getNoof_Room(), noofRoom);

		clear(manager.getSearch().getCheck_In());

		String checkin = File_Reader.getInstanceFR().getInstanceTD().getCheckin();

		send_Keys(manager.getSearch().getCheck_In(), checkin);

		clear(manager.getSearch().getCheck_Out());

		String checkout = File_Reader.getInstanceFR().getInstanceTD().getCheckout();

		send_Keys(manager.getSearch().getCheck_Out(), checkout);

		select_By_Value(manager.getSearch().getAdult(), "2");

		select_By_Value(manager.getSearch().getChild_Room(), "0");

		click_On_Element(manager.getSearch().getSubmit());

		// --select hotel

		click_On_Element(manager.getSelect().getRadio_Btn());

		click_On_Element(manager.getSelect().getContin());

		// Book Hotel
		send_Keys(manager.getBook().getFirstnam(), "NANDHU");

		send_Keys(manager.getBook().getLastnam(), "G");

		send_Keys(manager.getBook().getAddress(), "TRICHY");

		send_Keys(manager.getBook().getCcnum(), "1234567891234567");

		select_By_Value(manager.getBook().getCctype(), "VISA");

		select_By_Value(manager.getBook().getCcexp(), "10");

		select_By_Value(manager.getBook().getExpyear(), "2022");

		String cvvnum = File_Reader.getInstanceFR().getInstanceTD().getCvvnum();

		send_Keys(manager.getBook().getCcvnum(), cvvnum);

		click_On_Element(manager.getBook().getBooking());

		// confirm

		click_On_Element(manager.getConfirm().getIternity());

		// ---Order List
		click_On_Element(manager.getOrder().getCheckall());

		screen_Shot(manager.getOrder().getCheckall());

		click_On_Element(manager.getOrder().getCancel());

		
//		Alert s = driver.switchTo().alert();
//		s.accept();
	}
