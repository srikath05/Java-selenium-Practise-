package selenium_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import seleniumPractise.webelement;

public class CountofLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	static WebDriver driver;
		
		WebDriver driver = new ChromeDriver();
		ChromeDriver Driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.out.println("Title = "+driver.getTitle());
		List<WebElement> links = driver.findElements(By.tagName("a")) ;
		
		
		
		int countoflinks = links.size();
		
		System.out.println("count of Links on the page" + " " + countoflinks);
		
		driver.quit();
		
	
		

	}

}
