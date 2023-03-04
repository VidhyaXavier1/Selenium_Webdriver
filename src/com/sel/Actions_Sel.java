package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_Sel {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement findElement = driver.findElement(By.linkText("Prime"));
		Actions a=new Actions(driver);
		a.click(findElement).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.linkText("Clinic"));
		Actions a1=new Actions(driver);
		a1.contextClick(findElement2).build().perform();
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement findElement3 = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement findElement4 = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions a2=new Actions(driver);
		a2.dragAndDrop(findElement3, findElement4).build().perform();
		
		
		
		
		
		
				 
	}
}

