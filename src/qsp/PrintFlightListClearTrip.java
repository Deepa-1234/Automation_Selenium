package qsp;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFlightListClearTrip {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='p-relative'])[2]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("(//div[@class='p-relative'])[4]")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'Goa')])[1]")).click();
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'January')]/../../div[3]/div[5]/div[5]/div[1]")).click();
		
		driver.findElement(By.xpath("//button[.='Search flights']")).click();
		Thread.sleep(3000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		for(int i=0;i<3;i++)
		{
			Thread.sleep(3000);
			j.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		}
		List<WebElement> images = driver.findElements(By.xpath("//img[@class='br-2 o-hidden mx-1']"));
		List<WebElement> priceList = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-700 c-neutral-900 h-7']"));
		System.out.println(images.size());
		System.out.println(priceList.size());
		for(int i=0;i<images.size();i++) {
			System.out.print(images.get(i).getAttribute("alt"));
			System.out.println("----->"+priceList.get(i).getText());
		}
		driver.close();
	}
}
