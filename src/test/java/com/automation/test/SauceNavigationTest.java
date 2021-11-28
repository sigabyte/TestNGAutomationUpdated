package com.automation.test;

import org.testng.annotations.Test;
import com.automation.pages.SauceHomePage;
import com.automation.pages.SauceLoginPage;
import com.automation.utils.PropertyReader;

public class SauceNavigationTest extends BaseTest {

	@Test(groups = { "Smoke", "Chirag", "Navigation" })
	public void verifyUserCanNavigateToProductDetailPageFromHomePage() {
		// Login Page
		SauceLoginPage loginPage = new SauceLoginPage(driver);
		loginPage.LoginAction(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("secret_sauce"));

		SauceHomePage homePage = new SauceHomePage(driver);
		homePage.verifyProductDetailPageNavigation();

	}

}
