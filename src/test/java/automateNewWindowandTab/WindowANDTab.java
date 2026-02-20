package automateNewWindowandTab;

import java.time.Duration;

import base.DriverFactory;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowANDTab {

    @Test
    public void employee() {
        // Setup WebDriver
     //   System.setProperty("webdriver.chrome.driver",
    //            "C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop\\API Tester\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    	//WebDriver driver = new ChromeDriver();
		 WebDriver driver = DriverFactory.getDriver();

        // Launch Google
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("First page: " + driver.getTitle());

        // Open new TAB and navigate to Facebook
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");
        System.out.println("Second tab: " + driver.getTitle());

        // Store window handles
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> handlesList = new ArrayList<>(windowHandles);

        // Close current tab (Facebook)
        driver.close();

        // Switch back to original tab (Google)
        driver.switchTo().window(handlesList.get(0));
        System.out.println("Switched back to: " + driver.getTitle());

        // Optional: close original tab too
        driver.quit();
    }
}
