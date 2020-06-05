package com.freecrm.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pageobjects.ContactsPage;

import com.freecrm.pageobjects.LoginPage;
import com.freecrm.util.ReadExcelData;

public class ContactsTest extends TestBase {
	private static Logger log = LogManager.getLogger(ContactsTest.class);
	LoginPage lo;
	ContactsPage co;

	public ContactsTest() {
		super();

	}

	@BeforeClass
	
	public void setup_c() throws Exception {
		intialisation();
		lo = new LoginPage(driver);
		co=new ContactsPage(driver);
		lo.login(prop.getProperty("email"), prop.getProperty("password"));

		
	}
		
		
	
	@Test
	public void cpTitleValidation() {
	log.info("-----------------------cpTitleValidation-----------");
		System.out.println(co.validateContactsPage());
		Assert.assertEquals(co.validateContactsPage(),"Cogmento CRM");	
		
	}
	@Test
	public void cpVerifyingContacts() {
		log.info("-----------------------cpTitleValidation-----------");
		Assert.assertEquals(co.displayContactsDetails(), true, "Contact is not added");
	
	}
	
	@DataProvider
	 public Object[][] data1() throws Exception{
		Object[][] data=ReadExcelData.getTestData();
		return data;
	 }
	
	
	
	@Test(dataProvider="data1")
	public void cplLoginWithMultipleValues(String name1, String name2) throws Exception {
		co.addContacts(name1, name2);
		log.info("-----------------------Contacts Adding-----------");
		
		Thread.sleep(2000);	}
	 
	
	
	 
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
