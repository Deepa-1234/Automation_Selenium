package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCountWindows {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWh = driver.getWindowHandles();
		System.out.println("NO of windows:"+allWh.size());
		for(String wh:allWh)
		{
			System.out.println("window handle:"+wh);
			driver.switchTo().window(wh);
			System.out.println("Title:"+driver.getTitle());
			driver.close();
		}

	}

}
