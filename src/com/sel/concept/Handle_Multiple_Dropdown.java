package com.sel.concept;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Multiple_Dropdown { // its not multiple dropdwon its another way for calling
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		WebElement sk=driver.findElement(By.id("Skills"));
		selectOptionFromDropDown(sk, "Android");
		
		
		WebElement cn=driver.findElement(By.id("daybox"));
		selectOptionFromDropDown(cn, "23");
		
		WebElement yb=driver.findElement(By.id("yearbox"));
		selectOptionFromDropDown(yb, "1997");
				
	}
	
	public static void selectOptionFromDropDown(WebElement ele, String value) {
		
		Select drp = new Select(ele);
		
		List<WebElement> alloptions =  drp.getOptions();
		
		for( WebElement option: alloptions) {
			
			if(option.getText().equals(value)){
				option.click();
				break;
					
				
			}
		}
		
		
		
	}

}
