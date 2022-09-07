package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase2;

public class BookingPage extends TestBase2 {

@FindBy(xpath="(//ul[@class='sidebar-menu list-items']/li)[2]")
                                                              //(xpath="//li[@class='page-active']")	
WebElement myBooking;
	
WebDriverWait wait =new WebDriverWait(driver, 5);

public BookingPage() {
	PageFactory.initElements(driver, this);
}	
	
	
public boolean dashmyBooking	() {
	wait.until(ExpectedConditions.visibilityOf(myBooking));
	return myBooking.isDisplayed();
}
	
	
	
}
