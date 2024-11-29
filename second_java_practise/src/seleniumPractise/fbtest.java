package seleniumPractise;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class fbtest {

	public static void main(String[] args) {
				
		//FirefoxDriver driver=new FirefoxDriver();
		
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganji\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://username:password@www.flipkart.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	
		//driver.findElement(By.name("firstname")).sendKeys("user1");
		//driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("reg_email__")).sendKeys("gikki_valiant0528@yahoo.co.in");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gikki_valiant0528@yahoo.co.in");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
		//driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("6");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1989");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		

		 FluentWait<ChromeDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(30))        // Maximum wait time
	                .pollingEvery(Duration.ofSeconds(5))        // Poll every 5 seconds
	                .ignoring(Exception.class);
		 
		/*Select day_sel=new Select(driver.findElement(By.id("day")));
		day_sel.selectByVisibleText("23");
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		
		Select year =new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1999");
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();*/
		
	}

}
