package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SauceProductPage extends BasePage{

	@FindBy(xpath = "//div[contains(@class, 'inventory_details_name')]")
	WebElement itemTitle;

	@FindBy(className = "inventory_details_price")
	WebElement itemPrice;	

	public SauceProductPage(WebDriver driver) {
		super(driver);

	}

	public void verifyTitle() {

		System.out.println(itemTitle.getText());

	}

	public void verifyPrice() {

		System.out.println(itemPrice.getText());

	}

}
