package B_Wait;

import java.time.Duration;
import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aWait_Implicit_And_Thread_Sleep {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); // Dynamic Wait
		
//		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2"); will get Hello World
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		// implicitlyWait will not work here(1) as the element is already available in DOM
		// so we need to use Explicit wait
		WebElement start = driver.findElement(By.xpath("//div[@id='start']/button"));
		start.click();

		WebElement data = driver.findElement(By.xpath("//div[@id=\"finish\"]/h4"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.visibilityOf(data));

		System.out.println(data.getText());
	}

}
