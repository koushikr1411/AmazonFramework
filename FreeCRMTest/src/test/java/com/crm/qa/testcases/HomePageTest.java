package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be seperated -- independent with each other
	//before ech test cases -- launch the browser and login
	//@test -- each test case
	//and after each test cases -- close the browser

	@BeforeMethod
	
	@Test(priority = 1,enabled = true)
	public void setup() {
		//caling initialization method
		initialization();
		loginPage = new LoginPage();
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=2,enabled = true)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Title not found");
		//Assert.assertEquals(homePageTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Home Page Title not matched");
		//this msg will be print then when the test case is got failed
	}
	
	@Test(priority=2,enabled = true)
	public void  loginTest() {
		loginPage.doLogin();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}

	
	/*
	@AfterMethod
	private void teardown() {
		// TODO Auto-generated method stub
		driver.quit();}
	*/
	

}
