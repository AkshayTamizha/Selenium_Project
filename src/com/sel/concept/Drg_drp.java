package com.sel.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drg_drp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
					WebDriver driver = new ChromeDriver();
		
					driver.get("https://demoqa.com/droppable/");
					
					Thread.sleep(1000);
					driver.manage().window().maximize();
					
					
					WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
					
					WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	                 
					Actions act = new Actions(driver);
					
					//drag and drop method
					
					//act.dragAndDrop(drag, drop).build().perform();
					
					
					// or we can also use click and hold method
					
					act.clickAndHold(drag).pause(2000).moveToElement(drop).build().perform();
	
	Thread.sleep(2000);
                  //double click
					
				driver.get("https://demoqa.com/buttons");
				
				WebElement dblclk =driver.findElement(By.id("doubleClickBtn"));
				
				act.doubleClick(dblclk).build().perform();
	
	
	
	
	
	
	
	
	}
	

}
