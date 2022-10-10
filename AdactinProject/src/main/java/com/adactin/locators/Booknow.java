package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseclass.BaseClass;

public class Booknow extends BaseClass {
	
		@FindBy (id = "first_name")
		private WebElement firstname;
		public WebElement getFirstname() {
			return firstname;
		}
		 @FindBy (id = "last_name")
		 private WebElement last;
		 public WebElement getLast() {
			return last;
		}
		 @FindBy (id ="address")
		 private WebElement add;
		 public WebElement getAdd() {
			return add;
		}
		 @FindBy (id = "cc_num")
		 private WebElement ccnum;
		 public WebElement getCcnum() {
			return ccnum;
		}
		 @FindBy (id = "cc_type")
		 private WebElement num;
		 public WebElement getNum() {
			return num;
		}
		 @FindBy (id = "cc_exp_month")
		 private WebElement month;
		 public WebElement getMonth() {
			return month;
		}
		 
		 @FindBy (id = "cc_exp_year")
		 private WebElement yr;
		 public WebElement getYr() {
			return yr;
		}
		 @FindBy (id = "cc_cvv")
		 private WebElement cvno;
		 public WebElement getCvno() {
			return cvno;
		}
		 @FindBy (id = "book_now")
		 private WebElement book;
		 public WebElement getBook() {
			return book;
		}
		 public Booknow (WebDriver driver) {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
			 
		 }

	

}
