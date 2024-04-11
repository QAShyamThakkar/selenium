package B_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MintedWithImplicit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.minted.com/");

		WebElement emailInput = driver.findElement(By.cssSelector("#bx-element-1234416-Gu64MsV-input"));
		emailInput.sendKeys("Test@1234");
		
	}
	
	
}
