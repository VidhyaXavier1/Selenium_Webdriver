package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonmouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles, Computers')]//following-sibling::i")).click();
        driver.findElement(By.linkText("Power Banks")).click();
	}

}
