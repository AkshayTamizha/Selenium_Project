package com.seleinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDROPDOWN2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/r.php?locale=en_GB&display=page\"]")).click();
		
		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s= new Select(day);
		
		//select by index
		
		s.selectByIndex(22);

		List<WebElement> daylist=s.getOptions();
		
		for(WebElement dl:daylist) {
			System.out.println(dl.getText());
		}
		
		//select by visible text= black colour
		
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(month);
		
		s1.selectByVisibleText("Feb");
		
		List<WebElement> monthlist = s1.getOptions();
		
		for(WebElement ML:monthlist) {
			
			System.out.println(ML.getText());
		}
		
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));

		Select s2 = new Select(year);
		
		s2.selectByValue("1997");
		Boolean b1=s2.isMultiple(); // multipledropdown
		System.out.println(b1);
		
		
		List<WebElement>yearlist=s2.getOptions();
		for(WebElement yl:yearlist) {
			System.out.println(yl.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
