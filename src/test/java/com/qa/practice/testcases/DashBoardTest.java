package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase2;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.LoginPage;

public class DashBoardTest extends TestBase2 {

	DashBoard db;
	LoginPage lp;
 
	@BeforeMethod
    public void setup() throws IOException {
	driver_int();
	lp=new LoginPage();
	db= lp.doLogin(pro.getProperty("username"), pro.getProperty("password"));
	db= new DashBoard();
}
	
	@Test
	public void dashBoardWalletTest() {
		//db.dashBoardWallet();
		Assert.assertTrue(db.dashBoardWallet());
	}
	
	
@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
	
	
	
}
