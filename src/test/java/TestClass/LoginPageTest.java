package TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.dataProvider;
import Factory.BrowserFactory;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends BrowserFactory {
	LoginPage loginpage;
	HomePage homepage;

	

	@Test(dataProvider = "logindata", dataProviderClass = dataProvider.class)
	public void loginTest(String user, String pass) throws InterruptedException {
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		loginpage.sendUserName(user);
		loginpage.sendPassword(pass);
		loginpage.clickOnSubmitButton();
		String expectedtitle = "Swag Labs";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);

		homepage.clickOnMenuButton();
		Thread.sleep(1000);
		homepage.clickOnLogOutButton();
	
	}

}
