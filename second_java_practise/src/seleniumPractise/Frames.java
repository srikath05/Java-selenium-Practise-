package seleniumPractise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Set up WebDriver (example with ChromeDriver)
       driver = new ChromeDriver();
        
        // Navigate to the webpage with an iframe
        driver.get("https://selectorshub.com/xpath-practice-page");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // 1. Switch to iframe using index (if the iframe is the first one on the page)
      //  driver.switchTo().frame(0);  // Index starts from 0
        
        // 2. Or switch to iframe using name or ID
        // driver.switchTo().frame("iframe_name_or_id");

        // 3. Or switch to iframe using a WebElement
        // WebElement iframeElement = driver.findElement(By.id("iframe_id"));
        // driver.switchTo().frame(iframeElement);

        // Perform actions inside the iframe
        WebElement elementInIframe = driver.findElement(By.xpath("//a[text()='Click to practice shadow dom inside iframe scenario']"));
        elementInIframe.click();

        // Switch back to the main content (outside the iframe)
        driver.switchTo().defaultContent();

        // Perform actions in the main document
        WebElement elementOutsideIframe = driver.findElement(By.id("element_outside_iframe"));
        elementOutsideIframe.click();

        // Close the browser
        driver.quit();
    }

	}


