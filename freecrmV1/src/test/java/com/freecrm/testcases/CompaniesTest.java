package com.freecrm.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pageobjects.CompaniesPage;
import com.freecrm.pageobjects.ContactsPage;

import com.freecrm.pageobjects.LoginPage;
import com.sun.tools.sjavac.Log;
public class CompaniesTest extends TestBase{
	

	

		LoginPage lo;
		CompaniesPage cm;

		public CompaniesTest() {
			super();

		}

		@BeforeMethod
		public void setup_cm() throws Exception {
			intialisation();
			lo = new LoginPage(driver);
			cm=new CompaniesPage(driver);
			lo.login(prop.getProperty("email"), prop.getProperty("password"));
			
		}
		@Test(priority=0)
		public void cpValidateUrl() {
		
		Assert.assertEquals(cm.validateUrl(),"https://ui.freecrm.com/companies");
		}
		
		@Test(priority=1)
		public void cpAddNewComapny() throws InterruptedException {
		//cm.add_Companies();
		System.out.println("inside company adding function");
		Assert.assertEquals(cm.addCompanies(),"new company added");
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}

}
