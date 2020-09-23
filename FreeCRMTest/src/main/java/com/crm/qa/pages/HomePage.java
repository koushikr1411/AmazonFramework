package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[contains(text(),'Hello, koushikr')]")
	WebElement userNamelabel;
	
	@FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
	WebElement bestSellersLink;
	
	@FindBy(xpath = "//a[contains(text(),'Pantry')]")
	WebElement pantryLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Releases')]")
	WebElement newReleaseLink;
	
	@FindBy(xpath = "//a[contains(text(),'Buy Again')]")
	WebElement buyAgainLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		// this-pointing to the current class object
	}
	
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		//return title of the homepage in Sring
	}
	
	public boolean verifyCorrectUserName() {
		return userNamelabel.isDisplayed();
		
	}
	
	public BestSellersPage clickOnBestSellerLink() {
		bestSellersLink.click();
		//it will click on best seller link after clicking it will return on best seller page link
		//next landing page is best seller page.
		//it will return page object
		return new BestSellersPage();
	}
	
	public PantryPage clickOnPantryLink() {
		pantryLink.click();
		//it will click on best seller link after clicking it will return on best seller page link
		//next landing page is best seller page.
		//it will return page object
		return new PantryPage();
	}
	
	public NewReleasePage clickOnNewReleaseLink() {
		newReleaseLink.click();
		//it will click on best seller link after clicking it will return on best seller page link
		//next landing page is best seller page.
		//it will return page object
		return new NewReleasePage();
	}
	
	public BuyAgainPage clickOnBuyAgainPageLink() {
		buyAgainLink.click();
		//it will click on best seller link after clicking it will return on best seller page link
		//next landing page is best seller page.
		//it will return page object
		return new BuyAgainPage();
	}
	
	
	

}
