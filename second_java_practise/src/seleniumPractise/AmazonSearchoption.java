package seleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchoption {

	static WebDriver driver;
		    public static void main(String[] args) throws InterruptedException {
		        // Setup ChromeDriver path (replace with your local path to chromedriver)

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Launch Amazon website
		        driver.get("https://www.amazon.in/");

		        // Maximize the browser window
		        driver.manage().window().maximize();
		       // driver.manage().window().fullscreen();
		        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		        // Search for "Mobile"
		        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		        WebElement searchs = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		         
		        search.sendKeys("Mobile");
		        driver.findElement(By.id("nav-search-submit-button")).click();
 
		        // Wait for the results to load
		        Thread.sleep(3000);  // Simple wait

		        // Find all product names and prices on the first page
		        List<WebElement> productNames = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
		        List<WebElement> productPrices = driver.findElements(By.cssSelector("span.a-price-whole"));

		        // Print product name and price
		        for (int i = 0; i < productNames.size(); i++) 
		          {
		            String name = productNames.get(i).getText();
		            String price = (i < productPrices.size()) ? productPrices.get(i).getText() : "Price not available";
		            System.out.println("Product Name: " + name );
		            System.out.println(" Price: " + price);
		          }  	
		        
		        }
		        }
		

	
