package qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import testEvents.HomePageEvents;
import util.ElementFetch;

public class nopTest extends BaseTest {
	
	ElementFetch ele = new ElementFetch();
	HomePageEvents homepage= new HomePageEvents();
	
  @Test(priority = 1, groups = "smoke")
  public void verifyPgTitle() {
	  
	  homepage.pgTitle();
  }
  
  @Test(priority = 2, groups = "smoke")
	public void verifyLogoDisplayed() {
		homepage.logoTest();
	}

	@Test(priority = 3, groups = "smoke")
	public void verifySearchFunctionality() {
		homepage.SearchFunctionality();
	}

	@Test(priority = 4, groups = "smoke")
	public void verifyLoginPageAccessible() {
		
		homepage.verifyLoginPageAcc();
	}

	@Test(priority = 5, groups = "smoke")
	public void verifyRegistrationPageAccessible() {
		
		homepage.RegistrationPageAccess();
	}

	@Test(priority = 13, groups = "smoke")
	public void verifyProductCategoriesDisplayed() {

		WebElement productCategories = driver.findElement(By.cssSelector(".product-categories"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,150)");
		Assert.assertTrue(productCategories.isDisplayed(), "Product categories not displayed");
	}

	@Test(priority = 7, groups = "smoke")
	public void verifyProductDetailsPageDisplayed() {
		driver.findElement(By.linkText("Build your own computer")).click();
		String expectedTitle = "Build your own computer";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Incorrect product details page title");
	}

	@Test(priority = 8, groups = "smoke")
	public void verifyShoppingCartFunctionality() {
		driver.findElement(By.linkText("Shopping cart")).click();
		String expectedUrl = "https://demo.nopcommerce.com/cart";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Incorrect shopping cart page URL");
	}

	@Test(priority = 9, groups = "smoke")
	public void verifyCheckoutProcess() {
		// Test logic to verify checkout process
	}

	@Test(priority = 10, groups = "smoke")
	public void verifyLogoutFunctionality() {
		driver.findElement(By.linkText("Log out")).click();
		String expectedUrl = "https://demo.nopcommerce.com/logout";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Incorrect logout page URL");
	}

}
