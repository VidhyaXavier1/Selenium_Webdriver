package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecu {
      public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='a-link-normal see-more truncate-1line'])[7]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", findElement);
		js.executeScript("arguments[0].click()",findElement);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('twotabsearchtextbox').value='dresses';");
		WebElement findElement1 = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",findElement1);
		
	}
}
