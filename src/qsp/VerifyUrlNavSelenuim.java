package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavSelenuim {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String currentUrl= driver.getCurrentUrl();
		if(currentUrl.contains("selenium.dev"))
			System.out.println("navigating properly");
		else
			System.out.println("Not navigating");
		driver.quit();

}
}
