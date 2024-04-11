package B_Wait;

/*

|Site 1	|Wait	|Error	|getText|
/dynamic_loading/1"



*/

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_TheInternetHerokuapp {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1"); // No Error regardless of wait
//		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2"); //Error if wait is not there
		
		WebElement clickOnStart = driver.findElement(By.xpath("//button[text()='Start']"));
		clickOnStart.click();
		
		WebElement textRetrive = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(textRetrive));
				
		System.out.println(textRetrive.getText());
		
		
	}
	
	
	

}
