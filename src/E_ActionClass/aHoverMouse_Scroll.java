package E_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class aHoverMouse_Scroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://www.ebay.co.uk/");

		WebElement electronics = driver
				.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()=\"Electronics\"]"));

		// =========================1. Hover Mouse ==================================
		
		// electronicsLink.hover --- No Direct Method like Hover
		
		Actions action = new Actions(driver);
//		action.moveToElement(electronics).build().perform(); // Error == Add Pause
		action.moveToElement(electronics).pause(Duration.ofMillis(2000)).build().perform();

		WebElement tvsLink = driver
				.findElement(By.xpath("//nav[@aria-label=\"More Categories\"]/ul/li/a[text()='TVs']"));
		tvsLink.click();

		// pause - Time diff between hover and click so add pause
		// build - to build multiple actions
		// (if two method is not there, we dont need to use perform, only build)
		// perform that actions

		// ================== 2. Scroll Down Methods =================================

		for (int i = 1; i <= 15; i++) {

			action.scrollByAmount(200, 200).build().perform();
		}
		
		// ================== 3. Drag and Drop =================================

	}

}
