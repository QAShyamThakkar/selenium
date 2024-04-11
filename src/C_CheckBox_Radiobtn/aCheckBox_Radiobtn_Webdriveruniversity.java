package C_CheckBox_Radiobtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aCheckBox_Radiobtn_Webdriveruniversity {
	public static void main(String[] args) throws InterruptedException {

		// 1. Launch Browser

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 2. Launch url
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		Thread.sleep(5000);

		WebElement option1 = driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value=\"option-1\"]"));
		if (!option1.isSelected()) {
			option1.click();
		}
		
		WebElement option2 = driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value=\"option-2\"]"));
		if (!option2.isSelected()) {
			option2.click();
		}
		WebElement option3 = driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value=\"option-3\"]"));
		if (!option3.isSelected()) {
			option3.click();
		}
		WebElement option4 = driver.findElement(By.xpath("//div[@id='checkboxes']//input[@value=\"option-4\"]"));
		if (!option4.isSelected()) {
			option4.click();
		}
		

		WebElement radio = driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
		

		
	}
}
