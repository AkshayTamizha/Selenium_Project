package com.seleinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	
	public static void main( String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		
		int s= totalframe.size();
		System.out.println(s);
		
		
		// single frame- method overloading
		
		WebElement singlefram=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(singlefram);
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Akshay");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();  // it will go to main page
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		// multiple frame
		
	WebElement multiplefram=	driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		
		driver.switchTo().frame(multiplefram);
		
		WebElement multisingle=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		
		driver.switchTo().frame(multisingle);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kutty akshu");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		
		
		
		
		
		
	
		// multiple frame
		
		
		
		
		
		
		
		
		
		
		
	}

}
