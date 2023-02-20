package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_AllPrograms {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	driver.get("https://letcode.in/forms");

//*************** FOR SENDKEYS WITH USING ID LOCATOR  ***********************************************************//

//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('firstname').value='akash'");

//*************FOR CLICK**************************************
//		driver.get("https://www.google.com/search?q=google+translate&oq=goo&aqs=chrome.1.69i59l2j69i57j0i131i433i457j0j0i433l2j0.2556j0j15&sourceid=chrome&ie=UTF-8");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('tw-sl').click()");

//*****************GET Text ********************************		
//		driver.get("https://letcode.in/edit");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String text = (String) js.executeScript("return document.getElementById('join').value");
//		System.out.println(text);
		
		
//****************GOTO URL *********************
		
		
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.location='https://letcode.in/edit'");
		
		
//*****************GET Title *********************
//		driver.get("https://letcode.in/test");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String t=js.executeScript("return document.title").toString();
//		System.out.println(t);
		
//******************GET URL**********************		
		
//		driver.get("https://letcode.in/test");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    String t=js.executeScript("return document.URL").toString();
//	     System.out.println(t);
		
//******************GET Domain**********************			
		
	//	driver.get("https://letcode.in/test");
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//    String t=js.executeScript("return document.domain").toString();
	//    System.out.println(t);	
		
		
		
		
		
		
	}

}
