package qsp;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class PrintFlightListYatra {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.yatra.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//input[@name='flight_origin'])[1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();


		driver.findElement(By.xpath("//p[contains(text(),'Goa ')]")).click();
		driver.findElement(By.xpath("//input[@value='Search Flights']")).click();

		driver.findElement(By.xpath("//td[@title='Friday, 31 December 2021']")).click();
		driver.findElement(By.xpath("//input[@value='Search Flights']")).click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		for(int i=0;i<=6;i++)
		{
			Thread.sleep(3000);
			j.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		}
		//Thread.sleep(2000);
		//j.executeScript("window.scrollTo(0,0)");


		
		List<WebElement> flightList = driver.findElements(By.xpath("//span[@class='i-b text ellipsis']"));
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='i-b tipsy fare-summary-tooltip fs-18']"));
		System.out.println("flight count:"+flightList.size());
		System.out.println("Price list count:"+priceList.size());
		for(int i=0;i<flightList.size();i++) {
			System.out.print(flightList.get(i).getText());
			System.out.println("--->"+priceList.get(i).getText());


		}
		driver.close();
	}

}

