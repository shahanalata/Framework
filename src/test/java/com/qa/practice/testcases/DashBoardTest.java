package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase2;
import com.qa.practice.pages.AddFundPage;
import com.qa.practice.pages.BookingPage;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.LogOutPage;
import com.qa.practice.pages.LoginPage;
import com.qa.practice.pages.MyProfilePage;

public class DashBoardTest extends TestBase2 {

	DashBoard db;
	LoginPage lp;
	BookingPage bp;
	MyProfilePage mp;
	 AddFundPage ap;
	 LogOutPage lo;
 
	@BeforeMethod
    public void setup() throws IOException {
	driver_int();
	lp=new LoginPage();
	db= lp.doLogin(pro.getProperty("username"), pro.getProperty("password"));
	db= new DashBoard();
    bp= new BookingPage();
    mp=new MyProfilePage();
    ap= new  AddFundPage();
    lo= new LogOutPage();		
}
	
	/*@Test
	public void dashBoardWalletTest() {
		Assert.assertTrue(db.dashBoardWallet());
	}*/
	@Test
	public void dashMyProfileTest() {
	Assert.assertTrue(mp.dashMyProfile());	
	}
	
@Test
	public void dashFundTest() {
		Assert.assertTrue(ap.dasgAddFund());
	}
	@Test
	public void dashMyBookingTest() {
Assert.assertTrue(bp.dashmyBooking());
	}
	@Test
	public void LogOutButtonTest() {
		Assert.assertTrue(lo.dasgLogOut());
	}
@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
	
	
	
}
