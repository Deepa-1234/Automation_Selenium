package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Button_Enable {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean isEnabled=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(isEnabled
				) {
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("disabled");
		}
		
		boolean isDisplayed=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(isDisplayed) 
			System.out.println("displayed");
		else
			System.out.println("not Displayed");
		

	}
}

