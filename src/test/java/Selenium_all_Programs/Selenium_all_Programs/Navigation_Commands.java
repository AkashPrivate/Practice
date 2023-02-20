package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
      
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
	}

}
