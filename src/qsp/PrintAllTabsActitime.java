package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTabsActitime {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set <String> allTabs=driver.getWindowHandles();
		for(String tab:allTabs)
		{
			//
			driver.switchTo().window(tab);
			System.out.println(tab);
			//driver.close();
			
		}
}

}
