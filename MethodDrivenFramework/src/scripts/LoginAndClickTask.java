package scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.ActiTimeHomePagePO;
import pom.ActiTimeLoginPO;

public class LoginAndClickTask extends BaseTest{
	@Test
	public void loginClick() {
		try {
			ActiTimeLoginPO a=new ActiTimeLoginPO(driver);
			a.username().sendKeys("charitha.takili");
			a.password().sendKeys("APUqYmY3");
			a.loginButton().click();
			Thread.sleep(3000);
			ActiTimeHomePagePO b=new ActiTimeHomePagePO(driver);
			b.Task().click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			Reporter.log("Test fail", true);
			Assert.fail();
			
		}
	}

}
