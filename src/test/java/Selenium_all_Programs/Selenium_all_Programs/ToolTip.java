package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	
	
	
	public static void main(String[] args) {

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String str=driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("title");
		System.out.println(str);
		
		
		
		
		
	}

}
