package com.freecrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	WebDriver ldriver;

	@FindBy(xpath= "//a/span[contains(text(),'Contacts')]")
	WebElement contactsButton;

	@FindBy(xpath = "//button//i[contains(@class,'unhide icon')]")
	WebElement viewButton;

	@FindBy(xpath = "//div//i[contains(@class,'large user red icon')]")

	WebElement user1;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	
	WebElement addNew;

	@FindBy(xpath = "//div//input[@name='first_name']")
	WebElement fName;

	@FindBy(xpath = "//div//input[@name='last_name']")
	WebElement lName;

	@FindBy(xpath = "//div//button//i[contains(@class,'save icon')]")
	WebElement saveButton;

	public ContactsPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);

	}

	public String validateContactsPage() {
		contactsButton.click();
		return ldriver.getTitle();
	}
	
	public boolean displayContactsDetails() {
		contactsButton.click();
		viewButton.click();
		if(user1.isDisplayed())
			return true;
		else
		return false;
	}
	
	public void addContacts(String n1, String n2) throws Exception {
		contactsButton.click();
		addNew.click();
		fName.clear();
		lName.clear();
		
		fName.sendKeys(n1);
		lName.sendKeys(n2);
		saveButton.click();
		Thread.sleep(3000);
				
		
		//ldriver.navigate().back();
		
		
		
	}


	
	
	

}