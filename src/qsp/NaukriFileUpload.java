package qsp;

import java.io.File;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class NaukriFileUpload {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");

		
		
		File f=new File("./data/Resume.docx");
		String absPath = f.getAbsolutePath();
		System.out.println(absPath);
		
		Thread.sleep(2000);

		
		
		driver.findElement(By.xpath("//input[@id='file_upload']")).sendKeys(absPath);
		System.out.println("resume uploaded successfully");
		driver.close();
	}

}