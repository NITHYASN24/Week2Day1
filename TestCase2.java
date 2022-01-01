package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver page = new ChromeDriver();
		
		        page.get("http://leaftaps.com/opentaps/");
		        page.manage().window().maximize();
		
			    WebElement userName = page.findElement(By.id("username"));
			    userName.sendKeys("DemoCSR");
				page.findElement(By.id("password")).sendKeys("crmsfa");
				page.findElement(By.className("decorativeSubmit")).click();
		        page.findElement (By.linkText("CRM/SFA")).click();
		        page.findElement (By.linkText("Contacts")).click();
		        page.findElement (By.linkText("Find Contacts")).click();
		        page.findElement (By.linkText("Email")).click();
		        page.findElement (By.id("ext-gen160")).sendKeys("babu@testleaf.com");
		        page.findElement (By.className("x-btn-text")).click();
		        page.close();
	}

}
