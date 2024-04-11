package I_FileUploadDownload_CaptureSS_Date;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eg2FileDownload {
	public static void main(String[] args) throws InterruptedException, Exception {

		// First explain line 25 to 32, then this as story
		// To dow at 'Specific Folder', we can use following capability in selenium -
		// Just google it

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.default_directory", "C:\\Users\\khima\\Documents\\FileUpload_Dow Eg");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs); // We need to use options and

		////////////////////////////////////////////////////////////////////////////
		WebDriver driver = new ChromeDriver(options); // We need to pass option as input parameter
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://the-internet.herokuapp.com/download");

		// By default, downloaded in download folder
		WebElement fileDow = driver.findElement(By.xpath("//a[text()=\"TEST.png\"]"));
		fileDow.click();

	}
}

/*
 * ChromeOptions is a class in Selenium that allows you to customize and
 * configure ChromeDriver sessions. You can use ChromeOptions to do things like:
 * 
 * Open Chrome in incognito mode Disable extensions Set the user agent Specify a
 * particular Chrome binary Enable headless mode
 */