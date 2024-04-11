package F_Handling__Alert_AND_iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class biFrameDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://the-internet.herokuapp.com/tinymce");

		System.out.println(driver.getCurrentUrl());

		//1 Switching to Iframe
		driver.switchTo().frame("mce_0_ifr");

		//2 Complete task inside Iframe
		WebElement textBox = driver.findElement(By.id("tinymce"));
		textBox.clear();
		textBox.sendKeys("Hello Everyone");

		//3 Switch to main content
		driver.switchTo().defaultContent();

		//4 Continue to do action in the main page
		WebElement header = driver.findElement(By.xpath("//h3"));
		System.out.println(header.getText());

	}
}
