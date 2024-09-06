package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	
		public static void takeScreenshot(WebDriver driver, String filePath) throws IOException {
	        // Cast driver object to TakesScreenshot
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        
	        // Capture screenshot and store it as a file
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	        
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        
	        // Dynamic file name with timestamp
	      
	        // Specify the destination path
	        File destFile = new File(filePath+timestamp +".jpg");
	        
	        
	             // Copy file to the destination
	          FileHandler.copy(srcFile, destFile); 
	            System.out.println("Screenshot saved at: " + filePath);
		}
	}


