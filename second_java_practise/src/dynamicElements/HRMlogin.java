package dynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HRMlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("Webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUsername")).sendKeys("User02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();
	WebElement leave=	driver.findElement(By.id("menu_leave_viewLeaveModule"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(leave).build().perform();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[text()='Training']")).click();
	
		WebElement fromdate=driver.findElement(By.id("applyleave_txtFromDate"));
		fromdate.clear();
		fromdate.click();
		fromdate.sendKeys("2020-02-21");
		fromdate.sendKeys(Keys.ESCAPE);
		
		WebElement todate=driver.findElement(By.id("applyleave_txtToDate"));
		todate.clear();
		todate.click();
		todate.sendKeys("2020-02-22");
		todate.sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();		
			
		WebElement fromdate1=driver.findElement(By.id("calFromDate"));
		fromdate1.clear();
		fromdate1.click();
		fromdate1.sendKeys("2018-06-21");
		fromdate1.sendKeys(Keys.ESCAPE);
		
		WebElement todate1=driver.findElement(By.id("calToDate"));
		todate1.clear();
		todate1.click();
		todate1.sendKeys("2018-06-22");
		todate1.sendKeys(Keys.ESCAPE);
			
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
	
		
	}
	
}
