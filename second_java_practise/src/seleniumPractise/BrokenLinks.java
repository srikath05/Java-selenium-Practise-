package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrokenLinks {
		static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		driver = new ChromeDriver();
	   
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS );
		
		
		TakeScreenshot.takeScreenshot(driver, "C:\\Users\\ganji\\OneDrive\\Desktop\\Takescreenshot\\");
		
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		
	
		for(int i=0; i<Links.size();i++)
		{			
			WebElement ele = Links.get(i);
			String Urllink = ele.getAttribute("href");
			try {
				VerifyLink(Urllink);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				 e.printStackTrace();
			}
		}driver.quit();
		
	}

	private static void VerifyLink(String Urllink)throws IOException {
		
		URL link = new URL(Urllink);
		
		HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
		httpconnect.connect();
		if(httpconnect.getResponseCode()==404) {
			System.out.println("Result =" + Urllink +" "+ httpconnect.getResponseMessage());
		}
		
		
	}
		
		
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
	}

	

	


