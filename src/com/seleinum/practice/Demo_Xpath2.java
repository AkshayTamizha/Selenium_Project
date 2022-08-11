package com.seleinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Xpath2 {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		// relative xpath
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top']"));
		
		search.sendKeys("T-Shirts");
		
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		driver.findElement(By.xpath("//div[@class='product-container']")).click();
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
		
		
	}
	
	
	
	
	
	
	
}
