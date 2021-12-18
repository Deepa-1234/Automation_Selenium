package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIphone3andPrice {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//List<WebElement> product = driver.findElements(By.xpath("//div[@class='_2kHMtA']//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
		//List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../..//div[contains(@class,'_30jeq3 _1_WHN1')]"));
		
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));

		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'_30jeq3 _1_WHN1')]"));
		
		for(int i=0;i<product.size();i++) {
			System.out.println(product.get(i).getText()+"----> "+price.get(i).getText());
		}
		driver.quit();
}
}
