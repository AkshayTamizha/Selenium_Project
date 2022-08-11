package com.sel.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absxpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//html/body/div/header/div/div/div[3]/div/a[2]/div/span")).click();;
		
		WebElement signin=driver.findElement(By.xpath("/html/body/div/header/div/div/div[3]/div/a[2]/div/span"));
	           signin.click();
	
	           WebElement email=driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/form/div/div/div/div/input"));
	           email.sendKeys("akshay@gmail.com");
	
	WebElement cont=driver.findElement(By.xpath("  /html/body/div/div/div[2]/div/div[2]/div/div/form/div/div/div/div[2]/span/span/input"));
	
	cont.click();
	
	
	
	
	
	}

}
