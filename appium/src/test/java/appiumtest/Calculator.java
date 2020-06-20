package appiumtest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Calculator {
	



	WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException{
		
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "7.0"); 
		capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("platformName","Android");
	 
	   
	   capabilities.setCapability("appPackage", "com.android.calculator2");
	
	   capabilities.setCapability("appActivity","Calculator"); 
	
	 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public void testCal() throws Exception {
	   
	   WebElement two=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.GridLayout[1]/android.widget.Button[8]\r\n"));
	  System.out.println(two.getText());
	   two.click();
	   WebElement plus=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]"));
	  
	   plus.click();
	   WebElement four=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.GridLayout[1]/android.widget.Button[4]\r\n"));
	   System.out.println(four.getText());
	   
	   four.click();
	   driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]")).click();;
	   
	   
	   WebElement results=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]\r\n"));
		//Check the calculated value on the edit box
	   System.out.println(results.getText());
	Assert.assertEquals(results.getText(), "6");
	}

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}
	}
	


