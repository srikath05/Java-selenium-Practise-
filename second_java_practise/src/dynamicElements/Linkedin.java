package dynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Linkedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.drivr", " F:\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Join now")).click();
		driver.findElement(By.id("email-or-phone")).sendKeys("ganjishirisha@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sriansh27");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("first-name")).sendKeys("shirisha");
		driver.findElement(By.id("last-name")).sendKeys("ganji");
		
		driver.findElement(By.xpath("//button[@value='Continue']")).click();
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		
	}

}
