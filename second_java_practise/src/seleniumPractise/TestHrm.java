package seleniumPractise;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestHrm {
//
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganji\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("http://www.testingmasters.com/hrm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("txtUsername")).sendKeys("User02");
	driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
	Actions act=new Actions(driver);
	act.moveToElement(leave).build().perform();
	driver.findElement(By.id("menu_leave_applyLeave")).click();
	driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[text()='Training']")).click();
	WebElement fromdate=driver.findElement(By.id("applyleave_txtFromDate"));
	fromdate.clear();
	fromdate.click();
	fromdate.sendKeys("2019-07-03");
	fromdate.sendKeys(Keys.ESCAPE);
	
	WebElement todate=driver.findElement(By.id("applyleave_txtToDate"));
	todate.clear();
	todate.click();
	todate.sendKeys("2019-07-04");
	todate.sendKeys(Keys.ESCAPE);
	driver.findElement(By.id("applyleave_txtComment")).sendKeys("selenium training");
	driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
	
	driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	WebElement frmdat=driver.findElement(By.id("calFromDate"));
	frmdat.clear();
	frmdat.click();
	frmdat.sendKeys("2019-05-01");
	frmdat.sendKeys(Keys.ESCAPE);
	WebElement todat=driver.findElement(By.id("calToDate"));
	todat.clear();
	todat.click();
	todat.sendKeys("2019-08-01");
	todat.sendKeys(Keys.ESCAPE);
	driver.findElement(By.id("btnSearch")).click();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
	driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
	driver.findElement(By.id("btnSearch")).click();
	List<WebElement> rowscount=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
	int rows=rowscount.size();
	System.out.println("rows :"+rows);
	
	FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(30))  // Maximum wait time
	            .pollingEvery(Duration.ofSeconds(5))  // Check every 5 seconds
	            .ignoring(NoSuchElementException.class);  // Ignore this exception

	}

private static WebElement xpath(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
