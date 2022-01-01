package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
        page.findElement(By.linkText("Leads")).click();
		
    	page.findElement(By.linkText("Create Lead")).click();
    	
    	page.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
    	
    	page.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
    	
    	page.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
    	
    	WebElement source = page.findElement(By.id("createLeadForm_dataSourceId"));
    	   Select dd = new Select(source);
    	   dd.selectByIndex(3);
    
    	   
    	   WebElement marketingCampaignId  = page.findElement(By.id("createLeadForm_marketingCampaignId"));
    	   Select dropdown = new Select (marketingCampaignId);
    	   dropdown.selectByVisibleText("Automobile");
    	   
    	   page.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nitya");
    	   page.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
    	   page.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear");
    	   
    	   page.findElement(By.id("createLeadForm_birthDate")).sendKeys("21/12/20");
    	   
    	   page.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Hi");
    	   page.findElement(By.id("createLeadForm_departmentName")).sendKeys("Seleneium");
    	   page.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
   		
    	   
    	   
    	   WebElement industryEnumId  = page.findElement(By.id("createLeadForm_industryEnumId"));
    	   Select drop = new Select (industryEnumId);
    	   drop.selectByVisibleText("Computer Software");
    	   
    	   
    	  page.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
    	  
    	   WebElement ownershipEnumId  = page.findElement(By.id("createLeadForm_ownershipEnumId"));
    	   Select drop1 = new Select (ownershipEnumId);
    	   drop1.selectByVisibleText("Sole Proprietorship");
    	   
    	   
    	  page.findElement(By.id("createLeadForm_sicCode")).sendKeys("One");
    	  page.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Hello$");
    	 page.findElement(By.id("createLeadForm_description")).sendKeys("Training");
    	  page.findElement(By.id("createLeadForm_importantNote")).sendKeys("Login");
	
    	  
    	  page.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8940402174");
    		
    	  page.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
    	  
    	  page.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Nitya");
    	  
     	  page.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithyasundar24@gmail.com");
    	  
     	  
     	  
     	  
     	  page.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
     	  
     	  page.findElement(By.id("createLeadForm_generalToName")).sendKeys("Nitya");
     	  
     	  page.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Dhisha");
    	  
    	  page.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("272 vhh");
    	  page.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Hosur");
    	  page.findElement(By.id("createLeadForm_generalCity")).sendKeys("Hosur");
    	  
    	  
    	   WebElement generalStateProvinceGeoId  = page.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    	   Select drop2 = new Select (generalStateProvinceGeoId);
    	   drop2.selectByVisibleText("California");
    	   
    	  page.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635109");
    	  page.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("635");
	
    	  page.findElement (By.name("submitButton")).click();
    	  
    	  String title =	 page.getTitle();
    	     System.out.println(title);
    	    
    	     
	}

}
