package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PointClass {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		Point p=new Point(50, 500);
		driver.manage().window().setPosition(p);
	
		
	}

}
