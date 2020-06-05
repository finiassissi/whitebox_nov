package com.freecrm.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private static Logger log = LogManager.getLogger(LoginPage.class);
	WebDriver ldriver;

	@FindBy(xpath = "//a[@href='https://ui.freecrm.com']")
	WebElement loginButton;

	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//div[contains(text(),\"Login\")]")

	WebElement login;

	@FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[3]/span[1]")
	WebElement user;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	public String validateTitle() {
		return ldriver.getTitle();
	}

	public String login(String email, String password) throws Exception {

		loginButton.click();
		txtEmail.sendKeys(email);
		log.info("Email:  " + email + " Password:  " + password);
		txtPassword.sendKeys(password);
		login.click();

		log.info("Login  done");

		if (user.isDisplayed()) {
			return "successful";
		}

		else
			return "invalid";

	}

}
