package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Prompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("helldfdgdgfgfo");
		Thread.sleep(8000);
		alert.accept();
		
		/*WebElement findElement = driver.findElement(By.id("confirmButton"));
		findElement.click();
		Thread.sleep(4000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		findElement.click();
		alert2.dismiss();
		*/
	}

}
