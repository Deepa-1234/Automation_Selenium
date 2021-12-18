package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class PrintHeightWidthActiTime {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Dimension dimension = driver.findElement(By.id("username")).getSize();
		int h1 = dimension.getHeight();
		int w1 = dimension.getWidth();
		
		dimension=driver.findElement(By.name("pwd")).getSize();
		int h2 = dimension.getHeight();
		int w2 = dimension.getWidth();
		if(h1==h2&&w1==w2) {
			System.out.println("Height and width are equal");
		}
		else {
			System.out.println("Height and width are not equal");
		}
		driver.quit();
		
	}

}
