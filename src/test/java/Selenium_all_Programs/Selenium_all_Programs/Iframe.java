package Selenium_all_Programs.Selenium_all_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//*[@name=\"fname\"]")).sendKeys("akash");
		driver.findElement(By.xpath("//*[@name=\"lname\"]")).sendKeys("Choudhary");
//		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,200)");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//iframe[@class=\"has-background-white\"]"));
		Thread.sleep(2000);
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("nilesh");
		driver.switchTo().defaultContent();
	//	driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[1]/a[1]")).click();
		
	}

}
