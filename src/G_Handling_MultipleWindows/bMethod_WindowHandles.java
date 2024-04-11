package G_Handling_MultipleWindows;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class bMethod_WindowHandles {

	static String originalID; // At class level as we want to use same ID for both the method

	// Method 1 - Switch to New Window
	public static void swtichToNewWindow(WebDriver driver) {
		Set<String> listOfWindowIDs = driver.getWindowHandles();
		originalID = driver.getWindowHandle();

		for (String windowID : listOfWindowIDs) {
			System.out.println(windowID);
			if (!windowID.equals(originalID)) {
				driver.switchTo().window(windowID);
			}
		}
	}

	// Method 2 - Switch Back to original window
	public static void swtichBacktoMainWindow(WebDriver driver) {

		driver.switchTo().window(originalID);
	}

}
