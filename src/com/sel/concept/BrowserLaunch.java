package com.sel.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		// map concept--( key-- Driver name, value--path of chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		//upcasting-- parent class accessing the properties of child class
		
		//webdriver---  is a interface, ( base class) its a parent interface it has all methods for selenium
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  // launch the particular url
		
		String title=driver.getTitle();  // use to get the title of the given url or site
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();  // use to maximize webpage which out of web page so manage will be used
		
		// navigate methods
		
		driver.navigate().to("https://www.instagram.com/"); //navigate to next url
		
		driver.navigate().back();  // it will back to fb page
		
		driver.navigate().forward(); // it will forward to insta page
		
		driver.navigate().refresh(); // it will refresh the page
		
		driver.close(); // it will close current window
		
		driver.quit(); // for multiple windows close 
		
		
		
		
	}

}
