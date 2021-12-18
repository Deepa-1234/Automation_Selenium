package qsp;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("file:///C:/Users/Dell/OneDrive/Desktop/Demo.html");
		Scanner s= new Scanner(System.in);
		System.err.println("enter url");
		String url=s.nextLine();
		s.close();
		driver.get(url);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println("total number of elements:"+links.size());
    for(int i=0;i<links.size();i++) {
    String text=links.get(i).getText();
    System.out.println(text);
    }

	driver.quit();
	
	}
}