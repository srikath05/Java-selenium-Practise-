package seleniumPractise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonAndText {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

         driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Wait for elements to load
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the target website
        driver.get("https://www.amazon.in");
        //Thread.sleep(10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click all buttons on the page
      // List<WebElement> buttons = driver.findElements(By.xpath("//button | //input[@type='button' or @type='submit']"));
//        for (int i = 0; i < buttons.size(); i++) {
//            WebElement button = buttons.get(i);
//            try {
//                button.click();
//                System.out.println("Clicked button: " + button.getText());
//            } catch (Exception e) {
//                System.out.println("Could not click button: " + button.getText());
//            }
            
//            driver.navigate().back();
//            buttons = driver.findElements(By.tagName("button"));
       List<WebElement> inputFields = driver.findElements(By.xpath("//input[@type='text' or @type='email' or @type='password']"));
       for (WebElement field : inputFields) {
           wait.until(ExpectedConditions.elementToBeClickable(field));
           field.clear();
           field.sendKeys("Test Input");
       }
        

        // Enter text in all input fields on the page
       // List<WebElement> inputFields = driver.findElements(By.xpath("//input[@type='text' or @type='email' or @type='password']"));
	List<WebElement> buttons = driver.findElements(By.xpath("//button | //input[@type='button' or @type='submit']"));
//        for (int i = 0; i < inputFields.size(); i++) {
//            WebElement inputField = inputFields.get(i);
//            try {
//                inputField.sendKeys("Sample Text");
//                System.out.println("Entered text in field: " + inputField.getAttribute("name"));
//            } catch (Exception e) {
//                System.out.println("Could not enter text in field: " + inputField.getAttribute("name"));
//            }
//            
//            driver.navigate().back();
//            
//            inputFields = driver.findElements(By.xpath("//input[@type='text' or @type='email' or @type='password']"));
	for (WebElement button : buttons) {
		
		  wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

        // Close the browser
        //driver.quit();
    
	}
}