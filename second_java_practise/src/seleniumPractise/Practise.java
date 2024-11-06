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
		 
		
		 int[] repetedNums = {1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8};

	        // Traverse the array and print unique elements
	        for (int i = 0; i < repetedNums.length; i++) {
	            boolean isDuplicate = false;
	            
	            // Check if current element has appeared before
	            for (int j = 0; j < i; j++) {
	                if (repetedNums[i] == repetedNums[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            // If it's not a duplicate, print it
	            if (!isDuplicate) {
	                System.out.println(repetedNums[i]);
	            }
	        }
	 }
		 
}



