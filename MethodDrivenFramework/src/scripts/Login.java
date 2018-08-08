package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.ActiTimeLoginPO;

public class Login extends BaseTest{
	@Test
	public void loginCheck(byte[] actTitle, byte[] expTitle) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			ActiTimeLoginPO a=new ActiTimeLoginPO(driver);
			a.username().sendKeys("charitha.takili");
			a.password().sendKeys("APUqYmY3");
			a.loginButton().click();
			wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
			String exp="actiTIME - Enter Time-Track";
			String act=driver.getTitle();
			
			Assert.assertEquals(act,exp);
			
			Reporter.log("Title is Matched:: Test pass", true);
			
			
			
		} catch (Exception e) {
			Reporter.log("Test fail",true);
			Assert.fail();
			
		}
	}

}
