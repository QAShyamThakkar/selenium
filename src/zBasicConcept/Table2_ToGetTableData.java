package zBasicConcept;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table2_ToGetTableData {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khima\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();

		List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
		System.out.println(numberOfRows.size());
		for (int i = 0; i < numberOfRows.size(); i++) {

			// Understand Difference of below two
//			List<WebElement> columnData = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr/td[not(./a)]"));
			List<WebElement> columnData = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr["+i+"]/td[not(./a)]"));

			for (int j = 0; j < columnData.size(); j++) {
				System.out.print(columnData.get(j).getText()+" ");

			}System.out.println();
		}

	}

}
