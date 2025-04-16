package seleniumPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class Sample1 {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//driver = new ChromeDriver();
		
		/*
		 * // Initialize WebDriver
		 * 
		 * driver.get("https://google.com"); String windoehanle =
		 * driver.getWindowHandle();
		 * 
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https://www.amazon.in");
		 * 
		 * String pageTitle = driver.getTitle(); if (pageTitle.
		 * equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
		 * )) { System.out.println("Title verified successfully.");
		 * 
		 * } driver.switchTo().window(windoehanle);
		 */
		String arr = " hi world hello hello everyone";
	
		String[] words = arr.split(" ");
		
	String target = "hello";
		
		 int count = arr.split(target, -1).length - 1;
		
		
	System.out.println(target + " occurs : " + count);
	
		String text1 = " hi world hello hello everyone";
		String text2 = text1.toLowerCase();
		String substring = "hello";
      
      int counts = text2.split(substring, -1).length - 1;
      
      System.out.println("The substring '" + substring + " occurs " + counts + " times.");
		
	}
	}
	

