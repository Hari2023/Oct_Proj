package com.runnerclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;



import org.Oct31_Proj.Utility_Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Adacatin_Hotel extends Utility_Files {
	//public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		driver = browser_Configure("chrome");
		
		window_Commands("maximize");
		
		get_Url("https://adactinhotelapp.com/index.php");
		
		implicity_Wait(10);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		send_Keys(username, "Haribaskar1234");
		
		
		WebElement passwd = driver.findElement(By.xpath("//input[@name='password']"));
		send_Keys(passwd, "3x@HgypsH76zHb");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		click_On_Element(login);
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		select_By_Value(location, "New York");	
		
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		select_By_Value(hotels, "Hotel Sunshine");
		
		WebElement room_Type = driver.findElement(By.xpath("//select[@name='room_type']"));
		select_By_Value(room_Type, "Super Deluxe");	
		
		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		select_Visible_Text(noOfRooms, "2 - Two");	
		
		WebElement checkIn = driver.findElement(By.xpath("//input[@type='text' and @id='datepick_in']"));
		clear(checkIn);
		send_Keys(checkIn, "01/11/2022");
		
		WebElement checkOut = driver.findElement(By.xpath("//input[@type='text' and @name='datepick_out']"));
		clear(checkOut);
		send_Keys(checkOut, "02/11/2022");
		
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		select_By_Value(adult, "2");
		
		WebElement childRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f = new Select(childRoom);
		f.selectByValue("0");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		click_On_Element(search);
		
		WebElement radio_Btn = driver.findElement(By.xpath("//input[@type='radio']"));
		click_On_Element(radio_Btn);
		
		WebElement move = driver.findElement(By.xpath("//input[@name='continue']"));
		click_On_Element(move);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name' and @class='reg_input']"));
		send_Keys(firstname, "NANDHU");
		
		WebElement lastnam = driver.findElement(By.xpath("//input[@name='last_name']"));
		send_Keys(lastnam, "G");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		send_Keys(address, "TRICHY");
		
		WebElement cardnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		send_Keys(cardnum, "1234567891234567");
		
		WebElement creditcard = driver.findElement(By.xpath("//select[@name='cc_type']"));
		select_By_Value(creditcard, "VISA");
		get_Text(creditcard);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		select_By_Value(month, "10");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		select_By_Value(year, "2022");	
		
		WebElement ccvNum = driver.findElement(By.xpath("//input[@name='cc_cvv' and @type='text' ]"));
		send_Keys(ccvNum, "123");
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		click_On_Element(book);
		
		WebElement iternity = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		click_On_Element(iternity);
		
		WebElement check_All = driver.findElement(By.xpath("//input[@name='check_all']"));
		click_On_Element(check_All);
		
         screen_Shot( check_All);
		
		WebElement cancel_All = driver.findElement(By.xpath("//input[@name='cancelall']"));
		click_On_Element(cancel_All);
		
		
		
//		
//		Alert s = driver.switchTo().alert();
//		s.accept();
	}

}
