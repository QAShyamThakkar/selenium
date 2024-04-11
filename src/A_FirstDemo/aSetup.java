package A_FirstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class aSetup {
	public static void main(String[] args) {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		// 2. Launch url

		driver.get("https://www.google.com/");

	}

}
