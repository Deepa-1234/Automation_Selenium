package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogoDispdOrNot {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean displayed = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(displayed)
			System.out.println("Logo displayed");
		else
			System.out.println("Logo not displayed");
		driver.quit();
		
		
		}
}
