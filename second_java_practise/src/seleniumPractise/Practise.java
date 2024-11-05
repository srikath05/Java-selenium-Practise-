package seleniumPractise;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {
	 static WebDriver driver;
	 public static void main(String[] args) throws IOException, InterruptedException {
		 
		 
	 }
	 public void clickButtonInDynamicTable(WebDriver driver, String buttonName) {
		    try {
		  
		 // Locate the web table body
		  WebElement tableBody = driver.findElement(By.xpath("//table/tbody"));
		 
		 // Find all rows in the table body
		 List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		 
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



