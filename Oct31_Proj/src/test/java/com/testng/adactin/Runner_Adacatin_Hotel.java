package com.testng.adactin;

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

	public static WebDriver driver;

	public static Page_Object_Manager manager;

	@Test(priority = -1)
	private void browser() {
		driver = browser_Configure("chrome");
		manager = new Page_Object_Manager(driver);
	}

	@Test(priority = 0, dependsOnMethods = "browser")
	private void url_Launch() {

		window_Commands("maximize");

		get_Url("https://adactinhotelapp.com/index.php");

		implicity_Wait(10);

	}

	@Test(priority = 1, dependsOnMethods = "url_Launch")
	private void login() {

		send_Keys(manager.getHp().getUsername(), "Haribaskar1234");

		send_Keys(manager.getHp().getPassword(), "3x@HgypsH76zHb");

		click_On_Element(manager.getHp().getLogin());

	}

	// search Hotel

	@Test(priority = 2, dependsOnMethods = "login")
	private void search_Hotel() {
		select_By_Value(manager.getSearch().getLocate(), "New York");

		select_By_Value(manager.getSearch().getHotel(), "Hotel Sunshine");

		select_By_Value(manager.getSearch().getRoom_Type(), "Super Deluxe");

		select_Visible_Text(manager.getSearch().getNoof_Room(), "2 - Two");

		clear(manager.getSearch().getCheck_In());

		send_Keys(manager.getSearch().getCheck_In(), "08/11/2022");

		clear(manager.getSearch().getCheck_Out());

		send_Keys(manager.getSearch().getCheck_Out(), "11/11/2022");

		select_By_Value(manager.getSearch().getAdult(), "2");

		select_By_Value(manager.getSearch().getChild_Room(), "0");

		click_On_Element(manager.getSearch().getSubmit());

	}

	// --select hotel
	@Test(priority = 3, dependsOnMethods = "search_Hotel")
	private void select_Hotel() {

		click_On_Element(manager.getSelect().getRadio_Btn());

		click_On_Element(manager.getSelect().getContin());
	}

	// Book Hotel
	@Test(priority = 4, dependsOnMethods = "select_Hotel")
	private void book_Hotel() {
		send_Keys(manager.getBook().getFirstnam(), "NANDHU");

		send_Keys(manager.getBook().getLastnam(), "G");

		send_Keys(manager.getBook().getAddress(), "TRICHY");

		send_Keys(manager.getBook().getCcnum(), "1234567891234567");

		select_By_Value(manager.getBook().getCctype(), "VISA");

		select_By_Value(manager.getBook().getCcexp(), "10");

		select_By_Value(manager.getBook().getExpyear(), "2022");

		send_Keys(manager.getBook().getCcvnum(), "123");

		click_On_Element(manager.getBook().getBooking());

	}

	// confirm

	@Test(priority = 5, dependsOnMethods = "book_Hotel")
	private void confirm() {
		click_On_Element(manager.getConfirm().getIternity());

	}

	// ---Order List

	@Test(priority = 6, dependsOnMethods = "confirm")
	private void order() {
		click_On_Element(manager.getOrder().getCheckall());

		screen_Shot(manager.getOrder().getCheckall());

		click_On_Element(manager.getOrder().getCancel());

	}

//		
//		Alert s = driver.switchTo().alert();
//		s.accept();
}
