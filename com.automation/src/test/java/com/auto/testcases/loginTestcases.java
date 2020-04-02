package com.auto.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.base.TestBase;

import com.auto.pages.LoginPage;

public class loginTestcases extends TestBase {
	LoginPage lp;
	
	public loginTestcases(){
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialisation();
		lp=new LoginPage();
	}
	
	@Test(priority=1)
	public void validate_url()
	{
		String title=driver.getTitle();
		System.out.println("validating title of login Page");
		Assert.assertEquals(title,"Walmart.com | Save Money. Live Better." , "not valid URL");
	}
	@Test(priority=2)
	public void loginTest() throws Exception
	{
		
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		
	   lp.login_val();
		
	
	}
	
	//@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
