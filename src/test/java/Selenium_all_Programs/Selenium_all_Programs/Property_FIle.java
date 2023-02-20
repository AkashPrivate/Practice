package Selenium_all_Programs.Selenium_all_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_FIle {

	public static void main(String[] args) throws Throwable {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace2\\Selenium_All_Programs\\Selenium_all_Programs\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("url"));
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		
		}
		else if  (browserName.equals("edge")){
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get(prop.getProperty("url"));
			
			
		}
		
		
		
		
		

	}

}
