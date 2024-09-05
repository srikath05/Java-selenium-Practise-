package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Timesheettst {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver test=new ChromeDriver();
		test.get("http://www.testingmasters.com/hrm");
		test.manage().window().maximize();
		test.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		test.findElement(By.id("txtUsername")).sendKeys("User02");
		test.findElement(By.id("txtPassword")).sendKeys("TM1234");
		test.findElement(By.id("btnLogin")).click();
		WebElement time=test.findElement(By.id("menu_time_viewTimeModule"));
		Actions act=new Actions(test);
		act.moveToElement(time).build().perform();
		WebElement Timesheets=test.findElement(By.id("menu_time_Timesheets"));
		act.moveToElement(Timesheets).build().perform();
		test.findElement(By.xpath("//a[@id='menu_time_viewMyTimesheet']")).click();
		
		test.findElement(By.xpath("//a[@id='btnAddTimesheet']")).click();
		WebElement addts=test.findElement(By.id("time_date"));
		addts.clear();
		addts.click();
		addts.sendKeys("2019-07-19");
		addts.sendKeys(Keys.ESCAPE);
		
		test.findElement(By.xpath("//input[@id='btnEdit']")).click();
		test.findElement(By.id("initialRows_0_toDelete")).click();
		test.findElement(By.xpath("//select[@id='startDates']/option[3]"));
		WebElement pn=test.findElement(By.id("initialRows_0_projectName"));
		pn.clear();
		pn.click();
		pn.sendKeys("Nibble matrix - HRM");
		pn.sendKeys(Keys.TAB);
		test.findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']/option[4]")).click();
		test.findElement(By.id("initialRows_0_0")).sendKeys("6");
		test.findElement(By.id("btnAddRow")).click();
		
		WebElement pn1= test.findElement(By.id("initialRows_1_projectName"));
		pn1.clear();
		pn1.click();
		pn1.sendKeys("Reliance - CMS");
		pn1.sendKeys(Keys.TAB);
		test.findElement(By.xpath("//select[@id='initialRows_1_projectActivityName']/option[4]")).click();
		test.findElement(By.id("initialRows_1_0")).sendKeys("2");
		test.findElement(By.id("submitSave")).click();
		
	}

}
