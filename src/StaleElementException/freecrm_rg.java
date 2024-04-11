package StaleElementException;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class freecrm_rg {
	public static void main(String[] args) throws InterruptedException, Exception {

		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://ui.cogmento.com/");

	        //1. Sending keys to email
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("Test@test.com");

	        Thread.sleep(2000);
	      
	        //2. Refresh
	        driver.navigate().refresh();

	        Thread.sleep(2000);

	        //3. after refresh, email become stale - generating exception
	        email.sendKeys("Test@test.com");
	      
	        //4. Handling exception at point 3
	        try {
	            email.sendKeys("Test@test.com");
	        }catch (StaleElementReferenceException e){
	            email = driver.findElement(By.name("email"));
	            email.sendKeys("Test@gmail.com");
	        }
	        
	        
	        
	        
	}
}
