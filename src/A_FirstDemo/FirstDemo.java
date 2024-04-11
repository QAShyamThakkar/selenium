package A_FirstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	
	public static void main(String[] args) {
		
		
		//Open the browser by creating driver of chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Get URL
		driver.get("https://www.ebay.com/");
		
		
		WebElement inputSearch =  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		String attributeValue = inputSearch.getAttribute("type");
		System.out.println(attributeValue);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello World!');");
		
//		inputSearch.sendKeys("Laptop");
//			
//		WebElement searchBtn =  driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
//		searchBtn.click();
		
		
	}

}
