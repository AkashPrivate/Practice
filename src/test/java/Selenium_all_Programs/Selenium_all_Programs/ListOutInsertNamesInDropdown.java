package Selenium_all_Programs.Selenium_all_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOutInsertNamesInDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='lang']"));
		Select s=new Select(ele);
		List<WebElement>  all_options=s.getOptions();
		int  count=all_options.size();
		
		for(int i=0;i<count;i++) {
			
			String s1=all_options.get(i).getText();
			
			System.out.println(s1);
			
		}
		
		
		
		
		
	}

}
