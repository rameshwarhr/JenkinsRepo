package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
	private WebElement menuButton;

	@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
	private WebElement logoutButton;

	@FindBy(xpath = "//button[text()='Add to cart']//ancestor::div[@class='inventory_item']//div/a[@id='item_4_title_link']")
	private WebElement BackPack; // 

	public void clickOnMenuButton() {
		menuButton.click();
	}

	public void clickOnLogOutButton() {
		logoutButton.click();
	}

	public String getBackPackText() {
		return BackPack.getText();
	}

}
