package seleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProdtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// Launch Amazon website
		driver.get("https://www.amazon.in");

		// Maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

		driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();

		driver.findElement(By.xpath("//span[text()='₹10,000 - ₹20,000']")).click();

		// List<WebElement> table = driver.findElements(By.xpath("//span[@class
		// =\"rush-component s-latency-cf-section\"]"));

		List<WebElement> MNames = driver.findElements(By.xpath("//div[@class =\"a-section a-spacing-none a-spacing-top-small s-title-instructions-style\"]"));
		
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class =\"a-price-whole\"]"));

				  
		 /* for(WebElement mobileprices : prices) {
		  
		  String mobilenames = mobileprices.getText().replace(",", ""); 
		  int Mprice = Integer.parseInt(mobilenames);*/
		
		for (int i = 0; i < MNames.size(); i++) {
		    String mobileName = MNames.get(i).getText();
		    String price = (i < prices.size()) ? prices.get(i).getText().replace(",", "") : "Price not available";
		    
		    int Mprice = Integer.parseInt(price);
		    
		 //   System.out.println("Mobile Name: " + mobileName + " | Price: " + price);
		    
		    if(Mprice >= 17000) {
		    	
		    	System.out.println(mobileName + " : " + Mprice);
		    }
		  
		  }
		 

	}

}
