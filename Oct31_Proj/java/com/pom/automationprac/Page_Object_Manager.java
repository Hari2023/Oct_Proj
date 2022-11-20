package com.pom.automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {

	public WebDriver driver;

	private Login_Page login;

	private My_Store_Home mystore;

	private Dress dress;

	private Dress causal;

	private Evening_Dress evendress;

	private Summer_Dress summerdress;

	private Quantity_Select qtyselec;

	private Summer_Dressquantity summerqty;

	private Summary_Page summpage;

	private Address_Page addpage;

	private Shipp_Page shipping;

	private Payment_Page pay;

	private Confirm_Order confmorder;

	private Back_Order back;

	private Logout_Page logout;

	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getLogin() {
		if (login == null) {

			login = new Login_Page(driver);

		}
		return login;
	}

	public My_Store_Home getMystore() {
		if (mystore == null) {

			mystore = new My_Store_Home(driver);

		}
		return mystore;
	}
	
	public Dress getDress() {
		if (dress == null) {

			dress = new Dress(driver);

		}
		return dress;
	}

	public Dress getCausal() {
		if (causal == null) {

			causal = new Dress(driver);

		}
		return causal;
	}

	public Evening_Dress getEvendress() {
		if (evendress == null) {

			evendress = new Evening_Dress(driver);

		}
		return evendress;
	}

	public Summer_Dress getSummerdress() {
		
		if (summerdress == null) {

			summerdress = new Summer_Dress(driver);

		}
		return summerdress;
	}

	public Quantity_Select getQtyselec() {
		if (qtyselec == null) {

			qtyselec = new Quantity_Select(driver);

		}
		return qtyselec;
	}

	public Summer_Dressquantity getSummerqty() {
		if (summerqty == null) {

			summerqty = new Summer_Dressquantity(driver);

		}
		return summerqty;
	}

	public Summary_Page getSummpage() {
		if (summpage == null) {

			summpage = new Summary_Page(driver);

		}
		return summpage;
	}

	public Address_Page getAddpage() {
		if (addpage == null) {

			addpage = new Address_Page(driver);

		}
		return addpage;
	}

	public Shipp_Page getShipping() {
		if (shipping == null) {

			shipping = new Shipp_Page(driver);

		}
		return shipping;
	}

	public Payment_Page getPay() {
		if (pay == null) {

			pay = new Payment_Page(driver);

		}
		return pay;
	}

	public Confirm_Order getConfmorder() {
		if (confmorder == null) {

			confmorder = new Confirm_Order(driver);

		}
		return confmorder;
	}

	public Back_Order getBack() {
		if (back == null) {

			back = new Back_Order(driver);

		}
		return back;
	}

	public Logout_Page getLogout() {
		if (logout == null) {

			logout = new Logout_Page(driver);

		}
		return logout;
	}

}
