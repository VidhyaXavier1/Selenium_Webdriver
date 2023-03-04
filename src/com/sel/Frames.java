package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement findFrame = driver.findElement(By.xpath("//iframe[@src='https://images-na.ssl-images-amazon.com/images/S/apesafeframe/ape/sf/desktop/sf-1.50.1d34773.html']"));
		//WebElement findFrame = driver.findElement(By.xpath("//iframe[@src='https://images-na.ssl-images-amazon.com/images/S/apesafeframe/ape/sf/desktop/sf-1.50.57040ca.html']"));
		driver.switchTo().frame(findFrame);
		//driver.findElement(By.xpath("//div[@id='ad']//descendant::img[@src='https://m.media-amazon.com/images/S/al-na-9d5791cf-3faf/129aa5d1-7bb0-4fe5-a67e-86b94f35ac7c.jpg']")).click();
		driver.findElement(By.xpath("//div[contains(@aria-label,'Sponsored Ad')]")).click();
	}

}
