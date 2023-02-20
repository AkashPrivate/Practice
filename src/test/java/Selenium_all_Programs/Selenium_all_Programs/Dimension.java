package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dimension {

	
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		org.openqa.selenium.Dimension d =new org.openqa.selenium.Dimension(200, 200);
		driver.manage().window().setSize(d);
		driver.get("https://letcode.in/dropable");
	
		
	}

}
