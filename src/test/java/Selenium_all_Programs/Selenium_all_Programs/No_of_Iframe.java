package Selenium_all_Programs.Selenium_all_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class No_of_Iframe {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		System.out.println(ele.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
