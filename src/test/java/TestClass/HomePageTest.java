package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends BrowserFactory {
	 HomePage homepage;
	LoginPage loginpage;
	
	@Test
	public void checkBackPackIsAvailiable() {
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		
		loginpage.sendUserName("standard_user");
		loginpage.sendPassword("secret_sauce");
		loginpage.clickOnSubmitButton();
		Assert.assertEquals(homepage.getBackPackText(), "Sauce Labs Backpack");
		homepage.clickOnMenuButton();
		homepage.clickOnLogOutButton();
	}

}
