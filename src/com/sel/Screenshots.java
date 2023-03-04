package com.sel;

import java.io.File;
import java.io.IOException;


import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Date currentdate =new Date();
	//System.out.println(currentdate);
	String s=currentdate.toString().replace(" ", "-").replace(":","-");
	//System.out.println(s);
		Thread.sleep(4000);
	driver.get("http://www.greenstechnologys.com/");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//FileHandler.copy(screenshotFile, new File ("D:\\eclipse\\Java_Project\\Screenshots\\screen1.png"));
		FileUtils.copyFile(screenshotFile, new File ("D:\\eclipse\\Selenium_Webdriver\\Screenshot\\" + s +".png") );
		
		
		}

}
