package zBasicConcept;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	
	
		WebElement search = driver.findElement(By.id("gh-as-a"));
		search.click();
		
		WebElement search1 = driver.findElement(By.id("_nkw"));
		search1.sendKeys("TV");
		WebElement search2 = driver.findElement(By.xpath("//div/button[@class=\"btn btn-prim\"]"));
		search2.click();

		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a/div[@class=\"s-item__title\"]"));
		
		for (WebElement webElement : links) {
			System.out.println(webElement.getAttribute("href"));
		}
		
		
		

	}

}
