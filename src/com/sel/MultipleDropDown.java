package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
  

public static void main(String[] args) {
	boolean r=true;
	  System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium_Webdriver\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
	WebElement findElement = driver.findElement(By.xpath("//select[@name='cars']"));
	 Select s=new Select(findElement);
	    r=s.isMultiple();
	    if (r==true) {
	    	System.out.println("you can select multiple items in Standard multi select drop down");
	    }
	    else
	    {
	    	System.out.println("You can't select multiple items in Standard multi select drop down");
	    }
	   
	   s.selectByValue("volvo");
	   s.selectByIndex(1);
	   s.selectByVisibleText("Opel");
	   s.selectByValue("audi");
	   
	   System.out.println("List Of Items in the drop down");
	   System.out.println("-------------------------------");
	  
	   List <WebElement> op = s.getOptions();
	     for (WebElement allcars:op) {
	    	 System.out.println(allcars.getText());
	      }
	    WebElement firstSele = s.getFirstSelectedOption();
	   System.out.println("First selected option in the drop down " ); 
	   System.out.println("----------------------------------------");
	   System.out.println(firstSele.getText());
	     
	   System.out.println("List Of Selected Items in the drop down");
	   System.out.println("-------------------------------");
	   List <WebElement> op1 = s.getAllSelectedOptions();
	     for (WebElement selectcars:op1) {
	    	 System.out.println(selectcars.getText());
	      }
	     s.deselectByIndex(0);
	     System.out.println("List Of Selected Items after deselect  one element from the drop down");
		   System.out.println("--------------------------------------------------------------------");
		   List <WebElement> op2 = s.getAllSelectedOptions();
		     for (WebElement deselectcars:op2) {
		    	 System.out.println(deselectcars.getText());
		      }
		     s.deselectAll();
		     System.out.println("List Of Selected Items after deselect all the element from the drop down");
			   System.out.println("--------------------------------------------------------------------");
			   List <WebElement> op3 = s.getAllSelectedOptions();
			     for (WebElement deselectall:op3) {
			    	 System.out.println(deselectall.getText());
			      }
			     
     
		WebElement findElement1 = driver.findElement(By.id("oldSelectMenu"));
		boolean e=true;
         Select s1=new Select(findElement1);
         System.out.println("----------------------------");
         e=s1.isMultiple();
 	    if (e==true) { 
 	    	System.out.println("you can select multiple items in Multiselect drop down");
 	    }
 	    else
 	    {
 	    	System.out.println("You can't select multiple items in Multiselect drop down ");
 	    }
 	    
 	    
       
  }
  

}