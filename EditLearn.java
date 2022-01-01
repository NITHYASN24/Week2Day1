package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLearn {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver page = new ChromeDriver();
		
	
	page.get("http://www.leafground.com/pages/Edit.html");
	
	page.manage().window().maximize();
		
	WebElement email=page.findElement(By.id("email"));
			email.sendKeys("nithya@testleaf.com");
	
							
		//	To clear the data
              email.clear();
			//to append
			email.sendKeys("nitya",Keys.TAB);
			 
			 String emailvalues =email.getAttribute("value");
				System.out.println(emailvalues);
	
	}
}
