package seleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicProductSelection {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String element = "Explore all";
		driver = new ChromeDriver();

        // Launch Amazon website
        driver.get("https://www.amazon.in/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.navigate().refresh();
        
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//div[@class='a-cardui-footer']//a//span[2][contains(text(),'See more')]")).click();
    	
        DynamicElement(element);
                
	}
	public static void DynamicElement(String element) {
		
		// driver.findElement(By.xpath("//div[@class='a-cardui-footer']//a//span[2][contains(text(),'" + element + "')]")).click();
	driver.findElement(By.xpath("//div[@id='desktop-grid-2']//a//span[2][contains(text(),'" + element + "')]")).click();
	 //driver.findElement(By.xpath("//div[@id='acsProductBlockV1-0']//span[text()='REYSOL Cotton Checkered Kitchen A…']")).click();
		 
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='a-carousel-col a-carousel-center']//a"));
		
		for(int i=0;i<=list.size();i++) {
			
			WebElement linkclick =list.get(i);
			
		System.out.println("list "+ linkclick.getText() + linkclick);
			
	  try {
				 
			linkclick.click();
			
			driver.navigate().back();
			
			list = driver.findElements(By.xpath("//div[@class='a-carousel-col a-carousel-center']//a"));
			
			 }
	  
      catch (Exception e) {
    	  
       		 System.out.println("error cliks link = "+ e.getMessage());
       		  
       	  }
		}
	}
}
