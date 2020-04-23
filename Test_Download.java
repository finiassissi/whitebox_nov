package com.wbl.testing;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_Download {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\anton\\eclipseWS\\sample\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://whiteboxqa.com/login.php");

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("finiassissi1@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("q1w2e3r4T");
		driver.findElement(By.xpath("//*[@id='login']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/a"));

		Actions act = new Actions(driver);
		act.moveToElement(dropdown)
				.click(driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/ul/li[2]/a"))).perform();
		;

		WebElement source = driver
				.findElement(By.xpath("//*[@id=\"books\"]/div/div/div/div/table/tbody/tr[20]/td[2]/a"));
		String source1 = source.getAttribute("href");
		 System.out.println(source1);
			String wget_command = "cmd /c C:\\Users\\anton\\Downloads\\wget.exe -P C:\\Users\\anton\\Desktop  --no-check-certificate " + source1;
			//String wget_command = "cmd /c C:\\Users\\anton\\Downloads\\wget.exe --no-check-certificate https://goo.gl/Z8gzNQ -P C:\\Users\\anton\\Desktop";

		System.out.println(wget_command);
		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		} catch (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); 
		}
			driver.close();

		
	}

}