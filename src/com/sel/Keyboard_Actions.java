package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	WebElement findElement = driver.findElement(By.xpath("//a[text()='Amazon Basics']"));
	Actions a=new Actions(driver);
	a.contextClick(findElement).build().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	String w = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	for(String s:windowHandles) {
		if(!w.equals(s)) {
			driver.switchTo().window(s);
		}
		
	}
	Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.xpath("//div[@id='bg1pkvancq']"));
	Thread.sleep(2000);
	Actions a1=new Actions(driver);
	a.contextClick(findElement2).build().perform();
	Robot r1=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	Set<String> windowHandles2 = driver.getWindowHandles();
	 
	/* for(String i:windowHandles2) {
		 String t= driver.switchTo().window(i).getTitle();
		 if ((!t.contains("Basics")) || (!t.contains("Spend less. Smile more."))){
			 driver.switchTo().window(i);
		 } 	*/
		Thread.sleep(2000);
		 for(String i:windowHandles2) {
			 String t= driver.switchTo().window(i).getTitle();
			 String t1= driver.switchTo().window(i).getTitle();
			 if (!t1.contains("Living Room")) { 
				 driver.close();
				 } 
			 			 
	 }
		
	 }
	
}
