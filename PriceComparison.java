package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PriceComparison {

public void comparewithAmazon( HashMap<String, String> priceMap)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	 driver.get("https://www.amazon.com/");
	 Map<String, String> amazon=new HashMap<String,String>();
	 
	 
	//Sending Walmart products through Amazon search box one by one 
	
	 
	 for (Map.Entry<String, String> pname: priceMap.entrySet())
	 {
	  //System.out.println("Key: " + pname.getKey() + ",  Value: " + pname.getValue());
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pname.getKey()+ Keys.ENTER);
	 try 
	 {
		Thread.sleep(1000);
	 } catch (InterruptedException e)
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }

	 //taking the title and price and asserting if its equal or not
	  String name =driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).getText();
	  String price=driver.findElement(By.xpath("//*[@class='a-price-whole']")).getText();
	  
	
	  //Adding elements to Hashmap
	  amazon.put(name, price);	
	  
	  //Validating and printing the result
	  SoftAssert at= new SoftAssert();
	  at.assertEquals(priceMap.values(),amazon.values() ); 
	  at.assertTrue(false); 
       System.out.println("Results are not matching");
       
 	  for (Map.Entry<String, String> am_name: amazon.entrySet())
 	  {
 			System.out.println("Key: " + am_name.getKey() + ",  Value: " + am_name.getValue());
 	  }  
	   
	}
	   	 
	//close the Browser
     driver.close();
} 

 
@Test
  public void PriceCompare() {
	
	  //launch browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  HashMap<String, String> priceHash = new HashMap<String, String>();
	   
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	  
	  //Launch URL
	/*  driver.get("https://www.walmart.com/");
	  driver.findElement(By.xpath("//*[@id=\"header-account-toggle\"]/span/span/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"signed-out\"]/a[1]/div/span/div")).click();
	  driver.findElement(By.id("email")).sendKeys("user name");
	  driver.findElement(By.id("password")).sendKeys("Password");
	  driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button[1]")).click();*/
	  
	  
	  //search products Ipad-pro
	  driver.get("https://www.walmart.com/?action=SignIn&rm=true");
	  driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("Ipad Pro"+Keys.ENTER);
	
	  
	  //Taking first five walmart products from search and putting in Hashmap
	  for(int i=0;i<5;i++)
	  {
	    
			String nm = driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li["+ (i+1) +"]/div/div[2]/div[5]/div/a")).getText();
			String prc = driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li["+ (i+1) +"]/div/div[2]/div[7]/div/span/span/span[2]/span/span[2]/span[2]")).getText();
			priceHash.put(nm, prc);			
	  }
	  
	  // Print the hashmap 
	  for (Map.Entry<String,String> pname: priceHash.entrySet()){
		  System.out.println("Key"+pname.getKey() +"Value"+  pname.getValue());
	  } 
	  driver.close(); 
	  //Calling Function to compare price with Amazon
	  comparewithAmazon(priceHash);	  
  }

}


