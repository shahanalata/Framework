package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase2;

public class DashBoard extends TestBase2{
	
	
@FindBy(xpath="//span[text()='Welcome Back']")	
     WebElement  userNameLogo;

@FindBy(xpath="//p[text()='Wallet Balance']")
     WebElement wallet;

WebDriverWait wait =new WebDriverWait(driver, 5);

public DashBoard() {
	PageFactory.initElements(driver, this);
}
	
	public boolean userNameAfterLogin() {
		wait.until(ExpectedConditions.visibilityOf(userNameLogo));
		return userNameLogo.isDisplayed();
	}
	public boolean dashBoardWallet() {
		wait.until(ExpectedConditions.visibilityOf(wallet));
		return wallet.isDisplayed();
	}
	  
}
