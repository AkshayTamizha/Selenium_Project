package com.sel.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_xpathR {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//relative x path
		
		driver.findElement(By.xpath("//input[@id=\'search_query_top\']")).sendKeys("T.shirts");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		
		
		
	}

}
