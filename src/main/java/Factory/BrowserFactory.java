package Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import Pages.HomePage;
import utility.constant;

public class BrowserFactory {

	public static WebDriver driver;

	@BeforeMethod()
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", constant.chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}

	@AfterMethod()
	public void LogOutTheUser() throws InterruptedException {

		Thread.sleep(500);
		driver.quit();
	}



}
