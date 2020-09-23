package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	// Page FActory - Object repository we have to used

	// @FindBy(xpath="//a[@id='nav-link-accountList']")
	/*
	 * @FindBy(xpath = ("//*[@class='nav-a nav-a-2'])[1]")) public static WebElement
	 * Signinbuitton;
	 */
	
	  @FindBy(xpath="//span[@class='nav-action-inner']") 
	  public static List<WebElement> Signin;
	  // //a[@class='a-button-text']
	 
	public void doLogin() {
		/*
		 * WebElement button = new WebDriverWait(driver,
		 * 25).until(ExpectedConditions.elementToBeClickable(LoginPage.getWebElement()))
		 * ; button.click(); // new
		 * Actions(driver).moveToElement(Signinbuitton).perform();
		 * driver.findElement(By.xpath("(//*[@class='nav-action-inner'])[1]")).click();
		 */
	}

	/*
	 * public static List<WebElement> getWebElement() { return Signin; }
	 */	
	
	@FindBy(xpath = "//input[@type='email']")
	public static WebElement username;

	@FindBy(xpath = "//input[@id='continue']")
	public static WebElement submit;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	public static WebElement submit1;

	
	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement crmLogo;

	// initializing these the Page objects
	// Login page constructor created.
	public LoginPage() {
		PageFactory.initElements(driver, this);
		// this-pointing to the current class object
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCrmImage() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		
		for(int i=0;i<Signin.size();i++) {
		Signin.get(1).click();
		}
		username.sendKeys(un);
		submit.click();
		password.sendKeys(pwd);
		submit1.click();

		// returning homepage class object
		return new HomePage();
		// After this writing testcases for homepage

	}

}
