package seleniumPractise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class WebTableCheckboxesClicking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='resultTable']//tr//td[1]//input"));
	
		//List<WebElement> rows= driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
	
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//System.out.println("headless success" + js.executeScript("window.scrollBy(0,1000)"));
					
		//for (int i = 0; i < checkboxes.size(); i++) {
		//WebElement checkbox = checkboxes.get(i);
			
			for(WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				
				Thread.sleep(3000);
				System.out.println("Checkbox " + checkbox + " clicked.");
				} else {
				System.out.println("Checkbox " + checkbox + "  is already selected.");
			}
		}
 
		//driver.quit();
	}

	}


