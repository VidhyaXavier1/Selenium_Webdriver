package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Show More >>']")).click();
		WebElement w = driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
		Thread.sleep(2000);
		List<WebElement> row = w.findElements(By.tagName("tr"));
		int rowcount=row.size();
		System.out.println(rowcount);
		
		for(int i=0;i<rowcount;i++) {
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
		 int columnCount=column.size();
		 Thread.sleep(2000);
			for(int j=0;j<columnCount;j++) {
				String t=column.get(j).getText();
				if ( t.equals("S&P BSE Carbonex")) {
					for (int g=1;g<columnCount;g++) {
						
					System.out.println(column.get(g).getText());
					}
				}
			}
		}
	
		
	}

}
