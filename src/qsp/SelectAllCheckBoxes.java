package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxes {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("entetr url");
	
		String path=s.nextLine();
		s.close();
		WebDriver driver = new ChromeDriver();
		driver.get(path);
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
		}
		}

}
