package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseclass.BaseClass;

public class logoutpage extends BaseClass{
		@FindBy (id = "logout")
		private WebElement ac2;
		public WebElement getAc2() {
			return ac2;
		}
		public logoutpage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
	}
