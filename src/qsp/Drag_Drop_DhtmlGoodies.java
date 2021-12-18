package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_DhtmlGoodies {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException{

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement tgt=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(src, tgt).perform();
				}
}
