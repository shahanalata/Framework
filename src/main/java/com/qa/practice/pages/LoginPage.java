package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.base.TestBase2;

public class LoginPage  extends TestBase2{
	//or==object repository class --only create locator in this page
		//page object model create by 2 way    //page factory way(@FindBy)& by locator-another way
		
		@FindBy(xpath="//input[@name='email']")
		WebElement userName;
		                                             ////input[@type='email'])[1]
		@FindBy(xpath="//input[@type='password']")
		WebElement passWord;
		
		@FindBy(xpath="(//button[@type='submit'])[1]")
		WebElement loginButton;
		
		@FindBy(xpath="(//img[@alt='logo'])[1]")
		WebElement logo;
		
		@FindBy(xpath="(//*[contains(@class,'icon-box icon')])[2]")
		WebElement securePayment;
				//div[@class='icon-box icon-layout-2 d-flex bg-light'])[1]

		
	public LoginPage() {      //create contractor method for initialize
		PageFactory.initElements(driver,this); //initialize arguments //this refers to local class instanses/object
	}
		
		public  DashBoard doLogin(String username, String password) {
			userName.clear();
			userName.sendKeys("user@phptravels.com");
			passWord.clear();
			passWord.sendKeys("demouser");
			loginButton.click();
			return new DashBoard();
		}
		
		public boolean phpLogo(){
		return logo.isDisplayed();//return true /false
	}
	public boolean securePayment() {
		return securePayment.isDisplayed();
	}
	
}
