package seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@onclick='windowAlertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("yes");
	    driver.findElement(By.xpath("//button[@onclick='promptAlertFunction()']")).click();
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().accept();
		
	}

}
