package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	//driver.navigate().to("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381813367152&hvpos=&hvnetw=g&hvrand=10409209662175419248&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9006852&hvtargid=kwd-67997747&ref=pd_sl_45ezmglxsa_e&hydadcr=28884_11845472&gclid=CjwKCAiA0JKfBhBIEiwAPhZXD7YVu6hGyB8HRfkSZhP907prJpipKFuqcp1Dqro7GUzoPuvnBf-uVhoC1T0QAvD_BwE");
	//driver.navigate().back();
	//Thread.sleep(1000);
	//driver.navigate().forward();
	//Thread.sleep(1000);
//	driver.navigate().back();
	WebElement w=driver.findElement(By.name("q"));
	
	w.sendKeys("amazon");
	//w.sendKeys(Keys.ENTER);
	w.sendKeys(Keys.RETURN);
	WebElement q=driver.findElement(By.className("Amazon.com. Spend less. Smile more"));
	q.click();
	
	//driver.findElement(By.name("btnI")).click();
	
	
           

}
}
