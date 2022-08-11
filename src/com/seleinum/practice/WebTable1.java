package com.seleinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		
		driver.manage().window().maximize();
		
		
		/*
		 * List<WebElement>
		 * tabledata=driver.findElements(By.xpath("//table/tbody/tr/td"));
		 * 
		 * for(WebElement td:tabledata) {
		 * 
		 * System.out.println(td.getText()); }
		 */
		
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		for(WebElement rd : rowdata) {
			
			System.out.println(rd.getText());
		}
		
		
		
		  List<WebElement> columndata=driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		  
		  for(WebElement cd:columndata) {
		  
		  System.out.println(cd.getText());
		  
		  }
		 
		
		
		List<WebElement> prtdata=driver.findElements(By.xpath("//table/tbody/tr[78]/td[3] "));
		
		for(WebElement pd:prtdata) {
			
			String p = pd.getText();
					System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
