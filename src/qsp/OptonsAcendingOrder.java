package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptonsAcendingOrder {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/html/hotel.html");
		Select s= new Select(driver.findElement(By.id("mtr")));
		List <WebElement> elements=s.getOptions();
		TreeSet<String> tset= new TreeSet<>();
		
		for(int i=0;i<elements.size();i++) {
			tset.add(elements.get(i).getText());
		}
		System.out.println(tset);
		driver.quit();
	}
}
