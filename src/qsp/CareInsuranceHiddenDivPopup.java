package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceHiddenDivPopup {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		Select month= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByIndex(2);
		
		Select year= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("1984");
		driver.findElement(By.xpath("//a[.='1']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		
		
			String text=driver.findElement(By.id("policynumberError")).getText();
			if(text.contains("Please enter valid Policy No.")) 
			{
				System.out.println(text);
			}
		
		
//		if(driver.findElement(By.id("policynumberError")).getText().length()!=0)
//		{
//			String text=driver.findElement(By.id("policynumberError")).getText();
//			if(text.contains("Please enter valid Policy No.")) 
//			{
//				System.out.println(text);
//			}
//		}
			driver.quit();
			
		
	}
}
