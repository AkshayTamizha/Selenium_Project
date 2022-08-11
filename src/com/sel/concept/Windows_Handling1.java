package com.sel.concept;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys(Keys.SHIFT,"mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]")).click();
		driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]")).click();
		
		String parentID =driver.getWindowHandle();
		System.out.println(driver.getTitle());
		System.out.println("----------");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list= new ArrayList<String>(windowHandles);
		
     Thread.sleep(2000);
		
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		//System.out.println(parentID);
		/*for(String ak:windowHandles) {
			if(!parentID.equals(ak)) {
			driver.switchTo().window(ak);
			
			System.out.println(driver.getTitle());
		}
		*/
			driver.switchTo().window(parentID);
		}
		
	}


