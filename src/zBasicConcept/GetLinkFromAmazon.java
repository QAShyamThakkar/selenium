import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkFromAmazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // We need to pass option as input parameter
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.amazon.in/");
		
		List<WebElement> element  = driver.findElements(By.xpath("//a"));
		
		for (WebElement webElement : element) {
			System.out.println(webElement.getAttribute("href"));
		}

	}
}