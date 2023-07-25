package testEvents;

import org.testng.Assert;
import testObjects.HomePageElements;
import util.ElementFetch;

public class HomePageEvents {

	ElementFetch ele = new ElementFetch();

	public void pgTitle() {

		Assert.assertFalse(ele.getWebElement("XPATH", HomePageElements.pageTitle).isDisplayed(),
				"Page Title Not Matched");
	}
	
	public void logoTest() {
		
		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.logo).isDisplayed());
	}
	
	public void SearchFunctionality() {
		
		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.searchbox).isDisplayed(), "Searchbox Not Present");		
	}
	
	public void verifyLoginPageAcc() {
		
		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.loginIcon).isDisplayed());
		
		ele.getWebElement("XPATH", HomePageElements.loginIcon).click();
		
		Assert.assertTrue(ele.getWebElement("XPATH", HomePageElements.loginWelcome).isDisplayed());
		
	}
	
	public void RegistrationPageAccess() {
		
		Assert.assertTrue(ele.getWebElement("LINKTEXT", "Register").isDisplayed());
		
		ele.getWebElement("LINKTEXT", "Register").click();
		
		Assert.assertTrue(ele.getWebElement("XPATH", "//strong[contains(text(),'Your Personal Details')]").isDisplayed());
		
	}
	
	
}
