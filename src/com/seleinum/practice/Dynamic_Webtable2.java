package com.seleinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable2 {

	public static void main(String[] args) throws InterruptedException {
		
	
	
	

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
driver.get("https://money.rediff.com/gainers");	

driver.manage().window().maximize();

Thread.sleep(3000);

List<WebElement> companyname=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

List<WebElement> Currenrtpirce=driver.findElements(By.xpath("//table/tbody/tr/td[4]"));




for(int i=0;i<companyname.size();i++) {
	
	if(companyname.get(i).getText().equalsIgnoreCase("eMudhra")){
		
		System.out.println(Currenrtpirce.get(i).getText());
		
		
		
	}
	
	
}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	




	
}
