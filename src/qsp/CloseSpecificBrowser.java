package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseSpecificBrowser {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter browser you want to close");
		Scanner s= new Scanner(System.in);
		String expectedTitle=s.next();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set <String> allwh=driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String actualTitle=driver.getTitle();
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				driver.close();
				System.out.println("Your choice is fulfilled");
			}
			
		}
		s.close();
	}
}
