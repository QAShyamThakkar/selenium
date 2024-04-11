package D_SelectClass_DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bDropDown_Ebay {

	 public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		
		//1. Select Class to handle dropdown
		
		WebElement dropDownElement = driver.findElement(By.xpath("//span/select[@name=\"_sacat\"]"));
		
		Select dropDown = new Select(dropDownElement);
		
		dropDown.selectByVisibleText("Antiques");
		Thread.sleep(3000);   // so you can see
		
		dropDown.selectByIndex(3);
		Thread.sleep(3000); 
		
		dropDown.selectByValue("625");
		 
		//2. Retrieve the selected option from the dropdown 
		WebElement selectedOption = dropDown.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		//3. Retrieve the List of options from the dropdown 
		List<WebElement> listOfOptions = dropDown.getOptions();
		for (WebElement webElementOfAllOptions : listOfOptions) {
			System.out.println(webElementOfAllOptions.getText());
		}
		
	}
}
