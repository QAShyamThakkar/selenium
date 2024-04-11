package zBasicConcept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// For practice - other assignment
// - https://the-internet.herokuapp.com/upload = first upload file ow it will give error

public class screenshot2 {
	public static void main(String[] args) throws IOException {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get(
				"https://www.bankofbaroda.in/personal-banking/digital-products/instant-banking/internet-banking-baroda-connect");

		// just to set path and we can reuse this method again and again
		String spath = "C:\\Users\\khima\\Desktop\\1. Desktop\\New folder\\Screenshot 2021-06-20 130613.jpeg";
		captureSS(driver, spath);

		driver.quit();
	}

	public static void captureSS(WebDriver driver, String path) throws IOException {

		TakesScreenshot ss = (TakesScreenshot) driver;
		File ss1 = ss.getScreenshotAs(OutputType.FILE);

		File destImg = new File(path);
		FileUtils.copyFile(ss1, destImg);
	}
}
