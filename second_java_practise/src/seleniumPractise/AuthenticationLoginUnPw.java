package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuthenticationLoginUnPw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    WebDriver driver = new ChromeDriver();

        // Launch Amazon website
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth/");

        // Maximize the browser window
        driver.manage().window().maximize();
        
        ///////////////////
        //without using sendkeys
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('username').value='testuser';");
        
        //using Action class
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("username"));
        actions.moveToElement(element).click().sendKeys("testuser").build().perform();


	}

}
