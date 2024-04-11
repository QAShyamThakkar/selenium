package zBasicConcept;

import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		String currentWindow = driver.getWindowHandle();
		Set<String> listOfWindow = driver.getWindowHandles();
		for (String window : listOfWindow) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}

		driver.manage().window().maximize();

		driver.get("https://www.nseindia.com/");
		WebElement maerketData = driver.findElement(By.xpath("//a[text()='Market Data']"));

		Actions action = new Actions(driver);

		WebElement equity = driver.findElement(By.xpath("//a[text()='Equity & SME Market']"));
		action.moveToElement(maerketData).pause(1000).click(equity).build().perform();

	}

}
