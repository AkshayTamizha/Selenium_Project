package com.seleinum.practice;import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupandDown {

public static void main(String[] args) throws InterruptedException {
	
	
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	 		
	 			WebDriver driver = new ChromeDriver(); 
	 		
	
	 			driver.get("https://www.amazon.in/");
	 			  
	 			  driver.manage().window().maximize();
	 			  
	 			  WebElement logo=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	 			  
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView();", logo);
	
	//js.executeScript("arguments[0].scrillIntoView();,logo
	//srollup an down = JavascriptExecuto js = n(javascriptExecuttor) driver;
	
	Thread.sleep(3000);
	
	WebElement uplogo = driver.findElement(By.xpath("//img[@alt='Up to 70% off | Electronics clearance store']"));
	
	//JavascriptExectuor js = (JavascriptExecutor)driver;
	
	Thread.sleep(300);
	
js.executeScript("arguments[0].scrollIntoView", uplogo);
	
	uplogo.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
