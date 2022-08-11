package com.seleinum.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch2 {

	public static void main(String[] args) {
		
		
		//map concept= key, value= driver name, driver path
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //-- use to launch the webpage
		
		String title=driver.getTitle();  // used to get the title of the webpage
		System.out.println(title);
		
		String URL=driver.getCurrentUrl(); // used to get the current url of the webpage
		System.out.println(URL);
		
		driver.manage().window().maximize();
		
		
		//navigate methods

	driver.navigate().to("https://www.instagram.com/");	

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
	         driver.close();
	         driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
