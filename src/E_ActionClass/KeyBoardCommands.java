package E_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.co.uk/");

//		WebElement signIn = driver.findElement(By.xpath("//span[@id=\"gh-ug\"]/a"));
		WebElement signIn = driver.findElement(By.xpath("//a[text()=\"Sign in\"]"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(signIn).keyUp(Keys.CONTROL).build().perform();
		
//		signIn.click();  // will click on the same window

	}

}
