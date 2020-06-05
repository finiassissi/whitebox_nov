package com.freecrm.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pageobjects.*;

public class LoginTest extends TestBase {
	private static Logger log = LogManager.getLogger(LoginTest.class);
	LoginPage lp;

	public LoginTest() {
		super();

	}

	@BeforeClass()
	public void setup() {
		intialisation();
		lp = new LoginPage(driver);
	}

	@Test(priority = 0)
	public void lpValidateTitle() {

		log.trace("----------Validating Title------------");

		Assert.assertEquals(lp.validateTitle(), "Free CRM #1 cloud software for any business large or small");
		// System.out.println(lp.validateTitle());
		log.info(" Application URl validated");
	}

	// @Test(priority=1)
	public void lpLogin() throws Exception {
		log.trace("----------Login Function------------");
		Assert.assertEquals(lp.login(prop.getProperty("email"), prop.getProperty("password")), "successful");
		log.info("Successful");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
