package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParentBrowser {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set <String> allWh=driver.getWindowHandles();
		String parent=driver.getWindowHandle();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			if(parent.equals(wh)) 
			{
				driver.close();
			}
			Thread.sleep(2000);
		}
	}
}
