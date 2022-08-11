package com.sel.concept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitss_1 {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	//Implicitywait- used to check the dom until find element skip the rest of seconds ( for all element)
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
	
	//explicit wait= used to check dom until find element skip rest of second(find only particular element)
	
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		logo.click();
		
		//Fluent wait or polling wait- if we give wait for 30 sec and pooling fo 10 it will check dom only 10 
		//if find element will skip the rest 30 but ot check in each every second sec
		
		
		Wait w= new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10));
		
	
		
		
		
		
		
		
		
		
		
	
		
	}	

}
