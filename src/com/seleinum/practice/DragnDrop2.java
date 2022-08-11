package com.seleinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://demoqa.com/droppable/");
	
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
	
	Thread.sleep(3000);
	
	WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable'][1]"));
	
	Thread.sleep(3000);
	
	Actions act = new Actions(driver);
	
	Thread.sleep(3000);//https://demoqa.com/buttons
	//drag and dop
	
	act.dragAndDrop(dragable, dropable).build().perform();
	
	Thread.sleep(3000);
	//or
	
	//act.clickAndHold(dragable).pause(3000).moveToElement(dropable).build().perform();
	
	//double clicl
	
	driver.get("https://demoqa.com/buttons");
	
	WebElement dc = driver.findElement(By.id("doubleClickBtn"));
	
	act.doubleClick(dc).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
