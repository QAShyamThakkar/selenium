package F_Handling__Alert_AND_iFrame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aAlertExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//////////////////		Alert 1
		WebElement firstBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		firstBtn.click();

		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert1.getText());
//		alert1.accept();
		alert1.dismiss();

////////////////////		Alert 2
		WebElement secondBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		secondBtn.click();

		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert2.getText());
		alert2.accept();
//		alert2.dismiss();

		WebElement result = driver.findElement(By.xpath("//p[@id=\"result\"]"));
		System.out.println(result.getText());

//		alt.sendKeys("");
		
//////////////////////////		Alert 3
		WebElement thirdBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		thirdBtn.click();

		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert3.getText());
		alert3.sendKeys("Test");
		alert3.accept();
//		alert2.dismiss();

		System.out.println(result.getText());

		//////////////////// Manual Alert
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello World!');");
		
	}
}
