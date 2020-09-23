package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		//caling initialization method
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1,enabled = true)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		/*
		 * Assert.assertEquals(title,
		 * "CRMPRO  - CRM software for customer relationship management, sales, and support."
		 * );
		 */
	}
	@Test(priority=2,enabled = true)
	public void crmLogoImagetEST() {
		boolean flag = loginPage.validateCrmImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3,enabled = true)
	public void  loginTest() {
		loginPage.doLogin();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	//@AfterMethod
	public void  tearDown() {
		driver.quit();
	}

}
