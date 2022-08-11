package com.seleinum.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
			
		WebElement wom=driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions act = new Actions(driver);
		
		// actt.moveToElement(element).build().perform()
		//bulid()= use to build the task. pertform = used to perfor m the taskl'
		
		act.moveToElement(wom).build().perform();
		Thread.sleep(3000);
		
		WebElement cas=driver.findElement(By.xpath("//a[@title='Casual Dresses'][1]"));
		
		// act.click(element).build().perform()
		
		act.click(cas).build().perform();
		Thread.sleep(3000);
		
		//context click = mouse acttion like right click
		
		WebElement rc = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		
		act.contextClick(rc).build().perform();
		
		Thread.sleep(3000);
		
		// Robot is a class= robot r = new robot()
		
		Robot r = new Robot();
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
