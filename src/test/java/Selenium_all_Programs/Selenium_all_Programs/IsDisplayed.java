package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement ele1=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Boolean image=ele1.isDisplayed();	
		System.out.println("The image is displayed" +image);
		
		
		
		
		
		
	}

}
