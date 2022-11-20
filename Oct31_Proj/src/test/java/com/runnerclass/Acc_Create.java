package com.runnerclass;

import java.time.Duration;

import org.Oct31_Proj.Utility_Files;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Acc_Create extends Utility_Files {

	public static void main(String[] args) {

		driver = browser_Configure("chrome");

		window_Commands("maximize");

		get_Url("http://automationpractice.com/index.php");

		implicity_Wait(10);

		WebElement sign = driver.findElement(By.xpath("//a[@class='login']//parent::div"));
		click_On_Element(sign);

		WebElement email = driver.findElement(By.xpath("//input[@type='text' and @name='email_create' ]"));
		send_Keys(email, "hariba@gmail.com");

		WebElement create = driver.findElement(By.xpath("//button[@type='submit' and @name='SubmitCreate']"));
		click_On_Element(create);

		WebElement rdo_Btn = driver.findElement(By.xpath("//input[@type='radio' and @id='id_gender1']"));
		click_On_Element(rdo_Btn);

		WebElement firstname = driver.findElement(By.xpath("//input[@type='text' and @name='customer_firstname']"));
		send_Keys(firstname, "HariBaskar");

		WebElement lastname = driver.findElement(By.xpath("//input[@type='text' and @name='customer_lastname']"));
		send_Keys(lastname, "G");

		WebElement pass = driver.findElement(By.xpath("//div[@class='required password form-group']//child::input"));
		send_Keys(pass, "Hari2023"); // Hari23@#

		WebElement days = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='days']"));

		WebElement month = driver.findElement(By.xpath("//div[@id='uniform-months']//child::select[@name='months']"));

		WebElement year = driver.findElement(By.xpath("//div[@id='uniform-years']//child::select[@name='years']"));

		select_By_Value(days, "19");

		select_By_Value(month, "10");

		select_By_Value(year, "2022");

		WebElement company = driver
				.findElement(By.xpath("//div[@class='account_creation']//child::input[@name='company']"));

		send_Keys(company, "Wipro");

		WebElement address = driver.findElement(
				By.xpath("//div[@class='account_creation']//child::input[@name='address1' and @id='address1']"));

		send_Keys(address, "OMR");

		WebElement add2 = driver.findElement(
				By.xpath("//div[@class='account_creation']//child::input[@name='address2' and @id='address2']"));
		send_Keys(add2, "Chennai,Tamil Nadu");

		WebElement city = driver.findElement(By.xpath("//div[@class='account_creation']//child::input[@name='city']"));

		send_Keys(city, "Chennai");

		WebElement state = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='id_state' ]"));
		select_By_Value(state, "31");

		WebElement postcod = driver.findElement(By
				.xpath("//p[@class='required postcode form-group']//child::input[@name='postcode' and @type='text']"));

		send_Keys(postcod, "12345");

		WebElement united = driver
				.findElement(By.xpath("//div[@id='uniform-id_country']//child::select[@name='id_country']"));

		select_By_Value(united, "21");

		WebElement additional = driver
				.findElement(By.xpath("//p[@class='textarea form-group']//child::textarea[@name='other']"));

		send_Keys(additional, "Purchase");

		WebElement home = driver.findElement(By.xpath("//p[@class='form-group']//child::input[@name='phone']"));

		send_Keys(home, "7502530951");

		WebElement personal = driver.findElement(
				By.xpath("//p[@class='required form-group']//child::input[@type='text' and @name='phone_mobile']"));

		send_Keys(personal, "6379724477");

		WebElement future_Add = driver.findElement(By.xpath("//p[@id='address_alias']//child::input[@type='text']"));

		send_Keys(future_Add, "Trichy");

		WebElement register = driver
				.findElement(By.xpath("//div[@class='submit clearfix']//child::button[@id='submitAccount']"));

		click_On_Element(register);

	}

}
