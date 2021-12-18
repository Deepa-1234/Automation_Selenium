package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Present {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
boolean isSelected=driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
if(isSelected) {
	System.out.println("Check box Selected");
}
else
{
	System.out.println("Not selected");
}

	}

}
