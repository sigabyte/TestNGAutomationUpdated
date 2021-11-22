package com.automation.test;

import org.testng.annotations.Test;
import com.automation.pages.SauceHomePage;
import com.automation.pages.SauceLoginPage;

public class SauceLoginTest extends BaseTest {

	@Test(groups = { "Smoke", "Cigabyte", "Login" })
	public void verifyUserCanAbleToLogin() {
		// Login Page
		SauceLoginPage loginPage = new SauceLoginPage(driver);
		loginPage.LoginAction();

		// Home Page
		SauceHomePage homePage = new SauceHomePage(driver);
		homePage.verifyUserCanEnterHomePage();
	}

}
