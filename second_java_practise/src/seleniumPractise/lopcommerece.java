package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lopcommerece {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganji\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("user1");
		driver.findElement(By.id("LastName")).sendKeys("sun");
		
		/*Select day=new Select(driver.findElement(By.name("DateOfBirthDay")));
		day.selectByVisibleText("05");
		Select year =new Select(driver.findElement(By.name("DateOfBirthYear")));
		year.selectByVisibleText("1999");*/
		driver.findElement(By.id("Email")).sendKeys("gikki_valiants@yahoo.co.in");
		driver.findElement(By.id("Company")).sendKeys("Testing Masters tech");
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.partialLinkText("Log in")).click();
		//driver.findElement(By.name("register-continue")).click();
		driver.findElement(By.id("Email")).sendKeys("gikki_valiants@yahoo.co.in");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		//driver.findElementByClassName("button-1 login-button").click();
		//driver.findElement(By.name("__RequestVerificationToken")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();	
	}

}
