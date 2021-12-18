package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTabsInNewWindowActitime {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		
		driver.findElement(By.linkText("About your actiTIME")).click();
		
		driver.findElement(By.linkText("Read Service Agreement")).click();
		
		String parent=driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if(!parent.equals(wh)) {
				
				List<WebElement> elements = driver.findElements(By.xpath("//li/span"));
				
				for(WebElement e:elements) {
					System.out.println(e.getText());
				}
			}
		}
		driver.quit();
	}
}
