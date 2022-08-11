package com.sel.concept;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concept {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
				
				
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		
		Actions act = new Actions(driver);
		
		//moveToElement(element).build().perform() = moving the in mouse like one to other
		
		act.moveToElement(women).build().perform();
		
	WebElement casualdress=	driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
	// click.moveToElement().build(). clicking in mouse the exact element
	
		//act.click(casualdress).build().perform();
		
	//acti.contxtclick is right click the mouse the exact element
	
		act.contextClick(casualdress).build().perform();
		
		Thread.sleep(3000);
		
	Robot r = new Robot();
	
	Thread.sleep(2000);
	
		//DOWN
		r.keyPress(KeyEvent.VK_DOWN); // BOTH KEY PRES AND RELEASE FOR SELETING ONE DOWN IN RIGHT CLICK BOX
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);  // IF WE KEY PRESS AND RELEASE 2 TIMES IT GO 2 DOWN IN RIGHT CLICK BOX
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		//UP
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
