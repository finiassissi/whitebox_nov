package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BuyProductTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chrome/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//launching URL
        driver.get("http://automationpractice.com/index.php");
        //signing in using user name and password
        WebElement signin=driver.findElement(By.linkText("Sign in"));
        signin.click();
        
        
       // UN:training.qaprep@gmail.com, PW:Testing123
        System.out.println("signing in");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("training.qaprep@gmail.com");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Testing123");
        driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
        
        //Move your cursor over Women's link,Click on sub menu 'T-shirts'.
        
        WebElement tshirt= driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        WebElement women=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
         Actions action=new Actions(driver);
         action.moveToElement(women);
         action.moveToElement(tshirt).click().build().perform();
         
         // Mouse hover on the product displayed,'More' button will be displayed, click on 'More' button.
        System.out.println("view produts in detail");
        WebElement img= driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
        WebElement more=driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span"));
        action.moveToElement(img);
        action.moveToElement(more).click().build().perform();
         
        
        //increase quantity to 2,Select size 'L', Select color.10.Click 'Add to Cart' button.
   
        System.out.println(" select Quantity  2 and size L");
        //select quantity as 2
        driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span/i")).click();
        //selecting L size from drop down
        Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='group_1']")));
        dropdown.selectByIndex(2);
        //Select color
        driver.findElement(By.id("color_14")).click();
        //Adding product to cart
        System.out.println("product added to cart");
        driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
         
        
        //11. Click 'Proceed to checkout' button.
        driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
        
        
        System.out.println("checking out");
        //Complete the buy order process till payment.
        driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
        //address
        driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
        //Shipping
        driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
        
        //Small Window PopUp
        driver.findElement(By.xpath("//*[@id='order']/div[2]/div/div/a")).click();
        driver.findElement(By.id("uniform-cgv")).click();
        driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
        
        //Make sure that Product is ordered.(Assert the text).
        driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
        
        //assert the text
        String confirmMessage= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
        Thread.sleep(2000);
		
        if(confirmMessage.matches("Your order on My Store is complete.")) {
       		System.out.println(confirmMessage);
        }
        driver.close();	
	}	
}
