package com.seleinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath2 {

	public static void main(String [] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//dynamic xpath- contains, sibling, ancestor
		//sibling concept- following, preceeding
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		////tagname[@attname='value]/parent::tagname[@attname='value]
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']/parent::div")).click();
		
		
		//tagname[@attname='value]/following-sbling::tagname[@attname='value']
		
		driver.findElement(By.xpath("//label[@for='ap_email']/following-sibling::input[@type='email']")).sendKeys("9840880261");
		
		//tagname[@attname='value']precceding-sibling::tagname[@atname='value']
		
		
		driver.findElement(By.xpath("//span[@id='continue-announce']/preceding-sibling::input[@id='continue']")).click();
		
		
		//ancestor= top parent= //tagname[@attname='value]/ancestor::tagname[@att='value]
		
		//get text top parent will give the all text in page
		
		WebElement txt=driver.findElement(By.xpath("//input[@id='ap_password']/ancestor::div"));
		String text=txt.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
