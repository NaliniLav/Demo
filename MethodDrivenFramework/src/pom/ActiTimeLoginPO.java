package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class ActiTimeLoginPO extends BasePage{
	public ActiTimeLoginPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="username")
	private WebElement username;
	public WebElement username() {
		return username;
	}
	@FindBy(name="pwd")
	private WebElement password;
	public WebElement password() {
		return password;
	}
	@FindBy(id="loginButton")
	private WebElement loginButton;
	public WebElement loginButton() {
		return loginButton;
	}
}
