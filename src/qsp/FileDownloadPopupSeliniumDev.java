package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.*;
import java.awt.event.KeyEvent;


public class FileDownloadPopupSeliniumDev {
	
	static{
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException{
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("4.1.0")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
