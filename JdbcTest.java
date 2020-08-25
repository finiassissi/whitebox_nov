package test_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JdbcTest {
	WebDriver driver;


	@Test
	public void jdbctest() throws Exception {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\anton\\eclipseWS\\sample\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.navigate().refresh();

		WebElement target = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();

		WebElement target1 = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		action.moveToElement(target1).click().build().perform();
		
		String id1 = driver.findElement(By.linkText("0004")).getText();
		String name1=driver.findElement(By.linkText("Steven")).getText();
		System.out.println(id1+" "+name1);
		
		//Connecting to Database
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_list", "root", "q1w2e3r4T");

		// Create Statement Object
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery("select *  from employee");
		//setting to raw1
		rs.absolute(1);
		System.out.println(rs.getString(1));
		Assert.assertEquals(id1, rs.getString(1));
		System.out.println("both ids are equal");
		Assert.assertEquals(name1,rs.getString(2));
		System.out.println("both names are equal");

		con.close();

		driver.close();
		driver.quit();
	}
}
