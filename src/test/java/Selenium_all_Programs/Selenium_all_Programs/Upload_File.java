package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {

	
	
	
	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollTo(0,1500)");
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("F:\\akash.py");
		
		
		
		
		
		
	}
	
	
	
	

}
