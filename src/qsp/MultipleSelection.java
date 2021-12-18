
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/html/hotel.html");
		Select s= new Select(driver.findElement(By.id("mtr")));
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("v");
		Thread.sleep(1000);
		s.selectByVisibleText("dosa");
		Thread.sleep(1000);
		if(s.isMultiple())
		{
			s.deselectByIndex(0);
			Thread.sleep(1000);
			s.deselectByValue("v");
			Thread.sleep(1000);
			s.deselectByVisibleText("dosa");
			
		}
		Select ss=new Select(driver.findElement(By.id("mtr")));
		WebElement ele = ss.getWrappedElement();
		System.out.println(ele.getText());
		driver.quit();
	}

}
