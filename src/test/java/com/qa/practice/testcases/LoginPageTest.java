package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase2;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.LoginPage;

public class LoginPageTest extends TestBase2{

	LoginPage lp;
	DashBoard db;  //initialize globally for all test can use from there
	
	                        //in seperate page use in seperate testcase
	
	
@BeforeMethod	
	public void setup() throws IOException {
	driver_int() ;
	lp = new  LoginPage ();
	db= new DashBoard ();
}
	@Test
	public void validLoginAfterTest() {
		db= lp.doLogin(pro.getProperty("username"),pro.getProperty("password") );
		//Thread.sleep(3000);
		Assert.assertTrue(db.userNameAfterLogin());

	}
	

	@Test	
	public void phpLogoTest() {
	// LoginPage lp = new  LoginPage ();
	 Assert.assertTrue(lp.phpLogo());
	// lp.phpLogo();
}
	
	@Test
	public void paymentLogoTest() {
		Assert.assertTrue(lp.securePayment());
	}
/*@Test
	public void loginTest() {
	lp.doLogin("user@phptravels.com","demouser");
	
	}*/
	
	

	//	db=lp.doLogin(pro.getProperty("username"),pro.getProperty("password"));
		//DashBoard db= new DashBoard ();
	//Assert.assertTrue(db.userNameAfterLogin());
	
	
@AfterMethod
public void TearDown() throws InterruptedException {

	driver.quit();
}
	
	
	
}
