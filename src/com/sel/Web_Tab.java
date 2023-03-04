package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tab {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Show More >>']")).click();
			System.out.println("Full Table");
			System.out.println("===========");
			List<WebElement> tab = driver.findElements(By.id("dataTable"));
			int c=tab.size();
			for (int i=0;i<c;i++) {
				System.out.println(tab.get(i).getText());
			}
		    
			List<WebElement> column = driver.findElements(By.xpath("//table[@id='dataTable']//thead//tr"));
			int c1=column.size();
		   System.out.println("Total Columns in this table");
		    System.out.println("=======================");
		    System.out.println(c1);
		    System.out.println("Columns in this table");
		    System.out.println("=======================");
			for (int i=0;i<c1;i++) {
				System.out.println(column.get(i).getText() );
				
			}
			
		    List<WebElement> row = driver.findElements(By.xpath("//table[@id='dataTable']//tbody/tr"));
		    int r=row.size();
		    System.out.println("Total rows in this table");
		    System.out.println("=======================");
		    System.out.println(r);
		    System.out.println("Rows in this table");
		    System.out.println("=======================");
			for (int i=0;i<r;i++) {
				System.out.println(row.get(i).getText() );
				
			}
			
		
	}

}
