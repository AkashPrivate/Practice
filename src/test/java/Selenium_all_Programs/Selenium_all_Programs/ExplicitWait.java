package Selenium_all_Programs.Selenium_all_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Edit']")));
		ele.click();
		
		
		
		
		
	}

}
