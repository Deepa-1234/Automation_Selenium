package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailNavToGoogle {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(1000);
		String currenturl = driver.getCurrentUrl();
	//	System.out.println(currenturl);
		if(currenturl.contains("google.com"))
			System.out.println("navigating to google.com");
		else
			System.out.println("not navigating to google.com");
		driver.quit();
	
}
}
