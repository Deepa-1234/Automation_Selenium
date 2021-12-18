package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildtFirstNextParent {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Thread.sleep(2000);
		
		
		Set <String> allTabs=driver.getWindowHandles();		
		Iterator<String> tabsIterator = allTabs.iterator();
		
		
		while(tabsIterator.hasNext())
		{
			String wh=tabsIterator.next();
			driver.switchTo().window(wh);
			
			if(!parent.equals(wh)) 
			{
				System.out.println(driver.getTitle()+"is being closed");
				driver.close();
			}
			Thread.sleep(2000);
		}

		driver.switchTo().window(parent);
		System.out.println(driver.getTitle()+"is being closed");
		driver.close();
	}
}
