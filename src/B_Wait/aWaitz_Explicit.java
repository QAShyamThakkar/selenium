package B_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aWaitz_Explicit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // Dynamic Wait
		driver.get("https://www.minted.com/");
		
		Thread.sleep(10000);//Static Wait
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"Email address\"]"));
		email.sendKeys("test@gmail.com");
	}

}
