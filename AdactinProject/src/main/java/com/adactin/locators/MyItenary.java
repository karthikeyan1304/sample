package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseclass.BaseClass;

public class MyItenary extends BaseClass{
		@FindBy (xpath = "(//input[@class='disable_text'])[14]")
		private WebElement scroll;
		public WebElement getScroll() {
			return scroll;
		}
		 @FindBy (id = "my_itinerary")
		 private WebElement check;
		 public WebElement getCheck() {
			return check;
		}
		 
		 @FindBy (id = "check_all")
		 private WebElement select;
		 public WebElement getSelect() {
			return select;
		}
		 @FindBy (xpath = "(//input[@type='submit'])[2]")
		 private WebElement ac1;
		 public WebElement getAc1() {
			return ac1;
		}
		 public MyItenary (WebDriver driver) {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
			 
		 }
	}


