package Selenium_all_Programs.Selenium_all_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Css_Value {
	
	
	
	

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://omayo.blogspot.com/");
		String ele=driver.findElement(By.xpath("//a[@href='http://www.omayo.blogspot.com']")).getCssValue("line-height");
		System.out.println(ele);
		
	}

	
	
}
