package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase2;

public class AddFundPage extends TestBase2{
	                                              //li[@class='user_wallet ']
	@FindBy(xpath="(//ul[@class='sidebar-menu list-items']/li)[3]")
	WebElement addFund;

	WebDriverWait wait =new WebDriverWait(driver, 5);

	public AddFundPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean dasgAddFund() {
		wait.until(ExpectedConditions.visibilityOf(addFund));
		return addFund.isDisplayed();
	}	

}
