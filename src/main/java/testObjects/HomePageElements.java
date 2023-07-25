package testObjects;

public interface HomePageElements {
	
	String pageTitle = "//title[contains(text(),'nopCommerce demo store')]";
	
	String logo ="//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]";
	
	String searchbox = "//input[@id='small-searchterms']";
	
	String loginIcon = "//a[contains(text(),'Log in')]";
	
	String loginWelcome = "//h1[contains(text(),'Welcome, Please Sign In!')]";
	
	String RegIcon ="Register";
	
	String RegWelcome = "//strong[contains(text(),'Your Personal Details')]";
	

}
