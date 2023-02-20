package Selenium_all_Programs.Selenium_all_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles {
	
	
	

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
	/*	driver.findElement(By.xpath("//button[@id='home']")).click();
		        Set<String>   allwindows=driver.getWindowHandles();
		        Iterator<String> itr= allwindows.iterator();
		        String parentWindow=itr.next();
		        String childWindow=itr.next();
		        
		        
		        driver.switchTo().window(childWindow);
		        driver.findElement(By.xpath("//a[normalize-space()='Edit']")).click();		        
		        driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("akash choudhary");
		        driver.close();
	*/	
		        driver.findElement(By.xpath("//button[@id='multi']")).click();
		        Set<String>   allwindows1=driver.getWindowHandles();
		        Iterator<String> itr1= allwindows1.iterator();
		        String parentWindow1=itr1.next();
		        String childWindow1=itr1.next();
		        String childWindow2=itr1.next();
		        driver.switchTo().window(childWindow1);
		        WebElement ele=driver.findElement(By.xpath("//*[@id=\"fruits\"]"));
		        Select drop=new Select(ele);
		        drop.selectByVisibleText("Apple");
		
	}

}
