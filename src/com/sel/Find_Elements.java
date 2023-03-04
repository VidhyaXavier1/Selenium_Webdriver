package com.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {
	
	
	

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(1000);
	//	List<WebElement> auto = driver.findElements(By.xpath("//div[@class='UUbT9']"));
		//List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::b[contains(text(),'foods')]"));
		List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='eIPGRd']//b"));
		//for(WebElement w :auto) {
		//	System.out.println(w.getText());
	//		
	//	}
		
		for (int i=0;i<auto.size();i++) {
		         if (auto.get(i).getText().contains("foods")) {
		        	 auto.get(i).click();
		         }
		}

	}

}
