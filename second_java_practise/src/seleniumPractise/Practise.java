package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		 
		 		
	//	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ganji\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Join now")).click();
		driver.findElement(By.id("email-or-phone")).sendKeys("808864576");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shiri0528");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
}
