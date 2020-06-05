package com.freecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompaniesPage {
	WebDriver ldriver;

	@FindBy(xpath = "//div//span[contains(text(),\"Companies\")]")
	WebElement companies;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newButton;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")

	WebElement cmpName;

	@FindBy(xpath = "//div//button[contains(text(),\"Save\")]")
	WebElement saveButton;

	@FindBy(xpath = "///div//button[contains(text(),\"Cancel\")]")
	WebElement cancelbutton;

	public CompaniesPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);

	}

	public String validateUrl() {
		companies.click();

		return ldriver.getCurrentUrl();
	}

	public String addCompanies() throws InterruptedException {
		companies.click();
		System.out.println("companies button");
		newButton.click();

		System.out.println("newbutton");
		ldriver.navigate().refresh();
		ldriver.navigate().refresh();
		ldriver.navigate().refresh();
		
		cmpName.sendKeys("walmart");
		System.out.println("adding new");
		saveButton.click();
		System.out.println("save");

		// cancelbutton.click();
		return "new company added";

	}

}
