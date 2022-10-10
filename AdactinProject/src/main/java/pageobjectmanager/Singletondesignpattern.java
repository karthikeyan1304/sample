package pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.locators.Booknow;
import com.adactin.locators.MyItenary;
import com.adactin.locators.loginPage;
import com.adactin.locators.logoutpage;
import com.adactin.locators.searchPage;

public class Singletondesignpattern {
	
	public static WebDriver driver;
	public Singletondesignpattern(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public loginPage Loginpage() {
		loginPage l = new loginPage(driver);
		return l;
	}
	
	public searchPage Searchpage() {
		searchPage s = new searchPage(driver);
		return s;

	}
	public Booknow Booknow() {
		Booknow b = new Booknow(driver);
		return b;

	}
	public MyItenary Myitenary() {
		MyItenary m = new MyItenary(driver);
		return m;

	}
	public logoutpage logout() {
		logoutpage log = new logoutpage(driver);
		return log;

	}
	
	
	
	
	
	
	
	

}
