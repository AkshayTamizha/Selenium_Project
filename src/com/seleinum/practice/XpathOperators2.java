package com.seleinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOperators2 {

	public static void main( String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		// xpath operators
		//Or operator whether one shoudld be same
		
		/*
		 * driver.findElement(By.
		 * xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys(
		 * "T-shirts");
		 * 
		 * driver.findElement(By.
		 * xpath("//button[@name='submit_search' or @class='btn btn-default button-search']"
		 * )).click();
		 * 
		 */
		// and operator= both should be same

		/*
		 * driver.findElement(By.xpath("//img[@class='item-img' and @height='219']")).
		 * click();
		 * 
		 * Thread.sleep(7000);
		 * 
		 * driver.findElement(By.xpath("//img[@class='lazyloaded' and @alt='Huygens']"))
		 * .click();
		 */
		
		
		/*
		 * //contains- letter should contains ina nay part of word
		 * 
		 * driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys(
		 * "T-shirts");
		 * 
		 * driver.findElement(By.
		 * xpath("//button[contains(@class,'default button-search')]")).click();
		 * 
		 */
		// starts with
		/*
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//a[starts-with(@title,'Dresses')][1]")).click()
		 * ;
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//a[starts-with(@title,'Cas')][1]")).click();
		 */
		
		
		//xpath with text
		
		//tagname[text()='value] // tagname[text()='value'] // tagname[text()='value'], tagname[text()='value']-
		
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//chained xpath
		
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-shirts");
		
		//taganem[@attrname='value]//childtagname[index]
		
		//or /tagname[@attname='value']//childtaganme[@attt="value]
		
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
