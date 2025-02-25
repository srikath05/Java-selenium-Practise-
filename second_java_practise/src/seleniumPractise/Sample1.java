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
		
	//	int[] arr = {20,30,40,50,60,10};
		
		String array = "hi srikanth how are you";
		
		String[] words = array.split(" ");
		
		/*
		 * for(String word: words) {
		 * 
		 * 
		 * 
		 * result += Character.toUpperCase(word.charAt(0))+ word.substring(1) + " " ; }
		 * 
		 * System.out.println(result);
		 */
		
		if(words.length>1) {
			
			String secwordrev = words[1];
			String rev = "";
			
			for(int i = secwordrev.length()-1;i>=0;i--) {
				
				rev +=secwordrev.charAt(i);
			}
			words[1] = rev + " ";
		}
		System.out.println(String.join(" ", words));
		
	}
	}
	

