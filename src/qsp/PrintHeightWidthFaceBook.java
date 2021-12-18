package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightWidthFaceBook {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Dimension dimension = driver.findElement(By.id("email")).getSize();
		int h1 = dimension.getHeight();
		int w1 = dimension.getWidth();
		
		System.out.println("height:"+h1);
		System.out.println("width:"+w1);
		driver.quit();
	}

}
