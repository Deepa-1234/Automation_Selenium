package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggAmazon {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro max");
		List<WebElement> sugges = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		int count=sugges.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {	
			System.out.println(sugges.get(i).getText());
		}
		sugges.get(count-1).click();
	}
}

