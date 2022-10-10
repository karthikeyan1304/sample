package com.adactin.AdactinProject;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.AdactinBaseclass.BaseClass;
import com.adactin.locators.Booknow;
import com.adactin.locators.MyItenary;
import com.adactin.locators.loginPage;
import com.adactin.locators.logoutpage;
import com.adactin.locators.searchPage;
import com.propertyfile.Configurationhelper;
import com.propertyfile.Configurationreader;

import pageobjectmanager.Singletondesignpattern;

public class AdactinProject extends BaseClass{
	
	
    static WebDriver driver;	
	//public static void main(String[] args) throws Throwable {
		
	
    @Test
	public void TC101() throws Throwable {
		String getbrowser = Configurationhelper.configurationinstaneCR().getbrowser();
		driver = browserLaunch(getbrowser);
		String geturl = Configurationhelper.configurationinstaneCR().geturl();
		launchUrl(geturl);
		sleep();
		Singletondesignpattern w=	new Singletondesignpattern(driver);
		
		//Login
		String getusername = Configurationhelper.configurationinstaneCR().getusername();
         userInput(w.Loginpage().getUsername(), getusername);
        String getpassword = Configurationhelper.configurationinstaneCR().getpassword();
		 userInput(w.Loginpage().getPassword(), getpassword);
		 clickonElement(w.Loginpage().getLoginbtn());
		implicityWait();
		
		//searchpage
		 selectCase(w.Searchpage().getLoc(), "text", "Sydney");
		// TakesScreenshot();
		 selectCase(w.Searchpage().gethotel(), "index", "3");
		 selectCase(w.Searchpage().getRoom(), "index", "2");
		 selectCase(w.Searchpage().getType(), "index", "2");
		 clearElement(w.Searchpage().getDat_in());
		 userInput(w.Searchpage().getDat_in(), "17/07/2022");
		 scrollIntoView(w.Searchpage().getDat_in());
		// JavascriptExecutor ex = (JavascriptExecutor) driver;
		    //ex.executeScript("arguments[0].value='"+ "27/06/2022" +"';", dat_in);
		 clearElement(w.Searchpage().getDateout());
		 userInput(w.Searchpage().getDateout(), "20/07/2022");
		 selectCase(w.Searchpage().getAdult(), "text", "2 - Two");
		 selectCase(w.Searchpage().getChild(), "text", "0 - None");
		 clickonElement(w.Searchpage().getSub());
		 clickonElement(w.Searchpage().getButton());
		 clickonElement(w.Searchpage().getConti());
		 
		 //Booknow
		 
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
		 
		 //myIternary
		 scrollIntoView(w.Myitenary().getScroll());
		 clickonElement(w.Myitenary().getCheck());
		 clickonElement(w.Myitenary().getSelect());
		 clickonElement(w.Myitenary().getAc1());
		 alertAcept();
		 
		 
		 //Logout
		 clickonElement(w.logout().getAc2());
		 TakesScreenshot();

	}
	

	}

//}
