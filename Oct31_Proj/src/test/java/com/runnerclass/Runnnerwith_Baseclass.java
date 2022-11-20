package com.runnerclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.Oct31_Proj.Utility_Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Runnnerwith_Baseclass extends Utility_Files {

	//public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browser_Configure("chrome");
		//driver =browser("chrome");

		get_Url("http://automationpractice.com/index.php");

		window_Commands("maximize");

		implicity_Wait(10);

		WebElement sign = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a"));
		click_On_Element(sign);

		WebElement email = driver
				.findElement(By.xpath("//div[@class='form-group']//child::input[@name='email' and @id='email']"));
		send_Keys(email, "haribasn@gmail.com");

		WebElement passwd = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@name='passwd']"));
		send_Keys(passwd, "Hari2023");

		WebElement signin = driver.findElement(By.xpath("//p[@class='submit']//child::button[@type='submit']"));
		click_On_Element(signin);

		WebElement dress = driver.findElement(By.xpath("//a[@title='Dresses']//following::a[text()='Dresses']"));
		move_To_Element(dress);

		WebElement run = driver.findElement(By.xpath("//a[@title='Casual Dresses']//following::a[.='Casual Dresses']"));
		click_fun(run);

		WebElement quic = driver
				.findElement(By.xpath("//div[@class='product-image-container']//child::a[@title='Printed Dress']"));
		move_To_Element(quic);
		click_fun(quic);

		sleep(3000);

		WebElement iframe = driver
				.findElement(By.xpath("//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']"));
		frame(iframe);

		WebElement qty = driver.findElement(By.xpath("//a[@data-field-qty='qty']//child::i[@class='icon-plus']"));
		for (int i = 1; i <= 3; i++) {
			qty.click();

		}
		WebElement size = driver.findElement(By.xpath("//div[@id='uniform-group_1']//child::select[@name='group_1']"));
		select_By_Value(size, "3");

		WebElement cart = driver
				.findElement(By.xpath("//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']"));
		click_On_Element(cart);

		frame_Defau(cart);

		WebElement proceed = driver
				.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		click_On_Element(proceed);

		WebElement proceed2 = driver.findElement(
				By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		click_On_Element(proceed2);

		WebElement proceed3 = driver
				.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']"));
		click_On_Element(proceed3);

		WebElement check = driver.findElement(By.xpath("//div[@class='checker']//child::input[@type='checkbox']"));
		click_On_Element(check);

		WebElement carrier = driver.findElement(
				By.xpath("//p[@class='cart_navigation clearfix']//ancestor::button[@name='processCarrier']"));
		click_On_Element(carrier);

		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']//parent::p[@class='payment_module']"));
		click_On_Element(pay);

		WebElement confirm = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']"));

		java_Script(confirm);

		// confirm.click();

		sleep(5000);

		screen_Shot(confirm);

		WebElement orders = driver
				.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));

		java_Script(orders);

		sleep(3000);

		screen_Shot(orders);

		sleep(4000);

		WebElement dress2 = driver.findElement(By.xpath("//a[@title='Dresses']//following::a[text()='Dresses']"));
		move_To_Element(dress2);

		WebElement even_Dress = driver
				.findElement(By.xpath("//a[@title='Evening Dresses']//following::a[.='Evening Dresses']"));
		click_fun(even_Dress);

		WebElement quick2 = driver
				.findElement(By.xpath("//div[@class='product-image-container']//child::a[@title='Printed Dress']"));
		move_To_Element(quick2);
		click_fun(quick2);

		WebElement iframe2 = driver
				.findElement(By.xpath("//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']"));
		frame(iframe2);

		WebElement qty2 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			click_On_Element(qty2);
		}

		WebElement size2 = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='group_1']"));
		select_By_Value(size2, "2");

		get_Text(size2);

		WebElement color = driver.findElement(By.xpath("//a[@title='Pink']//ancestor::ul[@id='color_to_pick_list']"));
		click_On_Element(color);

		WebElement cart2 = driver
				.findElement(By.xpath("//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']"));
		click_On_Element(cart2);

		frame_Defau(cart2);

		WebElement pro1 = driver
				.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		click_On_Element(pro1);

		WebElement pro2 = driver.findElement(
				By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		click_On_Element(pro2);

		WebElement pro3 = driver
				.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']"));
		click_On_Element(pro3);

		WebElement checkbox = driver.findElement(By.xpath("//p[@class='checkbox']//child::input[@type='checkbox']"));
		click_On_Element(checkbox);

		WebElement pro4 = driver
				.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		click_On_Element(pro4);

		WebElement cheque = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='cheque']"));
		click_On_Element(cheque);

		WebElement confm = driver.findElement(By.xpath("//p[@id='cart_navigation']//button[@type='submit']"));
		click_On_Element(confm);

		screen_Shot(confm);

		WebElement order1 = driver
				.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));

		java_Script(order1);

		sleep(3000);

		screen_Shot(order1);

		sleep(4000);

		WebElement dress3 = driver.findElement(By.xpath("//a[@title='Dresses']//following::a[text()='Dresses']"));
		move_To_Element(dress3);

		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
		click_fun(summer);

		WebElement quic3 = driver.findElement(
				By.xpath("//div[@class='product-image-container']//child::a[@title='Printed Chiffon Dress']"));
		move_To_Element(quic3);
		click_fun(quic3);

		WebElement iframe3 = driver
				.findElement(By.xpath("//div[@class='fancybox-inner']//child::iframe[@class='fancybox-iframe']"));
		frame(iframe3);

		WebElement qty3 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::i[@class='icon-plus']"));
		for (int i = 0; i <= 2; i++) {
			click_On_Element(qty3);
		}
		WebElement size3 = driver.findElement(By.xpath("//div[@class='selector']//child::select[@name='group_1']"));
		select_By_Value(size3, "3");

		WebElement color2 = driver
				.findElement(By.xpath("//a[@title='Yellow']//ancestor::ul[@id='color_to_pick_list']"));
		click_On_Element(color2);

		WebElement cart3 = driver
				.findElement(By.xpath("//button[@name='Submit']//parent::p[@class='buttons_bottom_block no-print']"));
		click_On_Element(cart3);

		WebElement proc1 = driver
				.findElement(By.xpath("//div[@class='button-container']//child::a[@title='Proceed to checkout']"));
		click_On_Element(proc1);

		WebElement proc2 = driver.findElement(
				By.xpath("//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']"));
		click_On_Element(proc2);

		WebElement proc3 = driver
				.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processAddress']"));
		click_On_Element(proc3);

		WebElement chck = driver.findElement(By.xpath("//p[@class='checkbox']//child::input[@type='checkbox']"));
		click_On_Element(chck);

		WebElement process = driver
				.findElement(By.xpath("//p[@class='cart_navigation clearfix']//child::button[@name='processCarrier']"));
		click_On_Element(process);

		WebElement pay2 = driver.findElement(By.xpath("//a[@class='bankwire']//parent::p[@class='payment_module']"));
		click_On_Element(pay2);

		WebElement confm3 = driver.findElement(By.xpath("//p[@id='cart_navigation']//child::button[@type='submit']"));
		click_On_Element(confm3);

		screen_Shot(confm3);

		WebElement order3 = driver
				.findElement(By.xpath("//p[@class='cart_navigation exclusive']//child::a[@title='Back to orders']"));

		java_Script(order3);

		sleep(3000);

		screen_Shot(order3);

		WebElement logout = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a[@class='logout']"));
		click_On_Element(logout);

	}

}
