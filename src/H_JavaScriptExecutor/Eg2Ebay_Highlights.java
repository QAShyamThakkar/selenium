package H_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg2Ebay_Highlights {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.ebay.co.uk/");

		// Just google the script to highlight

		WebElement input = driver.findElement(By.xpath("//input[@placeholder=\"Search for anything\"]"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", input);

		input.sendKeys("TV");

		// Object of JS JavascriptExecuto 
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// JS Script to go down
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		WebElement cookies = driver.findElement(By.id("gdpr-banner-decline"));
		cookies.click();
		
		// JS Script to go up
		js.executeScript("window.scrollTo(0, 0, { behavior: \"instant\" });");
		
		String value = (String) js.executeScript("return window.myVariable");
		System.out.println(value);

	}
}
