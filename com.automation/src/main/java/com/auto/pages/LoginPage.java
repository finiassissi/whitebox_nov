package com.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath ="//*[@id=\"header-account-toggle\"]/span/span/span[2]")
	WebElement account;
	
	@FindBy(xpath="//*[@id=\"signed-out\"]/a[1]/div/span/div")
	WebElement signin;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/button[1]")
	WebElement sign;
	
	@FindBy(xpath="//*[@id=\"global-error\"]/button")
	WebElement msg;
	
	@FindBy(xpath="//*[@id=\"signed-in\"]/a[10]/div/span/div")
	WebElement signout;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void login (String un,String pw) throws Exception
	{
	account.click();
	signin.click();
	email.sendKeys(un);

	password.sendKeys(pw);

	//sign.click();
	
	//sign.clear();
	//driver.close();
	}	
	public void login_val()
	{
	
			System.out.println(driver.getCurrentUrl());
			System.out.println("login successfull");
			driver.close();
		
	}
	public void Logout()
	{
		signout.click();
	}
	}
	

