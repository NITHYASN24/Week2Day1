package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver page = new ChromeDriver();
		
		page. get("http://leaftaps.com/opentaps/");
		page.manage().window().maximize();
		
		WebElement username = page.findElement(By.id("username"));
		
		username.sendKeys("DemoCSR");
		page.findElement(By.id("password")).sendKeys("crmsfa");
		page.findElement(By.className("decorativeSubmit")).click();
        page.findElement (By.linkText("CRM/SFA")).click();
     
        page.findElement (By.linkText("Contacts")).click();
        page.findElement (By.linkText("Create Contact")).click();
        page.findElement (By.id("firstNameField")).sendKeys("Nithya");
        page.findElement (By.id("lastNameField")).sendKeys("K");
        page.findElement (By.name("submitButton")).click();
     
     System.out.println("Nithya");
     
     String title =	 page.getTitle();
     System.out.println(title);
     page.close();
     
     
	}

}
