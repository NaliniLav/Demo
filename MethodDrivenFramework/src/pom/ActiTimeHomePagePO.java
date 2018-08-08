package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class ActiTimeHomePagePO extends BasePage{
	public ActiTimeHomePagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	public WebElement Task() {
		return tasks;
	}
}
