package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase2;

public class LogOutPage extends TestBase2{

@FindBy(xpath="(//ul[@class='sidebar-menu list-items']/li)[5]")	
WebElement logOutButton;
	
WebDriverWait wait =new WebDriverWait(driver, 5);

public LogOutPage() {
	PageFactory.initElements(driver, this);
}
public boolean dasgLogOut	() {
	wait.until(ExpectedConditions.visibilityOf(logOutButton));
	return logOutButton.isDisplayed();
}	
	
	
	
}
