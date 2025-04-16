
package seleniumPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
		static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		driver = new ChromeDriver();
	   	driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//TakeScreenshot.takeScreenshot(driver, "C:\\Users\\ganji\\OneDrive\\Desktop\\Takescreenshot\\");
		
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		
	 
		/*
		 * for(int i=0; i<Links.size();i++) { WebElement ele = Links.get(i);
		 */
			
			for(WebElement ele : Links) {
			
			String Urllink = ele.getAttribute("href");
			
			   if (Urllink == null || Urllink.isEmpty()) {
	                System.out.println("Skipping empty or null URL");
	                continue;
	            }
					
		URL link = new URL(Urllink);
		
		HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
		httpconnect.connect();
	      if (httpconnect.getResponseCode() != 200) {
	           
	    	    System.out.println(Urllink + " is broken. HTTP Response Code: " + httpconnect.getResponseCode() + " " + httpconnect.getResponseMessage());
		        
	        } else {
	        	 System.out.println(Urllink + " is valid." + httpconnect.getResponseCode());
	         }
		
		
	}
	}
	}
		/* HttpURLConnection connection = (HttpURLConnection) new URL(linkURL).openConnection();
connection.setRequestMethod("HEAD");
int responseCode = connection.getResponseCode();
if (responseCode >= 400) {
    System.out.println("Broken Link: " + linkURL);
}
		 */
		
		/*
		 * // Open the website driver.get("https://www.amazon.in/");
		 * 
		 * // Get all the links in the webpage List<WebElement> links =
		 * driver.findElements(By.tagName("a"));
		 * 
		 * // Loop through each link and verify the response code for (WebElement link :
		 * links) { String url = link.getAttribute("href");
		 * 
		 * if (url == null || url.isEmpty()) {
		 * System.out.println("URL is either not configured or it is empty"); continue;
		 * }
		 * 
		 * try { // Open a connection to the URL HttpURLConnection connection =
		 * (HttpURLConnection) (new URL(url).openConnection());
		 * 
		 * // Set request method as "HEAD" to get just the response code //
		 * connection.setRequestMethod("HEAD");
		 * 
		 * // Connect to the URL and check response code connection.connect(); int
		 * responseCode = connection.getResponseCode();
		 * 
		 * // Check if the response code indicates a broken link if (responseCode >=
		 * 400) { System.out.println(url + " is a broken link. Response code: " +
		 * responseCode); } else { System.out.println(url + " is a valid link."); } }
		 * catch (Exception e) { System.out.println(url + " is a broken link. Error: " +
		 * e.getMessage()); } }
		 * 
		 * // Close the browser driver.quit();
		 */
	

	

	


