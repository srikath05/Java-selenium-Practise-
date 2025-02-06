package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTheProductAbovePrice {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  driver = new ChromeDriver();
		  // Navigate to Amazon
        driver.get("https://www.amazon.in");
        Thread.sleep(5000);
        driver.navigate().refresh();
        driver.manage().window().maximize();

        // Search for Mobiles
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
      //  driver.findElement(By.id("nav-search-submit-button")).click();
        
        driver.findElement(By.xpath("//div[@class='nav-fill']//a[text()='Mobiles']")).click();
        driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']/parent::a")).click();
        // Filter by Apple and Samsung brands
        driver.findElement(By.xpath("//input[@id='apb-browse-refinements-checkbox_1']/following-sibling::i")).click();
        driver.findElement(By.xpath("//span[text()='Samsung']/preceding::i[@class='a-icon a-icon-checkbox'][1]")).click();
        // Wait for results to load (simple delay)
        Thread.sleep(5000);
 
        
        // Retrieve and display mobiles above 15,000
        List<WebElement> mobileNames = driver.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']/span"));
        List<WebElement> mobilePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        
        System.out.println(mobileNames.size());
        System.out.println(mobilePrices.size());

        System.out.println("Mobiles priced above 55,000:");

       // for (int i = 0; i < mobileNames.size(); i++) {
      	  
    	  for (int i = 0; i < Math.min(mobileNames.size(), mobilePrices.size()); i++) {
            String name = mobileNames.get(i).getText();
            String priceText = mobilePrices.get(i).getText().replace(",", "");
            int price = Integer.parseInt(priceText);

            if (price < 55000) {
                System.out.println(name + " - rupess " + price);
            }
        }
            
      	driver.quit();
	}

}
	
