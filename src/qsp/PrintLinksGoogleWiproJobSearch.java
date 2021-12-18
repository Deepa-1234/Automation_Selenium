package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksGoogleWiproJobSearch {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		
		//List<WebElement> ele = driver.findElements(By.xpath("//span[contains(text(),'wipro')]"));
		//ele.get(0).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());
		for(WebElement wb:elements) {
			System.out.println(wb.getAttribute("href"));
		}
		driver.quit();
		
}
}
