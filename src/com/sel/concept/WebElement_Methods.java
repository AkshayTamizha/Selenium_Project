package com.sel.concept;

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
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize(); // maximize the webpage
		
		WebElement email =driver.findElement(By.id("email"));
		
		email.sendKeys("aks@gmail.com");
		
		String place=email.getAttribute("placeholder");
		System.out.println(place);
		
		String value=email.getAttribute("value");
		System.out.println(value);  // value present in maill= aks@gmail.com
		
		email.clear(); // use to clear the value in email
		
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("akshu");
		
		Thread.sleep(3000);  // it user to wait till give second while other page try to finsh load
		
		/*
		 * WebElement login=driver.findElement(By.id("u_0_5_wq")); // it doesnt work
		 * using id u_05 coz 2 matches login.click(); // overcome using xpath
		 */
		//------------------------
		//how to take screenshot
		//narrowing java concpet- convert one datatype to other = higher datatype to lower datatype
		// double z= value==324.444
		// int y = (int)z = 324
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumAk\\driver\\screen.png");
		
		FileUtils.copyFile(source, destination); // to copy both source and destination
		
	}

}
