package com.seleinum.practice;

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

public class Waits23 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.amazon.in/");
		
		
		
		driver.manage().window().maximize();
	

		//in thread sleep if giv 4000 it check and exectur ater 4000// in waits if give 4000 it will check at every seconds and if its found skip the rest of the seconds
		
		
		// implicity wiat= used to check the dom every second if its cound skip the rest second for all webelement
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for all element
		
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
		//Explict wait- it will check the dom each and every seco if found skip the other second for only one web elemtn
		
	WebDriverWait wait= new WebDriverWait(driver,3000);
	wait.until(ExpectedConditions.visibilityOf(logo));
	
	logo.click();
	
	//fluentwait- if we 30 sec and polling 10 sec it check the dom at only 10 sec if it catch skip the rest of the second
	
	
	Wait w1= new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10));
	
	//Wiat w1= new FLUENTwAIT(DRIVER).WITHtIMEOUT(Duration.ofseconm).Pollingecer9(duration0;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}