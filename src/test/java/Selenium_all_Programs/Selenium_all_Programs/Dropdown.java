package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,500)");
//***************************************************************************//	    
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		Select animal = new Select(ele1);
	//	animal.selectByVisibleText("Baby Cat");
	//	animal.selectByIndex(3);
	//  animal.selectByValue("2");
		

	}

	
	
	
	
	
	
	
	
}
