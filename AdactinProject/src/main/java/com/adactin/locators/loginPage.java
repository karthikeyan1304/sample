package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseclass.BaseClass;

public class loginPage extends BaseClass{
	
		@FindBy (id = "username")
		private WebElement username;
		public WebElement getUsername() {
			return username;
		}
		@FindBy (id = "password")
		private WebElement password;
		@FindBy (id ="login")
		private WebElement loginbtn;
		
		
		
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLoginbtn() {
			return loginbtn;
		}
		public loginPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
		

}
