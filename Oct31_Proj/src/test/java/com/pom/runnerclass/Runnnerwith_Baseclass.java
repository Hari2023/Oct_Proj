package com.pom.runnerclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.Oct31_Proj.Utility_Files;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pom.adadactinprac.Home_Page;
import com.pom.automationprac.Address_Page;
import com.pom.automationprac.Back_Order;
import com.pom.automationprac.Confirm_Order;
import com.pom.automationprac.Dress;
import com.pom.automationprac.Evening_Dress;
import com.pom.automationprac.Login_Page;
import com.pom.automationprac.Logout_Page;
import com.pom.automationprac.My_Store_Home;
import com.pom.automationprac.Page_Object_Manager;
import com.pom.automationprac.Payment_Page;
import com.pom.automationprac.Quantity_Select;
import com.pom.automationprac.Shipp_Page;
import com.pom.automationprac.Summary_Page;
import com.pom.automationprac.Summer_Dress;
import com.pom.automationprac.Summer_Dressquantity;

public class Runnnerwith_Baseclass extends Utility_Files {

	public static WebDriver driver = browser_Configure("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static Logger log = Logger.getLogger(Runnnerwith_Baseclass.class);

	public static void main(String[] args) throws InterruptedException, IOException {

		PropertyConfigurator.configure("log4j.properties");

		get_Url("http://automationpractice.com/index.php");

		window_Commands("maximize");

		implicity_Wait(10);

		log.info("------->Session Created<-------------------");
		// --Home Page

		log.info("---->Home Page Open<-----");
		click_On_Element(manager.getMystore().getSignin());

		// ---- Login
     log.info("---->Login Page Open<---");
     
     
		send_Keys(manager.getLogin().getEmail(), "haribasn@gmail.com");

		send_Keys(manager.getLogin().getPass(), "Hari2023");

		click_On_Element(manager.getLogin().getSubmit());

		// Dress Selection
    log.info("--->Dress Selections<----");
		move_To_Element(manager.getDress().getMove_dress());

		click_fun(manager.getDress().getCausal());

		// ---Dress Quantity

		move_To_Element(manager.getQtyselec().getPrinteddress());

		click_fun(manager.getQtyselec().getPrinteddress());

		sleep(3000);

		frame(manager.getQtyselec().getFrame());

		WebElement qty = driver.findElement(By.xpath("//a[@data-field-qty='qty']//child::i[@class='icon-plus']"));
		for (int i = 1; i <= 3; i++) {
			qty.click();

		}

		select_By_Value(manager.getQtyselec().getSize(), "3");

		click_On_Element(manager.getQtyselec().getCart());

		frame_Defau(manager.getQtyselec().getCart());

		click_On_Element(manager.getQtyselec().getProceed());

		// ---summary page

		click_On_Element(manager.getSummpage().getProceed());

		// address page

		click_On_Element(manager.getAddpage().getAddress());

		// Shipping

		click_On_Element(manager.getShipping().getCheck());
		click_On_Element(manager.getShipping().getCarrier());

		// payment
		click_On_Element(manager.getPay().getPay());

		// --confirm

		java_Script(manager.getConfmorder().getConfirm());

		sleep(5000);

		screen_Shot(manager.getConfmorder().getConfirm());

		// back order

		java_Script(manager.getBack().getBack());

		sleep(3000);

		screen_Shot(manager.getBack().getBack());

		sleep(4000);
		// dress2

		move_To_Element(manager.getEvendress().getDress_Evening());

		click_fun(manager.getEvendress().getEveningdress());

		move_To_Element(manager.getQtyselec().getPrinteddress());

		click_fun(manager.getQtyselec().getPrinteddress());

		frame(manager.getQtyselec().getFrame());

		WebElement qty2 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			click_On_Element(qty2);
		}

		select_By_Value(manager.getQtyselec().getSize(), "2");

		get_Text(manager.getQtyselec().getSize());

		click_On_Element(manager.getQtyselec().getColor());

		click_On_Element(manager.getQtyselec().getCart());

		frame_Defau(manager.getQtyselec().getCart());

		click_On_Element(manager.getQtyselec().getProceed());

		// summary page

		click_On_Element(manager.getSummpage().getProceed());

		click_On_Element(manager.getAddpage().getAddress());

// ship 
		click_On_Element(manager.getShipping().getCheck());
		click_On_Element(manager.getShipping().getCarrier());

//pay
		click_On_Element(manager.getPay().getCheque());

		// confm

		click_On_Element(manager.getConfmorder().getConfirm());

		screen_Shot(manager.getConfmorder().getConfirm());

		java_Script(manager.getBack().getBack());

		sleep(3000);

		screen_Shot(manager.getBack().getBack());

		sleep(4000);

		// dress 3

		move_To_Element(manager.getSummerdress().getDress_Summer());

		click_fun(manager.getSummerdress().getSummerdress());

		move_To_Element(manager.getSummerqty().getSummerqty());

		click_fun(manager.getSummerqty().getSummerqty());

		frame(manager.getSummerqty().getIframe());

		WebElement qty3 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			click_On_Element(qty3);
		}

		select_By_Value(manager.getSummerqty().getSize(), "3");

		click_On_Element(manager.getSummerqty().getColor());
		click_On_Element(manager.getSummerqty().getAddcart());

		frame_Defau(manager.getSummerqty().getAddcart());

		click_On_Element(manager.getSummerqty().getProced());

//summary page

		click_On_Element(manager.getSummpage().getProceed());

		// Address
		click_On_Element(manager.getAddpage().getAddress());

		// shipping
		click_On_Element(manager.getShipping().getCheck());

		click_On_Element(manager.getShipping().getCarrier());

		// Pay
		click_On_Element(manager.getPay().getPay());

		// Confirm

		click_On_Element(manager.getConfmorder().getConfirm());

		screen_Shot(manager.getConfmorder().getConfirm());

		// Back order

		java_Script(manager.getBack().getBack());

		sleep(3000);

		screen_Shot(manager.getBack().getBack());

		// Logout

		click_On_Element(manager.getLogout().getLogout());
log.info("---Logout Page----");
log.info("---Session Closed----");
	}

}
