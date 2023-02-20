package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws Throwable {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
      
//		driver.manage().window().maximize();
//		driver.get("https://letcode.in/alert");
		
//		driver.findElement(By.xpath("//button[@id='accept']")).click();
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//button[@id='confirm']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
		
		
//		driver.findElement(By.xpath("//button[@id='prompt']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().sendKeys("akash choudhary");
//		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[@id='modern']")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}

}
