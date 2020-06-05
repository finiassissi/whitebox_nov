package com.freecrm.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pageobjects.HomePage;
import com.freecrm.pageobjects.LoginPage;
import com.sun.tools.sjavac.Log;

public class HomeTest extends TestBase {
	private static Logger log = LogManager.getLogger(LoginTest.class);
	LoginPage lo;
	HomePage ho;
	
	public HomeTest() {
		super();
		
	}
	@BeforeMethod
	public void setup_h() throws Exception {
		
		intialisation();
		lo=new LoginPage(driver);
		ho=new HomePage(driver);
		lo.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@Test
	public void hpValidateTitle() {
	log.info(".............hpValidateTitle...........");
	System.out.println(ho.validateHome());
	Assert.assertEquals(ho.validateHome(),"Cogmento CRM");
	}
	
	@Test
	public void hpValiadteDisplayCompanies() {
		log.info(".............hpValiadteDisplayCompanies...........");
		Assert.assertEquals(ho.validateCompanies(), true);
	}
	@Test
	public void hpValiadteDisplayDeals() {
		log.info(".............hpValiadteDisplayDeals...........");
		Assert.assertEquals(ho.validateDeals(), true);
		
	}
	@Test
	public void hpValiadteDisplayCall() {
		log.info(".............hpValiadteDisplayCall..........");
	
		Assert.assertEquals(ho.validateCall(), true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
