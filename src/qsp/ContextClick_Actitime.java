package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.event.*;
import java.awt.*;

public class ContextClick_Actitime {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement we=driver.findElement(By.linkText("actiTIME Inc."));
		Actions a=new Actions(driver);
		a.contextClick(we).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		driver.quit();
		
	}

}
