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

public class bzEg_toUseMethods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.ebay.co.uk/");

		// 1 Opening new window
		WebElement register = driver.findElement(By.xpath("//a[text()='register']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).build().perform();

		bMethod_WindowHandles.swtichToNewWindow(driver);

		Thread.sleep(3000);
		bMethod_WindowHandles.swtichBacktoMainWindow(driver);

//		driver.close();

	}
}
