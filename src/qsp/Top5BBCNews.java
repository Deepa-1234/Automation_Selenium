package qsp;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top5BBCNews {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../../../li/a/h3"));
		for(WebElement wb:elements) {
			System.out.println(wb.getText());
		}
		driver.quit();
}
}
