package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("heelo.gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello");
		Thread.sleep(1000);
		String s=driver.findElement(By.name("login")).getText();
		System.out.println(s);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot password?")).click();*/
		driver.get("http://www.greenstechnologys.com/");
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='images/vadapalani-branch-offer-new.png']"))).click();
		//driver.findElement(By.xpath("//img[@src='images/vadapalani-branch-offer-new.png']")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
