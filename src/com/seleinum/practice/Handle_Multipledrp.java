package com.seleinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Multipledrp {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	
	WebElement yb=driver.findElement(By.xpath("//select[@id='yearbox']"));
	selectOptionFromDropDown(yb,"1997");
	
	WebElement db = driver.findElement(By.xpath("//select[@id='daybox']"));
	selectOptionFromDropDown(db,"23");
	}
	
	public static void selectOptionFromDropDown(WebElement ele, String value) {
		
		Select s1 = new Select(ele);
		
		
		List<WebElement> alldata=s1.getOptions();
		
		for(WebElement ad:alldata) {
			
			if(ad.getText().equals(value)) {
				
				ad.click();
				break;
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
	
	
}
