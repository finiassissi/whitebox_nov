package com.auto.testcases;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.auto.base.TestBase;
import com.auto.pages.LoginPage;
import com.auto.util.ReadExcel;

public class loginTestcase_dd extends TestBase {
 
	
	
LoginPage lp;
 XSSFWorkbook workbook;
 XSSFSheet sheet;
 XSSFCell cell;
 
 
 public loginTestcase_dd()
 {
 super();
 }
 
 @BeforeMethod
	public void setup()
	{
		intialisation();
		lp=new LoginPage();
	}
 
 @DataProvider
 public Object[][] getTestData_dd() throws Exception
 {
	 Object[][] data=ReadExcel.getTestData();
	// System.out.println("in the data provider");
	return data;
 }
 
 
 @Test(dataProvider="getTestData_dd")
 public void login_dd(String un, String pw)  throws Exception
 {
	
	lp.login(un, pw);
	//System.out.println("in the login_dd");
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 }
}
	 
	 
	 
	 
	 
	 
	