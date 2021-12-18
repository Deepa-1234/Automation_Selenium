package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/Dell/OneDrive/Desktop/html/Demo.html");
	//driver.get("https://www.facebook.com");
//	Thread.sleep(2000);
//	driver.findElement(By.tagName("a")).click();
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.findElement(By.id("d1")).click();
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.findElement(By.name("n1")).click();
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.findElement(By.className("c1")).click();
//	driver.navigate().back();
//	Thread.sleep(2000);
	driver.findElement(By.linkText("GOOGLE")).click();
	driver.navigate().back();
	driver.findElement(By.partialLinkText("GOOGLE")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[href='https://www.facebook.com']")).click();
	

	}

}
