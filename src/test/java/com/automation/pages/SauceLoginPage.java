package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLoginPage extends BasePage {

	@FindBy(id = "user-name")
	WebElement userNameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	@FindBy(xpath = "//div[@class='error-message-container error']/h3")
	WebElement invalidLoginError;

	public SauceLoginPage(WebDriver driver) {
		super(driver);

	}

	public void LoginAction(String username, String password) {
		waitForElementToBeClickable(userNameInput, driver);
		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginBtn.click();

	}

	public void verifyInvalidLoginError() {

		System.out.println(invalidLoginError.isDisplayed());
	}
}
