package Selenium_all_Programs.Selenium_all_Programs;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighLightElement {

	public static void main(String[] args) {
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
		WebElement emailTxt = driver.findElement(By.xpath("//input[@id='email']"));  
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.background='red'", emailTxt); 
		
		
		
		
		
		
		
	}

}
