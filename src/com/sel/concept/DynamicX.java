package com.sel.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicX {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']/parent::div[@class='nav-line-1-container'] ")).click();
		
		 driver.findElement(By.xpath("//label[@for='ap_email']/following-sibling::input[@type='email']")).sendKeys("9840880261");
		
		 
		driver.findElement(By.xpath(" //span[@id='continue-announce']/preceding-sibling::input[@id='continue']")).click();
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9840880261");
	
	driver.findElement(By.xpath("//input[@id='signInSubmit']/ancestor::div[@id='a-page']")).click();

}
}