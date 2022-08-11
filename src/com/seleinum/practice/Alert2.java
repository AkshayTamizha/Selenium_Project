package com.seleinum.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		// simple alert
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(4000);
		
		Alert simple=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		simple.accept();
		
		Thread.sleep(5000);
		//confirm alert= accept or dismiss
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(5000);
	 
		Alert confirmAlert= driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		confirmAlert.dismiss();
		
		//time alert- alert after 5 sec=
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        
		Thread.sleep(6000);
        
        Alert timealert=driver.switchTo().alert();
        
        timealert.accept();
        
        
		
		
		//prompt alert= accept or dismiss or sendkeys
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(5000);
		
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("Akshay");
		promptAlert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
}
