package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDateOfbirthFacebook {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement element=driver.findElement(By.id("day"));
			Select date =  new Select(element);
			date.selectByValue("11");
			
			Select month= new Select(driver.findElement(By.id("month")));
			month.selectByIndex(6);
			
			Select year= new Select(driver.findElement(By.id("year")));
			year.selectByVisibleText("1983");
			driver.close();
			
	}

}
