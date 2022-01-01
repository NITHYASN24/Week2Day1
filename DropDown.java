package Week2.Day1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	private static java.util.List<WebElement> options;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver page = new ChromeDriver();
		page.get("http://www.leafground.com/pages/Dropdown.html");
		
		page.manage().window().maximize();
		
		WebElement dd = page.findElement(By.id("dropdown1"));
	Select dropdown = new Select (dd);
	
	//dropdown.selectByVisibleText("Loadrunner");
	
	//to select using index
	dropdown.selectByIndex(4);
	
	//to select using value
	
	dropdown. selectByValue("4");
	//to select secondlast from dropdown
	 int size = dropdown.getOptions().size();
	 
	 dropdown.selectByIndex(size-2);
	// NoSuchElementException
		
		//	WebElement selectedElement = dropdown.getFirstSelectedOption();
	
	 //to select first option
//List< WebElement>	options = (List) dropdown. getOptions();
	// options.get(0).getText();
	 
	}
	

}
