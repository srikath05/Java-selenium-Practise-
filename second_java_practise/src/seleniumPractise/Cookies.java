package seleniumPractise;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
static WebDriver driver;
	public static void main(String[] args) {

		
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		System.out.println("hi");
		
		
		Set<Cookie> cookies= driver.manage().getCookies(); 
		for(Cookie c:cookies) {
		System.out.println(c); 
		
		}    driver.quit();
		driver.close();
	}

}
