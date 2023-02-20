package Selenium_all_Programs.Selenium_all_Programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Webpage {
	
	
	
	

	public static void main(String[] args) throws IOException {

		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		TakesScreenshot scr = (TakesScreenshot)driver;
		File f= scr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\HP\\eclipse-workspace2\\Selenium_All_Programs\\Selenium_all_Programs\\Screenshot\\sc1.png"));
		
		
		
		
	}
	
	

}
