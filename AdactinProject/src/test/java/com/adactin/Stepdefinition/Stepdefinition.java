package com.adactin.Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.AdactinBaseclass.BaseClass;
import com.propertyfile.Configurationhelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjectmanager.Singletondesignpattern;

public class Stepdefinition extends BaseClass{
	
	Singletondesignpattern w= new Singletondesignpattern(driver);
	
	@Given("user launch chrome browser with adactin url")
	public void user_launch_chrome_browser_with_adactin_url() throws Throwable {
		String geturl = Configurationhelper.configurationinstaneCR().geturl();
		launchUrl(geturl);
		implicityWait();
		
	}
	
	
	@Given("user enter valid user name")
	public void user_enter_valid_user_name() throws Throwable {
		String getusername = Configurationhelper.configurationinstaneCR().getusername();
        userInput(w.Loginpage().getUsername(), getusername);
	}
	
	@Given("user enter valid password")
	public void user_enter_valid_password() throws Throwable {
		String getpassword = Configurationhelper.configurationinstaneCR().getpassword();
		 userInput(w.Loginpage().getPassword(), getpassword);
	}
	
	
	@Then("click loginbutton to login")
	public void click_loginbutton_to_login() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		clickonElement(w.Loginpage().getLoginbtn());
		implicityWait();
	}
	@Given("User select the location")
	public void user_select_the_location() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		selectCase(w.Searchpage().getLoc(), "text", "Sydney");

	}
	@Given("User Select Hotel name")
	public void user_select_hotel_name() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		 selectCase(w.Searchpage().gethotel(), "index", "3");

	}
	@Given("User select Hotel Type")
	public void user_select_hotel_type() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		selectCase(w.Searchpage().getRoom(), "index", "2");

	}
	@Given("User select Room type")
	public void user_select_room_type() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		selectCase(w.Searchpage().getType(), "index", "2");
	}
	@Given("User select check in date and check out date")
	public void user_select_check_in_date_and_check_out_date() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		clearElement(w.Searchpage().getDat_in());
		 userInput(w.Searchpage().getDat_in(), "17/07/2022");
		 scrollIntoView(w.Searchpage().getDat_in());
		 clearElement(w.Searchpage().getDateout());
		 userInput(w.Searchpage().getDateout(), "20/07/2022");
	}
	
	@Given("User select number of person in the in hotel room")
	public void user_select_number_of_person_in_the_in_hotel_room() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		selectCase(w.Searchpage().getAdult(), "text", "2 - Two");
		 selectCase(w.Searchpage().getChild(), "text", "0 - None");
	}
	@Given("User Click Search page")
	public void user_click_search_page() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		clickonElement(w.Searchpage().getSub());
	}
	@Given("Check click check buuton and click continue")
	public void check_click_check_buuton_and_click_continue() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		clickonElement(w.Searchpage().getButton());
		 clickonElement(w.Searchpage().getConti());
	}
	
	@Given("User give their name and Address details to Book hotel")
	public void user_give_their_name_and_address_details_to_book_hotel() throws InterruptedException {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		userInput(w.Booknow().getFirstname(), "Karthi");
		 userInput(w.Booknow().getLast(), "keyan");
		 userInput(w.Booknow().getAdd(), "no,2 venkiroad ch 99");
		 userInput(w.Booknow().getCcnum(), "1234567890986543");
		 selectCase(w.Booknow().getNum(), "text", "VISA");
		 selectCase(w.Booknow().getMonth(), "text", "February");
		 selectCase(w.Booknow().getYr(), "text", "2013");
		 userInput(w.Booknow().getCvno(), "123");
		 clickonElement(w.Booknow().getBook());
		 sleep();
	}
	
	@Given("user Scroll the window and click My Itenary Button")
	public void user_scroll_the_window_and_click_my_itenary_button() {
		
		scrollIntoView(w.Myitenary().getScroll());
		 clickonElement(w.Myitenary().getCheck());
		 clickonElement(w.Myitenary().getSelect());
	}
	@Given("click check In Box")
	public void click_check_in_box() {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		 clickonElement(w.Myitenary().getAc1());
		 
	}
	@Given("user Click Alert Box")
	public void user_click_alert_box() throws IOException {
		alertAcept();
	}
	@Given("User click Logout Button")
	public void user_click_logout_button() throws IOException {
		Singletondesignpattern w= new Singletondesignpattern(driver);
		clickonElement(w.logout().getAc2());
		 TakesScreenshot();
	}

}
