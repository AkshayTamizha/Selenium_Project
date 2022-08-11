package com.sel.concept;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertical_Scrolldown {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		  driver.get("https://www.amazon.in/");
		  
		  driver.manage().window().maximize();
		  
		  
		  
		  WebElement logo =driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		  
		  //java script executor should used for the scroll up and scroll down
		  //narrrowing casting
		  
		  Thread.sleep(3000);
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  //js.executeScript(argument[0]scroll.IntoView();, webelement [0]-index of
		 // webelement if only 1 =0,1=2
		  
		  js.executeScript("arguments[0].scrollIntoView();", logo);
		  
		  Thread.sleep(3000);
		  
		  WebElement uplogo=driver.findElement(By.xpath("//img[@alt='Join Prime']"));
		 
	
		
	
	js.executeScript("arguments[0].scrollIntoView();", uplogo);
	
	Thread.sleep(3000);
	driver.get("https://www.album.alexflueras.ro/");
	
	Thread.sleep(5000);
	
	WebElement rightLogo= driver.findElement(By.id("a4"));
	js.executeScript("arguments[0].scrollIntoView", rightLogo);
	
	Thread.sleep(3000);
	
	WebElement rightLeft= driver.findElement(By.id("a1"));
	
	js.executeScript("arguments[0].scrollIntoView", rightLeft);
	
	
	
	
	
	
	
	
}


}
