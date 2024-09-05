package seleniumPractise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
	
		/*
		 * System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		 * ChromeDriver driver=new ChromeDriver();
		 * driver.get("http://www.testingmasters.com/hrm");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * 
		 * driver.manage().deleteAllCookies();
		 * 
		 * Set<Cookie> cookies= driver.manage().getCookies(); for(Cookie c:cookies) {
		 * System.out.println(c); }
		 */
		
		for(int i=1;i<=100;i++) {
			
			System.out.println(i);
		}

	}

}
