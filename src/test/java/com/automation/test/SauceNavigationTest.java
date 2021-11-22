package com.automation.test;

import org.testng.annotations.Test;
import com.automation.pages.SauceHomePage;
import com.automation.pages.SauceLoginPage;

public class SauceNavigationTest extends BaseTest {

	@Test(groups = { "Smoke", "Chirag", "Navigation" })
	public void verifyUserCanNavigateToProductDetailPageFromHomePage() {
		// Login Page
		SauceLoginPage loginPage = new SauceLoginPage(driver);
		loginPage.LoginAction();

		SauceHomePage homePage = new SauceHomePage(driver);
		homePage.verifyProductDetailPageNavigation();

	}

}
