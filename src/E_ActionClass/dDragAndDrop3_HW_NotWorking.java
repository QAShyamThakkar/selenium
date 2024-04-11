package E_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dDragAndDrop3_HW_NotWorking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 2. Launch url

		driver.get("http://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement from1 = driver.findElement(By.id("angular"));
		WebElement from2 = driver.findElement(By.id("mongo"));
		WebElement from3 = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement to = driver.findElement(By.id("droparea"));

		Actions action = new Actions(driver);

		action.clickAndHold(from1).pause(5000).moveToElement(to).pause(5000).release().build().perform();

//		action.dragAndDrop(from1, to).build().perform();
//		Thread.sleep(3000);
//		System.out.println(1);
//		action.dragAndDrop(from2, to).build().perform();
//		Thread.sleep(3000);
//		System.out.println(2);
//		action.dragAndDrop(from3, to).build().perform();
//		Thread.sleep(3000);
//		System.out.println(3);

	}

}
