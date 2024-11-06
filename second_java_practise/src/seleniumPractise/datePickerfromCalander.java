package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickerfromCalander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.click();
		date.sendKeys("09/11/2024");
		
		
		
	}

}
