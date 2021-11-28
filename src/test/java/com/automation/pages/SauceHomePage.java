package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SauceHomePage extends BasePage {

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement homePageItemName;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	List<WebElement> ListOfItems;

	public SauceHomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyUserCanEnterHomePage() {
		// HomePage

		System.out.println(homePageItemName.isDisplayed());
		switchToNewWindow(driver);
	}

	public void verifyProductDetailPageNavigation() {
		

		SauceProductPage pdpnav = new SauceProductPage(driver);

		for (int i = 0; i < ListOfItems.size(); i++) {

			ListOfItems.get(i).click();

			pdpnav.verifyPrice();
			pdpnav.verifyTitle();

			driver.navigate().back();

			ListOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		}

	}
}
