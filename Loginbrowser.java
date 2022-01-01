package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginbrowser {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver page = new ChromeDriver();
		
	page.get("http://leaftaps.com/opentaps/");
	
	page.manage().window().maximize();
String title =	 page.getTitle();
System.out.println(title);

  WebElement userName = page.findElement(By.id("username"));
  
  userName.sendKeys("DemoCSR");
  
	page.findElement(By.id("password")).sendKeys("crmsfa");
	
	page.findElement(By.className("decorativeSubmit")).click();
	
	page.findElement(By.linkText ("CRM/SFA")).click();
	
	page.findElement(By.linkText("Leads")).click();
		
	page.findElement(By.linkText("Create Lead")).click();
	
	page.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	page.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
	
	page.findElement(By.id("createLeadForm_lastName")).sendKeys("K");

	 WebElement source = page.findElement(By.id("createLeadForm_dataSourceId"));
	
   Select dd = new Select(source);
	
   dd.selectByIndex(3);
   
		page.findElement(By.name("submitButton")).click();
	
	}
	
	
	

}
