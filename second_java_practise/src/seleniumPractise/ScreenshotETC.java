package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotETC {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.id("txtUsername")).sendKeys("User02");
		 * driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		 * driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 */
		
		TakesScreenshot ss =  (TakesScreenshot) driver;
		
		File scrFile=ss.getScreenshotAs(OutputType.FILE);
		File trgtFile=new File("C:\\Users\\ganji\\OneDrive\\Desktop\\ScreenShot\\Screenshot.jpg");
		try {
			FileHandler.copy(scrFile, trgtFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.close();
			
	}

}
