package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFontTypeSizeFaceBook {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String fontsize=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
		String fontweight=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-weight");
		String color=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		System.out.println(fontsize);
		System.out.println(color);
		System.out.println(fontweight);
		driver.quit();
	}
	

}
