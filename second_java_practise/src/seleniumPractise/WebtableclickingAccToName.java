package seleniumPractise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableclickingAccToName {

		static WebDriver driver;
	    public static void main(String[] args) {
	        // Set up WebDriver
	            driver = new ChromeDriver();
	        try {
	            // Navigate to the page with the web table
	            driver.get("https://example.com");

	            // Target name to find
	            String targetName = "Jane Smith";

	            // Locate the table
	            WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));

	            // Locate all rows in the table body
	            List<WebElement> rows = table.findElements(By.xpath("//table[@id='resultTable']//tr"));

	            // Iterate through rows using a normal for loop
	            for (int i = 0; i < rows.size(); i++) {
	                // Get the current row
	                WebElement row = rows.get(i);

	                // Locate the name cell (1st column)
	                WebElement nameCell = row.findElement(By.xpath("//table[@id='resultTable']//tr//td[2]"));
	                String name = nameCell.getText();

	              if (name.equalsIgnoreCase(targetName)) {
	                    // Click the button in the 4th column of the same row
	                    WebElement button = row.findElement(By.xpath("//table[@id='resultTable']//tr//td[2]//a[text()='Joe.Root']"));
	                    button.click();

	                    System.out.println("Clicked the button for: " + targetName);
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


