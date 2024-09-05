package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highligthingelement {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Element=driver.findElement(By.id("e1"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//for(int i=1;i<=2;i++) {
			js.executeScript("argements[0].style.border='solid 3px black'", Element);
			Thread.sleep(200);
			js.executeScript("argements[0].style.border=", Element);
			Thread.sleep(200);
		}

	}


