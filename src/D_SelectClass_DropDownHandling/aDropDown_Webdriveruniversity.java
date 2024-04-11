package D_SelectClass_DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aDropDown_Webdriveruniversity {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

/////////////A. Select Option with Select class dropDown1
		WebElement dropDown1 = driver.findElement(By.id("dropdowm-menu-1"));
		//Select selectDropDown1 = new Select(driver.findElement(By.id("dropdowm-menu-1"));

		Select selectDropDown1 = new Select(dropDown1);
		selectDropDown1.selectByValue("python");

/////////////B.  Get first selected value and print it
		WebElement selectedOption1 = selectDropDown1.getFirstSelectedOption();
		System.out.println(selectedOption1.getText());

//////////C. Retrieve all the options from list
		
		List<WebElement> listOfOption = selectDropDown1.getOptions();
		
		for (WebElement option : listOfOption) {
			System.out.println(option.getText());
		}

		// Give for Practice
		// dropDown2
		WebElement dropDown2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select selectDropDown2 = new Select(dropDown2);
		selectDropDown2.selectByVisibleText("TestNG");

		WebElement selectedOption2 = selectDropDown2.getFirstSelectedOption();
		System.out.println(selectedOption2.getText());

		// dropDown3
//		WebElement dropDown3 = driver.findElement(By.id("dropdowm-menu-3"));

		Select selectDropDown3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		selectDropDown3.selectByIndex(2);

		WebElement selectedOption3 = selectDropDown3.getFirstSelectedOption();
		System.out.println(selectedOption3.getText());

	}

}
