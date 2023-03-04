package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.id("month"));
	Thread.sleep(2000);
	Select select=new Select(findElement);
	select.selectByValue("6");
	Thread.sleep(2000);
	select.selectByIndex(8);
	Thread.sleep(2000);
	select.selectByVisibleText("Oct");
	WebElement findElement2 = driver.findElement(By.id("day"));
	Select select2=new Select(findElement2);
	Thread.sleep(2000);
	select2.selectByValue("11");
	WebElement findElement3 = driver.findElement(By.id("year"));
	Select select3=new Select(findElement3);
	select3.selectByVisibleText("2014");
	
	
	
}
}
