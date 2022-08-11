package com.sel.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Pro {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize(); 
	
	List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
	
	int s=totalframes.size();
	System.out.println(s);
	
	
	WebElement singleframe=driver.findElement(By.id("singleframe"));
	
	//method overloading
	
	driver.switchTo().frame(singleframe);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium single frame");
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	Thread.sleep(3000);
	
	WebElement parentframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	
	driver.switchTo().frame(parentframe);
	
	WebElement childframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(childframe);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nested frames");
	
	//driver.switchTo().parentFrame(); // purpose if parent frame box also have text. from child frame to parent

	driver.switchTo().defaultContent();  // it will come to webpage from frame
	
	driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}