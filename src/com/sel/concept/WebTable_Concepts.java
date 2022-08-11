package com.sel.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Concepts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		/*
		 * List<WebElement> tabledata =
		 * driver.findElements(By.xpath("//table/tbody/tr/td")); // taking all the text
		 * - for each for(WebElement data: tabledata) { String text=data.getText();
		 * System.out.println(text); }
		 */
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		for(WebElement row:rowData) {
			
			String txt=row.getText();
			System.out.println(txt);
		}
		
		List<WebElement> prtclr = driver.findElements(By.xpath("//table/tbody/tr[78]/td[4]"));
		
		
		for(WebElement prtele: prtclr) {
			
			String txt3 = prtele.getText();
		System.out.println(txt3);
		}
		
		driver.findElement(By.tagName("))
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
