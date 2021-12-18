package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHover_Vtiger {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com");
		WebElement wb = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(wb).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String pho=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/following-sibling::p")).getText();
		System.out.println(pho);
		driver.close();		
	}

}
