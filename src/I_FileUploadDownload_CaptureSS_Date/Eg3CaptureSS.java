package I_FileUploadDownload_CaptureSS_Date;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg3CaptureSS {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://the-internet.herokuapp.com");

		// Now we need to take the screen - So just one class to remember

		/*
		 * //Selenium provides a built-in method to take screenshots, // called
		 * getScreenshotAs() //This method takes a screenshot of the current page and
		 * returns it as an image object. //The image object can then be saved to a file
		 * or displayed in an image viewer.
		 */

		// Take a screenshot of the current page.
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

		// Save the screenshot to a file. We NEED TO ADD LIBRARY COMMON IO
		// to copy and paste file
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\khima\\Documents\\FileUpload_Dow Eg\\SS.png"));

	}

	// Reusable method
	public static void takeSS(WebDriver driver, String filename) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,
				new File("C:\\Users\\khima\\Documents\\FileUpload_Dow Eg\\" + filename + ".png"));
	}
}
