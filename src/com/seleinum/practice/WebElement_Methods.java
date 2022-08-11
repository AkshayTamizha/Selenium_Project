package com.seleinum.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.id("email"));
		
		
		mail.sendKeys("Akshay@gmail.com");
		
	String txt=mail.getText();
		System.out.println(txt);
		
	String atti=mail.getAttribute("placeholder");
		System.out.println(atti);
		
	
		String valu= mail.getAttribute("value");
	System.out.println(valu);
	
	
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("akshay");
	
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
	File Destination= new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumAk\\driver\\Screen2.png");
	
	FileUtils.copyFile(source, Destination);
	
	
	
	
	
	
	
	}

}
