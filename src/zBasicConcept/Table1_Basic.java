package zBasicConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table1_Basic {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();

//		WebElement table = driver.findElement(By.xpath("//table[@id=\"table1\"]"));
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
		System.out.println("Rows = "+ rows.size());
		
		
		List <WebElement> rowsExclHeader = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr[not(./th)]"));
		System.out.println("Rows Excluding Header = "+ rowsExclHeader.size());
		
		
		List <WebElement> column = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr/td"));
		System.out.println("Columns = "+ column.size());
	
		List <WebElement> columnExclActions = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr/td[not(./a)]"));
		System.out.println("Column Excluding Actions = "+ columnExclActions.size());	
	}

}
