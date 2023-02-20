package Selenium_all_Programs.Selenium_all_Programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Webelement {
	
	

	public static void main(String[] args) throws IOException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/dropable");
		
		
		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Sign up']"));
	//	TakesScreenshot scr = (TakesScreenshot)driver;
		File f= ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\HP\\eclipse-workspace2\\Selenium_All_Programs\\Selenium_all_Programs\\Screenshot\\sc2.png"));
		
		
		
		
		
	}

}
