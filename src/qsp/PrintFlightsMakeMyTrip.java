package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PrintFlightsMakeMyTrip {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//input[@class='fsw_inputField lineHeight36 latoBlack font30']"));
		Actions a=new Actions(driver);
		a.moveToElement(element).click().perform();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//p[.='Bangalore, India']")).click();
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//p[.='Goa, India']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'December')]/../..//p[.='31']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		
		
		List<WebElement> flightList = driver.findElements(By.xpath("//span[@class='boldFont blackText airlineName']"));
		List<WebElement> priceList = driver.findElements(By.xpath("//p[@class='blackText fontSize18 blackFont white-space-no-wrap']"));
		
		System.out.println("flight count:"+flightList.size());
		System.out.println("Price list count:"+priceList.size());
		for(int i=0;i<flightList.size();i++) {
			System.out.print(flightList.get(i).getText());
			System.out.println("--->"+priceList.get(i).getText());


		}
		driver.close();
	}
}
