package com.sel.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement data= driver.findElement(By.id("day"));
		          
		//select = class, we should create object
		
		// selectByIndex
		
		 Select s = new Select(data);
		 
		s.selectByIndex(4);
		
		List<WebElement> datelist=s.getOptions(); // datelist= 1,2,3,4,5,6,...
		
		int dl = datelist.size(); // date size 31
		
		for(int i=0;i<dl;i++) {
			
			System.out.println(datelist.get(i).getText());
		}
		
		Thread.sleep(3000);
		
		//selectBy VisibleText
		
		WebElement month =driver.findElement(By.name("birthday_month"));
		
		Select s1 = new Select(month);
		
	s1.selectByVisibleText("Apr");
	
	// s1.gett option to print all the months in the month list in fb page
			List<WebElement> monthlist =s1.getOptions();
			
			for(WebElement ml: monthlist) {
				
				System.out.println(ml.getText());
			}
	
	Thread.sleep(3000);
	//select by value
	
	WebElement year =driver.findElement(By.name("birthday_year"));
		
		Select s2 = new Select(year);
		
		 s2.selectByValue("2014");
		
		
		
		List<WebElement> yearlist=s2.getOptions();
		
		int size=yearlist.size();
		System.out.println(size);
		
		
		for(WebElement yl: yearlist) {
			System.out.println(yl.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
