package seleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickoneachLinkofthePage {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Initialize WebDriver
		
         driver = new ChromeDriver();
        
     
            // Navigate to the desired web page
            driver.get("https://www.amazon.in/"); 
            
            // Find all links on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));
    		
            
            // Initialize WebDriverWait
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          
          for(int i =0; i<links.size(); i++) {
        	  
        	  WebElement link = links.get(i);
        	  try {
        		  link.click();
            	  
            	  wait.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
        	  
        	  driver.navigate().back();
        	  
        	  links = driver.findElements(By.tagName("a"));
        	  }
        	  catch (Exception e) {
        		  System.out.println("error cliks link"+ e.getMessage());
        		  
        	  }
        	 
          }
          
       
	}
	
}
           
        
    

	
	


