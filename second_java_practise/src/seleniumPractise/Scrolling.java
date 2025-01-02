 package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class Scrolling {

	public static void main(String[] args) {
		
	// System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://www.seleniumhq.org/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)");
		System.out.println("headless success" + js.executeScript("window.scrollBy(0,2000)"));

	}

}
