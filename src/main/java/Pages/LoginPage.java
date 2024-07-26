package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement passWord;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	private WebElement loginButton;
	
	
	public void sendUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void  sendPassword(String password) {
		passWord.sendKeys(password);
	}
	
	public void clickOnSubmitButton() {
		loginButton.click();
	}
	
	
	

}
