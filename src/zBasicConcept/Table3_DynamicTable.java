package zBasicConcept;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table3_DynamicTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();

		List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
		System.out.println(numberOfRows.size());
		
		String columnLocator = "//table[@id='table1']//tr[%s]/td[not(./a)]";
		
		
		for (int i = 0; i < numberOfRows.size(); i++) {

			List<WebElement> columnData = driver.findElements(By.xpath(String.format(columnLocator, i)));

			for (int j = 0; j < columnData.size(); j++) {
				System.out.print(columnData.get(j).getText()+" ");

			}System.out.println();
		}

	}

}
