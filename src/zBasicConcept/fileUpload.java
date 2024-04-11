package zBasicConcept;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// For practice - other assignment
// - https://the-internet.herokuapp.com/upload = first upload file ow it will give error

public class fileUpload {
	public static void main(String[] args) throws IOException {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.file.io/");

		WebElement button = driver.findElement(By.id("upload-button"));

		button.sendKeys("C:\\Users\\khima\\Desktop\\1. Desktop\\New folder\\Screenshot 2021-06-20 130613.jpg");

		WebElement text = driver.findElement(By.xpath("//p[text()=\"Your file is ready to share!\"]"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

		wait.until(ExpectedConditions.visibilityOf(text));

		if (text.isDisplayed()) {
			System.out.println("You file is uploded");
		} else {
			System.out.println("Try again");
		}


		driver.quit();
	}

}
