package com.freecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver ldriver;

	@FindBy(xpath = "//div[contains(text(),\"Contacts activity stream\")]")
	WebElement contactsActivity;

	@FindBy(xpath = "//div[contains(text(),\"Deals\")]")
	WebElement deals;

	@FindBy(xpath = "//div//span[contains(@class,'header') and contains(text(),\"Call Queue\")]")
	WebElement call;

	public HomePage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
	}

	public String validateHome() {
		return ldriver.getTitle();

	}

	public boolean validateCompanies() {

		return contactsActivity.isDisplayed();

	}

	public boolean validateDeals() {
		return deals.isDisplayed();
	}

	public boolean validateCall() {
		return call.isDisplayed();
	}
}
