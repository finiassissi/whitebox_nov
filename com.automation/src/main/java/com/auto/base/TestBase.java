package com.auto.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
 public TestBase()
 {
		try { 
	     prop= new Properties();
	     
	     FileInputStream ip;

		 ip = new FileInputStream("C:\\Users\\anton\\eclipseWS\\com.automation\\src\\main\\java\\com\\auto\\config\\config.properties");
	     prop.load(ip);
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	  catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
 }
 


public static void intialisation()
 {
 String browser1=prop.getProperty("browser");
 
 
 if (browser1.equals("chrome"))
 {
 System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe" );
 driver=new ChromeDriver();
 }
 driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS );
 driver.get(prop.getProperty("url"));
//System.out.println( driver.getTitle());
 
 }
}
 











