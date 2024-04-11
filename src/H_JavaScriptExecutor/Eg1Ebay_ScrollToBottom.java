package H_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg1Ebay_ScrollToBottom {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.ebay.co.uk/");

		// Js executor for scroll to bottom  (Waits are not able to solve it)

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		// Not able to click on Decline all cookies - Not by ExpWait and ImpWait as we
		// need to GO TO Bottom
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gdpr-banner-decline")));
		WebElement cookies = driver.findElement(By.id("gdpr-banner-decline"));
//		wait.until(ExpectedConditions.elementToBeClickable(cookies));
		cookies.click();

	}
}

/*
 * The JavascriptExecutor interface, is an interface provided by Selenium
 * WebDriver that allows you to execute JavaScript code within the context of a
 * web page.
 * 
 * It provides the "executeScript()" method.
 * 
 * In order to use the "executeScript()" method, you need to cast the "driver"
 * object to the "JavascriptExecutor" interface.
 * 
 * By doing this, you are essentially telling the compiler that the "driver"
 * object can also be treated as an instance of "JavascriptExecutor", and
 * therefore you can call the "executeScript()" method on it.
 * 
 * Note that this casting operation assumes that the driver object you are
 * working with is an instance of a class that implements both the WebDriver and
 * JavascriptExecutor interfaces. If the object does not implement the
 * JavascriptExecutor interface, this line of code would result in a
 * "ClassCastException" at runtime.
 * 
 */