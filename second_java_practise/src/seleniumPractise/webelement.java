package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement table=driver.findElement(By.cssSelector("table[class='tsc_table_s13]"));
		//table.findElements(By.cssSelector(cssSelector))
		
		
		
	}

}
