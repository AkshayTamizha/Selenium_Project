package com.sel.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOperators {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//xpath with or operators 
		
		/*
		 * WebElement search=driver.findElement(By.
		 * xpath("//input[@id='search_query_top' or name='search_query']"));
		 * search.sendKeys("Tshirts"); // both match no prob atlease one attribute
		 * should be correct
		 * 
		 * WebElement button= driver.findElement(By.
		 * xpath("//button[@name='submit_search' or class='btn btn-default button-search1']"
		 * )); button.click();
		 * 
		 * //xpath with and operator
		 * 
		 * driver.findElement(By.xpath(
		 * "//input[@id='search_query_top'and@name='search_query']")).sendKeys(
		 * "T-SHIRTS"); //When its come to and operator both attribute should be correct
		 * driver.findElement(By.
		 * xpath("//button[@name='submit_search'and@class='btn btn-default button-search']"
		 * )).click();
		 */
		 
		 //xpath with contains() = use to check given element contains in whole value
		 
		/*
		 * WebElement sear=
		 * driver.findElement(By.xpath("//input[contains(@id,'search_query')]"));
		 * //search_query_top is actual sear.sendKeys("T-SHIRTS");
		 * 
		 * WebElement but=
		 * driver.findElement(By.xpath("//button[contains(@name,'submit_sear')]"));//
		 * submit_search is actual but.click();
		 */
		 
		//xpath with starts-with = used to check value in starting letter given element
		 
		/*
		 * driver.findElement(By.xpath("//input[starts-with(@id,'search_que')]")).
		 * sendKeys("T-shirts");
		 * driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-def')]")).
		 * click();
		 */
		 //xpath with text()
		
		/*
		 * driver.findElement(By.xpath("//a[text()='Women']")).click();
		 * 
		 * ////a[text()='Women] //a[text()='value'] // a[text()='value]
		 */
		
		
		
		//chained xpath
		
		
		driver.findElement(By.xpath("//form[@id=\"searchbox\"]//input[4]")).sendKeys("T-shirts");
		// we can writte in both ways 
		//driver.findElement(By.xpath("//form[@id=\"searchbox\"]//input[@id=\"search_query_top\"]" )).sendKeys("T-shirts");
		
	  //driver.findElement(By.xpath("//form[@id='searchbox']//button[1]")).click();
		//we can write in both ways
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
