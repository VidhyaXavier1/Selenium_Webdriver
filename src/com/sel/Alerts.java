package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/?ITM=nli_cms_HP_logo_personal_topnavigation");
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("user-id-goahead")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("helldso");
        driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
       System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept(); //Simple alert
              
	}

}
