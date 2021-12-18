package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselectReverse {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/html/hotel.html");
		Select s= new Select(driver.findElement(By.id("mtr")));
		
		for(int i=0;i<s.getOptions().size();i++) {
			s.selectByIndex(i);
		}
		Thread.sleep(1000);
		for(int i=s.getOptions().size()-1;i>=0;i--) {
			s.deselectByIndex(i);
		}
		driver.close();
}
}
