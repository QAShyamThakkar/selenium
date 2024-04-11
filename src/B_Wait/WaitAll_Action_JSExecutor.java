package B_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAll_Action_JSExecutor {

	public static void main(String[] args) throws InterruptedException {

		// Open the ChromBrowser by creating object of WebDriver
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Maximize the chrome
		driver.manage().window().maximize();

		// load the url
		driver.get("https://www.ebay.co.uk/");

		WebElement acceptCookies = driver.findElement(By.id("gdpr-banner-accept"));

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//
//		wait.until(ExpectedConditions.visibilityOf(acceptCookies));
//		wait.until(ExpectedConditions.elementToBeClickable(acceptCookies));

		//going to the bottom of the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);", acceptCookies);

		//action class
//		Actions action = new Actions(driver);
//		action.moveToElement(acceptCookies);
//		action.scrollByAmount(1000, 1000);
		
//		Thread.sleep(4000);

		acceptCookies.click();

//		WebElement signIn = driver.findElement(By.xpath("//span[@id=\"gh-ug\"]/a"));

//		WebElement signIn = driver.findElement(By.xpath("//a[text()=\"Sign in\"]"));
//		signIn.click();

	}

}
