package E_ActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cDragAndDrop_List_WithiFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		//Don't do pause and Don't switch to iframe - go one by one
				
		// switching to iframe, because our images are inside the iframe - will see in next class
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(iframe1);
		
		List<WebElement> images = driver.findElements(By.xpath("//ul[@id=\"gallery\"]//img"));
		WebElement dropImg = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		for (WebElement dragImg : images) {
//			action.dragAndDrop(dragImg, dropImg) -- will not work, Any Idea???
			action.dragAndDrop(dragImg, dropImg).pause(Duration.ofSeconds(1)).build().perform();
		}
		
		driver.switchTo().defaultContent();  //switch back from iFrame

	}

}
