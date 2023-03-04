package com.sel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nyka_Project1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mb = driver.findElement(By.xpath("//div[@id='category_navigation']//descendant::li//a[contains(text(),'mom & baby')]"));
		
		
		WebElement bp = driver.findElement(By.xpath("//div[@class='MegaDropdown-ContentInner bgWhite']//descendant::a[contains(text(),'Baby Powder')]"));
		Actions a=new Actions(driver);
		a.moveToElement(mb).build().perform();
		a.click(bp).build().perform();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String s: windowHandles) {
			String t=driver.switchTo().window(s).getTitle();
			if(t.contains("Baby Powder")){
				driver.switchTo().window(s);
			}
			else
				driver.close();
							
		}
		driver.navigate().refresh();
		Thread.sleep(5000);
		 WebElement aa = driver.findElement(By.xpath("//div[contains(text(),'Himalaya Baby Powder')]"));
		 aa.click();
		 
		 
		Thread.sleep(7000);
		
		
		Set<String> winhan = driver.getWindowHandles();
	     Iterator itr= winhan.iterator();
	     String p=(String) itr.next();
	     String c=(String) itr.next();
	     driver.switchTo().window(c);
	    
		driver.navigate().refresh();
		
		WebElement sel = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Thread.sleep(2000);
		Select s1=new Select(sel);
		s1.selectByValue("2");
	 driver.findElement(By.xpath("//div[@class='css-16mrwkj']//descendant::span")).click();
	     
	 driver.findElement(By.xpath("//span[@class='cart-count']")).click();
	 Thread.sleep(3000);
	 WebElement cart = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
	 driver.switchTo().frame(cart);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//img[@src='https://adn-static1.nykaa.com/media/wysiwyg/Payments/down.svg']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li[@class='css-18fuhjc edkwwn3']//descendant::span[text()='4']")).click();
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@class='css-1l5d7z5 e1whhlt1']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	 driver.findElement(By.xpath("//div[@class='css-x6gbsc esabwed1']")).click();
	 driver.switchTo().defaultContent();
	 
	 driver.quit();
	 
	 
		
		
		
		
		

	}

}
