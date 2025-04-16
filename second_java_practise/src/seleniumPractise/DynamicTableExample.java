package seleniumPractise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		            //for (int i = 0; i < rows.size(); i++)
		            for(WebElement row : rows){
		             // Locate name and value cells in the current row
		             WebElement nameCell = row.findElement(By.xpath("./td[1]")); // Adjust XPath if necessary
		             WebElement valueCell = row.findElement(By.xpath("./td[2]")); // Adjust XPath if necessary

		             // Check if the name cell contains "B"
		             
		             if (nameCell.getText().trim().equals("B")) {
		             
		            	 // Print the corresponding value
		              //   String value = valueCell.getText();
		            	 System.out.println("The value for B is: " + valueCell.getText());
		                 
		            	 break; // Exit the loop once "B" is found
		                  
		             }
		                 	             
		            }
		            
		            // Store table data in a Map
		            Map<String, String> tableData = new HashMap<>();
		            List<WebElement> rowss = driver.findElements(By.xpath("//table/tbody/tr"));

		            for (WebElement row : rowss) {
		                List<WebElement> cells = row.findElements(By.tagName("td"));
		                if (cells.size() >= 2) {
		                    tableData.put(cells.get(0).getText().trim(), cells.get(1).getText().trim());
		                }
		            }

		            // Print the value of "B"
		            System.out.println("The value for B is: " + tableData.getOrDefault("B", "Not found"));

		       }   
}
