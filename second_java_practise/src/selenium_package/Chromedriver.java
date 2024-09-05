package selenium_package;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ganji\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("identifier")).sendKeys("9959210910");	
	driver.findElement(By.className("CwaK9")).click();
	driver.findElement(By.className("RveJvd snByac")).click();
	driver.findElement(By.className("password")).sendKeys("sri0528");
	
	
	}
	

}
