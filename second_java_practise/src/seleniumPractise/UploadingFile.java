package seleniumPractise;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadingFile {
	static WebDriver driver;
	public static void main(String[] args) {
				
		    driver=new ChromeDriver();		
			driver.get("https://selectorshub.com/xpath-practice-page");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\ganji\\OneDrive\\Desktop\\MT.docx");
	
			driver.switchTo().newWindow(WindowType.TAB); 
			driver.switchTo().newWindow(WindowType.WINDOW);
	
		  
			WebElement element = driver.findElement(By.xpath("//a[text()='Click here to practice iframe and nested iframe scenarios.']"));
			Actions action = new Actions(driver);
			
			action.moveToElement(element).perform();
		
		//	action.keyDown(Keys.SHIFT).sendKeys("qwerty").keyUp(Keys.SHIFT).sendKeys("qwerty").perform();
			
			
			action.dragAndDropBy(element, 30,0).perform();
			action.contextClick(element).perform();
			action.clickAndHold(element).moveToElement(element).release(element).build();
			action.dragAndDrop(element, element);
	        WebElement hiddenElement = driver.findElement(By.id("hiddenElementID"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].clicl();", hiddenElement);
			
	}

}
