package I_FileUploadDownload_CaptureSS_Date;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg4DatePicker_Easy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");;


		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(iFrame);

		// Click on Calendar input to open calendar picker
		WebElement datePickerInput = driver.findElement(By.id("datepicker"));
		datePickerInput.sendKeys("06/06/1990");
		
		Actions  a = new Actions(driver);
		a.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
	}

}
