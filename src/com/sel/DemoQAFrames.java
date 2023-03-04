package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAFrames {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/frames");
	WebElement findElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(findElement);
	WebElement findElement2 = driver.findElement(By.xpath("//h1[@id='sampleHeading'][1]"));
	
	System.out.println(findElement2.getText());
	
	driver.switchTo().defaultContent();
	WebElement findElement1 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	driver.switchTo().frame(findElement1);
	WebElement findElement3 = driver.findElement(By.xpath("//h1[@id='sampleHeading'][1]"));
	System.out.println(findElement3.getText());
}
}
