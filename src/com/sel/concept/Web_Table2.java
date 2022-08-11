package com.sel.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table2 {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("simpletable"));
		
		List<WebElement> headers=table.findElements(By.tagName("th"));
		
		for(WebElement ld:headers) {
			String txt=ld.getText();
			System.out.println(txt);
		}
		
		
		List<WebElement> allrows=table.findElements(By.cssSelector("tbody tr"));
		
		int a =allrows.size();
		System.out.println(a);
		
		
		for(WebElement row: allrows) {
			
			List<WebElement> coloumn=row.findElements(By.tagName("td"));
			
			WebElement firstcoloumn=coloumn.get(0);
		
		System.out.println(firstcoloumn.getText());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
