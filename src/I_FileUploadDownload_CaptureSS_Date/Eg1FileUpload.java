package I_FileUploadDownload_CaptureSS_Date;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg1FileUpload {
	public static void main(String[] args) throws InterruptedException, Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement fileUpload = driver.findElement(By.id("file-upload"));
		fileUpload.sendKeys("C:\\Users\\khima\\Documents\\FileUpload_Dow Eg\\TEST.png");

		Thread.sleep(5000);
		WebElement fileSubmit = driver.findElement(By.id("file-submit"));
		fileSubmit.click();
		
		//After Eg3 SS-  can relate below line
		Eg3CaptureSS.takeSS(driver, "SS1");
	}
}
