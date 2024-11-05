package seleniumPractise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String MainWindowHandle = driver.getWindowHandle();
		System.out.println("main window handle is = " + MainWindowHandle );
		WebElement link = driver.findElement(By.xpath("//button[@onclick = 'myFunction()']"));
		link.click(); 

		Set<String> AllWindowHandles = driver.getWindowHandles();
		System.out.println(AllWindowHandles);

		for (String windowHandle : AllWindowHandles) {
			if (!windowHandle.equals(MainWindowHandle)) {
				driver.switchTo().window(windowHandle); // Switch to new window
				break;
			}
		}		
		
		String newwindowUrl = driver.getCurrentUrl();
		System.out.println(newwindowUrl);
		
		String expectedUrl ="https://demo.opencart.com/";
		if (newwindowUrl.equals(expectedUrl)) {
			System.out.println("URL is correct: " + newwindowUrl);
		} else {
			System.out.println("URL is incorrect. Expected: " + expectedUrl + ", but got: " + newwindowUrl);
		}
		WebElement element = driver.findElement(By.xpath("//input[@name='search']"));
		element.sendKeys("apple");
		element.sendKeys(Keys.ENTER);

		// driver.close();
		driver.switchTo().window(MainWindowHandle);

		//driver.quit();
		
	}	
	public static void switchToNewWindow(WebDriver driver) {
	    // Storing the main window handle
        String mainWindowHandle = driver.getWindowHandle(); 
		
		// Fetching all open window handles
        Set<String> windowHandles = driver.getWindowHandles(); 
		
        for (String windowHandle : windowHandles) {
            // Switch to the new window handle that is not the main window
            if (!windowHandle.equals(mainWindowHandle)) {
                // Switching to the new window/tab
                driver.switchTo().window(windowHandle);
                break; // Exit loop after switching
           
            }
}
  }
}