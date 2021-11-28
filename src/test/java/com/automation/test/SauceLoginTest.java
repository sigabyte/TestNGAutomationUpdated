package com.automation.test;

import org.testng.annotations.Test;
import com.automation.pages.SauceHomePage;
import com.automation.pages.SauceLoginPage;
import com.automation.utils.PropertyReader;

public class SauceLoginTest extends BaseTest {

	@Test(groups = { "Regression", "Cigabyte", "Login" })
	public void verifyUserCanAbleToLogin() {
		// Login Page
		SauceLoginPage loginPage = new SauceLoginPage(driver);
		loginPage.LoginAction(PropertyReader.getProperty("login.username"),
				PropertyReader.getProperty("login.password"));

		// Home Page
		SauceHomePage homePage = new SauceHomePage(driver);
		homePage.verifyUserCanEnterHomePage();
	}

	@Test (groups= {"Regression", "Login"})
	public void verifyUserCannotDoLogin() {
		// Login Page
		SauceLoginPage loginPage = new SauceLoginPage(driver);
		loginPage.LoginAction("testtest", "test@123");
		
		loginPage.verifyInvalidLoginError();
	}

}
