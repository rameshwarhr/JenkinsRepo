package Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.constant;

public class BrowserFactory {

	public static WebDriver driver;

	@Parameters("Browser")
	@BeforeMethod()
	public void launchBrowser(String brwoserName) {
		
		if (brwoserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (brwoserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (brwoserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

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
