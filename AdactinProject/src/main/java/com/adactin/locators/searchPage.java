package com.adactin.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBaseclass.BaseClass;

public class searchPage extends BaseClass{
	
	
		 @FindBy (id = "location")
		 private WebElement loc;
		 @FindBy (id = "hotels")
		 private WebElement hotel;
		 @FindBy (id = "room_type")
		 private WebElement room;
		 @FindBy (id = "room_nos")
		 private WebElement type;
		 @FindBy (xpath = "//input[@name='datepick_in']")
		 private WebElement dat_in;
		 @FindBy (id = "datepick_out")
		 private WebElement dateout;
		 @FindBy (id = "adult_room")
		 private WebElement adult;
		 @FindBy (id = "child_room")
		 private WebElement child;
		 @FindBy (id = "Submit")
		 private WebElement sub;
		 @FindBy (id = "radiobutton_0")
		 private WebElement button;
		 @FindBy (id = "continue")
		 private WebElement conti;
		 
		 public WebElement getLoc() {
			return loc;
		}
		 public WebElement gethotel() {
			return hotel;
		}
		 public WebElement getRoom() {
			return room;
		}
		 public WebElement getType() {
			return type;
		}
		 public WebElement getDat_in() {
			return dat_in;
		}
		 public WebElement getDateout() {
			return dateout;
		}
		 public WebElement getAdult() {
			return adult;
		}
		 public WebElement getChild() {
			return child;
		}
		 public WebElement getSub() {
			return sub;
		}
		 public WebElement getButton() {
			return button;
		}
		 public WebElement getConti() {
			return conti;
		}
		 
		 public searchPage(WebDriver driver) {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
			
		}
	

}
