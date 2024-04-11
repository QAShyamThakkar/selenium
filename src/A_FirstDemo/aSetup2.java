package A_FirstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class aSetup2 {
	public static void main(String[] args) {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 2. Launch url

		driver.get("https://demoqa.com/books");
		
		driver.findElement(By.id("searchBox")).sendKeys("Java");
		driver.findElement(By.id("searchBox")).clear();
		
		driver.findElement(By.id("searchBox")).sendKeys("Python");
	}

}
