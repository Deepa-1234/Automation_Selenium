package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllExceptChoice {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter browser you don't want to close");
		
			Scanner s= new Scanner(System.in);
			String choice=s.next();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com");
			Set <String> allWh=driver.getWindowHandles();
			for(String wh:allWh) {
				driver.switchTo().window(wh);
				if(!driver.getTitle().equals(choice))
				{
					driver.close();
				}
			}
			
			s.close();
		}
}
