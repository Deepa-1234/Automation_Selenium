package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAnchorOrNot {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tagname = driver.findElement(By.xpath("//a[contains(text(),'actiTIME')]")).getTagName();
		if(tagname.equals("a")) {
			System.out.println("link present");
		}
		else {
			System.out.println("link not present");
		}
		driver.quit();

	}
}