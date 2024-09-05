package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Cricbuz extends Practise{

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 try {	
//		int sum = 0;
//
//		System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//
//	  driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22774/nz-vs-ind-2nd-t20i-india-tour-of-new-zealand-2020");
//	  driver.manage().window().maximize();
//		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
//		  WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); 
//		  int rowcount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
//		  int  count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
//		 
//		  for(int i=0;i<count;i++) {
//			  String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
//			  
//			  int valueinteger=Integer.parseInt(value); 
//			  sum=sum+valueinteger;
//			  }
//		  System.out.println(sum);
//		  }
//		  catch(Exception e) {
//			  System.out.println("exception is : "+e);
//			  
//		  }
//		  
		  int  sum=0;
	//	System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		  WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		  int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		  int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		  for(int i=0;i<count-2;i++)
		  {
		  String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		  int valueinteger=  Integer.parseInt(value);
		  sum=sum+valueinteger;//103
		  }
		  //System.out.println(sum);

		  String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		  int extrasValue=Integer.parseInt(Extras);
		  int TotalSumValue=sum+extrasValue;
		  System.out.println(TotalSumValue);


		  String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		  int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		  if(ActualTotalVAlue==TotalSumValue)
		  {
		  System.out.println("Count Matches");
		  }
		  else
		  {
		  System.out.println("count fails");
		  
		  }
		  
		  TakesScreenshot ss =  (TakesScreenshot) driver;
			
			File scrFile=ss.getScreenshotAs(OutputType.FILE);
			File trgtFile=new File("C:\\Users\\ganji\\OneDrive\\Desktop\\ScreenShot\\Screenshot.jpg");
			try {
				FileHandler.copy(scrFile, trgtFile);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				

driver.close();
	}

}
