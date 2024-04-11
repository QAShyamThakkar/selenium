package A_FirstDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class aSetup3 {
	public static void main(String[] args) {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// 2. Launch url

		driver.get("https://www.ebay.com/");
		
		WebElement cat = driver.findElement(By.id("gh-cat"));
		Select dp = new Select(cat);
		System.out.println(dp.getOptions().size());
	
	
	}

}
