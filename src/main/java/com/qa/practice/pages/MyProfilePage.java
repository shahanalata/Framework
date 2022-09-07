package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase2;

public class MyProfilePage extends TestBase2{
	
	@FindBy(xpath="(//ul[@class='sidebar-menu list-items']/li)[4]")
	WebElement myProfile;
	
	
	WebDriverWait wait =new WebDriverWait(driver, 8);

	public  MyProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean dashMyProfile() {
		wait.until(ExpectedConditions.visibilityOf(myProfile));
		return myProfile.isDisplayed();
	}

}
