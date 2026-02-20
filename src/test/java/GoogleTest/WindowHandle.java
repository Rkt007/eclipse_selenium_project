package GoogleTest;

import java.util.Set;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle();
		System.out.println("Parent Window ID: " + parent);

		// Open a new tab using JavaScript
		((JavascriptExecutor) driver).executeScript("window.open('https://www.bing.com', '_blank');");

		// Wait for the new tab to open
		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All window handles: " + allWindows);

		// Switch to the child window
		for (String handle : allWindows) {
			if (!handle.equals(parent)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to child window.");
				System.out.println("Child window title: " + driver.getTitle());
				break;
			}
		}

		// Close child window
		driver.close(); 

		// Switch back to parent
		driver.switchTo().window(parent);
		System.out.println("Switched back to parent window: " + driver.getTitle());

		driver.quit();
	}
}
