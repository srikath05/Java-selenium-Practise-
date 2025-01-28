package seleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickingOnButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
	}
		public void clickButtonInDynamicTable(WebDriver driver, String buttonName) {
		    try {
		  
		 // Locate the web table body
		  WebElement tableBody = driver.findElement(By.xpath("//table/tbody"));
		 
		 // Find all rows in the table body
		 List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
//		 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(20));
//		 waits.until(ExpectedConditions.elementToBeClickable(By.id("")));
//		 
//		 FluentWait<WebDriver> wait = new FluentWait<>(driver)
//				 .withTimeout(Duration.ofSeconds(10))
//				 .pollingEvery(Duration.ofSeconds(10))
//				 .ignoring(Exception.class);
		 
		 // Iterate through each row
		 for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {
		 WebElement row = rows.get(rowIndex);
		            
		 // Find all cells in the current row
		 List<WebElement> cells = row.findElements(By.tagName("td"));
		 
		 // Iterate through each cell
		 for (int colIndex = 0; colIndex < cells.size(); colIndex++) {
		 WebElement cell = cells.get(colIndex);
		                
		 // Check if the cell contains the button name
		 if (cell.getText().contains(buttonName)) {
		 
		// Find and click the button in the current row
		 WebElement button = row.findElement(By.xpath(".//button[text()='" + buttonName + "']"));
		                    
		// Print the row and column index
		 
		System.out.println("Button with name '" + buttonName + "' found at row: " + (rowIndex + 1) + ", column: " + (colIndex + 1));
		                    
		  // Click the button
		  button.click();
		 
		  // Exit after clicking the button
		                    return;
		                }
		            }
		        }
		 
		        System.out.println("Button with name '" + buttonName + "' not found in the table.");
		    } catch (NoSuchElementException e) {
		        System.out.println("Exception: " + e.getMessage());
		    }
		}
		

}
