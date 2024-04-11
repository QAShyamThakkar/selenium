package G_Handling_MultipleWindows;

import java.time.Duration;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class aMultipleWindow_Eg1Ebay {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.ebay.co.uk/");

		// 1 Opening new window
		WebElement register = driver.findElement(By.xpath("//a[text()='register']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).build().perform();

		// 2 To get ID of current window
		String originalWindowID = driver.getWindowHandle();
		System.out.println(originalWindowID);

		// 3 To List IDs of ALL windows
		Set<String> listOfWindowIDs = driver.getWindowHandles();
		for (String windowID : listOfWindowIDs) {
			System.out.println(windowID);
		}

		// 4 To Switch to new Windows
		for (String windowID : listOfWindowIDs) {  // there will always two windows only

//			System.out.println(windowID); -- Second time it will switch to New Window

			if (!windowID.equals(originalWindowID)) {
				driver.switchTo().window(windowID);
			}
		}

		// 5 Switch Back to Original Window

		// First lets get title of New Window
		String titleText1 = driver.getTitle();
		System.out.println("Title Text: " + titleText1);

		System.out.println(driver.getCurrentUrl()); // you can also get the URL
		
		Thread.sleep(3000);
		driver.switchTo().window(originalWindowID);

//		Thread.sleep(3000);
//		driver.close();

	}
}
