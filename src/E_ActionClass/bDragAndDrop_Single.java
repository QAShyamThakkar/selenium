package E_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bDragAndDrop_Single {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 2. Launch url

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();


		Actions action = new Actions(driver);
		
		
//		WebElement from1 = driver.findElement(By.id("angular"));
//		WebElement to1 = driver.findElement(By.id("droparea"));
		
		
		WebElement from1 = driver.findElement(By.xpath("//li[@id=\"fourth\"]"));
		WebElement to1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		action.dragAndDrop(from1, to1).build().perform();
		System.out.println("1 over");

		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		action.dragAndDrop(from, to).build().perform();
		System.out.println("2 over");

	}

}
