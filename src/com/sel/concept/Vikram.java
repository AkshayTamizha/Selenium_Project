package com.sel.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vikram {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	 WebElement search=driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div/div/div[2]/input"));
		
             search.sendKeys("Vikram movie download");
             
             search.click();
             
		
		
		
	}
	
}
