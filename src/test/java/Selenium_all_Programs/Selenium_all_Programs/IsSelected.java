package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
    
		driver.get("https://letcode.in/radio");	
		WebElement ele1=driver.findElement(By.xpath("//input[@id='yes']"));
		ele1.click();
		Boolean check=ele1.isSelected();
		System.out.println(check);
		
		
		
		
		
		
	}

}
