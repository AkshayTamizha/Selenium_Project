package com.sel.concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
				
		// simple alert =ok = accept()
		
       driver.findElement(By.id("alertButton")).click();
       
       //switching alert
       
       Alert simpleAlert = driver.switchTo().alert();
       
       Thread.sleep(2000);
       
	         simpleAlert.accept();

	         // conform alert= ok or cancel = accept() or dismiss()
	         
	         WebElement confirmbutton= driver.findElement(By.id("confirmButton"));
	         confirmbutton.click();
	         
	         Thread.sleep(2000);
	         	         
	         driver.switchTo().alert().dismiss();
	         
	         //prompt alert= ok or cancel or send key= accept() or dismiss() or sendkeys()
	         Thread.sleep(2000);
	        
	         
	          
	          
	          driver.findElement(By.id("timerAlertButton")).click();
	          
	          Thread.sleep(6000);
	          
	          Alert time=driver.switchTo().alert();
	          
	          time.accept();
	          
	          //TIME ALERT= GIVE 5 SEC THEN CLICK
	          
	          
	          
	  		 driver.findElement(By.id("promtButton")).click();  // add is coming so not work
	  		 
	  		 Alert sendke = driver.switchTo().alert(); 
	  		 
	  		 String txt=sendke.getText();
	  		 System.out.println(txt);
	  		 sendke.sendKeys("Akshay");
	  		 sendke.accept();
	  		 
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
		
		
		
		
	}
	

}
