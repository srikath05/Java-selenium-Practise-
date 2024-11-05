package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstdaypractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072202&extra_1=s|c|256737974095|b|www%20faceboook|&placement=&creative=256737974095&keyword=www%20faceboook&partner_id=googlesem&extra_2=campaignid%3D973072202%26adgroupid%3D49357331998%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-517541620072%26loc_physical_ms%3D9062131%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwg-DpBRBbEiwAEV1_-PdtzDIwtmT0PZZ0oiG-3EBMPIH6yQATr4-B062P-LcC6vbOcZ01uhoCzCAQAvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("9959210910");
		driver.findElement(By.name("pass")).sendKeys("shirisha28");
		//driver.findElement(By.name("jazoest")).click();
		

	} 

}
