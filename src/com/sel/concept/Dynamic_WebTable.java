package com.sel.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
   driver.get("https://money.rediff.com/gainers");	
   
   driver.manage().window().maximize();
   
   Thread.sleep(3000);

List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));


List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

Thread.sleep(3000);
	
for(int i =0;i<companynames.size();i++) {  // company name vandhy spl indus match aiduchina price ah print panu
		
	if(companynames.get(i).getText().equalsIgnoreCase("Superhouse")) {
		
		System.out.println(currentprice.get(i).getText());
	}
	



		
		
}

}
}
