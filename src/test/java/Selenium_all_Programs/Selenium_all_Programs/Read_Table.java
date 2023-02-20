package Selenium_all_Programs.Selenium_all_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Table {

	
	
	
	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	//  //*[@id="customers"]/tbody/tr[1]/th[1]	   // tr means row and th means column 
	//	 //*[@id="customers"]/tbody/tr[2]/th[1]
	//	 //*[@id="customers"]/tbody/tr[3]/th[1]
	//	 //*[@id="customers"]/tbody/tr[4]/th[1]
	//	 //*[@id="customers"]/tbody/tr[5]/th[1]
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")); // xpath to find number of rows
		int count = rows.size();  // to find no of rows 
		
		
		
	    String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
	    
		String afterXpath  = "]/td[1]";
		
		for(int i=2;i<=count;i++) {
			
			String actualXpath= beforeXpath+i+afterXpath;   // logic
			 WebElement ele=driver.findElement(By.xpath(actualXpath));
			 System.out.println(ele.getText());
		
		}
		
	System.out.println("**********************************************************");	
		
		 String beforeXpath1 = "//*[@id=\"customers\"]/tbody/tr[";
		    
			String afterXpath1  = "]/td[2]";
			
			for(int i=2;i<=count;i++) {
				
				String actualXpath1= beforeXpath1+i+afterXpath1;   // logic
				 WebElement ele1=driver.findElement(By.xpath(actualXpath1));
				 System.out.println(ele1.getText());
			
			}
		
	System.out.println("****************************************************************");	
		
	String beforeXpath2 = "//*[@id=\"customers\"]/tbody/tr[";
    
	String afterXpath2  = "]/td[3]";
	
	for(int i=2;i<=count;i++) {
		
		String actualXpath2= beforeXpath2+i+afterXpath2;   // logic
		 WebElement ele2=driver.findElement(By.xpath(actualXpath2));
		 System.out.println(ele2.getText());
	
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
