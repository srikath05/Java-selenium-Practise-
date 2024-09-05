package dynamicElements;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parids=it.next();
		String chids=it.next();
		driver.switchTo().window(chids);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parids);
		System.out.println(driver.getTitle());
		
		
		
	}

}
