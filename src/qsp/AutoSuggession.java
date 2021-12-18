package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
	
		List<WebElement> elements = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			System.err.println(elements.get(i).getText());
		}
		elements.get(0).click();
		
	}
}
