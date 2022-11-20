package com.pom.adadactinprac;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;

	private Search_Hotel search;

	private Select_Hotel select;

	private Book_Hotel book;

	private Hotel_Confirm confirm;

	private Order_List order;

	public Page_Object_Manager(WebDriver driver) {

		this.driver = driver;

	}

	public Home_Page getHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}

		return hp;
	}

	public Search_Hotel getSearch() {

		if (search == null) {
			search = new Search_Hotel(driver);
		}

		return search;
	}

	public Select_Hotel getSelect() {

		if (select == null) {
			select = new Select_Hotel(driver);
		}
		return select;
	}

	public Book_Hotel getBook() {

		if (book == null) {
			book = new Book_Hotel(driver);
		}

		return book;
	}

	public Hotel_Confirm getConfirm() {

		if (confirm == null) {
			confirm = new Hotel_Confirm(driver);
		}

		return confirm;
	}

	public Order_List getOrder() {
		if (order == null) {
			order = new Order_List(driver);
		}

		return order;
	}

}
