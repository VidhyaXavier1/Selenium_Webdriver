package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browse {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
	//	driver.get("https://netbanking.hdfcbank.com/netbanking/");
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	Thread.sleep(3000);
	//	WebElement findElement = driver.findElement(By.name("fldLoginUserId"));
	//	WebElement findElement = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	//	WebElement findElement1 = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		//Thread.sleep(3000);
	//	WebDriverWait wait =new WebDriverWait(driver,30);
     //   wait.until(ExpectedConditions.visibilityOf(findElement));
        
        
	//	findElement.sendKeys("hsdf2222");
	//	findElement1.sendKeys("83748");
	//driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("hsdf2222");
	//	driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
	//	driver.findElement(By.xpath("//a[text()='Register Now']")).click();
	//	driver.findElement(By.xpath("//a[text()='Credit Card only? Login here']")).click();	
	
	/* System.setProperty("webdriver.edge.driver","D:\\eclipse\\Selenium_Webdriver\\Driver\\msedgedriver.exe" );
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.className("form-control text-muted"));
		Thread.sleep(3000);
		findElement.sendKeys("hsdf2222");*/
		
		
		driver.get("https://www.nykaa.com/himalaya-baby-care-baby-powder/p/6023?productId=6023&pps=1&skuId=4791");
		System.out.println(driver.getTitle());
	 
}
}
