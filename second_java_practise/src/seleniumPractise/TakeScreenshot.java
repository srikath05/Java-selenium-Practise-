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
		////////////////////////////////////////////
		
		//  @Override
		  /*  public void onTestFailure(ITestResult result) {
		        try {
		            TakesScreenshot ts = (TakesScreenshot) driver;
		            File source = ts.getScreenshotAs(OutputType.FILE);
		            Files.copy(source.toPath(), new File("./Screenshots/" + result.getName() + ".png").toPath());
		            System.out.println("Screenshot captured for failed test case: " + result.getName());
		        } catch (Exception e) {
		            e.printStackTrace();
		        }*/
		
		////////////////////////////////////////

        // Take a screenshot
    /*    Screenshot screenshot = ((ITakesScreenshot)driver).GetScreenshot();

        // Generate timestamp for unique file name
        string timestamp = DateTime.Now.ToString("yyyyMMdd_HHmmss");

        // Define the destination path
        string filePath = @"C:\Screenshots\Screenshot_" + timestamp + ".jpg";

        // Save the screenshot
        screenshot.SaveAsFile(filePath, ScreenshotImageFormat.Jpeg);

        Console.WriteLine("Screenshot saved at: " + filePath);    */
    }



