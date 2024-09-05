package dynamicElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tablesandDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
	//	 driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[text()='Option1']")).click();
		
		 WebElement option = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
						
		
		Select dropdown = new Select(option);
		
		//dropdown.selectByIndex(1);
		
		dropdown.selectByVisibleText("Option1");
		
		
		
				
		
		
				//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		
//	List<WebElement> cb=(List<WebElement>) driver.findElement(By.xpath("//div[@class='right-align']"));
//	for(WebElement listcb:cb) {
//		 if(!listcb.isEnabled())
//		 {
//			 listcb.click();
//		 }
		
	}
		
	
	}


