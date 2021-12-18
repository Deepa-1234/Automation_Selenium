package qsp;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOption {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/html/hotel.html");
		Select s= new Select(driver.findElement(By.id("mtr")));
		List <WebElement> elements=s.getOptions();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option name");
		String s1=sc.next();
		int count=0;
		
		LinkedHashSet<String> hset= new LinkedHashSet<>();
		for(int i=0;i<elements.size();i++) {
			hset.add(elements.get(i).getText());
		}
		
		for(String h:hset) {
			if(h.contains(s1)) {
				System.out.println("element Found");
				count=1;
			}
		}

		if(count==0) {
			System.out.println("option not found");
		}
		driver.quit();
		sc.close();
}
}
