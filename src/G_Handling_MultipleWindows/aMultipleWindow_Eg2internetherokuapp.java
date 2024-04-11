package G_Handling_MultipleWindows;

import java.time.Duration;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class aMultipleWindow_Eg2internetherokuapp {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("http://the-internet.herokuapp.com/windows");
		
		String currentWindowID = driver.getWindowHandle();

		WebElement clickHereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHereLink.click();

		Set<String> listOfWindowsId = driver.getWindowHandles();

		for (String windowId : listOfWindowsId) {
			if (!windowId.equals(currentWindowID)) {
				driver.switchTo().window(windowId);
			}
		}

		System.out.println(driver.findElement(By.xpath("//h3")).getText());

		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(currentWindowID);

		Thread.sleep(3000);

		driver.close();

	}
}
