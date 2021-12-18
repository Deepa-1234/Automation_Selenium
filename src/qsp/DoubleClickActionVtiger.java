package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DoubleClickActionVtiger {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement wb=driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(wb).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		driver.findElement(By.linkText("READ FULL STORY")).click();
		String pageName=driver.getTitle();
		if(pageName.contains("HackerEarth")) {
			System.out.println("HackerEarth page is being displayed");
		}
		else {
			System.out.println("HackerEarth page is not displayed");
		}
		driver.close();
	}

}
