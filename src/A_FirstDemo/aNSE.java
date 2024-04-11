package A_FirstDemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class aNSE {
	public static void main(String[] args) {

		// 1. Launch Browser

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\khima\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		


		// 2. Launch url

		driver.get("https://www.google.com/");

	}

}
