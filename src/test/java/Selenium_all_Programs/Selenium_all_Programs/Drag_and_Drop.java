package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {
	
	
	
	

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		WebElement ele1=driver.findElement(By.xpath("//p[@id='text']"));
		WebElement ele2 =driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(ele1, ele2).build().perform();
		
	
	}

}
