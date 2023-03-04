package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.marketwatch.com/market-data/europe?mod=market-data-center");
	
			driver.navigate().refresh();
				
			WebElement table = driver.findElement(By.xpath("//div[@class='element element--table overflow--table ByIndexGainers']//table//tbody"));
			
	       List<WebElement> row = table.findElements(By.tagName("tr"));
	         int rowCount= row.size();
	 	         for(int i=0;i<rowCount;i++) {
	        	 List<WebElement> column= row.get(i).findElements(By.tagName("td"));
	        	 int columnCount=column.size();
	        	 for(int j=0;j<columnCount;j++)
	        	 {
	        		 String t=column.get(j).getText();
	        		 if(t.equalsIgnoreCase("Credit Suisse Group AG")) {
	        			 System.out.println(column.get(4).getText());
	        		 }
	        	 }
	        	 
	         }
}  
}
