package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtionAlignCheckFaceBook {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(3000);
		int y1=driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int y2=driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int y3=driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		
		if(y1==y2&&y2==y3) {
			System.out.println("Gender Buttons are aligned properly"
					+ "");
		}
		else
		{
			System.out.println("Gender Buttons are not aligned properly");
		}

	}
	
}
