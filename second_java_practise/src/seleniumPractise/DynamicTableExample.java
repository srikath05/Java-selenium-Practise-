package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableExample {
static WebDriver driver;
	public static void main(String[] args) {
		

		         driver = new ChromeDriver();
		       	  
		              // Navigate to the webpage
		            driver.get("https://example.com"); // Replace with your target URL
		            driver.manage().window().maximize();

		           // Locate all rows in the table
		           List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

		            // Iterate through rows using a normal for loop
		            for (int i = 0; i < rows.size(); i++) {
		             // Locate name and value cells in the current row
		             WebElement nameCell = rows.get(i).findElement(By.xpath("./td[1]")); // Adjust XPath if necessary
		             WebElement valueCell = rows.get(i).findElement(By.xpath("./td[2]")); // Adjust XPath if necessary

		             // Check if the name cell contains "B"
		             
		             if (nameCell.getText().trim().equals("B")) {
		             
		            	 // Print the corresponding value
		                 
		            	 System.out.println("The value for B is: " + valueCell.getText());
		                 
		            	 break; // Exit the loop once "B" is found
		                  
		             }
		             
		            }
		       }   
}
