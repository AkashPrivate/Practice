package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightCLick {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
      
		driver.manage().window().maximize();
		driver.get("https://www.hotelkeyapp.com/");
		WebElement ele=driver.findElement(By.xpath("//button[@class='btn hk-btn-bg hk-border-r']"));
		Actions act=new  Actions(driver);
		act.contextClick(ele).build().perform();
		
		
		
		
		
		
	}

}
