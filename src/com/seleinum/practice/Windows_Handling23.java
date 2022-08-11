package com.seleinum.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling23 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		search.sendKeys(Keys.SHIFT, "mobile");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]")).click();

		driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]")).click();

		// windows handle= driver.getwindow hanle only parent webpage and id

		String parentID = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		System.out.println(parentID);
		System.out.println("------");

		// windows handles= it is used to handle multiple windows

		Set<String> multiple = driver.getWindowHandles();

		
		  List<String> list= new ArrayList<String>(multiple);
		  
		  driver.switchTo().window(list.get(1));
		  
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		 

		/*
		 * for (String ak : multiple) {
		 * 
		 * if (!parentID.equals(ak)) {
		 * 
		 * driver.switchTo().window(ak); System.out.println(driver.getTitle()); }
		 * 
		 * }
		 */

		driver.switchTo().window(parentID);

	}

}
